package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

class class_0077
extends Thread {
    final /* synthetic */ class_1605 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_2018 lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ class_2018 IlIllllllIIlIIllllIIlIIIl;

    class_0077(class_2018 class_20182, class_1605 class_16052, class_2018 class_20183) {
        this.IlIllllllIIlIIllllIIlIIIl = class_20182;
        this.lllIIIllIIIIlllIlIIllIIll = class_16052;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20183;
    }

    @Override
    public void run() {
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
        ArrayList arrayList = Lists.newArrayList((Iterable)this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        arrayList.removeAll(this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl());
        for (class_0025 class_00252 : arrayList) {
            class_2018.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl).add(new class_0718(this.lllIlIIlIIIlIlIIIllIlllIl, class_00252));
        }
        class_2018.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, new ArrayList());
        class_2018.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl).addAll(class_2018.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl));
        for (class_0025 class_00252 : Lists.reverse((List)this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl())) {
            class_2018.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl).add(Math.max(0, class_2018.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl).size() - 1), new class_0718(this.lllIlIIlIIIlIlIIIllIlllIl, class_00252));
        }
        class_2018.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl, new ArrayList());
        class_2018.lIlllIlllIIIIlIIlllIllIII(this.IlIllllllIIlIIllllIIlIIIl).addAll(class_2018.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl));
        class_2018.IlIIIIIllllllIIlllIllllll((class_2018)this.IlIllllllIIlIIllllIIlIIIl).IllIIIllIIIIlIlIlIllIIlll = true;
        class_2018.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, true);
    }
}

