package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

class class_0010 {
    protected List lllIIIllIIIIlllIlIIllIIll;
    List lllIlIIlIIIlIlIIIllIlllIl;
    List IlIllllllIIlIIllllIIlIIIl;
    List lIlllIlllIIIIlIIlllIllIII;
    List IlIIIIIllllllIIlllIllllll;
    final /* synthetic */ class_0822 lIllllIIlIIIlIllllllIIIll;

    class_0010(class_0822 class_08222, List list) {
        this.lIllllIIlIIIlIllllllIIIll = class_08222;
        ArrayList<class_1665> arrayList = new ArrayList<class_1665>();
        ArrayList<class_0767> arrayList2 = new ArrayList<class_0767>();
        ArrayList<Float> arrayList3 = new ArrayList<Float>();
        ArrayList<Float> arrayList4 = new ArrayList<Float>();
        ArrayList<Object> arrayList5 = new ArrayList<Object>();
        for (class_1376 class_13762 : list) {
            if (class_13762.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll() == null) continue;
            arrayList.add(class_13762.lllIIIllIIIIlllIlIIllIIll);
            arrayList2.add(class_13762.lllIIIllIIIIlllIlIIllIIll.IlIlllIIIIIIlIIllIIllIlll());
            arrayList3.add(Float.valueOf(class_13762.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll()));
            arrayList4.add(Float.valueOf(class_13762.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII()));
            arrayList5.add(class_13762.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI.lIlllIlllIIIIlIIlllIllIII());
        }
        this.lllIIIllIIIIlllIlIIllIIll = arrayList;
        this.lllIlIIlIIIlIlIIIllIlllIl = arrayList2;
        this.IlIllllllIIlIIllllIIlIIIl = arrayList3;
        this.lIlllIlllIIIIlIIlllIllIII = arrayList4;
        this.IlIIIIIllllllIIlllIllllll = arrayList5;
    }
}

