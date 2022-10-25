package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.scoreboard.IScoreObjectiveCriteria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_0141 {
    private final Map lllIIIllIIIIlllIlIIllIIll = new HashMap();
    private final Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private final Map IlIllllllIIlIIllllIIlIIIl = new HashMap();
    private final class_0693[] lIlllIlllIIIIlIIlllIllIII = new class_0693[3];
    private final Map IlIIIIIllllllIIlllIllllll = new HashMap();
    private final Map lIllllIIlIIIlIllllllIIIll = new HashMap();

    public class_0693 lllIIIllIIIIlllIlIIllIIll(String string) {
        return (class_0693)this.lllIIIllIIIIlllIlIIllIIll.get(string);
    }

    public class_0693 lllIIIllIIIIlllIlIIllIIll(String string, IScoreObjectiveCriteria class_01172) {
        class_0693 class_06932 = this.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_06932 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        class_06932 = new class_0693(this, string, class_01172);
        ArrayList<class_0693> arrayList = (ArrayList<class_0693>)this.lllIlIIlIIIlIlIIIllIlllIl.get(class_01172);
        if (arrayList == null) {
            arrayList = new ArrayList<class_0693>();
            this.lllIlIIlIIIlIlIIIllIlllIl.put(class_01172, arrayList);
        }
        arrayList.add(class_06932);
        this.lllIIIllIIIIlllIlIIllIIll.put(string, class_06932);
        this.IlIllllllIIlIIllllIIlIIIl(class_06932);
        return class_06932;
    }

    public Collection lllIIIllIIIIlllIlIIllIIll(IScoreObjectiveCriteria class_01172) {
        Collection collection = (Collection)this.lllIlIIlIIIlIlIIIllIlllIl.get(class_01172);
        return collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public class_0678 lllIIIllIIIIlllIlIIllIIll(String string, class_0693 class_06932) {
        class_0678 class_06782;
        HashMap hashMap = (HashMap)this.IlIllllllIIlIIllllIIlIIIl.get(string);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.IlIllllllIIlIIllllIIlIIIl.put(string, hashMap);
        }
        if ((class_06782 = (class_0678)hashMap.get(class_06932)) == null) {
            class_06782 = new class_0678(this, class_06932, string);
            ((Map)hashMap).put(class_06932, class_06782);
        }
        return class_06782;
    }

    public Collection lllIIIllIIIIlllIlIIllIIll(class_0693 class_06932) {
        ArrayList<class_0678> arrayList = new ArrayList<class_0678>();
        for (Map map : this.IlIllllllIIlIIllllIIlIIIl.values()) {
            class_0678 class_06782 = (class_0678)map.get(class_06932);
            if (class_06782 == null) continue;
            arrayList.add(class_06782);
        }
        Collections.sort(arrayList, class_0678.lllIIIllIIIIlllIlIIllIIll);
        return arrayList;
    }

    public Collection lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.values();
    }

    public Collection lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl.keySet();
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        Map map = (Map)this.IlIllllllIIlIIllllIIlIIIl.remove(string);
        if (map != null) {
            this.IllIIlllllllIIlIIlIIIIlIl(string);
        }
    }

    public Collection IlIllllllIIlIIllllIIlIIIl() {
        Collection collection = this.IlIllllllIIlIIllllIIlIIIl.values();
        ArrayList arrayList = new ArrayList();
        for (Map map : collection) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public Map IlIllllllIIlIIllllIIlIIIl(String string) {
        HashMap hashMap = (HashMap)this.IlIllllllIIlIIllllIIlIIIl.get(string);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        return hashMap;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0693 class_06932) {
        this.lllIIIllIIIIlllIlIIllIIll.remove(class_06932.lllIlIIlIIIlIlIIIllIlllIl());
        for (int i = 0; i < 3; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll(i) != class_06932) continue;
            this.lllIIIllIIIIlllIlIIllIIll(i, (class_0693)null);
        }
        List list = (List)this.lllIlIIlIIIlIlIIIllIlllIl.get(class_06932.IlIllllllIIlIIllllIIlIIIl());
        if (list != null) {
            list.remove(class_06932);
        }
        for (Map map : this.IlIllllllIIlIIllllIIlIIIl.values()) {
            map.remove(class_06932);
        }
        this.IlIIIIIllllllIIlllIllllll(class_06932);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, class_0693 class_06932) {
        this.lIlllIlllIIIIlIIlllIllIII[n] = class_06932;
    }

    public class_0693 lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.lIlllIlllIIIIlIIlllIllIII[n];
    }

    public class_0531 lIlllIlllIIIIlIIlllIllIII(String string) {
        return (class_0531)this.IlIIIIIllllllIIlllIllllll.get(string);
    }

    public class_0531 IlIIIIIllllllIIlllIllllll(String string) {
        class_0531 class_05312 = this.lIlllIlllIIIIlIIlllIllIII(string);
        if (class_05312 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        class_05312 = new class_0531(this, string);
        this.IlIIIIIllllllIIlllIllllll.put(string, class_05312);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_05312);
        return class_05312;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0531 class_05312) {
        this.IlIIIIIllllllIIlllIllllll.remove(class_05312.lllIIIllIIIIlllIlIIllIIll());
        for (String string : class_05312.IlIllllllIIlIIllllIIlIIIl()) {
            this.lIllllIIlIIIlIllllllIIIll.remove(string);
        }
        this.lIlllIlllIIIIlIIlllIllIII(class_05312);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        if (!this.IlIIIIIllllllIIlllIllllll.containsKey(string2)) {
            return false;
        }
        class_0531 class_05312 = this.lIlllIlllIIIIlIIlllIllIII(string2);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI(string) != null) {
            this.lIllllIIlIIIlIllllllIIIll(string);
        }
        this.lIllllIIlIIIlIllllllIIIll.put(string, class_05312);
        class_05312.IlIllllllIIlIIllllIIlIIIl().add(string);
        return true;
    }

    public boolean lIllllIIlIIIlIllllllIIIll(String string) {
        class_0531 class_05312 = this.IIIllIIlIIIIIIlIlIIllIIlI(string);
        if (class_05312 != null) {
            this.lllIIIllIIIIlllIlIIllIIll(string, class_05312);
            return true;
        }
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, class_0531 class_05312) {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI(string) != class_05312) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + class_05312.lllIIIllIIIIlllIlIIllIIll() + "'.");
        }
        this.lIllllIIlIIIlIllllllIIIll.remove(string);
        class_05312.IlIllllllIIlIIllllIIlIIIl().remove(string);
    }

    public Collection lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll.keySet();
    }

    public Collection IlIIIIIllllllIIlllIllllll() {
        return this.IlIIIIIllllllIIlllIllllll.values();
    }

    public class_0531 IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        return (class_0531)this.lIllllIIlIIIlIllllllIIIll.get(string);
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0693 class_06932) {
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_0693 class_06932) {
    }

    public void IlIIIIIllllllIIlllIllllll(class_0693 class_06932) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0678 class_06782) {
    }

    public void IllIIlllllllIIlIIlIIIIlIl(String string) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0531 class_05312) {
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_0531 class_05312) {
    }

    public void lIlllIlllIIIIlIIlllIllIII(class_0531 class_05312) {
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(int n) {
        switch (n) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        return null;
    }

    public static int IIIllIllIIlIlIlIlIllllIIl(String string) {
        return string.equalsIgnoreCase("list") ? 0 : (string.equalsIgnoreCase("sidebar") ? 1 : (string.equalsIgnoreCase("belowName") ? 2 : -1));
    }
}

