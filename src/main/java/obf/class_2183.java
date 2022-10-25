package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class class_2183
extends class_0141 {
    private final class_0220 lllIIIllIIIIlllIlIIllIIll;
    private final Set lllIlIIlIIIlIlIIIllIlllIl = new HashSet();
    private class_0390 IlIllllllIIlIIllllIIlIIIl;

    public class_2183(class_0220 class_02202) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02202;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0678 class_06782) {
        super.lllIIIllIIIIlllIlIIllIIll(class_06782);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.contains(class_06782.IlIllllllIIlIIllllIIlIIIl())) {
            this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_1588(class_06782, 0));
        }
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IllIIlllllllIIlIIlIIIIlIl(String string) {
        super.IllIIlllllllIIlIIlIIIIlIl(string);
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_1588(string));
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, class_0693 class_06932) {
        class_0693 class_06933 = this.lllIIIllIIIIlllIlIIllIIll(n);
        super.lllIIIllIIIIlllIlIIllIIll(n, class_06932);
        if (class_06933 != class_06932 && class_06933 != null) {
            if (this.IllIIIllIIIIlIlIlIllIIlll(class_06933) > 0) {
                this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_2139(n, class_06932));
            } else {
                this.IIIllIllIIlIlIlIlIllllIIl(class_06933);
            }
        }
        if (class_06932 != null) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl.contains(class_06932)) {
                this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_2139(n, class_06932));
            } else {
                this.IIIllIIlIIIIIIlIlIIllIIlI(class_06932);
            }
        }
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        if (super.lllIIIllIIIIlllIlIIllIIll(string, string2)) {
            class_0531 class_05312 = this.lIlllIlllIIIIlIIlllIllIII(string2);
            this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_0232(class_05312, Arrays.asList(string), 3));
            this.lIllllIIlIIIlIllllllIIIll();
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, class_0531 class_05312) {
        super.lllIIIllIIIIlllIlIIllIIll(string, class_05312);
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_0232(class_05312, Arrays.asList(string), 4));
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_0693 class_06932) {
        super.IlIllllllIIlIIllllIIlIIIl(class_06932);
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_0693 class_06932) {
        super.lIlllIlllIIIIlIIlllIllIII(class_06932);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.contains(class_06932)) {
            this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_1015(class_06932, 2));
        }
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(class_0693 class_06932) {
        super.IlIIIIIllllllIIlllIllllll(class_06932);
        if (this.lllIlIIlIIIlIlIIIllIlllIl.contains(class_06932)) {
            this.IIIllIllIIlIlIlIlIllllIIl(class_06932);
        }
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0531 class_05312) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_05312);
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_0232(class_05312, 0));
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_0531 class_05312) {
        super.IlIllllllIIlIIllllIIlIIIl(class_05312);
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_0232(class_05312, 2));
        this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_0531 class_05312) {
        super.lIlllIlllIIIIlIIlllIllIII(class_05312);
        this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(new class_0232(class_05312, 1));
        this.lIllllIIlIIIlIllllllIIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0390 class_03902) {
        this.IlIllllllIIlIIllllIIlIIIl = class_03902;
    }

    protected void lIllllIIlIIIlIllllllIIIll() {
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public List lIllllIIlIIIlIllllllIIIll(class_0693 class_06932) {
        ArrayList<class_0703> arrayList = new ArrayList<class_0703>();
        arrayList.add(new class_1015(class_06932, 0));
        for (int i = 0; i < 3; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll(i) != class_06932) continue;
            arrayList.add(new class_2139(i, class_06932));
        }
        for (class_0678 class_06782 : this.lllIIIllIIIIlllIlIIllIIll(class_06932)) {
            arrayList.add(new class_1588(class_06782, 0));
        }
        return arrayList;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(class_0693 class_06932) {
        List list = this.lIllllIIlIIIlIllllllIIIll(class_06932);
        for (class_1822 class_18222 : this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll) {
            for (class_0703 class_07032 : list) {
                class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.add(class_06932);
    }

    public List IllIIlllllllIIlIIlIIIIlIl(class_0693 class_06932) {
        ArrayList<class_0703> arrayList = new ArrayList<class_0703>();
        arrayList.add(new class_1015(class_06932, 1));
        for (int i = 0; i < 3; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll(i) != class_06932) continue;
            arrayList.add(new class_2139(i, class_06932));
        }
        return arrayList;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(class_0693 class_06932) {
        List list = this.IllIIlllllllIIlIIlIIIIlIl(class_06932);
        for (class_1822 class_18222 : this.lllIIIllIIIIlllIlIIllIIll.lIIIllIIIIIllllIlIlIllIll().IlIIIIIllllllIIlllIllllll) {
            for (class_0703 class_07032 : list) {
                class_18222.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07032);
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.remove(class_06932);
    }

    public int IllIIIllIIIIlIlIlIllIIlll(class_0693 class_06932) {
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll(i) != class_06932) continue;
            ++n;
        }
        return n;
    }
}

