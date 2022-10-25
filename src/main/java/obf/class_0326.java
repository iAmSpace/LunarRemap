package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class_0326 {
    private final List lllIIIllIIIIlllIlIIllIIll = new ArrayList();
    private final Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private int IlIllllllIIlIIllllIIlIIIl;

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
    }

    public Map lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        int n = 0;
        for (class_1324 class_13242 : this.lllIIIllIIIIlllIlIIllIIll) {
            class_13242.lllIIIllIIIIlllIlIIllIIll(n);
            n += class_13242.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public String toString() {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(2);
        stringBuilder.append(";");
        for (n = 0; n < this.lllIIIllIIIIlllIlIIllIIll.size(); ++n) {
            if (n > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((class_1324)this.lllIIIllIIIIlllIlIIllIIll.get(n)).toString());
        }
        stringBuilder.append(";");
        stringBuilder.append(this.IlIllllllIIlIIllllIIlIIIl);
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty()) {
            stringBuilder.append(";");
            n = 0;
            for (Map.Entry entry : this.lllIlIIlIIIlIlIIIllIlllIl.entrySet()) {
                if (n++ > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(((String)entry.getKey()).toLowerCase());
                Map map = (Map)entry.getValue();
                if (map.isEmpty()) continue;
                stringBuilder.append("(");
                int n2 = 0;
                for (Map.Entry entry2 : map.entrySet()) {
                    if (n2++ > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append((String)entry2.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append((String)entry2.getValue());
                }
                stringBuilder.append(")");
            }
        } else {
            stringBuilder.append(";");
        }
        return stringBuilder.toString();
    }

    private static class_1324 lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        int n2;
        Object object;
        String[] arrstring = string.split("x", 2);
        int n3 = 1;
        int n4 = 0;
        if (arrstring.length == 2) {
            try {
                n3 = Integer.parseInt(arrstring[0]);
                if (n + n3 >= 256) {
                    n3 = 256 - n;
                }
                if (n3 < 0) {
                    n3 = 0;
                }
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        try {
            object = arrstring[arrstring.length - 1];
            arrstring = ((String)object).split(":", 2);
            n2 = Integer.parseInt(arrstring[0]);
            if (arrstring.length > 1) {
                n4 = Integer.parseInt(arrstring[1]);
            }
            if (Block.lllIIIllIIIIlllIlIIllIIll(n2) == Blocks.lllIIIllIIIIlllIlIIllIIll) {
                n2 = 0;
                n4 = 0;
            }
            if (n4 < 0 || n4 > 15) {
                n4 = 0;
            }
        }
        catch (Throwable throwable) {
            return null;
        }
        object = new class_1324(n3, Block.lllIIIllIIIIlllIlIIllIIll(n2), n4);
        ((class_1324)object).lllIIIllIIIIlllIlIIllIIll(n);
        return object;
    }

    private static List lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string != null && string.length() >= 1) {
            ArrayList<class_1324> arrayList = new ArrayList<class_1324>();
            String[] arrstring = string.split(",");
            int n = 0;
            String[] arrstring2 = arrstring;
            int n2 = arrstring.length;
            for (int i = 0; i < n2; ++i) {
                String string2 = arrstring2[i];
                class_1324 class_13242 = class_0326.lllIIIllIIIIlllIlIIllIIll(string2, n);
                if (class_13242 == null) {
                    return null;
                }
                arrayList.add(class_13242);
                n += class_13242.lllIIIllIIIIlllIlIIllIIll();
            }
            return arrayList;
        }
        return null;
    }

    public static class_0326 lllIIIllIIIIlllIlIIllIIll(String string) {
        int n;
        if (string == null) {
            return class_0326.IlIIIIIllllllIIlllIllllll();
        }
        String[] arrstring = string.split(";", -1);
        int n2 = n = arrstring.length == 1 ? 0 : MathHelper.lllIIIllIIIIlllIlIIllIIll(arrstring[0], 0);
        if (n >= 0 && n <= 2) {
            List list;
            class_0326 class_03262 = new class_0326();
            int n3 = arrstring.length == 1 ? 0 : 1;
            if ((list = class_0326.lllIlIIlIIIlIlIIIllIlllIl(arrstring[n3++])) != null && !list.isEmpty()) {
                class_03262.IlIllllllIIlIIllllIIlIIIl().addAll(list);
                class_03262.lIlllIlllIIIIlIIlllIllIII();
                int n4 = class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl;
                if (n > 0 && arrstring.length > n3) {
                    n4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(arrstring[n3++], n4);
                }
                class_03262.lllIIIllIIIIlllIlIIllIIll(n4);
                if (n > 0 && arrstring.length > n3) {
                    String[] arrstring2;
                    String[] arrstring3 = arrstring2 = arrstring[n3++].toLowerCase().split(",");
                    int n5 = arrstring2.length;
                    for (int i = 0; i < n5; ++i) {
                        String string2 = arrstring3[i];
                        String[] arrstring4 = string2.split("\\(", 2);
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        if (arrstring4[0].length() <= 0) continue;
                        class_03262.lllIlIIlIIIlIlIIIllIlllIl().put(arrstring4[0], hashMap);
                        if (arrstring4.length <= 1 || !arrstring4[1].endsWith(")") || arrstring4[1].length() <= 1) continue;
                        String[] arrstring5 = arrstring4[1].substring(0, arrstring4[1].length() - 1).split(" ");
                        for (int j = 0; j < arrstring5.length; ++j) {
                            String[] arrstring6 = arrstring5[j].split("=", 2);
                            if (arrstring6.length != 2) continue;
                            hashMap.put(arrstring6[0], arrstring6[1]);
                        }
                    }
                } else {
                    class_03262.lllIlIIlIIIlIlIIIllIlllIl().put("village", new HashMap());
                }
                return class_03262;
            }
            return class_0326.IlIIIIIllllllIIlllIllllll();
        }
        return class_0326.IlIIIIIllllllIIlllIllllll();
    }

    public static class_0326 IlIIIIIllllllIIlllIllllll() {
        class_0326 class_03262 = new class_0326();
        class_03262.lllIIIllIIIIlllIlIIllIIll(class_0672.IlIlIIlIlIllIIlIlIIllIIIl.lIlIllIIllIIIIlllIlIlllIl);
        class_03262.IlIllllllIIlIIllllIIlIIIl().add(new class_1324(1, Blocks.IllIIlllllllIIlIIlIIIIlIl));
        class_03262.IlIllllllIIlIIllllIIlIIIl().add(new class_1324(2, Blocks.lIlllIlllIIIIlIIlllIllIII));
        class_03262.IlIllllllIIlIIllllIIlIIIl().add(new class_1324(1, Blocks.IlIllllllIIlIIllllIIlIIIl));
        class_03262.lIlllIlllIIIIlIIlllIllIII();
        class_03262.lllIlIIlIIIlIlIIIllIlllIl().put("village", new HashMap());
        return class_03262;
    }
}

