package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class class_0146
extends class_1309 {
    public class_1553 IlIIIIIllllllIIlllIllllll;

    public class_0146(class_1334 class_13342) {
        super(class_13342);
    }

    public class_0146(class_1334 class_13342, int n, int n2, int n3, int n4) {
        super(class_13342, n, n2, n3, n4);
        ArrayList<class_1553> arrayList = new ArrayList<class_1553>();
        class_1553[] arrclass_1553 = class_1553.values();
        int n5 = arrclass_1553.length;
        for (int i = 0; i < n5; ++i) {
            class_1553 class_15532;
            this.IlIIIIIllllllIIlllIllllll = class_15532 = arrclass_1553[i];
            this.lllIIIllIIIIlllIlIIllIIll(n4);
            if (!this.IlIllllllIIlIIllllIIlIIIl()) continue;
            arrayList.add(class_15532);
        }
        if (!arrayList.isEmpty()) {
            this.IlIIIIIllllllIIlllIllllll = (class_1553)((Object)arrayList.get(this.IlllIIlllllllIIllIlIllllI.nextInt(arrayList.size())));
        }
        this.lllIIIllIIIIlllIlIIllIIll(n4);
    }

    public class_0146(class_1334 class_13342, int n, int n2, int n3, int n4, String string) {
        this(class_13342, n, n2, n3, n4);
        for (class_1553 class_15532 : class_1553.values()) {
            if (!class_15532.llIIlIlIlllIIllIlIlllIllI.equals(string)) continue;
            this.IlIIIIIllllllIIlllIllllll = class_15532;
            break;
        }
        this.lllIIIllIIIIlllIlIIllIIll(n4);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Motive", this.IlIIIIIllllllIIlllIllllll.llIIlIlIlllIIllIlIlllIllI);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        String string = class_07752.IllIIIllIIIIlIlIlIllIIlll("Motive");
        for (class_1553 class_15532 : class_1553.values()) {
            if (!class_15532.llIIlIlIlllIIllIlIlllIllI.equals(string)) continue;
            this.IlIIIIIllllllIIlllIllllll = class_15532;
        }
        if (this.IlIIIIIllllllIIlllIllllll == null) {
            this.IlIIIIIllllllIIlllIllllll = class_1553.lllIIIllIIIIlllIlIIllIIll;
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll.IllIIIIllIIllIllIlllIlIIl;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll.IIIIIIIIlIllIIllIIlllIllI;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        if (class_15212 instanceof class_0814) {
            class_0814 class_08142 = (class_0814)class_15212;
            if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                return;
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIlIllIIlIIIIlllIlIllIlI), 0.0f);
    }
}

