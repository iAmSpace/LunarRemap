package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import optifine.Config;

import java.util.ArrayList;
import java.util.Arrays;

public class class_0925 {
    private String lllIIIllIIIIlllIlIIllIIll = null;
    private static final class_2198[] lllIlIIlIIIlIlIIIllIlllIl = new class_2198[0];

    public class_0925(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string) {
        int n;
        String string2 = string;
        int n2 = string.lastIndexOf(47);
        if (n2 >= 0) {
            string2 = string.substring(n2 + 1);
        }
        if ((n = string2.lastIndexOf(46)) >= 0) {
            string2 = string2.substring(0, n);
        }
        return string2;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n = string.lastIndexOf(47);
        return n < 0 ? "" : string.substring(0, n);
    }

    public class_2198[] IlIllllllIIlIIllllIIlIIIl(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<class_2198> arrayList = new ArrayList<class_2198>();
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            class_2198[] arrclass_2198 = this.lIlllIlllIIIIlIIlllIllIII(string2);
            if (arrclass_2198 == null) {
                return lllIlIIlIIIlIlIIIllIlllIl;
            }
            arrayList.addAll(Arrays.asList(arrclass_2198));
        }
        class_2198[] arrclass_2198 = arrayList.toArray(new class_2198[arrayList.size()]);
        return arrclass_2198;
    }

    public class_2198[] lIlllIlllIIIIlIIlllIllIII(String string) {
        int n;
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).length() <= 0) {
            return null;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, ":");
        String string2 = "minecraft";
        boolean bl = false;
        if (arrstring.length > 1 && this.lllIIIllIIIIlllIlIIllIIll(arrstring)) {
            string2 = arrstring[0];
            n = 1;
        } else {
            string2 = "minecraft";
            n = 0;
        }
        String string3 = arrstring[n];
        String[] arrstring2 = Arrays.copyOfRange(arrstring, n + 1, arrstring.length);
        Block[] arrclass_0549 = this.lllIIIllIIIIlllIlIIllIIll(string2, string3);
        if (arrclass_0549 == null) {
            return null;
        }
        class_2198[] arrclass_2198 = new class_2198[arrclass_0549.length];
        for (int i = 0; i < arrclass_0549.length; ++i) {
            class_2198 class_21982;
            Block class_05492 = arrclass_0549[i];
            int n2 = Block.lllIIIllIIIIlllIlIIllIIll(class_05492);
            int[] arrn = null;
            if (arrstring2.length > 0 && (arrn = this.lllIIIllIIIIlllIlIIllIIll(class_05492, arrstring2)) == null) {
                return null;
            }
            arrclass_2198[i] = class_21982 = new class_2198(n2, arrn);
        }
        return arrclass_2198;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring) {
        if (arrstring.length < 2) {
            return false;
        }
        String string = arrstring[1];
        return string.length() < 1 ? false : (this.IlIIIIIllllllIIlllIllllll(string) ? false : !string.contains("="));
    }

    public boolean IlIIIIIllllllIIlllIllllll(String string) {
        if (string == null) {
            return false;
        }
        if (string.length() < 1) {
            return false;
        }
        char c = string.charAt(0);
        return Character.isDigit(c);
    }

    public Block[] lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        if (this.IlIIIIIllllllIIlllIllllll(string2)) {
            int[] arrn = this.IIIllIllIIlIlIlIlIllllIIl(string2);
            if (arrn == null) {
                return null;
            }
            Block[] arrclass_0549 = new Block[arrn.length];
            for (int i = 0; i < arrn.length; ++i) {
                int n = arrn[i];
                Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(n);
                if (class_05492 == null) {
                    this.lIIIIlIlIIlllllIIllIIlIII("net.minecraft.block.Block not found for id: " + n);
                    return null;
                }
                arrclass_0549[i] = class_05492;
            }
            return arrclass_0549;
        }
        String string3 = string + ":" + string2;
        Block class_05493 = Block.lllIIIllIIIIlllIlIIllIIll(string3);
        if (class_05493 == null) {
            this.lIIIIlIlIIlllllIIllIIlIII("net.minecraft.block.Block not found for name: " + string3);
            return null;
        }
        Block[] arrclass_0549 = new Block[]{class_05493};
        return arrclass_0549;
    }

    public int[] lllIIIllIIIIlllIlIIllIIll(Block class_05492, String[] arrstring) {
        if (arrstring.length <= 0) {
            return null;
        }
        String string = arrstring[0];
        if (this.IlIIIIIllllllIIlllIllllll(string)) {
            int[] arrn = this.IIIllIllIIlIlIlIlIllllIIl(string);
            return arrn;
        }
        this.lIIIIlIlIIlllllIIllIIlIII("Invalid block metadata: " + string);
        return null;
    }

    public class_0672[] lIllllIIlIIIlIllllllIIIll(String string) {
        if (string == null) {
            return null;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        ArrayList<class_0672> arrayList = new ArrayList<class_0672>();
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            class_0672 class_06722 = this.IIIllIIlIIIIIIlIlIIllIIlI(string2);
            if (class_06722 == null) {
                this.lIIIIlIlIIlllllIIllIIlIII("Biome not found: " + string2);
                continue;
            }
            arrayList.add(class_06722);
        }
        class_0672[] arrclass_0672 = arrayList.toArray(new class_0672[arrayList.size()]);
        return arrclass_0672;
    }

    public class_0672 IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        if ((string = string.toLowerCase()).equals("nether")) {
            return class_0672.lIlIllIIlIIlIIlIIlIIlIIll;
        }
        class_0672[] arrclass_0672 = class_0672.lllIIlIIIllllllIIIIlIlIlI();
        for (int i = 0; i < arrclass_0672.length; ++i) {
            String string2;
            class_0672 class_06722 = arrclass_0672[i];
            if (class_06722 == null || !(string2 = class_06722.IlIIIlIllIIIllIIIIlIIlIll.replace(" ", "").toLowerCase()).equals(string)) continue;
            return class_06722;
        }
        return null;
    }

    public int IllIIlllllllIIlIIlIIIIlIl(String string) {
        if (string == null) {
            return -1;
        }
        int n = Config.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII("Invalid number: " + string);
        }
        return n;
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        if (string == null) {
            return n;
        }
        int n2 = Config.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n2 < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII("Invalid number: " + string);
            return n;
        }
        return n2;
    }

    public int[] IIIllIllIIlIlIlIlIllllIIl(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ,");
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.contains("-")) {
                String[] arrstring2 = Config.lllIIIllIIIIlllIlIIllIIll(string2, "-");
                if (arrstring2.length != 2) {
                    this.lIIIIlIlIIlllllIIllIIlIII("Invalid statusUpdateInterval: " + string2 + ", when parsing: " + string);
                    continue;
                }
                int n = Config.lllIIIllIIIIlllIlIIllIIll(arrstring2[0], -1);
                int n2 = Config.lllIIIllIIIIlllIlIIllIIll(arrstring2[1], -1);
                if (n >= 0 && n2 >= 0 && n <= n2) {
                    for (int j = n; j <= n2; ++j) {
                        arrayList.add(j);
                    }
                    continue;
                }
                this.lIIIIlIlIIlllllIIllIIlIII("Invalid statusUpdateInterval: " + string2 + ", when parsing: " + string);
                continue;
            }
            int n = Config.lllIIIllIIIIlllIlIIllIIll(string2, -1);
            if (n < 0) {
                this.lIIIIlIlIIlllllIIllIIlIII("Invalid number: " + string2 + ", when parsing: " + string);
                continue;
            }
            arrayList.add(n);
        }
        int[] arrn = new int[arrayList.size()];
        for (int i = 0; i < arrn.length; ++i) {
            arrn[i] = (Integer)arrayList.get(i);
        }
        return arrn;
    }

    public void IllIIIllIIIIlIlIlIllIIlll(String string) {
        Config.lllIIIllIIIIlllIlIIllIIll("" + this.lllIIIllIIIIlllIlIIllIIll + ": " + string);
    }

    public void lIIIIlIlIIlllllIIllIIlIII(String string) {
        Config.lllIlIIlIIIlIlIIIllIlllIl("" + this.lllIIIllIIIIlllIlIIllIIll + ": " + string);
    }

    public class_1475 llIIlllIllIllllIIIlIIIIII(String string) {
        if (string == null) {
            return null;
        }
        class_1475 class_14752 = new class_1475();
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ,");
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            class_1519 class_15192 = this.lllIIlIIIllllllIIIIlIlIlI(string2);
            if (class_15192 == null) {
                return null;
            }
            class_14752.lllIIIllIIIIlllIlIIllIIll(class_15192);
        }
        return class_14752;
    }

    private class_1519 lllIIlIIIllllllIIIIlIlIlI(String string) {
        if (string == null) {
            return null;
        }
        if (string.indexOf(45) >= 0) {
            String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, "-");
            if (arrstring.length != 2) {
                this.lIIIIlIlIIlllllIIllIIlIII("Invalid range: " + string);
                return null;
            }
            int n = Config.lllIIIllIIIIlllIlIIllIIll(arrstring[0], -1);
            int n2 = Config.lllIIIllIIIIlllIlIIllIIll(arrstring[1], -1);
            if (n >= 0 && n2 >= 0) {
                return new class_1519(n, n2);
            }
            this.lIIIIlIlIIlllllIIllIIlIII("Invalid range: " + string);
            return null;
        }
        int n = Config.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII("Invalid integer: " + string);
            return null;
        }
        return new class_1519(n, n);
    }

    public static boolean llIIllIllIlIIlIIllIllllll(String string) {
        return string == null ? false : string.toLowerCase().equals("true");
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(String string, int n) {
        if (string == null) {
            return n;
        }
        string = string.trim();
        try {
            int n2 = Integer.parseInt(string, 16) & 0xFFFFFF;
            return n2;
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }
}

