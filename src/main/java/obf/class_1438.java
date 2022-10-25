package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Collection;

public class class_1438 {
    public ArrayList lllIIIllIIIIlllIlIIllIIll;
    ArrayList lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII = 0;
    public int IlIIIIIllllllIIlllIllllll = 0;
    final /* synthetic */ class_0041 lIllllIIlIIIlIllllllIIIll;

    public class_1438(class_0041 class_00412, class_1847 class_18472) {
        this.lIllllIIlIIIlIllllllIIIll = class_00412;
        this.IlIllllllIIlIIllllIIlIIIl = class_18472.IIIllIIlIIIIIIlIlIIllIIlI;
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList();
        this.lllIIIllIIIIlllIlIIllIIll.add(class_18472);
        this.lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.lllIIIllIIIIlllIlIIllIIll.remove(0));
        while (arrayList.size() > 0) {
            class_1847 class_18472;
            class_1847 class_18473 = (class_1847)arrayList.remove(0);
            class_18473.lIlllIlllIIIIlIIlllIllIII = false;
            if (class_18473.IIIllIIlIIIIIIlIlIIllIIlI != this.IlIllllllIIlIIllllIIlIIIl) continue;
            this.lllIIIllIIIIlllIlIIllIIll.add(class_18473);
            class_18473.IlIllllllIIlIIllllIIlIIIl = true;
            boolean bl = false;
            if (class_18473.lllIIIllIIIIlllIlIIllIIll < class_0041.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll) - 1) {
                class_18472 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18473.lllIIIllIIIIlllIlIIllIIll + 1][class_18473.lllIlIIlIIIlIlIIIllIlllIl];
                if (!class_18472.IlIllllllIIlIIllllIIlIIIl && !class_18472.lIlllIlllIIIIlIIlllIllIII) {
                    arrayList.add(class_18472);
                    class_18472.lIlllIlllIIIIlIIlllIllIII = true;
                }
                if (class_18472.IIIllIIlIIIIIIlIlIIllIIlI != class_18473.IIIllIIlIIIIIIlIlIIllIIlI) {
                    bl = true;
                }
            } else {
                bl = true;
            }
            if (class_18473.lllIIIllIIIIlllIlIIllIIll > 0) {
                class_18472 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18473.lllIIIllIIIIlllIlIIllIIll - 1][class_18473.lllIlIIlIIIlIlIIIllIlllIl];
                if (!class_18472.IlIllllllIIlIIllllIIlIIIl && !class_18472.lIlllIlllIIIIlIIlllIllIII) {
                    arrayList.add(class_18472);
                    class_18472.lIlllIlllIIIIlIIlllIllIII = true;
                }
                if (class_18472.IIIllIIlIIIIIIlIlIIllIIlI != class_18473.IIIllIIlIIIIIIlIlIIllIIlI) {
                    bl = true;
                }
            } else {
                bl = true;
            }
            if (class_18473.lllIlIIlIIIlIlIIIllIlllIl < class_0041.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll) - 1) {
                class_18472 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18473.lllIIIllIIIIlllIlIIllIIll][class_18473.lllIlIIlIIIlIlIIIllIlllIl + 1];
                if (!class_18472.IlIllllllIIlIIllllIIlIIIl && !class_18472.lIlllIlllIIIIlIIlllIllIII) {
                    arrayList.add(class_18472);
                    class_18472.lIlllIlllIIIIlIIlllIllIII = true;
                }
                if (class_18472.IIIllIIlIIIIIIlIlIIllIIlI != class_18473.IIIllIIlIIIIIIlIlIIllIIlI) {
                    bl = true;
                }
            } else {
                bl = true;
            }
            if (class_18473.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                class_18472 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18473.lllIIIllIIIIlllIlIIllIIll][class_18473.lllIlIIlIIIlIlIIIllIlllIl - 1];
                if (!class_18472.IlIllllllIIlIIllllIIlIIIl && !class_18472.lIlllIlllIIIIlIIlllIllIII) {
                    arrayList.add(class_18472);
                    class_18472.lIlllIlllIIIIlIIlllIllIII = true;
                }
                if (class_18472.IIIllIIlIIIIIIlIlIIllIIlI != class_18473.IIIllIIlIIIIIIlIlIIllIIlI) {
                    bl = true;
                }
            } else {
                bl = true;
            }
            if (!bl) continue;
            class_18473.lIllllIIlIIIlIllllllIIIll = 0;
            this.lllIlIIlIIIlIlIIIllIlllIl.add(class_18473);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIllllllIIlIIllllIIlIIIl();
        this.lIlllIlllIIIIlIIlllIllIII();
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(Collection collection) {
        this.lIlllIlllIIIIlIIlllIllIII = 0;
        this.IlIIIIIllllllIIlllIllllll = 0;
        for (class_1847 class_18472 : collection) {
            this.lIlllIlllIIIIlIIlllIllIII += class_18472.lllIIIllIIIIlllIlIIllIIll;
            this.IlIIIIIllllllIIlllIllllll += class_18472.lllIlIIlIIIlIlIIIllIlllIl;
        }
        this.lIlllIlllIIIIlIIlllIllIII /= collection.size();
        this.IlIIIIIllllllIIlllIllllll /= collection.size();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Collection collection) {
        int n = 131072;
        class_1847 class_18472 = null;
        for (class_1847 class_18473 : collection) {
            int n2 = (class_18473.lllIIIllIIIIlllIlIIllIIll - this.lIlllIlllIIIIlIIlllIllIII) * (class_18473.lllIIIllIIIIlllIlIIllIIll - this.lIlllIlllIIIIlIIlllIllIII) + (class_18473.lllIlIIlIIIlIlIIIllIlllIl - this.IlIIIIIllllllIIlllIllllll) * (class_18473.lllIlIIlIIIlIlIIIllIlllIl - this.IlIIIIIllllllIIlllIllllll);
            if (n2 >= n) continue;
            n = n2;
            class_18472 = class_18473;
        }
        this.lIlllIlllIIIIlIIlllIllIII = class_18472.lllIIIllIIIIlllIlIIllIIll;
        this.IlIIIIIllllllIIlllIllllll = class_18472.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        float f = Minecraft.getMinecraft().IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(class_0672.lllIIlIIIllllllIIIIlIlIlI()[this.IlIllllllIIlIIllllIIlIIIl].IlIIIlIllIIIllIIIIlIIlIll) + 8;
        float f2 = class_0041.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll) / 32;
        float f3 = 2.0f;
        float f4 = f / 16.0f * f2 / f3;
        int n = 0;
        while (this.lllIlIIlIIIlIlIIIllIlllIl.size() > 0 && (float)n < f4) {
            this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, ++n);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.size() > 0) {
            ArrayList<class_1847> arrayList = new ArrayList<class_1847>();
            for (class_1847 class_18472 : this.lllIIIllIIIIlllIlIIllIIll) {
                if (class_18472.lIllllIIlIIIlIllllllIIIll >= 0 && class_18472.lIllllIIlIIIlIllllllIIIll != n) continue;
                arrayList.add(class_18472);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(arrayList);
        }
    }

    public ArrayList lllIIIllIIIIlllIlIIllIIll(Collection collection, int n) {
        ArrayList<class_1847> arrayList = new ArrayList<class_1847>();
        for (class_1847 class_18472 : collection) {
            class_1847 class_18473;
            class_1847 class_18474;
            if (class_18472.lllIIIllIIIIlllIlIIllIIll < class_0041.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll) - 2) {
                class_18474 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18472.lllIIIllIIIIlllIlIIllIIll + 1][class_18472.lllIlIIlIIIlIlIIIllIlllIl];
                class_18473 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18472.lllIIIllIIIIlllIlIIllIIll + 2][class_18472.lllIlIIlIIIlIlIIIllIlllIl];
                if (class_18474.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18474.lIllllIIlIIIlIllllllIIIll < 0 && class_18473.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18473.lIllllIIlIIIlIllllllIIIll < 0) {
                    class_18474.lIllllIIlIIIlIllllllIIIll = n;
                    class_18473.lIllllIIlIIIlIllllllIIIll = n;
                    arrayList.add(class_18473);
                } else if (class_18474.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18474.lIllllIIlIIIlIllllllIIIll < 0) {
                    class_18474.lIllllIIlIIIlIllllllIIIll = n;
                    arrayList.add(class_18474);
                } else if (class_18473.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18473.lIllllIIlIIIlIllllllIIIll < 0) {
                    class_18473.lIllllIIlIIIlIllllllIIIll = n;
                    arrayList.add(class_18473);
                }
            }
            if (class_18472.lllIIIllIIIIlllIlIIllIIll > 1) {
                class_18474 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18472.lllIIIllIIIIlllIlIIllIIll - 1][class_18472.lllIlIIlIIIlIlIIIllIlllIl];
                class_18473 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18472.lllIIIllIIIIlllIlIIllIIll - 2][class_18472.lllIlIIlIIIlIlIIIllIlllIl];
                if (class_18474.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18474.lIllllIIlIIIlIllllllIIIll < 0 && class_18473.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18473.lIllllIIlIIIlIllllllIIIll < 0) {
                    class_18474.lIllllIIlIIIlIllllllIIIll = n;
                    class_18473.lIllllIIlIIIlIllllllIIIll = n;
                    arrayList.add(class_18473);
                } else if (class_18474.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18474.lIllllIIlIIIlIllllllIIIll < 0) {
                    class_18474.lIllllIIlIIIlIllllllIIIll = n;
                    arrayList.add(class_18474);
                } else if (class_18473.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18473.lIllllIIlIIIlIllllllIIIll < 0) {
                    class_18473.lIllllIIlIIIlIllllllIIIll = n;
                    arrayList.add(class_18473);
                }
            }
            if (class_18472.lllIlIIlIIIlIlIIIllIlllIl < class_0041.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll) - 1) {
                class_18474 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18472.lllIIIllIIIIlllIlIIllIIll][class_18472.lllIlIIlIIIlIlIIIllIlllIl + 1];
                if (class_18474.IIIllIIlIIIIIIlIlIIllIIlI == class_18472.IIIllIIlIIIIIIlIlIIllIIlI && class_18474.lIllllIIlIIIlIllllllIIIll < 0) {
                    class_18474.lIllllIIlIIIlIllllllIIIll = n;
                    arrayList.add(class_18474);
                }
            }
            if (class_18472.lllIlIIlIIIlIlIIIllIlllIl <= 0) continue;
            class_18474 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll[class_18472.lllIIIllIIIIlllIlIIllIIll][class_18472.lllIlIIlIIIlIlIIIllIlllIl - 1];
            if (class_18474.IIIllIIlIIIIIIlIlIIllIIlI != class_18472.IIIllIIlIIIIIIlIlIIllIIlI || class_18474.lIllllIIlIIIlIllllllIIIll >= 0) continue;
            class_18474.lIllllIIlIIIlIllllllIIIll = n;
            arrayList.add(class_18474);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        this.lllIIIllIIIIlllIlIIllIIll(collection);
        this.lllIlIIlIIIlIlIIIllIlllIl(collection);
        return arrayList;
    }
}

