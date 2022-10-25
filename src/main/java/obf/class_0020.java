package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

import java.text.DecimalFormat;

public class class_0020
extends class_1432 {
    public static boolean lllIIIllIIIIlllIlIIllIIll;
    public static boolean lllIlIIlIIIlIlIIIllIlllIl;
    public static boolean IlIllllllIIlIIllllIIlIIIl;
    public static boolean lIlllIlllIIIIlIIlllIllIII;
    public static boolean IlIIIIIllllllIIlllIllllll;
    private static long lIIIIlIlIIlllllIIllIIlIII;
    private static long llIIlllIllIllllIIIlIIIIII;
    private static boolean llIIllIllIlIIlIIllIllllll;
    private static boolean lllIIlIIIllllllIIIIlIlIlI;
    private static boolean IlIlllIIIIIIlIIllIIllIlll;
    private static boolean IlIlIIlIlIllIIlIlIIllIIIl;
    private static boolean lllllIlllIIllIlIIlIIIllII;
    public static String lIllllIIlIIIlIllllllIIIll;

    public class_0020(GameSettings class_17512) {
        super(class_17512);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, class_1432 class_14322, class_0139 class_01392) {
        class_14322.IIIllIIlIIIIIIlIlIIllIIlI = 0.0f;
        class_14322.IllIIlllllllIIlIIlIIIIlIl = 0.0f;
        GameSettings class_17512 = class_06672.gameSettings;
        if (class_17512.lllIIIlllIlllIIlIllllIIlI.lIlllIlllIIIIlIIlllIllIII()) {
            class_14322.IllIIlllllllIIlIIlIIIIlIl += 1.0f;
        }
        if (class_17512.lIIlIIIlIlIIlllIlIllIllIl.lIlllIlllIIIIlIIlllIllIII()) {
            class_14322.IllIIlllllllIIlIIlIIIIlIl -= 1.0f;
        }
        if (class_17512.lIIlIlllIIlllIIlllIIlIlII.lIlllIlllIIIIlIIlllIllIII()) {
            class_14322.IIIllIIlIIIIIIlIlIIllIIlI += 1.0f;
        }
        if (class_17512.lIIlIlIIIIIllIIIIllIlIlII.lIlllIlllIIIIlIIlllIllIII()) {
            class_14322.IIIllIIlIIIIIIlIlIIllIIlI -= 1.0f;
        }
        if (class_01392.lIlIlIIllIIIlllIllIIlIllI() && !IlIlIIlIlIllIIlIlIIllIIIl) {
            IlIlIIlIlIllIIlIlIIllIIIl = true;
            lllllIlllIIllIlIIlIIIllII = IlIllllllIIlIIllllIIlIIIl;
        } else if (IlIlIIlIlIllIIlIlIIllIIIl && !class_01392.lIlIlIIllIIIlllIllIIlIllI()) {
            IlIlIIlIlIllIIlIlIIllIIIl = false;
            if (lllllIlllIIllIlIIlIIIllII && !IlIllllllIIlIIllllIIlIIIl) {
                IlIllllllIIlIIllllIIlIIIl = true;
                llIIlllIllIllllIIIlIIIIII = System.currentTimeMillis();
                lllIIlIIIllllllIIIIlIlIlI = true;
                lIlllIlllIIIIlIIlllIllIII = false;
            }
        }
        class_14322.IIIllIllIIlIlIlIlIllllIIl = class_17512.lIIIIlIIIIllIlIIllllIlIII.lIlllIlllIIIIlIIlllIllIII();
        if (((Boolean)class_1046.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll()) {
            if (class_17512.lIIIlllllllIlllIIllllllll.lIlllIlllIIIIlIIlllIllIII() && !llIIllIllIlIIlIIllIllllll) {
                if (class_01392.lIlIlIIllIIIlllIllIIlIllI() || class_01392.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
                    class_14322.IllIIIllIIIIlIlIlIllIIlll = true;
                    IlIlllIIIIIIlIIllIIllIlll = class_01392.lIlIlIIllIIIlllIllIIlIllI();
                } else {
                    class_14322.IllIIIllIIIIlIlIlIllIIlll = !class_14322.IllIIIllIIIIlIlIlIllIIlll;
                }
                lIIIIlIlIIlllllIIllIIlIII = System.currentTimeMillis();
                llIIllIllIlIIlIIllIllllll = true;
            }
            if (!class_17512.lIIIlllllllIlllIIllllllll.lIlllIlllIIIIlIIlllIllIII() && llIIllIllIlIIlIIllIllllll) {
                if (class_01392.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl || IlIlllIIIIIIlIIllIIllIlll) {
                    class_14322.IllIIIllIIIIlIlIlIllIIlll = false;
                } else if (System.currentTimeMillis() - lIIIIlIlIIlllllIIllIIlIII > 300L) {
                    class_14322.IllIIIllIIIIlIlIlIllIIlll = false;
                }
                llIIllIllIlIIlIIllIllllll = false;
            }
        } else {
            class_14322.IllIIIllIIIIlIlIlIllIIlll = class_17512.lIIIlllllllIlllIIllllllll.lIlllIlllIIIIlIIlllIllIII();
        }
        if (class_14322.IllIIIllIIIIlIlIlIllIIlll) {
            class_14322.IIIllIIlIIIIIIlIlIIllIIlI = (float)((double)class_14322.IIIllIIlIIIIIIlIlIIllIIlI * 0.3);
            class_14322.IllIIlllllllIIlIIlIIIIlIl = (float)((double)class_14322.IllIIlllllllIIlIIlIIIIlIl * 0.3);
        }
        boolean bl = (float)class_01392.lIllIIlllIIIlIlIIIlllIlIl().lllIIIllIIIIlllIlIIllIIll() > 6.0f || class_01392.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl;
        boolean bl2 = !class_14322.IllIIIllIIIIlIlIlIllIIlll && !class_01392.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl && bl;
        lllIIIllIIIIlllIlIIllIIll = (Boolean)class_1046.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() == false;
        lllIlIIlIIIlIlIIIllIlllIl = (Boolean)class_1046.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII();
        if ((bl2 || lllIIIllIIIIlllIlIIllIIll) && class_17512.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII() && !lllIIlIIIllllllIIIIlIlIlI && !class_01392.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl && !lllIIIllIIIIlllIlIIllIIll) {
            IlIllllllIIlIIllllIIlIIIl = !IlIllllllIIlIIllllIIlIIIl;
            llIIlllIllIllllIIIlIIIIII = System.currentTimeMillis();
            lllIIlIIIllllllIIIIlIlIlI = true;
            lIlllIlllIIIIlIIlllIllIII = false;
        }
        if ((bl2 || lllIIIllIIIIlllIlIIllIIll) && !class_17512.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII() && lllIIlIIIllllllIIIIlIlIlI) {
            if (System.currentTimeMillis() - llIIlllIllIllllIIIlIIIIII > 300L) {
                lIlllIlllIIIIlIIlllIllIII = true;
            }
            lllIIlIIIllllllIIIIlIlIlI = false;
        }
        class_0020.lllIIIllIIIIlllIlIIllIIll(class_14322, class_01392, class_17512);
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2) {
        IlIllllllIIlIIllllIIlIIIl = bl;
        IlIIIIIllllllIIlllIllllll = bl2;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_1432 class_14322, class_0139 class_01392, GameSettings class_17512) {
        lIllllIIlIIIlIllllllIIIll = "";
        if (((Boolean)class_1046.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            String string = "";
            boolean bl = class_01392.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl;
            boolean bl2 = class_01392.lIlIlIIllIIIlllIllIIlIllI();
            boolean bl3 = class_17512.lIIIlllllllIlllIIllllllll.lIlllIlllIIIIlIIlllIllIII();
            boolean bl4 = class_17512.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII();
            if (bl) {
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                string = (Boolean)class_1046.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII() != false && bl4 && class_01392.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII ? string + ((String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII()).replaceAll("%BOOST%", decimalFormat.format(class_1046.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII())) : string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII();
            }
            if (bl2) {
                string = string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII();
            }
            if (class_14322.IllIIIllIIIIlIlIlIllIIlll) {
                string = bl ? string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII.lIlllIlllIIIIlIIlllIllIII() : (bl2 ? string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII() : (bl3 ? string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.llIIllIllIlIIlIIllIllllll.lIlllIlllIIIIlIIlllIllIII() : string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII.lIlllIlllIIIIlIIlllIllIII()));
            } else if (IlIllllllIIlIIllllIIlIIIl && !bl && !bl2) {
                boolean bl5;
                boolean bl6 = bl5 = lIlllIlllIIIIlIIlllIllIII || lllIIIllIIIIlllIlIIllIIll || IlIIIIIllllllIIlllIllllll;
                string = bl4 ? string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII() : (bl5 ? string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.IlIlllIIIIIIlIIllIIllIlll.lIlllIlllIIIIlIIlllIllIII() : string + (String) LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl.lIlllIlllIIIIlIIlllIllIII());
            }
            lIllllIIlIIIlIllllllIIIll = string;
        }
    }

    static {
        IlIllllllIIlIIllllIIlIIIl = true;
        lIlllIlllIIIIlIIlllIllIII = false;
        IlIIIIIllllllIIlllIllllll = false;
        lIllllIIlIIIlIllllllIIIll = "";
    }
}

