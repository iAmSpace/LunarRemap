package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import optifine.Config;

import java.util.ArrayList;
import java.util.Properties;

public class class_1301 {
    public String lllIIIllIIIIlllIlIIllIIll = null;
    public String lllIlIIlIIIlIlIIIllIlllIl = null;
    public int[] IlIllllllIIlIIllllIIlIIIl = null;
    public String[] lIlllIlllIIIIlIIlllIllIII = null;
    public int IlIIIIIllllllIIlllIllllll = 0;
    public String[] lIllllIIlIIIlIllllllIIIll = null;
    public int IIIllIIlIIIIIIlIlIIllIIlI = 0;
    public int IllIIlllllllIIlIIlIIIIlIl = 63;
    public int[] IIIllIllIIlIlIlIlIllllIIl = null;
    public class_0672[] IllIIIllIIIIlIlIlIllIIlll = null;
    public int lIIIIlIlIIlllllIIllIIlIII = 0;
    public int llIIlllIllIllllIIIlIIIIII = 1024;
    public int llIIllIllIlIIlIIllIllllll = 0;
    public boolean lllIIlIIIllllllIIIIlIlIlI = false;
    public int IlIlllIIIIIIlIIllIIllIlll = 0;
    public int IlIlIIlIlIllIIlIlIIllIIIl = 0;
    public int[] lllllIlllIIllIlIIlIIIllII = null;
    public int IlIlIIlllIIlIllIIIlllllIl = 1;
    public int[] lIIlIIIIIlIlllIlIIlIlIlll = null;
    public int lIlIlIIlIIIIlIIIIIlllIIII = 1;
    public IIcon[] IlIIIlIIIIllIIIllIIIIIIll = null;
    public IIcon[] IIlllIlIlllIllIIIlllIIlIl = null;
    public static final int lIlIllIIlIIlIIlIIlIIlIIll = 0;
    public static final int llIIlIllIllllIlIIIIlIIlll = 1;
    public static final int llIllllIlIllIIIlIllIIlIlI = 2;
    public static final int lIlllIlllIlIIIIlllIlIlIIl = 3;
    public static final int IlIIlllllIIlIlIlllllIllll = 4;
    public static final int llIIlIlIlllIIllIlIlllIllI = 5;
    public static final int IllIIIIllIIllIllIlllIlIIl = 6;
    public static final int IIIIIIIIlIllIIllIIlllIllI = 7;
    public static final int IIlIIlIlIlIllIIlIlIIIIlll = 8;
    public static final int llIIIlllIlllIlIllIIIIllIl = 9;
    public static final int IIIIlIllIlIIlIIlIllIlIlll = 0;
    public static final int IlIlIIlllIllllllllIIIlIlI = 1;
    public static final int llllIIIIlIIIlIIIIIIlIllll = 2;
    public static final int llIIIIllIIIIIIIlIIIlIIIIl = 3;
    public static final int IIllIllIIllIIlllIIIlIlllI = 128;
    public static final int llllllIlIllllIlIlIlIIIIlI = 1;
    public static final int lIlIIllllIlIIIIllIIIIlIIl = 2;
    public static final int llIlllIIllIlllIlIlIlIIIll = 4;
    public static final int IIIIlIIlIIIllIIIIllIIIlII = 8;
    public static final int lllIIIIIIlIlllIIlIlIIIllI = 16;
    public static final int llIIlIIllIIllIlIIllIIllII = 32;
    public static final int lIlIlIIIIIIlIIllllIlIIllI = 60;
    public static final int IllllIIIIlIIlIIIIlllIIIIl = 63;
    public static final int llllIlIIIIIIIIIlllIIlIIIl = 128;
    public static final int IIIIlIlIIlIIIIlIlllIlIIII = 1;
    public static final int lllIIIIlIlIIlIIlllIIIIIIl = 2;
    public static final int llIlIIlllIIIIIllIIlIlIIII = 6;
    public static final int IllIIIlllllIlIlllIlllllII = 128;

    public class_1301(Properties properties, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_1301.IlIllllllIIlIIllllIIlIIIl(string);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_1301.lIlllIlllIIIIlIIlllIllIII(string);
        this.IlIllllllIIlIIllllIIlIIIl = class_1301.IlIlllIIIIIIlIIllIIllIlll(properties.getProperty("matchBlocks"));
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl(properties.getProperty("matchTiles"));
        this.IlIIIIIllllllIIlllIllllll = class_1301.lllllIlllIIllIlIIlIIIllII(properties.getProperty("method"));
        this.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI(properties.getProperty("tiles"));
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_1301.llIIllIllIlIIlIIllIllllll(properties.getProperty("connect"));
        this.IllIIlllllllIIlIIlIIIIlIl = class_1301.lIIIIlIlIIlllllIIllIIlIII(properties.getProperty("faces"));
        this.IIIllIllIIlIlIlIlIllllIIl = class_1301.lllIIlIIIllllllIIIIlIlIlI(properties.getProperty("metadata"));
        this.IllIIIllIIIIlIlIlIllIIlll = class_1301.IlIIIIIllllllIIlllIllllll(properties.getProperty("biomes"));
        this.lIIIIlIlIIlllllIIllIIlIII = class_1301.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("minHeight"), -1);
        this.llIIlllIllIllllIIIlIIIIII = class_1301.lllIIIllIIIIlllIlIIllIIll(properties.getProperty("maxHeight"), 1024);
        this.llIIllIllIlIIlIIllIllllll = class_1301.IllIIlllllllIIlIIlIIIIlIl(properties.getProperty("renderPass"));
        this.lllIIlIIIllllllIIIIlIlIlI = class_1301.IIIllIllIIlIlIlIlIllllIIl(properties.getProperty("innerSeams"));
        this.IlIlllIIIIIIlIIllIIllIlll = class_1301.IllIIlllllllIIlIIlIIIIlIl(properties.getProperty("width"));
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_1301.IllIIlllllllIIlIIlIIIIlIl(properties.getProperty("height"));
        this.lllllIlllIIllIlIIlIIIllII = class_1301.lllIIlIIIllllllIIIIlIlIlI(properties.getProperty("weights"));
        this.IlIlIIlllIIlIllIIIlllllIl = class_1301.IllIIIllIIIIlIlIlIllIIlll(properties.getProperty("symmetry"));
    }

    private String[] lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string == null) {
            return null;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.endsWith(".png")) {
                string2 = string2.substring(0, string2.length() - 4);
            }
            arrstring[i] = string2 = class_1384.lllIIIllIIIIlllIlIIllIIll(string2, this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        return arrstring;
    }

    private static String IlIllllllIIlIIllllIIlIIIl(String string) {
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

    private static String lIlllIlllIIIIlIIlllIllIII(String string) {
        int n = string.lastIndexOf(47);
        return n < 0 ? "" : string.substring(0, n);
    }

    private static class_0672[] IlIIIIIllllllIIlllIllllll(String string) {
        if (string == null) {
            return null;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ");
        ArrayList<class_0672> arrayList = new ArrayList<class_0672>();
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            class_0672 class_06722 = class_1301.lIllllIIlIIIlIllllllIIIll(string2);
            if (class_06722 == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Biome not found: " + string2);
                continue;
            }
            arrayList.add(class_06722);
        }
        class_0672[] arrclass_0672 = arrayList.toArray(new class_0672[arrayList.size()]);
        return arrclass_0672;
    }

    private static class_0672 lIllllIIlIIIlIllllllIIIll(String string) {
        string = string.toLowerCase();
        class_0672[] arrclass_0672 = class_0672.lllIIlIIIllllllIIIIlIlIlI();
        for (int i = 0; i < arrclass_0672.length; ++i) {
            String string2;
            class_0672 class_06722 = arrclass_0672[i];
            if (class_06722 == null || !(string2 = class_06722.IlIIIlIllIIIllIIIIlIIlIll.replace(" ", "").toLowerCase()).equals(string)) continue;
            return class_06722;
        }
        return null;
    }

    private String[] IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        Object object;
        if (string == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ,");
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.contains("-") && ((String[])(object = Config.lllIIIllIIIIlllIlIIllIIll(string2, "-"))).length == 2) {
                int n = Config.lllIIIllIIIIlllIlIIllIIll(object[0], -1);
                int n2 = Config.lllIIIllIIIIlllIlIIllIIll(object[1], -1);
                if (n >= 0 && n2 >= 0) {
                    if (n <= n2) {
                        for (int j = n; j <= n2; ++j) {
                            arrayList.add(String.valueOf(j));
                        }
                        continue;
                    }
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid statusUpdateInterval: " + string2 + ", when parsing: " + string);
                    continue;
                }
            }
            arrayList.add(string2);
        }
        String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        for (int i = 0; i < arrstring2.length; ++i) {
            String string3;
            object = arrstring2[i];
            if (!(((String)(object = class_1384.lllIIIllIIIIlllIlIIllIIll((String)object, this.lllIlIIlIIIlIlIIIllIlllIl))).startsWith(this.lllIlIIlIIIlIlIIIllIlllIl) || ((String)object).startsWith("textures/") || ((String)object).startsWith("mcpatcher/"))) {
                object = this.lllIlIIlIIIlIlIIIllIlllIl + "/" + (String)object;
            }
            if (((String)object).endsWith(".png")) {
                object = ((String)object).substring(0, ((String)object).length() - 4);
            }
            if (((String)object).startsWith(string3 = "textures/blocks/")) {
                object = ((String)object).substring(string3.length());
            }
            if (((String)object).startsWith("/")) {
                object = ((String)object).substring(1);
            }
            arrstring2[i] = object;
        }
        return arrstring2;
    }

    private static int IllIIlllllllIIlIIlIIIIlIl(String string) {
        if (string == null) {
            return -1;
        }
        int n = Config.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n < 0) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid number: " + string);
        }
        return n;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        if (string == null) {
            return n;
        }
        int n2 = Config.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n2 < 0) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid number: " + string);
            return n;
        }
        return n2;
    }

    private static boolean IIIllIllIIlIlIlIlIllllIIl(String string) {
        return string == null ? false : string.toLowerCase().equals("true");
    }

    private static int IllIIIllIIIIlIlIlIllIIlll(String string) {
        if (string == null) {
            return 1;
        }
        if (string.equals("opposite")) {
            return 2;
        }
        if (string.equals("all")) {
            return 6;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown symmetry: " + string);
        return 1;
    }

    private static int lIIIIlIlIIlllllIIllIIlIII(String string) {
        if (string == null) {
            return 63;
        }
        String[] arrstring = Config.lllIIIllIIIIlllIlIIllIIll(string, " ,");
        int n = 0;
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            int n2 = class_1301.llIIlllIllIllllIIIlIIIIII(string2);
            n |= n2;
        }
        return n;
    }

    private static int llIIlllIllIllllIIIlIIIIII(String string) {
        if ((string = string.toLowerCase()).equals("bottom")) {
            return 1;
        }
        if (string.equals("top")) {
            return 2;
        }
        if (string.equals("north")) {
            return 4;
        }
        if (string.equals("south")) {
            return 8;
        }
        if (string.equals("east")) {
            return 32;
        }
        if (string.equals("west")) {
            return 16;
        }
        if (string.equals("sides")) {
            return 60;
        }
        if (string.equals("all")) {
            return 63;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown face: " + string);
        return 128;
    }

    private static int llIIllIllIlIIlIIllIllllll(String string) {
        if (string == null) {
            return 0;
        }
        if (string.equals("block")) {
            return 1;
        }
        if (string.equals("tile")) {
            return 2;
        }
        if (string.equals("material")) {
            return 3;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown connect: " + string);
        return 128;
    }

    private static int[] lllIIlIIIllllllIIIIlIlIlI(String string) {
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
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid statusUpdateInterval: " + string2 + ", when parsing: " + string);
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
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid statusUpdateInterval: " + string2 + ", when parsing: " + string);
                continue;
            }
            int n = Config.lllIIIllIIIIlllIlIIllIIll(string2, -1);
            if (n < 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid number: " + string2 + ", when parsing: " + string);
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

    private static int[] IlIlllIIIIIIlIIllIIllIlll(String string) {
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
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid statusUpdateInterval: " + string2 + ", when parsing: " + string);
                    continue;
                }
                int n = class_1301.IlIlIIlIlIllIIlIlIIllIIIl(arrstring2[0]);
                int n2 = class_1301.IlIlIIlIlIllIIlIlIIllIIIl(arrstring2[1]);
                if (n >= 0 && n2 >= 0 && n <= n2) {
                    for (int j = n; j <= n2; ++j) {
                        arrayList.add(j);
                    }
                    continue;
                }
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid statusUpdateInterval: " + string2 + ", when parsing: " + string);
                continue;
            }
            int n = class_1301.IlIlIIlIlIllIIlIlIIllIIIl(string2);
            if (n < 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid block ID: " + string2 + ", when parsing: " + string);
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

    private static int IlIlIIlIlIllIIlIlIIllIIIl(String string) {
        int n = Config.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n >= 0) {
            return n;
        }
        Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(string);
        return class_05492 != null ? Block.lllIIIllIIIIlllIlIIllIIll(class_05492) : -1;
    }

    private static int lllllIlllIIllIlIIlIIIllII(String string) {
        if (string == null) {
            return 1;
        }
        if (!string.equals("ctm") && !string.equals("glass")) {
            if (!string.equals("horizontal") && !string.equals("bookshelf")) {
                if (string.equals("vertical")) {
                    return 6;
                }
                if (string.equals("top")) {
                    return 3;
                }
                if (string.equals("random")) {
                    return 4;
                }
                if (string.equals("repeat")) {
                    return 5;
                }
                if (string.equals("fixed")) {
                    return 7;
                }
                if (!string.equals("horizontal+vertical") && !string.equals("h+v")) {
                    if (!string.equals("vertical+horizontal") && !string.equals("v+h")) {
                        Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown method: " + string);
                        return 0;
                    }
                    return 9;
                }
                return 8;
            }
            return 2;
        }
        return 1;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.length() > 0) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("No base path found: " + string);
                return false;
            }
            if (this.IlIllllllIIlIIllllIIlIIIl == null) {
                this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl();
            }
            if (this.lIlllIlllIIIIlIIlllIllIII == null && this.IlIllllllIIlIIllllIIlIIIl == null) {
                this.lIlllIlllIIIIlIIlllIllIII = this.IlIllllllIIlIIllllIIlIIIl();
            }
            if (this.IlIllllllIIlIIllllIIlIIIl == null && this.lIlllIlllIIIIlIIlllIllIII == null) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("No matchBlocks or matchTiles specified: " + string);
                return false;
            }
            if (this.IlIIIIIllllllIIlllIllllll == 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("No method: " + string);
                return false;
            }
            if (this.lIllllIIlIIIlIllllllIIIll != null && this.lIllllIIlIIIlIllllllIIIll.length > 0) {
                if (this.IIIllIIlIIIIIIlIlIIllIIlI == 0) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll();
                }
                if (this.IIIllIIlIIIIIIlIlIIllIIlI == 128) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid connect in: " + string);
                    return false;
                }
                if (this.llIIllIllIlIIlIIllIllllll > 0) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Render pass not supported: " + this.llIIllIllIlIIlIIllIllllll);
                    return false;
                }
                if ((this.IllIIlllllllIIlIIlIIIIlIl & 0x80) != 0) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid faces in: " + string);
                    return false;
                }
                if ((this.IlIlIIlllIIlIllIIIlllllIl & 0x80) != 0) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid symmetry in: " + string);
                    return false;
                }
                switch (this.IlIIIIIllllllIIlllIllllll) {
                    case 1: {
                        return this.lIIlIIIIIlIlllIlIIlIlIlll(string);
                    }
                    case 2: {
                        return this.lIlIlIIlIIIIlIIIIIlllIIII(string);
                    }
                    case 3: {
                        return this.IlIIlllllIIlIlIlllllIllll(string);
                    }
                    case 4: {
                        return this.llIIlIllIllllIlIIIIlIIlll(string);
                    }
                    case 5: {
                        return this.llIllllIlIllIIIlIllIIlIlI(string);
                    }
                    case 6: {
                        return this.IlIIIlIIIIllIIIllIIIIIIll(string);
                    }
                    case 7: {
                        return this.lIlllIlllIlIIIIlllIlIlIIl(string);
                    }
                    case 8: {
                        return this.IIlllIlIlllIllIIIlllIIlIl(string);
                    }
                    case 9: {
                        return this.lIlIllIIlIIlIIlIIlIIlIIll(string);
                    }
                }
                Config.lllIlIIlIIIlIlIIIllIlllIl("Unknown method: " + string);
                return false;
            }
            Config.lllIlIIlIIIlIlIIIllIlllIl("No tiles specified: " + string);
            return false;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("No name found: " + string);
        return false;
    }

    private int lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl != null ? 1 : (this.lIlllIlllIIIIlIIlllIllIII != null ? 2 : 128);
    }

    private int[] lllIlIIlIIIlIlIIIllIlllIl() {
        int[] arrn;
        int n;
        char c;
        int n2;
        if (!this.lllIIIllIIIIlllIlIIllIIll.startsWith("block")) {
            return null;
        }
        for (n2 = n = "block".length(); n2 < this.lllIIIllIIIIlllIlIIllIIll.length() && (c = this.lllIIIllIIIIlllIlIIllIIll.charAt(n2)) >= '0' && c <= '9'; ++n2) {
        }
        if (n2 == n) {
            return null;
        }
        String string = this.lllIIIllIIIIlllIlIIllIIll.substring(n, n2);
        int n3 = Config.lllIIIllIIIIlllIlIIllIIll(string, -1);
        if (n3 < 0) {
            arrn = null;
        } else {
            int[] arrn2 = new int[1];
            arrn = arrn2;
            arrn2[0] = n3;
        }
        return arrn;
    }

    private String[] IlIllllllIIlIIllllIIlIIIl() {
        String[] arrstring;
        IIcon class_21022 = class_1301.IlIlIIlllIIlIllIIIlllllIl(this.lllIIIllIIIIlllIlIIllIIll);
        if (class_21022 == null) {
            arrstring = null;
        } else {
            String[] arrstring2 = new String[1];
            arrstring = arrstring2;
            arrstring2[0] = this.lllIIIllIIIIlllIlIIllIIll;
        }
        return arrstring;
    }

    private static IIcon IlIlIIlllIIlIllIIIlllllIl(String string) {
        return class_1511.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(string);
    }

    private boolean lIIlIIIIIlIlllIlIIlIlIlll(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            this.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI("0-11 16-27 32-43 48-58");
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length < 47) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid tiles, must be at least 47: " + string);
            return false;
        }
        return true;
    }

    private boolean lIlIlIIlIIIIlIIIIIlllIIII(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            this.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI("12-15");
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length != 4) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid tiles, must be exactly 4: " + string);
            return false;
        }
        return true;
    }

    private boolean IlIIIlIIIIllIIIllIIIIIIll(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("No tiles defined for vertical: " + string);
            return false;
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length != 4) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid tiles, must be exactly 4: " + string);
            return false;
        }
        return true;
    }

    private boolean IIlllIlIlllIllIIIlllIIlIl(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("No tiles defined for horizontal+vertical: " + string);
            return false;
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length != 7) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid tiles, must be exactly 7: " + string);
            return false;
        }
        return true;
    }

    private boolean lIlIllIIlIIlIIlIIlIIlIIll(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("No tiles defined for vertical+horizontal: " + string);
            return false;
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length != 7) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid tiles, must be exactly 7: " + string);
            return false;
        }
        return true;
    }

    private boolean llIIlIllIllllIlIIIIlIIlll(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll != null && this.lIllllIIlIIIlIllllllIIIll.length > 0) {
            if (this.lllllIlllIIllIlIIlIIIllII != null) {
                int n;
                int n2;
                int[] arrn;
                if (this.lllllIlllIIllIlIIlIIIllII.length > this.lIllllIIlIIIlIllllllIIIll.length) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("More weights defined than tiles, trimming weights: " + string);
                    arrn = new int[this.lIllllIIlIIIlIllllllIIIll.length];
                    System.arraycopy(this.lllllIlllIIllIlIIlIIIllII, 0, arrn, 0, arrn.length);
                    this.lllllIlllIIllIlIIlIIIllII = arrn;
                }
                if (this.lllllIlllIIllIlIIlIIIllII.length < this.lIllllIIlIIIlIllllllIIIll.length) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Less weights defined than tiles, expanding weights: " + string);
                    arrn = new int[this.lIllllIIlIIIlIllllllIIIll.length];
                    System.arraycopy(this.lllllIlllIIllIlIIlIIIllII, 0, arrn, 0, this.lllllIlllIIllIlIIlIIIllII.length);
                    n2 = this.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII);
                    for (n = this.lllllIlllIIllIlIIlIIIllII.length; n < arrn.length; ++n) {
                        arrn[n] = n2;
                    }
                    this.lllllIlllIIllIlIIlIIIllII = arrn;
                }
                this.lIIlIIIIIlIlllIlIIlIlIlll = new int[this.lllllIlllIIllIlIIlIIIllII.length];
                n = 0;
                for (n2 = 0; n2 < this.lllllIlllIIllIlIIlIIIllII.length; ++n2) {
                    this.lIIlIIIIIlIlllIlIIlIlIlll[n2] = n += this.lllllIlllIIllIlIIlIIIllII[n2];
                }
                this.lIlIlIIlIIIIlIIIIIlllIIII = n;
                if (this.lIlIlIIlIIIIlIIIIIlllIIII <= 0) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid sum of all weights: " + n);
                    this.lIlIlIIlIIIIlIIIIIlllIIII = 1;
                }
            }
            return true;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Tiles not defined: " + string);
        return false;
    }

    private int lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        int n;
        if (arrn.length <= 0) {
            return 0;
        }
        int n2 = 0;
        for (n = 0; n < arrn.length; ++n) {
            int n3 = arrn[n];
            n2 += n3;
        }
        n = n2 / arrn.length;
        return n;
    }

    private boolean llIllllIlIllIIIlIllIIlIlI(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Tiles not defined: " + string);
            return false;
        }
        if (this.IlIlllIIIIIIlIIllIIllIlll > 0 && this.IlIlllIIIIIIlIIllIIllIlll <= 16) {
            if (this.IlIlIIlIlIllIIlIlIIllIIIl > 0 && this.IlIlIIlIlIllIIlIlIIllIIIl <= 16) {
                if (this.lIllllIIlIIIlIllllllIIIll.length != this.IlIlllIIIIIIlIIllIIllIlll * this.IlIlIIlIlIllIIlIlIIllIIIl) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("Number of tiles does not equal width x height: " + string);
                    return false;
                }
                return true;
            }
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid height: " + string);
            return false;
        }
        Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid width: " + string);
        return false;
    }

    private boolean lIlllIlllIlIIIIlllIlIlIIl(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Tiles not defined: " + string);
            return false;
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length != 1) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Number of tiles should be 1 for method: fixed.");
            return false;
        }
        return true;
    }

    private boolean IlIIlllllIIlIlIlllllIllll(String string) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            this.lIllllIIlIIIlIllllllIIIll = this.IIIllIIlIIIIIIlIlIIllIIlI("66");
        }
        if (this.lIllllIIlIIIlIllllllIIIll.length != 1) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid tiles, must be exactly 1: " + string);
            return false;
        }
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1511 class_15112) {
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.IlIIIlIIIIllIIIllIIIIIIll = class_1301.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, class_15112);
        }
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            this.IIlllIlIlllIllIIIlllIIlIl = class_1301.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, class_15112);
        }
    }

    private static IIcon[] lllIIIllIIIIlllIlIIllIIll(String[] arrstring, class_1511 class_15112) {
        if (arrstring == null) {
            return null;
        }
        ArrayList<IIcon> arrayList = new ArrayList<IIcon>();
        for (int i = 0; i < arrstring.length; ++i) {
            String string;
            ResourceLocation class_17732;
            boolean bl;
            String string2;
            String string3 = string2 = arrstring[i];
            if (!string2.contains("/")) {
                string3 = "textures/blocks/" + string2;
            }
            if (!(bl = Config.IlIllllllIIlIIllllIIlIIIl(class_17732 = new ResourceLocation(string = string3 + ".png")))) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("File not found: " + string);
            }
            IIcon class_21022 = class_15112.lllIIIllIIIIlllIlIIllIIll(string2);
            arrayList.add(class_21022);
        }
        IIcon[] arrclass_2102 = arrayList.toArray(new IIcon[arrayList.size()]);
        return arrclass_2102;
    }

    public String toString() {
        return "CTM name: " + this.lllIIIllIIIIlllIlIIllIIll + ", basePath: " + this.lllIlIIlIIIlIlIIIllIlllIl + ", matchBlocks: " + Config.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl) + ", matchTiles: " + Config.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
    }
}

