package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Objects;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.block.BlockFire;
import optifine.Config;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1333 {
    public class_1843 lllIIIllIIIIlllIlIIllIIll;
    public IIcon lllIlIIlIIIlIlIIIllIlllIl;
    public boolean IlIllllllIIlIIllllIIlIIIl;
    public boolean lIlllIlllIIIIlIIlllIllIII;
    public boolean IlIIIIIllllllIIlllIllllll;
    public static boolean lIllllIIlIIIlIllllllIIIll = true;
    public static boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    public boolean IllIIlllllllIIlIIlIIIIlIl = true;
    public boolean IIIllIllIIlIlIlIlIllllIIl = false;
    public double IllIIIllIIIIlIlIlIllIIlll;
    public double lIIIIlIlIIlllllIIllIIlIII;
    public double llIIlllIllIllllIIIlIIIIII;
    public double llIIllIllIlIIlIIllIllllll;
    public double lllIIlIIIllllllIIIIlIlIlI;
    public double IlIlllIIIIIIlIIllIIllIlll;
    public boolean IlIlIIlIlIllIIlIlIIllIIIl;
    public boolean lllllIlllIIllIlIIlIIIllII;
    public final Minecraft IlIlIIlllIIlIllIIIlllllIl;
    public int lIIlIIIIIlIlllIlIIlIlIlll;
    public int lIlIlIIlIIIIlIIIIIlllIIII;
    public int IlIIIlIIIIllIIIllIIIIIIll;
    public int IIlllIlIlllIllIIIlllIIlIl;
    public int lIlIllIIlIIlIIlIIlIIlIIll;
    public int llIIlIllIllllIlIIIIlIIlll;
    public boolean llIllllIlIllIIIlIllIIlIlI;
    public float lIlllIlllIlIIIIlllIlIlIIl;
    public float IlIIlllllIIlIlIlllllIllll;
    public float llIIlIlIlllIIllIlIlllIllI;
    public float IllIIIIllIIllIllIlllIlIIl;
    public float IIIIIIIIlIllIIllIIlllIllI;
    public float IIlIIlIlIlIllIIlIlIIIIlll;
    public float llIIIlllIlllIlIllIIIIllIl;
    public float IIIIlIllIlIIlIIlIllIlIlll;
    public float IlIlIIlllIllllllllIIIlIlI;
    public float llllIIIIlIIIlIIIIIIlIllll;
    public float llIIIIllIIIIIIIlIIIlIIIIl;
    public float IIllIllIIllIIlllIIIlIlllI;
    public float llllllIlIllllIlIlIlIIIIlI;
    public float lIlIIllllIlIIIIllIIIIlIIl;
    public float llIlllIIllIlllIlIlIlIIIll;
    public float IIIIlIIlIIIllIIIIllIIIlII;
    public float lllIIIIIIlIlllIIlIlIIIllI;
    public float llIIlIIllIIllIlIIllIIllII;
    public float lIlIlIIIIIIlIIllllIlIIllI;
    public float IllllIIIIlIIlIIIIlllIIIIl;
    public int llllIlIIIIIIIIIlllIIlIIIl;
    public int IIIIlIlIIlIIIIlIlllIlIIII;
    public int lllIIIIlIlIIlIIlllIIIIIIl;
    public int llIlIIlllIIIIIllIIlIlIIII;
    public int IllIIIlllllIlIlllIlllllII;
    public int llIlllIlIIllIlIIIIllIIlIl;
    public int lIIIllIIIIIllllIlIlIllIll;
    public int lIIIlIIIlIlllIllIIIlIIIlI;
    public int lIIlIlllIllIlIlllIIIIIIII;
    public int IIlIllIIlllllIIlIIllllIIl;
    public int IllllIIlIIIllIlllIlllIllI;
    public int IllIlIlIIIlllIIllIIIIlIll;
    public int IlIIIlIllIIIllIIIIlIIlIll;
    public int llllIIllIlIlllllllIIlIIlI;
    public int IlllIIlllllllIIllIlIllllI;
    public int IlllIIIllllIIllIllIlIIlIl;
    public int lllIIIlIIlIlIllIIIIIlIIll;
    public int IIIlIlIllIlllllIlIllllllI;
    public int IIIIlIllIlIIIIIllllIIlllI;
    public int llllIlIIllIIlllllIIllIIll;
    public int IlIlIllIIlIIIIlllIlIllIlI;
    public int IlIIllIlIlIllIIIlIIlIlIIl;
    public int lIlIIllIllIIIIIlIllllIIIl;
    public int lIlllIIllIIIIIIlIlIIlIllI;
    public float llIIIlIlIlIIlIllIIIllIlIl;
    public float lIIlIIlIllIlIIlIlIIlIlIlI;
    public float llIIIIIlIIlIIIIllIIIlIIII;
    public float lIlIlIIllIIIlllIllIIlIllI;
    public float IlIIIIIllIlllIIIIlIIIllIl;
    public float lIIlIlIIllIIIlIIlIlIIIlII;
    public float lIIIlIIllIllIIlIIlIIIllII;
    public float lIlIllIIllIIIIlllIlIlllIl;
    public float IlIIIlIIlllllIIIllIlIlIll;
    public float lIIllllllllIlIllllllllIlI;
    public float lIIIIllIIllIIIlIIIllIllII;
    public float lIIllIIlIIIlllIlllIIlIIlI;
    public boolean IllIIllIlIlllIllIllIlIIIl;
    public float IIIlIllllIIIlllllIllIlIII = 0.2f;
    public boolean IIIIIllIlIllIlIlIIlIllIIl = true;
    private static class_1333 lIIllIlIIlIIlllllIlIIllIl;
    private final ResourceLocation lIIlllIIlIlIlIIIlIlllIIll = new ResourceLocation("textures/blocks/trip_wire_full.png");

    public class_1333(class_1843 class_18432) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18432;
        this.lIlllIlllIIIIlIIlllIllIII = false;
        this.IlIllllllIIlIIllllIIlIIIl = false;
        this.IlIlIIlllIIlIllIIIlllllIl = Minecraft.getMinecraft();
        this.IIIlIllllIIIlllllIllIlIII = 1.0f - Config.IllIIIlllllIlIlllIlllllII() * 0.8f;
    }

    public class_1333() {
        this.IlIlIIlllIIlIllIIIlllllIl = Minecraft.getMinecraft();
    }

    public void lllIIIllIIIIlllIlIIllIIll(IIcon class_21022) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_21022;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIIllIllIIlIlIlIlIllllIIl = bl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6) {
        if (!this.IlIlIIlIlIllIIlIlIIllIIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll = d;
            this.lIIIIlIlIIlllllIIllIIlIII = d4;
            this.llIIlllIllIllllIIIlIIIIII = d2;
            this.llIIllIllIlIIlIIllIllllll = d5;
            this.lllIIlIIIllllllIIIIlIlIlI = d3;
            this.IlIlllIIIIIIlIIllIIllIlll = d6;
            this.lllllIlllIIllIlIIlIIIllII = this.IlIlIIlllIIlIllIIIlllllIl.gameSettings.IllIIIllIIIIlIlIlIllIIlll >= 2 && (this.IllIIIllIIIIlIlIlIllIIlll > 0.0 || this.lIIIIlIlIIlllllIIllIIlIII < 1.0 || this.llIIlllIllIllllIIIlIIIIII > 0.0 || this.llIIllIllIlIIlIIllIllllll < 1.0 || this.lllIIlIIIllllllIIIIlIlIlI > 0.0 || this.IlIlllIIIIIIlIIllIIllIlll < 1.0);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        if (!this.IlIlIIlIlIllIIlIlIIllIIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll = class_05492.IlIlIIlllIIlIllIIIlllllIl();
            this.lIIIIlIlIIlllllIIllIIlIII = class_05492.lIIlIIIIIlIlllIlIIlIlIlll();
            this.llIIlllIllIllllIIIlIIIIII = class_05492.lIlIlIIlIIIIlIIIIIlllIIII();
            this.llIIllIllIlIIlIIllIllllll = class_05492.IlIIIlIIIIllIIIllIIIIIIll();
            this.lllIIlIIIllllllIIIIlIlIlI = class_05492.IIlllIlIlllIllIIIlllIIlIl();
            this.IlIlllIIIIIIlIIllIIllIlll = class_05492.lIlIllIIlIIlIIlIIlIIlIIll();
            this.lllllIlllIIllIlIIlIIIllII = this.IlIlIIlllIIlIllIIIlllllIl.gameSettings.IllIIIllIIIIlIlIlIllIIlll >= 2 && (this.IllIIIllIIIIlIlIlIllIIlll > 0.0 || this.lIIIIlIlIIlllllIIllIIlIII < 1.0 || this.llIIlllIllIllllIIIlIIIIII > 0.0 || this.llIIllIllIlIIlIIllIllllll < 1.0 || this.lllIIlIIIllllllIIIIlIlIlI > 0.0 || this.IlIlllIIIIIIlIIllIIllIlll < 1.0);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3, double d4, double d5, double d6) {
        this.IllIIIllIIIIlIlIlIllIIlll = d;
        this.lIIIIlIlIIlllllIIllIIlIII = d4;
        this.llIIlllIllIllllIIIlIIIIII = d2;
        this.llIIllIllIlIIlIIllIllllll = d5;
        this.lllIIlIIIllllllIIIIlIlIlI = d3;
        this.IlIlllIIIIIIlIIllIIllIlll = d6;
        this.IlIlIIlIlIllIIlIlIIllIIIl = true;
        this.lllllIlllIIllIlIIlIIIllII = this.IlIlIIlllIIlIllIIIlllllIl.gameSettings.IllIIIllIIIIlIlIlIllIIlll >= 2 && (this.IllIIIllIIIIlIlIlIllIIlll > 0.0 || this.lIIIIlIlIIlllllIIllIIlIII < 1.0 || this.llIIlllIllIllllIIIlIIIIII > 0.0 || this.llIIllIllIlIIlIIllIllllll < 1.0 || this.lllIIlIIIllllllIIIIlIlIlI > 0.0 || this.IlIlllIIIIIIlIIllIIllIlll < 1.0);
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIlIIlIlIllIIlIlIIllIIIl = false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, int n2, int n3, IIcon class_21022) {
        this.lllIIIllIIIIlllIlIIllIIll(class_21022);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, int n2, int n3) {
        this.IlIIIIIllllllIIlllIllllll = true;
        this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, n, n2, n3);
        this.IlIIIIIllllllIIlllIllllll = false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492, int n, int n2, int n3) {
        int n4 = class_05492.lIIIIlIlIIlllllIIllIIlIII();
        if (n4 == -1) {
            return false;
        }
        this.IlIIIIIllllllIIlllIllllll = LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(class_05492), this.IlIIIIIllllllIIlllIllllll);
        String string = (String) LunarClient.getInstance().getSettingsManager().rsClearGlass.getValue();
        if (!Objects.equals(string, "NO") && (class_05492 instanceof class_0166 ? string.equals("REGULAR") || string.equals("ALL") : class_05492 instanceof class_2258 && string.equals("ALL"))) {
            return true;
        }
        class_05492.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && class_05492 == Blocks.IlIlIllIIlIIIIlllIlIllIlI && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_05492);
        switch (n4) {
            case 0: {
                return this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
            }
            case 1: {
                return this.llIIllIllIlIIlIIllIllllll(class_05492, n, n2, n3);
            }
            case 2: {
                return this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3);
            }
            case 3: {
                return this.lllIIIllIIIIlllIlIIllIIll((BlockFire)class_05492, n, n2, n3);
            }
            case 4: {
                return this.lllllIlllIIllIlIIlIIIllII(class_05492, n, n2, n3);
            }
            case 5: {
                return this.IIIllIllIIlIlIlIlIllllIIl(class_05492, n, n2, n3);
            }
            case 6: {
                return this.IlIlllIIIIIIlIIllIIllIlll(class_05492, n, n2, n3);
            }
            case 7: {
                return this.IIlllIlIlllIllIIIlllIIlIl(class_05492, n, n2, n3);
            }
            case 8: {
                return this.IllIIIllIIIIlIlIlIllIIlll(class_05492, n, n2, n3);
            }
            case 9: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_0609)class_05492, n, n2, n3);
            }
            case 10: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1254)class_05492, n, n2, n3);
            }
            case 11: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1417)class_05492, n, n2, n3);
            }
            case 12: {
                return this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3);
            }
            case 13: {
                return this.IlIIIlIIIIllIIIllIIIIIIll(class_05492, n, n2, n3);
            }
            case 14: {
                return this.IlIllllllIIlIIllllIIlIIIl(class_05492, n, n2, n3);
            }
            case 15: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1342)class_05492, n, n2, n3);
            }
            case 16: {
                return this.lllIIIllIIIIlllIlIIllIIll(class_05492, n, n2, n3, false);
            }
            case 17: {
                return this.IlIllllllIIlIIllllIIlIIIl(class_05492, n, n2, n3, true);
            }
            case 18: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_2092)class_05492, n, n2, n3);
            }
            case 19: {
                return this.lllIIlIIIllllllIIIIlIlIlI(class_05492, n, n2, n3);
            }
            case 20: {
                return this.lIIIIlIlIIlllllIIllIIlIII(class_05492, n, n2, n3);
            }
            case 21: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_2172)class_05492, n, n2, n3);
            }
            default: {
                return false;
            }
            case 23: {
                return this.IlIlIIlIlIllIIlIlIIllIIIl(class_05492, n, n2, n3);
            }
            case 24: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_0706)class_05492, n, n2, n3);
            }
            case 25: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1870)class_05492, n, n2, n3);
            }
            case 26: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1865)class_05492, n, n2, n3);
            }
            case 27: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1141)class_05492, n, n2, n3);
            }
            case 28: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1084)class_05492, n, n2, n3);
            }
            case 29: {
                return this.IIIllIIlIIIIIIlIlIIllIIlI(class_05492, n, n2, n3);
            }
            case 30: {
                return this.IllIIlllllllIIlIIlIIIIlIl(class_05492, n, n2, n3);
            }
            case 31: {
                return this.lIIlIIIIIlIlllIlIIlIlIlll(class_05492, n, n2, n3);
            }
            case 32: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1482)class_05492, n, n2, n3);
            }
            case 33: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1709)class_05492, n, n2, n3);
            }
            case 34: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_0587)class_05492, n, n2, n3);
            }
            case 35: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_0628)class_05492, n, n2, n3);
            }
            case 36: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_0113)class_05492, n, n2, n3);
            }
            case 37: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1298)class_05492, n, n2, n3);
            }
            case 38: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1700)class_05492, n, n2, n3);
            }
            case 39: {
                return this.lIlIlIIlIIIIlIIIIIlllIIII(class_05492, n, n2, n3);
            }
            case 40: {
                return this.lllIIIllIIIIlllIlIIllIIll((class_1487)class_05492, n, n2, n3);
            }
            case 41: 
        }
        return this.llIIlllIllIllllIIIlIIIIII(class_05492, n, n2, n3);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1865 class_18652, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 3;
        if (n5 == 0) {
            this.lIlIllIIlIIlIIlIIlIIlIIll = 3;
        } else if (n5 == 3) {
            this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
        } else if (n5 == 1) {
            this.lIlIllIIlIIlIIlIIlIIlIIll = 2;
        }
        if (!class_1865.IllIIlllllllIIlIIlIIIIlIl(n4)) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
            this.IlIlIIlllIIlIllIIIlllllIl(class_18652, n, n2, n3);
            this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
            return true;
        }
        this.IlIIIIIllllllIIlllIllllll = true;
        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
        this.IlIlIIlllIIlIllIIIlllllIl(class_18652, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll(class_18652.llIlllIIllIlllIlIlIlIIIll());
        this.lllIIIllIIIIlllIlIIllIIll(0.25, 0.8125, 0.25, 0.75, 1.0, 0.75);
        this.IlIlIIlllIIlIllIIIlllllIl(class_18652, n, n2, n3);
        this.IlIIIIIllllllIIlllIllllll = false;
        this.lllIIIllIIIIlllIlIIllIIll();
        this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
        return true;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n4);
        boolean bl = class_0736.IllIIlllllllIIlIIlIIIIlIl(n4);
        float f = 0.5f;
        float f2 = 1.0f;
        float f3 = 0.8f;
        float f4 = 0.6f;
        int n6 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(n6);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f, f);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 0);
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d3 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d5 = (double)n + this.IllIIIllIIIIlIlIlIllIIlll;
        double d6 = (double)n + this.lIIIIlIlIIlllllIIllIIlIII;
        double d7 = (double)n2 + this.llIIlllIllIllllIIIlIIIIII + 0.1875;
        double d8 = (double)n3 + this.lllIIlIIIllllllIIIIlIlIlI;
        double d9 = (double)n3 + this.IlIlllIIIIIIlIIllIIllIlll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d5, d7, d9, d, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d5, d7, d8, d, d3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d6, d7, d8, d2, d3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d6, d7, d9, d2, d4);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f2, f2);
        class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 1);
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        d2 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        d3 = class_21022.IlIIIIIllllllIIlllIllllll();
        d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        d5 = d;
        d6 = d2;
        d7 = d3;
        d8 = d3;
        d9 = d;
        double d10 = d2;
        double d11 = d4;
        double d12 = d4;
        if (n5 == 0) {
            d6 = d;
            d7 = d4;
            d9 = d2;
            d12 = d3;
        } else if (n5 == 2) {
            d5 = d2;
            d8 = d4;
            d10 = d;
            d11 = d3;
        } else if (n5 == 3) {
            d5 = d2;
            d8 = d4;
            d10 = d;
            d11 = d3;
            d6 = d;
            d7 = d4;
            d9 = d2;
            d12 = d3;
        }
        double d13 = (double)n + this.IllIIIllIIIIlIlIlIllIIlll;
        double d14 = (double)n + this.lIIIIlIlIIlllllIIllIIlIII;
        double d15 = (double)n2 + this.llIIllIllIlIIlIIllIllllll;
        double d16 = (double)n3 + this.lllIIlIIIllllllIIIIlIlIlI;
        double d17 = (double)n3 + this.IlIlllIIIIIIlIIllIIllIlll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d14, d15, d17, d9, d11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d14, d15, d16, d5, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d15, d16, d6, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d15, d17, d10, d12);
        int n7 = class_1632.lIlllIlllIIIIlIIlllIllIII[n5];
        if (bl) {
            n7 = class_1632.lIlllIlllIIIIlIIlllIllIII[class_1632.lIllllIIlIIIlIllllllIIIll[n5]];
        }
        int n8 = 4;
        switch (n5) {
            case 0: {
                n8 = 5;
                break;
            }
            case 1: {
                n8 = 3;
            }
            default: {
                break;
            }
            case 3: {
                n8 = 2;
            }
        }
        if (n7 != 2 && (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1, 2))) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI > 0.0 ? n6 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f3, f3, f3);
            this.IlIllllllIIlIIllllIIlIIIl = n8 == 2;
            this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2));
        }
        if (n7 != 3 && (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1, 3))) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll < 1.0 ? n6 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f3, f3, f3);
            this.IlIllllllIIlIIllllIIlIIIl = n8 == 3;
            this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3));
        }
        if (n7 != 4 && (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3, 4))) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI > 0.0 ? n6 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f4, f4, f4);
            this.IlIllllllIIlIIllllIIlIIIl = n8 == 4;
            this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4));
        }
        if (n7 != 5 && (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3, 5))) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll < 1.0 ? n6 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f4, f4, f4);
            this.IlIllllllIIlIIllllIIlIIIl = n8 == 5;
            this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5));
        }
        this.IlIllllllIIlIIllllIIlIIIl = false;
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1870 class_18702, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(0.4375, 0.0, 0.4375, 0.5625, 0.875, 0.5625);
        this.IlIlIIlllIIlIllIIIlllllIl(class_18702, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll(class_18702.llIlllIIllIlllIlIlIlIIIll());
        this.IlIIIIIllllllIIlllIllllll = true;
        this.lllIIIllIIIIlllIlIIllIIll(0.5625, 0.0, 0.3125, 0.9375, 0.125, 0.6875);
        this.IlIlIIlllIIlIllIIIlllllIl(class_18702, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll(0.125, 0.0, 0.0625, 0.5, 0.125, 0.4375);
        this.IlIlIIlllIIlIllIIIlllllIl(class_18702, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll(0.125, 0.0, 0.5625, 0.5, 0.125, 0.9375);
        this.IlIlIIlllIIlIllIIIlllllIl(class_18702, n, n2, n3);
        this.IlIIIIIllllllIIlllIllllll = false;
        this.lllIIIllIIIIlllIlIIllIIll();
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_18702.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n4 = class_18702.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll((Block)class_18702, 0, 0);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_18702, n, n2, n3, -1, class_21022);
        }
        double d = class_21022.IlIIIIIllllllIIlllIllllll();
        double d2 = class_21022.lIllllIIlIIIlIllllllIIIll();
        int n5 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        for (int i = 0; i < 3; ++i) {
            double d3 = (double)i * Math.PI * 2.0 / 3.0 + 1.5707963267948966;
            double d4 = class_21022.lllIIIllIIIIlllIlIIllIIll(8.0);
            double d5 = class_21022.lIlllIlllIIIIlIIlllIllIII();
            if ((n5 & 1 << i) != 0) {
                d5 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            }
            double d6 = (double)n + 0.5;
            double d7 = (double)n + 0.5 + Math.sin(d3) * 8.0 / 16.0;
            double d8 = (double)n3 + 0.5;
            double d9 = (double)n3 + 0.5 + Math.cos(d3) * 8.0 / 16.0;
            class_08682.lllIIIllIIIIlllIlIIllIIll(d6, n2 + 1, d8, d4, d);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d6, n2 + 0, d8, d4, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d7, n2 + 0, d9, d5, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d7, n2 + 1, d9, d5, d);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d7, n2 + 1, d9, d5, d);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d7, n2 + 0, d9, d5, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d6, n2 + 0, d8, d4, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d6, n2 + 1, d8, d4, d);
        }
        class_18702.lIlllIlllIlIIIIlllIlIlIIl();
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0706 class_07062, int n, int n2, int n3) {
        float f;
        this.IlIlIIlllIIlIllIIIlllllIl(class_07062, n, n2, n3);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_07062.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n4 = class_07062.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f5 = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            f = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f5;
            f3 = f;
            f4 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
        IIcon class_21022 = class_07062.lIlllIlllIIIIlIIlllIllIII(2);
        f = 0.125f;
        this.lIllllIIlIIIlIllllllIIIll(class_07062, (float)n - 1.0f + f, n2, n3, class_21022);
        this.IlIIIIIllllllIIlllIllllll(class_07062, (float)n + 1.0f - f, n2, n3, class_21022);
        this.lIlllIlllIIIIlIIlllIllIII(class_07062, n, n2, (float)n3 - 1.0f + f, class_21022);
        this.IlIllllllIIlIIllllIIlIIIl((Block)class_07062, (double)n, (double)n2, (float)n3 + 1.0f - f, class_21022);
        IIcon class_21023 = class_0706.lIlllIlllIIIIlIIlllIllIII("inner");
        this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_07062, (double)n, (float)n2 - 1.0f + 0.25f, (double)n3, class_21023);
        this.lllIIIllIIIIlllIlIIllIIll((Block)class_07062, (double)n, (double)((float)n2 + 1.0f - 0.75f), (double)n3, class_21023);
        int n5 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n5 > 0) {
            IIcon class_21024 = class_0816.lIlllIlllIIIIlIIlllIllIII("water_still");
            int n6 = class_1689.lllIlIIlIIIlIlIIIllIlllIl(Blocks.IllIIIllIIIIlIlIlIllIIlll, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            float f7 = (float)(n6 >> 16 & 0xFF) / 255.0f;
            float f8 = (float)(n6 >> 8 & 0xFF) / 255.0f;
            float f9 = (float)(n6 & 0xFF) / 255.0f;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f7, f8, f9);
            this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_07062, (double)n, (float)n2 - 1.0f + class_0706.IIIllIllIIlIlIlIlIllllIIl(n5), (double)n3, class_21024);
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1709 class_17092, int n, int n2, int n3) {
        float f;
        this.IlIlIIlllIIlIllIIIlllllIl(class_17092, n, n2, n3);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_17092.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n4 = class_17092.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_17092, 0);
        float f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            f = (f2 * 30.0f + f3 * 59.0f + f4 * 11.0f) / 100.0f;
            float f5 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
            float f6 = (f2 * 30.0f + f4 * 70.0f) / 100.0f;
            f2 = f;
            f3 = f5;
            f4 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
        f = 0.1865f;
        this.lIllllIIlIIIlIllllllIIIll(class_17092, (float)n - 0.5f + f, n2, n3, class_21022);
        this.IlIIIIIllllllIIlllIllllll(class_17092, (float)n + 0.5f - f, n2, n3, class_21022);
        this.lIlllIlllIIIIlIIlllIllIII(class_17092, n, n2, (float)n3 - 0.5f + f, class_21022);
        this.IlIllllllIIlIIllllIIlIIIl((Block)class_17092, (double)n, (double)n2, (float)n3 + 0.5f - f, class_21022);
        this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_17092, (double)n, (float)n2 - 0.5f + f + 0.1875f, (double)n3, this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.lIlllIlllIIIIlIIlllIllIII));
        class_1774 class_17742 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_17742 != null && class_17742 instanceof class_0461) {
            Item class_06112 = ((class_0461)class_17742).lllIIIllIIIIlllIlIIllIIll();
            int n5 = ((class_0461)class_17742).IlIIIIIllllllIIlllIllllll();
            if (class_06112 instanceof class_1272) {
                Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(class_06112);
                int n6 = class_05492.lIIIIlIlIIlllllIIllIIlIII();
                float f7 = 0.0f;
                float f8 = 4.0f;
                float f9 = 0.0f;
                class_08682.lIlllIlllIIIIlIIlllIllIII(f7 / 16.0f, f8 / 16.0f, f9 / 16.0f);
                n4 = class_05492.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
                if (n4 != 0xFFFFFF) {
                    f2 = (float)(n4 >> 16 & 0xFF) / 255.0f;
                    f3 = (float)(n4 >> 8 & 0xFF) / 255.0f;
                    f4 = (float)(n4 & 0xFF) / 255.0f;
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
                }
                if (n6 == 1) {
                    this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n5), (double)n, (double)n2, (double)n3, 0.75f);
                } else if (n6 == 13) {
                    this.IlIIIIIllllllIIlllIllllll = true;
                    float f10 = 0.125f;
                    this.lllIIIllIIIIlllIlIIllIIll(0.5f - f10, 0.0, (double)(0.5f - f10), (double)(0.5f + f10), 0.25, (double)(0.5f + f10));
                    this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                    this.lllIIIllIIIIlllIlIIllIIll(0.5f - f10, 0.25, (double)(0.5f - f10), (double)(0.5f + f10), 0.5, (double)(0.5f + f10));
                    this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                    this.lllIIIllIIIIlllIlIIllIIll(0.5f - f10, 0.5, (double)(0.5f - f10), (double)(0.5f + f10), 0.75, (double)(0.5f + f10));
                    this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                    this.IlIIIIIllllllIIlllIllllll = false;
                    this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                }
                class_08682.lIlllIlllIIIIlIIlllIllIII(-f7 / 16.0f, -f8 / 16.0f, -f9 / 16.0f);
            }
        }
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0628 class_06282, int n, int n2, int n3) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_06282, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0628 class_06282, int n, int n2, int n3, int n4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_06282.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n5 = class_06282.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n5 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        return this.lllIIIllIIIIlllIlIIllIIll(class_06282, n, n2, n3, n4, false);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0628 class_06282, int n, int n2, int n3, int n4, boolean bl) {
        int n5 = bl ? 0 : n4 & 3;
        boolean bl2 = false;
        float f = 0.0f;
        switch (n5) {
            case 0: {
                this.IlIIIlIIIIllIIIllIIIIIIll = 2;
                this.IIlllIlIlllIllIIIlllIIlIl = 1;
                this.lIlIllIIlIIlIIlIIlIIlIIll = 3;
                this.llIIlIllIllllIlIIIIlIIlll = 3;
                break;
            }
            case 1: {
                this.lIIlIIIIIlIlllIlIIlIlIlll = 1;
                this.lIlIlIIlIIIIlIIIIIlllIIII = 2;
                this.lIlIllIIlIIlIIlIIlIIlIIll = 2;
                this.llIIlIllIllllIlIIIIlIIlll = 1;
                bl2 = true;
                break;
            }
            case 2: {
                this.IlIIIlIIIIllIIIllIIIIIIll = 1;
                this.IIlllIlIlllIllIIIlllIIlIl = 2;
                break;
            }
            case 3: {
                this.lIIlIIIIIlIlllIlIIlIlIlll = 2;
                this.lIlIlIIlIIIIlIIIIIlllIIII = 1;
                this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
                this.llIIlIllIllllIlIIIIlIIlll = 2;
                bl2 = true;
            }
        }
        f = this.lllIIIllIIIIlllIlIIllIIll(class_06282, n, n2, n3, 0, f, 0.75f, 0.25f, 0.75f, bl2, bl, n4);
        f = this.lllIIIllIIIIlllIlIIllIIll(class_06282, n, n2, n3, 1, f, 0.5f, 0.0625f, 0.625f, bl2, bl, n4);
        f = this.lllIIIllIIIIlllIlIIllIIll(class_06282, n, n2, n3, 2, f, 0.25f, 0.3125f, 0.5f, bl2, bl, n4);
        this.lllIIIllIIIIlllIlIIllIIll(class_06282, n, n2, n3, 3, f, 0.625f, 0.375f, 1.0f, bl2, bl, n4);
        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        this.lIIlIIIIIlIlllIlIIlIlIlll = 0;
        this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
        this.IlIIIlIIIIllIIIllIIIIIIll = 0;
        this.IIlllIlIlllIllIIIlllIIlIl = 0;
        this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
        this.llIIlIllIllllIlIIIIlIIlll = 0;
        return true;
    }

    public float lllIIIllIIIIlllIlIIllIIll(class_0628 class_06282, int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, boolean bl, boolean bl2, int n5) {
        if (bl) {
            float f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        class_06282.lIlIIllllIlIIIIllIIIIlIIl = n4;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - (f2 /= 2.0f), f, (double)(0.5f - (f4 /= 2.0f)), (double)(0.5f + f2), (double)(f + f3), (double)(0.5f + f4));
        if (bl2) {
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
            this.lllIIIllIIIIlllIlIIllIIll((Block)class_06282, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_06282, 0, n5));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_06282, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_06282, 1, n5));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
            this.IlIllllllIIlIIllllIIlIIIl((Block)class_06282, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_06282, 2, n5));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
            this.lIlllIlllIIIIlIIlllIllIII(class_06282, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_06282, 3, n5));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
            this.IlIIIIIllllllIIlllIllllll(class_06282, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_06282, 4, n5));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
            this.lIllllIIlIIIlIllllllIIIll(class_06282, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_06282, 5, n5));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        } else {
            this.IlIlIIlllIIlIllIIIlllllIl(class_06282, n, n2, n3);
        }
        return f + f3;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(Block class_05492, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        double d = 0.4f;
        double d2 = 0.5 - d;
        double d3 = 0.2f;
        if (n4 == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n - d2, (double)n2 + d3, (double)n3, -d, 0.0, 0);
        } else if (n4 == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n + d2, (double)n2 + d3, (double)n3, d, 0.0, 0);
        } else if (n4 == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2 + d3, (double)n3 - d2, 0.0, -d, 0);
        } else if (n4 == 4) {
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2 + d3, (double)n3 + d2, 0.0, d, 0);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2, (double)n3, 0.0, 0.0, 0);
            if (class_05492 != Blocks.lIIIlIIIlIlllIllIIIlIIIlI && Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
                this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
            }
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1342 class_13422, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 3;
        int n6 = (n4 & 0xC) >> 2;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_13422.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        double d = -0.1875;
        boolean bl = class_13422.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4);
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        switch (n5) {
            case 0: {
                d5 = -0.3125;
                d3 = class_1342.lIlIIllllIlIIIIllIIIIlIIl[n6];
                break;
            }
            case 1: {
                d4 = 0.3125;
                d2 = -class_1342.lIlIIllllIlIIIIllIIIIlIIl[n6];
                break;
            }
            case 2: {
                d5 = 0.3125;
                d3 = -class_1342.lIlIIllllIlIIIIllIIIIlIIl[n6];
                break;
            }
            case 3: {
                d4 = -0.3125;
                d2 = class_1342.lIlIIllllIlIIIIllIIIIlIIl[n6];
            }
        }
        if (!bl) {
            this.lllIIIllIIIIlllIlIIllIIll((Block)class_13422, (double)n + d2, (double)n2 + d, (double)n3 + d3, 0.0, 0.0, 0);
        } else {
            IIcon class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.IllIIlllllllIIlIIlIIIIlIl);
            this.lllIIIllIIIIlllIlIIllIIll(class_21022);
            float f = 2.0f;
            float f2 = 14.0f;
            float f3 = 7.0f;
            float f4 = 9.0f;
            switch (n5) {
                case 1: 
                case 3: {
                    f = 7.0f;
                    f2 = 9.0f;
                    f3 = 2.0f;
                    f4 = 14.0f;
                }
            }
            this.lllIIIllIIIIlllIlIIllIIll(f / 16.0f + (float)d2, 0.125, (double)(f3 / 16.0f + (float)d3), (double)(f2 / 16.0f + (float)d2), 0.25, (double)(f4 / 16.0f + (float)d3));
            double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(f);
            double d7 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(f3);
            double d8 = class_21022.lllIIIllIIIIlllIlIIllIIll(f2);
            double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n + f / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f3 / 16.0f) + d3, d6, d7);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n + f / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f4 / 16.0f) + d3, d6, d9);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n + f2 / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f4 / 16.0f) + d3, d8, d9);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)((float)n + f2 / 16.0f) + d2, (float)n2 + 0.25f, (double)((float)n3 + f3 / 16.0f) + d3, d8, d7);
            this.IlIlIIlllIIlIllIIIlllllIl(class_13422, n, n2, n3);
            this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
            this.lllIIIllIIIIlllIlIIllIIll();
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_13422.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll((Block)class_13422, (double)n + d4, (double)n2 + d, (double)n3 + d5, 0.0, 0.0, 0);
        this.lllIIIllIIIIlllIlIIllIIll((class_0113)class_13422, n, n2, n3);
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1298 class_12982, int n, int n2, int n3) {
        IIcon class_21022;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_12982.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 3;
        double d = 0.0;
        double d2 = -0.1875;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = 0.0;
        if (class_12982.lIIIIlIlIIlllllIIllIIlIII(n4)) {
            class_21022 = Blocks.lIIllllllllIlIllllllllIlI.lIlllIlllIIIIlIIlllIllIII(0);
        } else {
            d2 -= 0.1875;
            class_21022 = Blocks.IlIIIlIIlllllIIIllIlIlIll.lIlllIlllIIIIlIIlllIllIII(0);
        }
        switch (n5) {
            case 0: {
                d3 = -0.3125;
                d5 = 1.0;
                break;
            }
            case 1: {
                d = 0.3125;
                d4 = -1.0;
                break;
            }
            case 2: {
                d3 = 0.3125;
                d5 = -1.0;
                break;
            }
            case 3: {
                d = -0.3125;
                d4 = 1.0;
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll((Block)class_12982, (double)n + 0.25 * d4 + 0.1875 * d5, (float)n2 - 0.1875f, (double)n3 + 0.25 * d5 + 0.1875 * d4, 0.0, 0.0, n4);
        this.lllIIIllIIIIlllIlIIllIIll((Block)class_12982, (double)n + 0.25 * d4 + -0.1875 * d5, (float)n2 - 0.1875f, (double)n3 + 0.25 * d5 + -0.1875 * d4, 0.0, 0.0, n4);
        this.lllIIIllIIIIlllIlIIllIIll(class_21022);
        this.lllIIIllIIIIlllIlIIllIIll((Block)class_12982, (double)n + d, (double)n2 + d2, (double)n3 + d3, 0.0, 0.0, n4);
        this.lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll(class_12982, n, n2, n3, n5);
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0113 class_01132, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll(class_01132, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 3);
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0113 class_01132, int n, int n2, int n3, int n4) {
        this.IlIlIIlllIIlIllIIIlllllIl(class_01132, n, n2, n3);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_01132.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        int n5 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll((Block)class_01132, 1, n5);
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d3 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d5 = 0.125;
        double d6 = n + 1;
        double d7 = n + 1;
        double d8 = n + 0;
        double d9 = n + 0;
        double d10 = n3 + 0;
        double d11 = n3 + 1;
        double d12 = n3 + 1;
        double d13 = n3 + 0;
        double d14 = (double)n2 + d5;
        if (n4 == 2) {
            d6 = d7 = (double)(n + 0);
            d8 = d9 = (double)(n + 1);
            d10 = d13 = (double)(n3 + 1);
            d11 = d12 = (double)(n3 + 0);
        } else if (n4 == 3) {
            d6 = d9 = (double)(n + 0);
            d7 = d8 = (double)(n + 1);
            d10 = d11 = (double)(n3 + 0);
            d12 = d13 = (double)(n3 + 1);
        } else if (n4 == 1) {
            d6 = d9 = (double)(n + 1);
            d7 = d8 = (double)(n + 0);
            d10 = d11 = (double)(n3 + 1);
            d12 = d13 = (double)(n3 + 0);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d14, d13, d, d3);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d14, d12, d, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d7, d14, d11, d2, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d6, d14, d10, d2, d3);
    }

    public void IlIIIIIllllllIIlllIllllll(Block class_05492, int n, int n2, int n3) {
        this.IlIIIIIllllllIIlllIllllll = true;
        this.lllIIIllIIIIlllIlIIllIIll(class_05492, n, n2, n3, true);
        this.IlIIIIIllllllIIlllIllllll = false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, int n2, int n3, boolean bl) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl2 = bl || (n4 & 8) != 0;
        int n5 = class_1039.IllIIlllllllIIlIIlIIIIlIl(n4);
        float f = 0.25f;
        if (bl2) {
            switch (n5) {
                case 0: {
                    this.lIIlIIIIIlIlllIlIIlIlIlll = 3;
                    this.lIlIlIIlIIIIlIIIIIlllIIII = 3;
                    this.IlIIIlIIIIllIIIllIIIIIIll = 3;
                    this.IIlllIlIlllIllIIIlllIIlIl = 3;
                    this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.25, 0.0, 1.0, 1.0, 1.0);
                    break;
                }
                case 1: {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
                    break;
                }
                case 2: {
                    this.IlIIIlIIIIllIIIllIIIIIIll = 1;
                    this.IIlllIlIlllIllIIIlllIIlIl = 2;
                    this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.25, 1.0, 1.0, 1.0);
                    break;
                }
                case 3: {
                    this.IlIIIlIIIIllIIIllIIIIIIll = 2;
                    this.IIlllIlIlllIllIIIlllIIlIl = 1;
                    this.lIlIllIIlIIlIIlIIlIIlIIll = 3;
                    this.llIIlIllIllllIlIIIIlIIlll = 3;
                    this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 0.75);
                    break;
                }
                case 4: {
                    this.lIIlIIIIIlIlllIlIIlIlIlll = 1;
                    this.lIlIlIIlIIIIlIIIIIlllIIII = 2;
                    this.lIlIllIIlIIlIIlIIlIIlIIll = 2;
                    this.llIIlIllIllllIlIIIIlIIlll = 1;
                    this.lllIIIllIIIIlllIlIIllIIll(0.25, 0.0, 0.0, 1.0, 1.0, 1.0);
                    break;
                }
                case 5: {
                    this.lIIlIIIIIlIlllIlIIlIlIlll = 2;
                    this.lIlIlIIlIIIIlIIIIIlllIIII = 1;
                    this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
                    this.llIIlIllIllllIlIIIIlIIlll = 2;
                    this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 0.75, 1.0, 1.0);
                }
            }
            ((class_1039)class_05492).lllIlIIlIIIlIlIIIllIlllIl((float)this.IllIIIllIIIIlIlIlIllIIlll, (float)this.llIIlllIllIllllIIIlIIIIII, (float)this.lllIIlIIIllllllIIIIlIlIlI, (float)this.lIIIIlIlIIlllllIIllIIlIII, (float)this.llIIllIllIlIIlIIllIllllll, (float)this.IlIlllIIIIIIlIIllIIllIlll);
            this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
            this.lIIlIIIIIlIlllIlIIlIlIlll = 0;
            this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
            this.IlIIIlIIIIllIIIllIIIIIIll = 0;
            this.IIlllIlIlllIllIIIlllIIlIl = 0;
            this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
            this.llIIlIllIllllIlIIIIlIIlll = 0;
            this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            ((class_1039)class_05492).lllIlIIlIIIlIlIIIllIlllIl((float)this.IllIIIllIIIIlIlIlIllIIlll, (float)this.llIIlllIllIllllIIIlIIIIII, (float)this.lllIIlIIIllllllIIIIlIlIlI, (float)this.lIIIIlIlIIlllllIIllIIlIII, (float)this.llIIllIllIlIIlIIllIllllll, (float)this.IlIlllIIIIIIlIIllIIllIlll);
        } else {
            switch (n5) {
                case 0: {
                    this.lIIlIIIIIlIlllIlIIlIlIlll = 3;
                    this.lIlIlIIlIIIIlIIIIIlllIIII = 3;
                    this.IlIIIlIIIIllIIIllIIIIIIll = 3;
                    this.IIlllIlIlllIllIIIlllIIlIl = 3;
                }
                default: {
                    break;
                }
                case 2: {
                    this.IlIIIlIIIIllIIIllIIIIIIll = 1;
                    this.IIlllIlIlllIllIIIlllIIlIl = 2;
                    break;
                }
                case 3: {
                    this.IlIIIlIIIIllIIIllIIIIIIll = 2;
                    this.IIlllIlIlllIllIIIlllIIlIl = 1;
                    this.lIlIllIIlIIlIIlIIlIIlIIll = 3;
                    this.llIIlIllIllllIlIIIIlIIlll = 3;
                    break;
                }
                case 4: {
                    this.lIIlIIIIIlIlllIlIIlIlIlll = 1;
                    this.lIlIlIIlIIIIlIIIIIlllIIII = 2;
                    this.lIlIllIIlIIlIIlIIlIIlIIll = 2;
                    this.llIIlIllIllllIlIIIIlIIlll = 1;
                    break;
                }
                case 5: {
                    this.lIIlIIIIIlIlllIlIIlIlIlll = 2;
                    this.lIlIlIIlIIIIlIIIIIlllIIII = 1;
                    this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
                    this.llIIlIllIllllIlIIIIlIIlll = 2;
                }
            }
            this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
            this.lIIlIIIIIlIlllIlIIlIlIlll = 0;
            this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
            this.IlIIIlIIIIllIIIllIIIIIIll = 0;
            this.IIlllIlIlllIllIIIlllIIlIl = 0;
            this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
            this.llIIlIllIllllIlIIIIlIIlll = 0;
        }
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6, float f, double d7) {
        IIcon class_21022 = class_1039.lIlllIlllIIIIlIIlllIllIII("piston_side");
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        double d8 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d9 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d10 = class_21022.lllIIIllIIIIlllIlIIllIIll(d7);
        double d11 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(4.0);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f, f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d4, d5, d10, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d3, d5, d8, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d2, d3, d6, d8, d11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d2, d4, d6, d10, d11);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3, double d4, double d5, double d6, float f, double d7) {
        IIcon class_21022 = class_1039.lIlllIlllIIIIlIIlllIllIII("piston_side");
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        double d8 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d9 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d10 = class_21022.lllIIIllIIIIlllIlIIllIIll(d7);
        double d11 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(4.0);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f, f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d3, d6, d10, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d3, d5, d8, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d2, d4, d5, d8, d11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d2, d4, d6, d10, d11);
    }

    public void IlIllllllIIlIIllllIIlIIIl(double d, double d2, double d3, double d4, double d5, double d6, float f, double d7) {
        IIcon class_21022 = class_1039.lIlllIlllIIIIlIIlllIllIII("piston_side");
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        double d8 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d9 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d10 = class_21022.lllIIIllIIIIlllIlIIllIIll(d7);
        double d11 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(4.0);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f, f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d2, d3, d5, d10, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d3, d5, d8, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d4, d6, d8, d11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d2, d4, d6, d10, d11);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Block class_05492, int n, int n2, int n3, boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = true;
        this.IlIllllllIIlIIllllIIlIIIl(class_05492, n, n2, n3, bl);
        this.IlIIIIIllllllIIlllIllllll = false;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492, int n, int n2, int n3, boolean bl) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_1042.IllIIlllllllIIlIIlIIIIlIl(n4);
        float f = 0.25f;
        float f2 = 0.375f;
        float f3 = 0.625f;
        float f4 = bl ? 1.0f : 0.5f;
        double d = bl ? 16.0 : 8.0;
        switch (n5) {
            case 0: {
                this.lIIlIIIIIlIlllIlIIlIlIlll = 3;
                this.lIlIlIIlIIIIlIIIIIlllIIII = 3;
                this.IlIIIlIIIIllIIIllIIIIIIll = 3;
                this.IIlllIlIlllIllIIIlllIIlIl = 3;
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.375f, (float)n + 0.625f, (float)n2 + 0.25f, (float)n2 + 0.25f + f4, (double)((float)n3 + 0.625f), (double)((float)n3 + 0.625f), 0.8f, d);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.625f, (float)n + 0.375f, (float)n2 + 0.25f, (float)n2 + 0.25f + f4, (double)((float)n3 + 0.375f), (double)((float)n3 + 0.375f), 0.8f, d);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.375f, (float)n + 0.375f, (float)n2 + 0.25f, (float)n2 + 0.25f + f4, (double)((float)n3 + 0.375f), (double)((float)n3 + 0.625f), 0.6f, d);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.625f, (float)n + 0.625f, (float)n2 + 0.25f, (float)n2 + 0.25f + f4, (double)((float)n3 + 0.625f), (double)((float)n3 + 0.375f), 0.6f, d);
                break;
            }
            case 1: {
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.75, 0.0, 1.0, 1.0, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.375f, (float)n + 0.625f, (float)n2 - 0.25f + 1.0f - f4, (float)n2 - 0.25f + 1.0f, (double)((float)n3 + 0.625f), (double)((float)n3 + 0.625f), 0.8f, d);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.625f, (float)n + 0.375f, (float)n2 - 0.25f + 1.0f - f4, (float)n2 - 0.25f + 1.0f, (double)((float)n3 + 0.375f), (double)((float)n3 + 0.375f), 0.8f, d);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.375f, (float)n + 0.375f, (float)n2 - 0.25f + 1.0f - f4, (float)n2 - 0.25f + 1.0f, (double)((float)n3 + 0.375f), (double)((float)n3 + 0.625f), 0.6f, d);
                this.lllIIIllIIIIlllIlIIllIIll((float)n + 0.625f, (float)n + 0.625f, (float)n2 - 0.25f + 1.0f - f4, (float)n2 - 0.25f + 1.0f, (double)((float)n3 + 0.625f), (double)((float)n3 + 0.375f), 0.6f, d);
                break;
            }
            case 2: {
                this.IlIIIlIIIIllIIIllIIIIIIll = 1;
                this.IIlllIlIlllIllIIIlllIIlIl = 2;
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 0.25);
                this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.375f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.25f, (float)n3 + 0.25f + f4, 0.6f, d);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.625f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.25f, (float)n3 + 0.25f + f4, 0.6f, d);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.375f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.25f, (float)n3 + 0.25f + f4, 0.5f, d);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.625f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.25f, (float)n3 + 0.25f + f4, 1.0f, d);
                break;
            }
            case 3: {
                this.IlIIIlIIIIllIIIllIIIIIIll = 2;
                this.IIlllIlIlllIllIIIlllIIlIl = 1;
                this.lIlIllIIlIIlIIlIIlIIlIIll = 3;
                this.llIIlIllIllllIlIIIIlIIlll = 3;
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.75, 1.0, 1.0, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.375f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 - 0.25f + 1.0f - f4, (float)n3 - 0.25f + 1.0f, 0.6f, d);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.625f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 - 0.25f + 1.0f - f4, (float)n3 - 0.25f + 1.0f, 0.6f, d);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.375f, (float)n + 0.625f, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 - 0.25f + 1.0f - f4, (float)n3 - 0.25f + 1.0f, 0.5f, d);
                this.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.625f, (float)n + 0.375f, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 - 0.25f + 1.0f - f4, (float)n3 - 0.25f + 1.0f, 1.0f, d);
                break;
            }
            case 4: {
                this.lIIlIIIIIlIlllIlIIlIlIlll = 1;
                this.lIlIlIIlIIIIlIIIIIlllIIII = 2;
                this.lIlIllIIlIIlIIlIIlIIlIIll = 2;
                this.llIIlIllIllllIlIIIIlIIlll = 1;
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 0.25, 1.0, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                this.IlIllllllIIlIIllllIIlIIIl((float)n + 0.25f, (float)n + 0.25f + f4, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.375f, 0.5f, d);
                this.IlIllllllIIlIIllllIIlIIIl((float)n + 0.25f, (float)n + 0.25f + f4, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.625f, 1.0f, d);
                this.IlIllllllIIlIIllllIIlIIIl((float)n + 0.25f, (float)n + 0.25f + f4, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.375f, 0.6f, d);
                this.IlIllllllIIlIIllllIIlIIIl((float)n + 0.25f, (float)n + 0.25f + f4, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.625f, 0.6f, d);
                break;
            }
            case 5: {
                this.lIIlIIIIIlIlllIlIIlIlIlll = 2;
                this.lIlIlIIlIIIIlIIIIIlllIIII = 1;
                this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
                this.llIIlIllIllllIlIIIIlIIlll = 2;
                this.lllIIIllIIIIlllIlIIllIIll(0.75, 0.0, 0.0, 1.0, 1.0, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
                this.IlIllllllIIlIIllllIIlIIIl((float)n - 0.25f + 1.0f - f4, (float)n - 0.25f + 1.0f, (float)n2 + 0.375f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.375f, 0.5f, d);
                this.IlIllllllIIlIIllllIIlIIIl((float)n - 0.25f + 1.0f - f4, (float)n - 0.25f + 1.0f, (float)n2 + 0.625f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.625f, 1.0f, d);
                this.IlIllllllIIlIIllllIIlIIIl((float)n - 0.25f + 1.0f - f4, (float)n - 0.25f + 1.0f, (float)n2 + 0.375f, (float)n2 + 0.625f, (float)n3 + 0.375f, (float)n3 + 0.375f, 0.6f, d);
                this.IlIllllllIIlIIllllIIlIIIl((float)n - 0.25f + 1.0f - f4, (float)n - 0.25f + 1.0f, (float)n2 + 0.625f, (float)n2 + 0.375f, (float)n3 + 0.625f, (float)n3 + 0.625f, 0.6f, d);
            }
        }
        this.lIIlIIIIIlIlllIlIIlIlIlll = 0;
        this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
        this.IlIIIlIIIIllIIIllIIIIIIll = 0;
        this.IIlllIlIlllIllIIIlllIIlIl = 0;
        this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
        this.llIIlIllIllllIlIIIIlIIlll = 0;
        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return true;
    }

    public boolean lIllllIIlIIIlIllllllIIIll(Block class_05492, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 7;
        boolean bl = (n4 & 8) > 0;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        boolean bl2 = this.lllIlIIlIIIlIlIIIllIlllIl();
        if (!bl2) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.IlIIIIIllllllIIlllIllllll));
        }
        float f = 0.25f;
        float f2 = 0.1875f;
        float f3 = 0.1875f;
        if (n5 == 5) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f2, 0.0, (double)(0.5f - f), (double)(0.5f + f2), (double)f3, (double)(0.5f + f));
        } else if (n5 == 6) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0, (double)(0.5f - f2), (double)(0.5f + f), (double)f3, (double)(0.5f + f2));
        } else if (n5 == 4) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f2, 0.5f - f, (double)(1.0f - f3), (double)(0.5f + f2), (double)(0.5f + f), 1.0);
        } else if (n5 == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f2, 0.5f - f, 0.0, (double)(0.5f + f2), (double)(0.5f + f), (double)f3);
        } else if (n5 == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f - f3, 0.5f - f, (double)(0.5f - f2), 1.0, (double)(0.5f + f), (double)(0.5f + f2));
        } else if (n5 == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.5f - f, (double)(0.5f - f2), (double)f3, (double)(0.5f + f), (double)(0.5f + f2));
        } else if (n5 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 1.0f - f3, (double)(0.5f - f2), (double)(0.5f + f), 1.0, (double)(0.5f + f2));
        } else if (n5 == 7) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f2, 1.0f - f3, (double)(0.5f - f), (double)(0.5f + f2), 1.0, (double)(0.5f + f));
        }
        this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
        if (!bl2) {
            this.lllIIIllIIIIlllIlIIllIIll();
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        class_0864[] arrclass_0864 = new class_0864[8];
        float f4 = 0.0625f;
        float f5 = 0.0625f;
        float f6 = 0.625f;
        arrclass_0864[0] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f4, 0.0, -f5);
        arrclass_0864[1] = class_0864.lllIIIllIIIIlllIlIIllIIll(f4, 0.0, -f5);
        arrclass_0864[2] = class_0864.lllIIIllIIIIlllIlIIllIIll(f4, 0.0, f5);
        arrclass_0864[3] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f4, 0.0, f5);
        arrclass_0864[4] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f4, f6, -f5);
        arrclass_0864[5] = class_0864.lllIIIllIIIIlllIlIIllIIll(f4, f6, -f5);
        arrclass_0864[6] = class_0864.lllIIIllIIIIlllIlIIllIIll(f4, f6, f5);
        arrclass_0864[7] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f4, f6, f5);
        for (int i = 0; i < 8; ++i) {
            if (bl) {
                arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl -= 0.0625;
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll(0.69813174f);
            } else {
                arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl += 0.0625;
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll(-0.69813174f);
            }
            if (n5 == 0 || n5 == 7) {
                arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl((float)Math.PI);
            }
            if (n5 == 6 || n5 == 0) {
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl(1.5707964f);
            }
            if (n5 > 0 && n5 < 5) {
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl -= 0.375;
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll(1.5707964f);
                if (n5 == 4) {
                    arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl(0.0f);
                }
                if (n5 == 3) {
                    arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl((float)Math.PI);
                }
                if (n5 == 2) {
                    arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl(1.5707964f);
                }
                if (n5 == 1) {
                    arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl(-1.5707964f);
                }
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll += (double)n + 0.5;
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl += (double)((float)n2 + 0.5f);
                arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl += (double)n3 + 0.5;
                continue;
            }
            if (n5 != 0 && n5 != 7) {
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll += (double)n + 0.5;
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl += (double)((float)n2 + 0.125f);
                arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl += (double)n3 + 0.5;
                continue;
            }
            arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll += (double)n + 0.5;
            arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl += (double)((float)n2 + 0.875f);
            arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl += (double)n3 + 0.5;
        }
        class_0864 class_08642 = null;
        class_0864 class_08643 = null;
        class_0864 class_08644 = null;
        class_0864 class_08645 = null;
        for (int i = 0; i < 6; ++i) {
            if (i == 0) {
                d = class_21022.lllIIIllIIIIlllIlIIllIIll(7.0);
                d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(6.0);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(9.0);
                d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(8.0);
            } else if (i == 2) {
                d = class_21022.lllIIIllIIIIlllIlIIllIIll(7.0);
                d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(6.0);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(9.0);
                d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
            }
            if (i == 0) {
                class_08642 = arrclass_0864[0];
                class_08643 = arrclass_0864[1];
                class_08644 = arrclass_0864[2];
                class_08645 = arrclass_0864[3];
            } else if (i == 1) {
                class_08642 = arrclass_0864[7];
                class_08643 = arrclass_0864[6];
                class_08644 = arrclass_0864[5];
                class_08645 = arrclass_0864[4];
            } else if (i == 2) {
                class_08642 = arrclass_0864[1];
                class_08643 = arrclass_0864[0];
                class_08644 = arrclass_0864[4];
                class_08645 = arrclass_0864[5];
            } else if (i == 3) {
                class_08642 = arrclass_0864[2];
                class_08643 = arrclass_0864[1];
                class_08644 = arrclass_0864[5];
                class_08645 = arrclass_0864[6];
            } else if (i == 4) {
                class_08642 = arrclass_0864[3];
                class_08643 = arrclass_0864[2];
                class_08644 = arrclass_0864[6];
                class_08645 = arrclass_0864[7];
            } else if (i == 5) {
                class_08642 = arrclass_0864[0];
                class_08643 = arrclass_0864[3];
                class_08644 = arrclass_0864[7];
                class_08645 = arrclass_0864[4];
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08643.lllIIIllIIIIlllIlIIllIIll, class_08643.lllIlIIlIIIlIlIIIllIlllIl, class_08643.IlIllllllIIlIIllllIIlIIIl, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08644.lllIIIllIIIIlllIlIIllIIll, class_08644.lllIlIIlIIIlIlIIIllIlllIl, class_08644.IlIllllllIIlIIllllIIlIIIl, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08645.lllIIIllIIIIlllIlIIllIIll, class_08645.lllIlIIlIIIlIlIIIllIlllIl, class_08645.IlIllllllIIlIIllllIIlIIIl, d, d2);
        }
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        return true;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI(Block class_05492, int n, int n2, int n3) {
        int n4;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n5 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = n5 & 3;
        boolean bl = (n5 & 4) == 4;
        boolean bl2 = (n5 & 8) == 8;
        boolean bl3 = !class_1334.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
        boolean bl4 = this.lllIlIIlIIIlIlIIIllIlllIl();
        if (!bl4) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.lIllllIIlIIIlIllllllIIIll));
        }
        float f = 0.25f;
        float f2 = 0.125f;
        float f3 = 0.125f;
        float f4 = 0.3f - f;
        float f5 = 0.3f + f;
        if (n6 == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f2, f4, (double)(1.0f - f3), (double)(0.5f + f2), (double)f5, 1.0);
        } else if (n6 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f2, f4, 0.0, (double)(0.5f + f2), (double)f5, (double)f3);
        } else if (n6 == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f - f3, f4, (double)(0.5f - f2), 1.0, (double)f5, (double)(0.5f + f2));
        } else if (n6 == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0, f4, (double)(0.5f - f2), (double)f3, (double)f5, (double)(0.5f + f2));
        }
        this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
        if (!bl4) {
            this.lllIIIllIIIIlllIlIIllIIll();
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        class_0864[] arrclass_0864 = new class_0864[8];
        float f6 = 0.046875f;
        float f7 = 0.046875f;
        float f8 = 0.3125f;
        arrclass_0864[0] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f6, 0.0, -f7);
        arrclass_0864[1] = class_0864.lllIIIllIIIIlllIlIIllIIll(f6, 0.0, -f7);
        arrclass_0864[2] = class_0864.lllIIIllIIIIlllIlIIllIIll(f6, 0.0, f7);
        arrclass_0864[3] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f6, 0.0, f7);
        arrclass_0864[4] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f6, f8, -f7);
        arrclass_0864[5] = class_0864.lllIIIllIIIIlllIlIIllIIll(f6, f8, -f7);
        arrclass_0864[6] = class_0864.lllIIIllIIIIlllIlIIllIIll(f6, f8, f7);
        arrclass_0864[7] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f6, f8, f7);
        for (int i = 0; i < 8; ++i) {
            arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl += 0.0625;
            if (bl2) {
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll(0.5235988f);
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl -= 0.4375;
            } else if (bl) {
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll(0.08726647f);
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl -= 0.4375;
            } else {
                arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll(-0.69813174f);
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl -= 0.375;
            }
            arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll(1.5707964f);
            if (n6 == 2) {
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl(0.0f);
            }
            if (n6 == 0) {
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl((float)Math.PI);
            }
            if (n6 == 1) {
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl(1.5707964f);
            }
            if (n6 == 3) {
                arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl(-1.5707964f);
            }
            arrclass_0864[i].lllIIIllIIIIlllIlIIllIIll += (double)n + 0.5;
            arrclass_0864[i].lllIlIIlIIIlIlIIIllIlllIl += (double)((float)n2 + 0.3125f);
            arrclass_0864[i].IlIllllllIIlIIllllIIlIIIl += (double)n3 + 0.5;
        }
        class_0864 class_08642 = null;
        class_0864 class_08643 = null;
        class_0864 class_08644 = null;
        class_0864 class_08645 = null;
        int n7 = 7;
        int n8 = 9;
        int n9 = 9;
        int n10 = 16;
        for (int i = 0; i < 6; ++i) {
            if (i == 0) {
                class_08642 = arrclass_0864[0];
                class_08643 = arrclass_0864[1];
                class_08644 = arrclass_0864[2];
                class_08645 = arrclass_0864[3];
                d = class_21022.lllIIIllIIIIlllIlIIllIIll(n7);
                d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n9);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(n8);
                d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n9 + 2);
            } else if (i == 1) {
                class_08642 = arrclass_0864[7];
                class_08643 = arrclass_0864[6];
                class_08644 = arrclass_0864[5];
                class_08645 = arrclass_0864[4];
            } else if (i == 2) {
                class_08642 = arrclass_0864[1];
                class_08643 = arrclass_0864[0];
                class_08644 = arrclass_0864[4];
                class_08645 = arrclass_0864[5];
                d = class_21022.lllIIIllIIIIlllIlIIllIIll(n7);
                d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n9);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(n8);
                d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n10);
            } else if (i == 3) {
                class_08642 = arrclass_0864[2];
                class_08643 = arrclass_0864[1];
                class_08644 = arrclass_0864[5];
                class_08645 = arrclass_0864[6];
            } else if (i == 4) {
                class_08642 = arrclass_0864[3];
                class_08643 = arrclass_0864[2];
                class_08644 = arrclass_0864[6];
                class_08645 = arrclass_0864[7];
            } else if (i == 5) {
                class_08642 = arrclass_0864[0];
                class_08643 = arrclass_0864[3];
                class_08644 = arrclass_0864[7];
                class_08645 = arrclass_0864[4];
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08643.lllIIIllIIIIlllIlIIllIIll, class_08643.lllIlIIlIIIlIlIIIllIlllIl, class_08643.IlIllllllIIlIIllllIIlIIIl, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08644.lllIIIllIIIIlllIlIIllIIll, class_08644.lllIlIIlIIIlIlIIIllIlllIl, class_08644.IlIllllllIIlIIllllIIlIIIl, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08645.lllIIIllIIIIlllIlIIllIIll, class_08645.lllIlIIlIIIlIlIIIllIlllIl, class_08645.IlIllllllIIlIIllllIIlIIIl, d, d2);
        }
        float f9 = 0.09375f;
        float f10 = 0.09375f;
        float f11 = 0.03125f;
        arrclass_0864[0] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f9, 0.0, -f10);
        arrclass_0864[1] = class_0864.lllIIIllIIIIlllIlIIllIIll(f9, 0.0, -f10);
        arrclass_0864[2] = class_0864.lllIIIllIIIIlllIlIIllIIll(f9, 0.0, f10);
        arrclass_0864[3] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f9, 0.0, f10);
        arrclass_0864[4] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f9, f11, -f10);
        arrclass_0864[5] = class_0864.lllIIIllIIIIlllIlIIllIIll(f9, f11, -f10);
        arrclass_0864[6] = class_0864.lllIIIllIIIIlllIlIIllIIll(f9, f11, f10);
        arrclass_0864[7] = class_0864.lllIIIllIIIIlllIlIIllIIll(-f9, f11, f10);
        for (n4 = 0; n4 < 8; ++n4) {
            arrclass_0864[n4].IlIllllllIIlIIllllIIlIIIl += 0.21875;
            if (bl2) {
                arrclass_0864[n4].lllIlIIlIIIlIlIIIllIlllIl -= 0.09375;
                arrclass_0864[n4].IlIllllllIIlIIllllIIlIIIl -= 0.1625;
                arrclass_0864[n4].lllIIIllIIIIlllIlIIllIIll(0.0f);
            } else if (bl) {
                arrclass_0864[n4].lllIlIIlIIIlIlIIIllIlllIl += 0.015625;
                arrclass_0864[n4].IlIllllllIIlIIllllIIlIIIl -= 0.171875;
                arrclass_0864[n4].lllIIIllIIIIlllIlIIllIIll(0.17453294f);
            } else {
                arrclass_0864[n4].lllIIIllIIIIlllIlIIllIIll(0.87266463f);
            }
            if (n6 == 2) {
                arrclass_0864[n4].lllIlIIlIIIlIlIIIllIlllIl(0.0f);
            }
            if (n6 == 0) {
                arrclass_0864[n4].lllIlIIlIIIlIlIIIllIlllIl((float)Math.PI);
            }
            if (n6 == 1) {
                arrclass_0864[n4].lllIlIIlIIIlIlIIIllIlllIl(1.5707964f);
            }
            if (n6 == 3) {
                arrclass_0864[n4].lllIlIIlIIIlIlIIIllIlllIl(-1.5707964f);
            }
            arrclass_0864[n4].lllIIIllIIIIlllIlIIllIIll += (double)n + 0.5;
            arrclass_0864[n4].lllIlIIlIIIlIlIIIllIlllIl += (double)((float)n2 + 0.3125f);
            arrclass_0864[n4].IlIllllllIIlIIllllIIlIIIl += (double)n3 + 0.5;
        }
        n4 = 5;
        int n11 = 11;
        int n12 = 3;
        int n13 = 9;
        for (int i = 0; i < 6; ++i) {
            if (i == 0) {
                class_08642 = arrclass_0864[0];
                class_08643 = arrclass_0864[1];
                class_08644 = arrclass_0864[2];
                class_08645 = arrclass_0864[3];
                d = class_21022.lllIIIllIIIIlllIlIIllIIll(n4);
                d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n12);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(n11);
                d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n13);
            } else if (i == 1) {
                class_08642 = arrclass_0864[7];
                class_08643 = arrclass_0864[6];
                class_08644 = arrclass_0864[5];
                class_08645 = arrclass_0864[4];
            } else if (i == 2) {
                class_08642 = arrclass_0864[1];
                class_08643 = arrclass_0864[0];
                class_08644 = arrclass_0864[4];
                class_08645 = arrclass_0864[5];
                d = class_21022.lllIIIllIIIIlllIlIIllIIll(n4);
                d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n12);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(n11);
                d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n12 + 2);
            } else if (i == 3) {
                class_08642 = arrclass_0864[2];
                class_08643 = arrclass_0864[1];
                class_08644 = arrclass_0864[5];
                class_08645 = arrclass_0864[6];
            } else if (i == 4) {
                class_08642 = arrclass_0864[3];
                class_08643 = arrclass_0864[2];
                class_08644 = arrclass_0864[6];
                class_08645 = arrclass_0864[7];
            } else if (i == 5) {
                class_08642 = arrclass_0864[0];
                class_08643 = arrclass_0864[3];
                class_08644 = arrclass_0864[7];
                class_08645 = arrclass_0864[4];
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08643.lllIIIllIIIIlllIlIIllIIll, class_08643.lllIlIIlIIIlIlIIIllIlllIl, class_08643.IlIllllllIIlIIllllIIlIIIl, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08644.lllIIIllIIIIlllIlIIllIIll, class_08644.lllIlIIlIIIlIlIIIllIlllIl, class_08644.IlIllllllIIlIIllllIIlIIIl, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(class_08645.lllIIIllIIIIlllIlIIllIIll, class_08645.lllIlIIlIIIlIlIIIllIlllIl, class_08645.IlIllllllIIlIIllllIIlIIIl, d, d2);
        }
        if (bl) {
            double d5 = arrclass_0864[0].lllIlIIlIIIlIlIIIllIlllIl;
            float f12 = 0.03125f;
            float f13 = 0.5f - f12 / 2.0f;
            float f14 = f13 + f12;
            double d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            double d7 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(bl ? 2.0 : 0.0);
            double d8 = class_21022.lIlllIlllIIIIlIIlllIllIII();
            double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(bl ? 4.0 : 2.0);
            double d10 = (double)(bl3 ? 3.5f : 1.5f) / 16.0;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(0.75f, 0.75f, 0.75f);
            if (n6 == 2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, (double)n2 + d10, (double)n3 + 0.25, d6, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, (double)n2 + d10, (double)n3 + 0.25, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, (double)n2 + d10, n3, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, (double)n2 + d10, n3, d8, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, d5, (double)n3 + 0.5, d6, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, d5, (double)n3 + 0.5, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, (double)n2 + d10, (double)n3 + 0.25, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, (double)n2 + d10, (double)n3 + 0.25, d8, d7);
            } else if (n6 == 0) {
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, (double)n2 + d10, (double)n3 + 0.75, d6, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, (double)n2 + d10, (double)n3 + 0.75, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, d5, (double)n3 + 0.5, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, d5, (double)n3 + 0.5, d8, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, (double)n2 + d10, n3 + 1, d6, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, (double)n2 + d10, n3 + 1, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f14, (double)n2 + d10, (double)n3 + 0.75, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f13, (double)n2 + d10, (double)n3 + 0.75, d8, d7);
            } else if (n6 == 1) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(n, (double)n2 + d10, (float)n3 + f14, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d10, (float)n3 + f14, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d10, (float)n3 + f13, d8, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n, (double)n2 + d10, (float)n3 + f13, d6, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d10, (float)n3 + f14, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, d5, (float)n3 + f14, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, d5, (float)n3 + f13, d8, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d10, (float)n3 + f13, d6, d7);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, d5, (float)n3 + f14, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d10, (float)n3 + f14, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d10, (float)n3 + f13, d8, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, d5, (float)n3 + f13, d6, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d10, (float)n3 + f14, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d10, (float)n3 + f14, d8, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d10, (float)n3 + f13, d8, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d10, (float)n3 + f13, d6, d7);
            }
        }
        return true;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl(Block class_05492, int n, int n2, int n3) {
        boolean bl;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0);
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl2 = (n4 & 4) == 4;
        boolean bl3 = bl = (n4 & 2) == 2;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (((Boolean) LunarClient.getInstance().getSettingsManager().rsRedString.getValue()).booleanValue()) {
            class_21022 = Block.IIllIllIIllIIlllIIIlIlllI;
            class_08682.lllIIIllIIIIlllIlIIllIIll(1.0f, 0.0f, 0.0f, 1.0f);
        } else {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        }
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(bl2 ? 2.0 : 0.0);
        double d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(bl2 ? 4.0 : 2.0);
        double d5 = (double)(bl ? 3.5f : 1.5f) / 16.0;
        boolean bl4 = class_2109.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4, 1);
        boolean bl5 = class_2109.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4, 3);
        boolean bl6 = class_2109.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4, 2);
        boolean bl7 = class_2109.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4, 0);
        float f = 0.03125f;
        float f2 = 0.5f - f / 2.0f;
        float f3 = f2 + f;
        if (!(bl6 || bl5 || bl7 || bl4)) {
            bl6 = true;
            bl7 = true;
        }
        if (bl6) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.25, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, n3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, n3, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, n3, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, n3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.25, d, d2);
        }
        if (bl6 || bl7 && !bl5 && !bl4) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.5, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.25, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.25, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.25, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.5, d, d2);
        }
        if (bl7 || bl6 && !bl5 && !bl4) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.75, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.5, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.5, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.5, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.75, d, d2);
        }
        if (bl7) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, n3 + 1, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, n3 + 1, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.75, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, (double)n3 + 0.75, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, (double)n3 + 0.75, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f3, (double)n2 + d5, n3 + 1, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (double)n2 + d5, n3 + 1, d, d2);
        }
        if (bl4) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(n, (double)n2 + d5, (float)n3 + f3, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n, (double)n2 + d5, (float)n3 + f3, d, d4);
        }
        if (bl4 || bl5 && !bl6 && !bl7) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.25, (double)n2 + d5, (float)n3 + f3, d, d4);
        }
        if (bl5 || bl4 && !bl6 && !bl7) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + d5, (float)n3 + f3, d, d4);
        }
        if (bl5) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f2, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d5, (float)n3 + f2, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d5, (float)n3 + f3, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.75, (double)n2 + d5, (float)n3 + f3, d, d4);
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(BlockFire class_16872, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = class_16872.IllIIlllllllIIlIIlIIIIlIl(0);
        IIcon class_21023 = class_16872.IllIIlllllllIIlIIlIIIIlIl(1);
        IIcon class_21024 = class_21022;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21024 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_16872.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        double d = class_21024.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21024.IlIIIIIllllllIIlllIllllll();
        double d3 = class_21024.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21024.lIllllIIlIIIlIllllllIIIll();
        float f = 1.4f;
        if (!class_1334.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3) && !Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3)) {
            double d5;
            float f2 = 0.2f;
            float f3 = 0.0625f;
            if ((n + n2 + n3 & 1) == 1) {
                d = class_21023.IlIllllllIIlIIllllIIlIIIl();
                d2 = class_21023.IlIIIIIllllllIIlllIllllll();
                d3 = class_21023.lIlllIlllIIIIlIIlllIllIII();
                d4 = class_21023.lIllllIIlIIIlIllllllIIIll();
            }
            if ((n / 2 + n2 / 2 + n3 / 2 & 1) == 1) {
                d5 = d3;
                d3 = d;
                d = d5;
            }
            if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3)) {
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (float)n2 + f + f3, n3 + 1, d3, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (float)n2 + f + f3, n3 + 0, d, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (float)n2 + f + f3, n3 + 0, d, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)n + f2, (float)n2 + f + f3, n3 + 1, d3, d2);
            }
            if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3)) {
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 0, d, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 1, d3, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 1, d3, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 1, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1 - 0, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll((float)(n + 1) - f2, (float)n2 + f + f3, n3 + 0, d, d2);
            }
            if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1)) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f + f3, (float)n3 + f2, d3, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 0, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f + f3, (float)n3 + f2, d, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f + f3, (float)n3 + f2, d, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 0) + f3, n3 + 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 0, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f + f3, (float)n3 + f2, d3, d2);
            }
            if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1)) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f + f3, (float)(n3 + 1) - f2, d, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 0) + f3, n3 + 1 - 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 1 - 0, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f + f3, (float)(n3 + 1) - f2, d3, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f + f3, (float)(n3 + 1) - f2, d3, d2);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 0) + f3, n3 + 1 - 0, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 0) + f3, n3 + 1 - 0, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f + f3, (float)(n3 + 1) - f2, d, d2);
            }
            if (Blocks.lIIlIlllIllIlIlllIIIIIIII.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3)) {
                d5 = (double)n + 0.5 + 0.5;
                double d6 = (double)n + 0.5 - 0.5;
                double d7 = (double)n3 + 0.5 + 0.5;
                double d8 = (double)n3 + 0.5 - 0.5;
                double d9 = (double)n + 0.5 - 0.5;
                double d10 = (double)n + 0.5 + 0.5;
                double d11 = (double)n3 + 0.5 - 0.5;
                double d12 = (double)n3 + 0.5 + 0.5;
                d = class_21022.IlIllllllIIlIIllllIIlIIIl();
                d2 = class_21022.IlIIIIIllllllIIlllIllllll();
                d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
                d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
                f = -0.2f;
                if ((n + ++n2 + n3 & 1) == 0) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d9, (float)n2 + f, n3 + 0, d3, d2);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d5, n2 + 0, n3 + 0, d3, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d5, n2 + 0, n3 + 1, d, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d9, (float)n2 + f, n3 + 1, d, d2);
                    d = class_21023.IlIllllllIIlIIllllIIlIIIl();
                    d2 = class_21023.IlIIIIIllllllIIlllIllllll();
                    d3 = class_21023.lIlllIlllIIIIlIIlllIllIII();
                    d4 = class_21023.lIllllIIlIIIlIllllllIIIll();
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d10, (float)n2 + f, n3 + 1, d3, d2);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d6, n2 + 0, n3 + 1, d3, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d6, n2 + 0, n3 + 0, d, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d10, (float)n2 + f, n3 + 0, d, d2);
                } else {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f, d12, d3, d2);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, d8, d3, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, d8, d, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f, d12, d, d2);
                    d = class_21023.IlIllllllIIlIIllllIIlIIIl();
                    d2 = class_21023.IlIIIIIllllllIIlllIllllll();
                    d3 = class_21023.lIlllIlllIIIIlIIlllIllIII();
                    d4 = class_21023.lIllllIIlIIIlIllllllIIIll();
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f, d11, d3, d2);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, d7, d3, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, d7, d, d4);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f, d11, d, d2);
                }
            }
        } else {
            double d13 = (double)n + 0.5 + 0.2;
            double d14 = (double)n + 0.5 - 0.2;
            double d15 = (double)n3 + 0.5 + 0.2;
            double d16 = (double)n3 + 0.5 - 0.2;
            double d17 = (double)n + 0.5 - 0.3;
            double d18 = (double)n + 0.5 + 0.3;
            double d19 = (double)n3 + 0.5 - 0.3;
            double d20 = (double)n3 + 0.5 + 0.3;
            class_08682.lllIIIllIIIIlllIlIIllIIll(d17, (float)n2 + f, n3 + 1, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, n2 + 0, n3 + 1, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, n2 + 0, n3 + 0, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d17, (float)n2 + f, n3 + 0, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d18, (float)n2 + f, n3 + 0, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d14, n2 + 0, n3 + 0, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d14, n2 + 0, n3 + 1, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d18, (float)n2 + f, n3 + 1, d, d2);
            d = class_21023.IlIllllllIIlIIllllIIlIIIl();
            d2 = class_21023.IlIIIIIllllllIIlllIllllll();
            d3 = class_21023.lIlllIlllIIIIlIIlllIllIII();
            d4 = class_21023.lIllllIIlIIIlIllllllIIIll();
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f, d20, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, d16, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, d16, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f, d20, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f, d19, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, d15, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, d15, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f, d19, d, d2);
            d13 = (double)n + 0.5 - 0.5;
            d14 = (double)n + 0.5 + 0.5;
            d15 = (double)n3 + 0.5 - 0.5;
            d16 = (double)n3 + 0.5 + 0.5;
            d17 = (double)n + 0.5 - 0.4;
            d18 = (double)n + 0.5 + 0.4;
            d19 = (double)n3 + 0.5 - 0.4;
            d20 = (double)n3 + 0.5 + 0.4;
            class_08682.lllIIIllIIIIlllIlIIllIIll(d17, (float)n2 + f, n3 + 0, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, n2 + 0, n3 + 0, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, n2 + 0, n3 + 1, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d17, (float)n2 + f, n3 + 1, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d18, (float)n2 + f, n3 + 1, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d14, n2 + 0, n3 + 1, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d14, n2 + 0, n3 + 0, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d18, (float)n2 + f, n3 + 0, d3, d2);
            d = class_21022.IlIllllllIIlIIllllIIlIIIl();
            d2 = class_21022.IlIIIIIllllllIIlllIllllll();
            d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
            d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f, d20, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, d16, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, d16, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f, d20, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)n2 + f, d19, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, d15, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, d15, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)n2 + f, d19, d3, d2);
        }
        return true;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl(Block class_05492, int n, int n2, int n3) {
        boolean bl;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        IIcon class_21022 = class_1640.lIlllIlllIIIIlIIlllIllIII("cross");
        IIcon class_21023 = class_1640.lIlllIlllIIIIlIIlllIllIII("line");
        IIcon class_21024 = class_1640.lIlllIlllIIIIlIIlllIllIII("cross_overlay");
        IIcon class_21025 = class_1640.lIlllIlllIIIIlIIlllIllIII("line_overlay");
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        float f = (float)n4 / 15.0f;
        float f2 = f * 0.6f + 0.4f;
        if (n4 == 0) {
            f2 = 0.3f;
        }
        float f3 = f * f * 0.7f - 0.5f;
        float f4 = f * f * 0.6f - 0.7f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
        double d = 0.015625;
        double d2 = 0.015625;
        boolean bl2 = class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3, 1) || !this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 - 1, n3, -1);
        boolean bl3 = class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3, 3) || !this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 - 1, n3, -1);
        boolean bl4 = class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1, 2) || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 - 1, -1);
        boolean bl5 = bl = class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1, 0) || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 + 1, -1);
        if (!this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3).IllIIlllllllIIlIIlIIIIlIl()) {
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 + 1, n3, -1)) {
                bl2 = true;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 + 1, n3, -1)) {
                bl3 = true;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 - 1, -1)) {
                bl4 = true;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1).IllIIlllllllIIlIIlIIIIlIl() && class_1640.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 + 1, -1)) {
                bl = true;
            }
        }
        float f5 = n + 0;
        float f6 = n + 1;
        float f7 = n3 + 0;
        float f8 = n3 + 1;
        int n5 = 0;
        if ((bl2 || bl3) && !bl4 && !bl) {
            n5 = 1;
        }
        if ((bl4 || bl) && !bl3 && !bl2) {
            n5 = 2;
        }
        if (n5 == 0) {
            int n6 = 0;
            int n7 = 0;
            int n8 = 16;
            int n9 = 16;
            boolean bl6 = true;
            if (!bl2) {
                f5 += 0.3125f;
            }
            if (!bl2) {
                n6 += 5;
            }
            if (!bl3) {
                f6 -= 0.3125f;
            }
            if (!bl3) {
                n8 -= 5;
            }
            if (!bl4) {
                f7 += 0.3125f;
            }
            if (!bl4) {
                n7 += 5;
            }
            if (!bl) {
                f8 -= 0.3125f;
            }
            if (!bl) {
                n9 -= 5;
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f8, class_21022.lllIIIllIIIIlllIlIIllIIll(n8), class_21022.lllIlIIlIIIlIlIIIllIlllIl(n9));
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f7, class_21022.lllIIIllIIIIlllIlIIllIIll(n8), class_21022.lllIlIIlIIIlIlIIIllIlllIl(n7));
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f7, class_21022.lllIIIllIIIIlllIlIIllIIll(n6), class_21022.lllIlIIlIIIlIlIIIllIlllIl(n7));
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f8, class_21022.lllIIIllIIIIlllIlIIllIIll(n6), class_21022.lllIlIIlIIIlIlIIIllIlllIl(n9));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f8, class_21024.lllIIIllIIIIlllIlIIllIIll(n8), class_21024.lllIlIIlIIIlIlIIIllIlllIl(n9));
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f7, class_21024.lllIIIllIIIIlllIlIIllIIll(n8), class_21024.lllIlIIlIIIlIlIIIllIlllIl(n7));
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f7, class_21024.lllIIIllIIIIlllIlIIllIIll(n6), class_21024.lllIlIIlIIIlIlIIIllIlllIl(n7));
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f8, class_21024.lllIIIllIIIIlllIlIIllIIll(n6), class_21024.lllIlIIlIIIlIlIIIllIlllIl(n9));
        } else if (n5 == 1) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f8, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.lIllllIIlIIIlIllllllIIIll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f7, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.IlIIIIIllllllIIlllIllllll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f7, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.IlIIIIIllllllIIlllIllllll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f8, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.lIllllIIlIIIlIllllllIIIll());
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f8, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.lIllllIIlIIIlIllllllIIIll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f7, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.IlIIIIIllllllIIlllIllllll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f7, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.IlIIIIIllllllIIlllIllllll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f8, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.lIllllIIlIIIlIllllllIIIll());
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f8, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.lIllllIIlIIIlIllllllIIIll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f7, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.lIllllIIlIIIlIllllllIIIll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f7, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.IlIIIIIllllllIIlllIllllll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f8, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.IlIIIIIllllllIIlllIllllll());
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f8, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.lIllllIIlIIIlIllllllIIIll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f6, (double)n2 + 0.015625, f7, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.lIllllIIlIIIlIllllllIIIll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f7, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.IlIIIIIllllllIIlllIllllll());
            class_08682.lllIIIllIIIIlllIlIIllIIll(f5, (double)n2 + 0.015625, f8, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.IlIIIIIllllllIIlllIllllll());
        }
        if (!this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3).IllIIlllllllIIlIIlIIIIlIl()) {
            float f9 = 0.021875f;
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3).IllIIlllllllIIlIIlIIIIlIl() && this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 + 1, n3) == Blocks.IlIIIlIllIIIllIIIIlIIlIll) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, n2 + 0, n3 + 1, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, n2 + 0, n3 + 0, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, n2 + 0, n3 + 1, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, n2 + 0, n3 + 0, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.lIllllIIlIIIlIllllllIIIll());
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3).IllIIlllllllIIlIIlIIIIlIl() && this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 + 1, n3) == Blocks.IlIIIlIllIIIllIIIIlIIlIll) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, n2 + 0, n3 + 1, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, n2 + 0, n3 + 0, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, n2 + 0, n3 + 1, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 1, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, (float)(n2 + 1) + 0.021875f, n3 + 0, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - 0.015625, n2 + 0, n3 + 0, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.IlIIIIIllllllIIlllIllllll());
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1).IllIIlllllllIIlIIlIIIIlIl() && this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 - 1) == Blocks.IlIIIlIllIIIllIIIIlIIlIll) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)n3 + 0.015625, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)n3 + 0.015625, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)n3 + 0.015625, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 1) + 0.021875f, (double)n3 + 0.015625, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)n3 + 0.015625, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.IlIIIIIllllllIIlllIllllll());
            }
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1).IllIIlllllllIIlIIlIIIIlIl() && this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 + 1) == Blocks.IlIIIlIllIIIllIIIIlIIlIll) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f3, f4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)(n3 + 1) - 0.015625, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)(n3 + 1) - 0.015625, class_21023.IlIllllllIIlIIllllIIlIIIl(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, class_21023.lIlllIlllIIIIlIIlllIllIII(), class_21023.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)(n3 + 1) - 0.015625, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.IlIIIIIllllllIIlllIllllll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)(n3 + 1) - 0.015625, class_21025.IlIllllllIIlIIllllIIlIIIl(), class_21025.lIllllIIlIIIlIllllllIIIll());
                class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (float)(n2 + 1) + 0.021875f, (double)(n3 + 1) - 0.015625, class_21025.lIlllIlllIIIIlIIlllIllIII(), class_21025.lIllllIIlIIIlIllllllIIIll());
            }
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0609 class_06092, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll((Block)class_06092, 0, n4);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_06092, n, n2, n3, 1, class_21022);
        }
        if (class_06092.llIlllIIllIlllIlIlIlIIIll()) {
            n4 &= 7;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_06092.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d5 = 0.0625;
        double d6 = n + 1;
        double d7 = n + 1;
        double d8 = n + 0;
        double d9 = n + 0;
        double d10 = n3 + 0;
        double d11 = n3 + 1;
        double d12 = n3 + 1;
        double d13 = n3 + 0;
        double d14 = (double)n2 + d5;
        double d15 = (double)n2 + d5;
        double d16 = (double)n2 + d5;
        double d17 = (double)n2 + d5;
        if (n4 != 1 && n4 != 2 && n4 != 3 && n4 != 7) {
            if (n4 == 8) {
                d6 = d7 = (double)(n + 0);
                d8 = d9 = (double)(n + 1);
                d10 = d13 = (double)(n3 + 1);
                d11 = d12 = (double)(n3 + 0);
            } else if (n4 == 9) {
                d6 = d9 = (double)(n + 0);
                d7 = d8 = (double)(n + 1);
                d10 = d11 = (double)(n3 + 0);
                d12 = d13 = (double)(n3 + 1);
            }
        } else {
            d6 = d9 = (double)(n + 1);
            d7 = d8 = (double)(n + 0);
            d10 = d11 = (double)(n3 + 1);
            d12 = d13 = (double)(n3 + 0);
        }
        if (n4 != 2 && n4 != 4) {
            if (n4 == 3 || n4 == 5) {
                d15 += 1.0;
                d16 += 1.0;
            }
        } else {
            d14 += 1.0;
            d17 += 1.0;
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll(d6, d14, d10, d3, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d7, d15, d11, d3, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d16, d12, d, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d17, d13, d, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d17, d13, d, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d16, d12, d, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d7, d15, d11, d3, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d6, d14, d10, d3, d2);
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0.05);
        }
        return true;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll(Block class_05492, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, n, n2, n3, n4, class_21022);
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d5 = 0.0;
        double d6 = 0.05f;
        if (n4 == 5) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d6, (double)(n2 + 1) + d5, (double)(n3 + 1) + d5, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d6, (double)(n2 + 0) - d5, (double)(n3 + 1) + d5, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d6, (double)(n2 + 0) - d5, (double)(n3 + 0) - d5, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d6, (double)(n2 + 1) + d5, (double)(n3 + 0) - d5, d3, d2);
        }
        if (n4 == 4) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d6, (double)(n2 + 0) - d5, (double)(n3 + 1) + d5, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d6, (double)(n2 + 1) + d5, (double)(n3 + 1) + d5, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d6, (double)(n2 + 1) + d5, (double)(n3 + 0) - d5, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d6, (double)(n2 + 0) - d5, (double)(n3 + 0) - d5, d, d4);
        }
        if (n4 == 3) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) + d5, (double)(n2 + 0) - d5, (double)n3 + d6, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) + d5, (double)(n2 + 1) + d5, (double)n3 + d6, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0) - d5, (double)(n2 + 1) + d5, (double)n3 + d6, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0) - d5, (double)(n2 + 0) - d5, (double)n3 + d6, d, d4);
        }
        if (n4 == 2) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) + d5, (double)(n2 + 1) + d5, (double)(n3 + 1) - d6, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) + d5, (double)(n2 + 0) - d5, (double)(n3 + 1) - d6, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0) - d5, (double)(n2 + 0) - d5, (double)(n3 + 1) - d6, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 0) - d5, (double)(n2 + 1) + d5, (double)(n3 + 1) - d6, d3, d2);
        }
        return true;
    }

    public boolean lIIIIlIlIIlllllIIllIIlIII(Block class_05492, int n, int n2, int n3) {
        int n4;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        int n5 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            n4 = 0;
            if ((n5 & 1) != 0) {
                n4 = 2;
            } else if ((n5 & 2) != 0) {
                n4 = 5;
            } else if ((n5 & 4) != 0) {
                n4 = 3;
            } else if ((n5 & 8) != 0) {
                n4 = 4;
            }
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, n, n2, n3, n4, class_21022);
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        n4 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d5 = 0.05f;
        if ((n5 & 2) != 0) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 1, n3 + 1, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 0, n3 + 1, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 0, n3 + 0, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 1, n3 + 0, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 1, n3 + 0, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 0, n3 + 0, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 0, n3 + 1, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)n + d5, n2 + 1, n3 + 1, d, d2);
        }
        if ((n5 & 8) != 0) {
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 0, n3 + 1, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 1, n3 + 1, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 1, n3 + 0, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 0, n3 + 0, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 0, n3 + 0, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 1, n3 + 0, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 1, n3 + 1, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)(n + 1) - d5, n2 + 0, n3 + 1, d3, d4);
        }
        if ((n5 & 4) != 0) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)n3 + d5, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, (double)n3 + d5, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 1, (double)n3 + d5, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)n3 + d5, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)n3 + d5, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 1, (double)n3 + d5, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, (double)n3 + d5, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)n3 + d5, d3, d4);
        }
        if ((n5 & 1) != 0) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, (double)(n3 + 1) - d5, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)(n3 + 1) - d5, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)(n3 + 1) - d5, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 1, (double)(n3 + 1) - d5, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 1, (double)(n3 + 1) - d5, d3, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, (double)(n3 + 1) - d5, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 0, (double)(n3 + 1) - d5, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, (double)(n3 + 1) - d5, d, d2);
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3).IllIIlllllllIIlIIlIIIIlIl()) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)(n2 + 1) - d5, n3 + 0, d, d2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)(n2 + 1) - d5, n3 + 1, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (double)(n2 + 1) - d5, n3 + 1, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (double)(n2 + 1) - d5, n3 + 0, d3, d2);
        }
        return true;
    }

    public boolean llIIlllIllIllllIIIlIIIIII(Block class_05492, int n, int n2, int n3) {
        IIcon class_21022;
        IIcon class_21023;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n5 = class_05492.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n5 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        boolean bl = class_05492 instanceof class_0937;
        int n6 = 0;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21023 = this.lllIlIIlIIIlIlIIIllIlllIl;
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        } else {
            n6 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            class_21023 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n6);
            class_21022 = bl ? ((class_0937)class_05492).IllIIlllllllIIlIIlIIIIlIl(n6) : ((class_2092)class_05492).llIlllIIllIlllIlIlIlIIIll();
        }
        IIcon class_21024 = class_21023;
        boolean bl2 = true;
        boolean bl3 = true;
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            IIcon class_21025 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, n, n2, n3, 4, class_21023);
            IIcon class_21026 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, n, n2, n3, 3, class_21023);
            if (class_21025 != class_21023 || class_21026 != class_21023) {
                class_2092 class_20922 = (class_2092)class_05492;
                bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3) != class_05492 || this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3) != n6;
                bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3) != class_05492 || this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3) != n6;
            }
            class_21023 = class_21025;
            class_21024 = class_21026;
        }
        double d = class_21023.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21023.lllIIIllIIIIlllIlIIllIIll(7.0);
        double d3 = class_21023.lllIIIllIIIIlllIlIIllIIll(9.0);
        double d4 = class_21023.lIlllIlllIIIIlIIlllIllIII();
        double d5 = class_21023.IlIIIIIllllllIIlllIllllll();
        double d6 = class_21023.lIllllIIlIIIlIllllllIIIll();
        double d7 = class_21024.IlIllllllIIlIIllllIIlIIIl();
        double d8 = class_21024.lllIIIllIIIIlllIlIIllIIll(7.0);
        double d9 = class_21024.lllIIIllIIIIlllIlIIllIIll(9.0);
        double d10 = class_21024.lIlllIlllIIIIlIIlllIllIII();
        double d11 = class_21024.IlIIIIIllllllIIlllIllllll();
        double d12 = class_21024.lIllllIIlIIIlIllllllIIIll();
        double d13 = class_21022.lllIIIllIIIIlllIlIIllIIll(7.0);
        double d14 = class_21022.lllIIIllIIIIlllIlIIllIIll(9.0);
        double d15 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d16 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d17 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(7.0);
        double d18 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(9.0);
        double d19 = n;
        double d20 = n + 1;
        double d21 = n3;
        double d22 = n3 + 1;
        double d23 = (double)n + 0.5 - 0.0625;
        double d24 = (double)n + 0.5 + 0.0625;
        double d25 = (double)n3 + 0.5 - 0.0625;
        double d26 = (double)n3 + 0.5 + 0.0625;
        boolean bl4 = bl ? ((class_0937)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1)) : ((class_2092)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1));
        boolean bl5 = bl ? ((class_0937)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1)) : ((class_2092)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1));
        boolean bl6 = bl ? ((class_0937)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3)) : ((class_2092)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3));
        boolean bl7 = bl ? ((class_0937)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3)) : ((class_2092)class_05492).IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3));
        double d27 = 0.001;
        double d28 = 0.999;
        double d29 = 0.001;
        boolean bl8 = !bl4 && !bl5 && !bl6 && !bl7;
        double d30 = (double)n2 + 0.999;
        double d31 = (double)n2 + 0.001;
        if (!bl2) {
            d30 = n2 + 1;
        }
        if (!bl3) {
            d31 = n2;
        }
        if (!bl6 && !bl8) {
            if (!bl4 && !bl5) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d2, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d2, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d3, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d3, d5);
            }
        } else if (bl6 && bl7) {
            if (!bl4) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d25, d10, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d25, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d25, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d25, d7, d11);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d8, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d8, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d25, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d25, d7, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d25, d10, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d25, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d9, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d9, d11);
            }
            if (!bl5) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d26, d7, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d26, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d26, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d26, d10, d11);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d26, d7, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d26, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d8, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d8, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d9, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d9, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d26, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d26, d10, d11);
            }
            if (bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d26, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d26, d14, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d25, d13, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d25, d13, d15);
            }
            if (bl3) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d26, d13, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d26, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d25, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d25, d14, d16);
            }
        } else {
            if (!bl4 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d9, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d9, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d25, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d25, d7, d11);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d8, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d8, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d25, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d25, d7, d11);
            }
            if (!bl5 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d26, d7, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d26, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d9, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d9, d11);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d26, d7, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d26, d7, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d8, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d8, d11);
            }
            if (bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d26, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d14, d17);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d13, d17);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d25, d13, d15);
            }
            if (bl3) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d13, d17);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d26, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d25, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d14, d17);
            }
        }
        if ((bl7 || bl8) && !bl6) {
            if (!bl5 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d8, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d8, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d26, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d26, d10, d11);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d9, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d9, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d26, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d26, d10, d11);
            }
            if (!bl4 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d25, d10, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d25, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d8, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d8, d11);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d25, d10, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d25, d10, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d9, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d9, d11);
            }
            if (bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d14, d18);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d26, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d25, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d13, d18);
            }
            if (bl3) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d26, d13, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d13, d18);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d14, d18);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d25, d14, d16);
            }
        } else if (!(bl7 || bl4 || bl5)) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d2, d5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d2, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d3, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d3, d5);
        }
        if (!bl4 && !bl8) {
            if (!bl7 && !bl6) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d9, d11);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d9, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d8, d12);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d8, d11);
            }
        } else if (bl4 && bl5) {
            if (!bl6) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d21, d, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d22, d4, d5);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d21, d, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d2, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d2, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d3, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d3, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d22, d4, d5);
            }
            if (!bl7) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d22, d4, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d21, d, d5);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d2, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d2, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d21, d, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d22, d4, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d3, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d3, d5);
            }
            if (bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d21, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d21, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d22, d13, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d22, d14, d16);
            }
            if (bl3) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d21, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d21, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d22, d14, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d22, d13, d16);
            }
        } else {
            if (!bl6 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d21, d, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d3, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d3, d5);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d21, d, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d2, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d2, d5);
            }
            if (!bl7 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d3, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d3, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d21, d, d5);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d2, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d2, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d21, d, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d21, d, d5);
            }
            if (bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d21, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d21, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d13, d17);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d14, d17);
            }
            if (bl3) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d21, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d21, d14, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d14, d17);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d13, d17);
            }
        }
        if ((bl5 || bl8) && !bl4) {
            if (!bl6 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d2, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d2, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d22, d4, d5);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d3, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d3, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d22, d4, d5);
            }
            if (!bl7 && !bl8) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d22, d4, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d2, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d2, d5);
            } else {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d22, d4, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d22, d4, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d3, d6);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d3, d5);
            }
            if (bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d14, d18);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d13, d18);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d22, d13, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d22, d14, d16);
            }
            if (bl3) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d13, d18);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d14, d18);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d22, d14, d16);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d22, d13, d16);
            }
        } else if (!(bl5 || bl7 || bl6)) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d8, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d8, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d9, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d9, d11);
        }
        if (bl2) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d25, d14, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d25, d13, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d26, d13, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d26, d14, d18);
        }
        if (bl3) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d25, d13, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d25, d14, d17);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d26, d14, d18);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d26, d13, d18);
        }
        if (bl8) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d25, d2, d5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d25, d2, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d31, d26, d3, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d30, d26, d3, d5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d26, d2, d5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d26, d2, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d31, d25, d3, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d20, d30, d25, d3, d5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d21, d9, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d21, d9, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d21, d8, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d21, d8, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d30, d22, d8, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d23, d31, d22, d8, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d31, d22, d9, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d24, d30, d22, d9, d11);
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2092 class_20922, int n, int n2, int n3) {
        IIcon class_21022;
        IIcon class_21023;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_20922.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n5 = class_20922.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n5 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21023 = this.lllIlIIlIIIlIlIIIllIlllIl;
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        } else {
            int n6 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            class_21023 = this.lllIIIllIIIIlllIlIIllIIll((Block)class_20922, 0, n6);
            class_21022 = class_20922.llIlllIIllIlllIlIlIlIIIll();
        }
        IIcon class_21024 = class_21023;
        IIcon class_21025 = class_21023;
        IIcon class_21026 = class_21023;
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21023 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_20922, n, n2, n3, 2, class_21023);
            class_21024 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_20922, n, n2, n3, 3, class_21024);
            class_21025 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_20922, n, n2, n3, 4, class_21025);
            class_21026 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_20922, n, n2, n3, 5, class_21026);
        }
        double d = class_21023.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21023.lllIIIllIIIIlllIlIIllIIll(8.0);
        double d3 = class_21023.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21023.IlIIIIIllllllIIlllIllllll();
        double d5 = class_21023.lIllllIIlIIIlIllllllIIIll();
        double d6 = class_21024.IlIllllllIIlIIllllIIlIIIl();
        double d7 = class_21024.lllIIIllIIIIlllIlIIllIIll(8.0);
        double d8 = class_21024.lIlllIlllIIIIlIIlllIllIII();
        double d9 = class_21024.IlIIIIIllllllIIlllIllllll();
        double d10 = class_21024.lIllllIIlIIIlIllllllIIIll();
        double d11 = class_21025.IlIllllllIIlIIllllIIlIIIl();
        double d12 = class_21025.lllIIIllIIIIlllIlIIllIIll(8.0);
        double d13 = class_21025.lIlllIlllIIIIlIIlllIllIII();
        double d14 = class_21025.IlIIIIIllllllIIlllIllllll();
        double d15 = class_21025.lIllllIIlIIIlIllllllIIIll();
        double d16 = class_21026.IlIllllllIIlIIllllIIlIIIl();
        double d17 = class_21026.lllIIIllIIIIlllIlIIllIIll(8.0);
        double d18 = class_21026.lIlllIlllIIIIlIIlllIllIII();
        double d19 = class_21026.IlIIIIIllllllIIlllIllllll();
        double d20 = class_21026.lIllllIIlIIIlIllllllIIIll();
        double d21 = class_21022.lllIIIllIIIIlllIlIIllIIll(7.0);
        double d22 = class_21022.lllIIIllIIIIlllIlIIllIIll(9.0);
        double d23 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d24 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(8.0);
        double d25 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d26 = n;
        double d27 = (double)n + 0.5;
        double d28 = n + 1;
        double d29 = n3;
        double d30 = (double)n3 + 0.5;
        double d31 = n3 + 1;
        double d32 = (double)n + 0.5 - 0.0625;
        double d33 = (double)n + 0.5 + 0.0625;
        double d34 = (double)n3 + 0.5 - 0.0625;
        double d35 = (double)n3 + 0.5 + 0.0625;
        boolean bl = class_20922.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1));
        boolean bl2 = class_20922.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1));
        boolean bl3 = class_20922.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3));
        boolean bl4 = class_20922.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3));
        boolean bl5 = class_20922.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3, 1);
        boolean bl6 = class_20922.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3, 0);
        double d36 = 0.01;
        double d37 = 0.005;
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3 && !bl4) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 1, d30, d, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 0, d30, d, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d2, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d2, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d7, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d7, d10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 0, d30, d8, d10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 1, d30, d8, d9);
                if (!bl2 && !bl) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d35, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d35, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d34, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d34, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d34, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d35, d22, d23);
                }
                if (bl5 || n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n - 1, n2 + 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d24);
                }
                if (bl6 || n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n - 1, n2 - 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d24);
                }
            } else if (!bl3 && bl4) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d2, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d2, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 0, d30, d3, d5);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 1, d30, d3, d4);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 1, d30, d6, d9);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 0, d30, d6, d10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d7, d10);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d7, d9);
                if (!bl2 && !bl) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d34, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d35, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d35, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d34, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d34, d22, d23);
                }
                if (bl5 || n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n + 1, n2 + 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d34, d21, d23);
                }
                if (bl6 || n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n + 1, n2 - 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d34, d21, d23);
                }
            }
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 1, d30, d, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 0, d30, d, d5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 0, d30, d3, d5);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 1, d30, d3, d4);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 1, d30, d6, d9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d28, n2 + 0, d30, d6, d10);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 0, d30, d8, d10);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d26, n2 + 1, d30, d8, d9);
            if (bl5) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d35, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d35, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d34, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d34, d21, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d35, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d35, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d34, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d34, d21, d25);
            } else {
                if (n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n - 1, n2 + 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)(n2 + 1) + 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d24);
                }
                if (n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n + 1, n2 + 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)(n2 + 1) + 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)(n2 + 1) + 0.01, d34, d21, d23);
                }
            }
            if (bl6) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d35, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d35, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d34, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d34, d21, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d35, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d35, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d34, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d34, d21, d25);
            } else {
                if (n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n - 1, n2 - 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d35, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d26, (double)n2 - 0.01, d34, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d24);
                }
                if (n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n + 1, n2 - 1, n3)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d35, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d35, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d27, (double)n2 - 0.01, d34, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d28, (double)n2 - 0.01, d34, d21, d23);
                }
            }
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl && !bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d29, d11, d14);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d29, d11, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d12, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d12, d14);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d17, d19);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d17, d20);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d29, d18, d20);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d29, d18, d19);
                if (!bl4 && !bl3) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 1, d30, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 0, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 0, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 1, d30, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 1, d30, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 0, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 0, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 1, d30, d22, d23);
                }
                if (bl5 || n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3 - 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d29, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d29, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d29, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d29, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d21, d23);
                }
                if (bl6 || n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3 - 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d29, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d29, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d29, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d29, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d21, d23);
                }
            } else if (!bl && bl2) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d12, d14);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d12, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d31, d13, d15);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d31, d13, d14);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d31, d16, d19);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d31, d16, d20);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d30, d17, d20);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d30, d17, d19);
                if (!bl4 && !bl3) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 1, d30, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 0, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 0, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 1, d30, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 1, d30, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, n2 + 0, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 0, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, n2 + 1, d30, d22, d23);
                }
                if (bl5 || n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3 + 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d31, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d31, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d31, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d31, d22, d24);
                }
                if (bl6 || n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3 + 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d31, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d31, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d31, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d31, d22, d24);
                }
            }
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d31, d16, d19);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d31, d16, d20);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d29, d18, d20);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d29, d18, d19);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d29, d11, d14);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d29, d11, d15);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 0, d31, d13, d15);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d27, n2 + 1, d31, d13, d14);
            if (bl5) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d31, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d29, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d29, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d31, d21, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d29, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d31, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d31, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d29, d21, d25);
            } else {
                if (n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3 - 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d29, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d29, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d29, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d29, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d21, d23);
                }
                if (n2 < n4 - 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3 + 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d31, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d31, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d31, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)(n2 + 1) + 0.005, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)(n2 + 1) + 0.005, d31, d22, d24);
                }
            }
            if (bl6) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d31, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d29, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d29, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d31, d21, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d29, d22, d25);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d31, d22, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d31, d21, d23);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d29, d21, d25);
            } else {
                if (n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3 - 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d29, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d29, d21, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d22, d23);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d29, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d29, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d21, d23);
                }
                if (n2 > 1 && this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3 + 1)) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d31, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d31, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d22, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d31, d21, d24);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d32, (double)n2 - 0.005, d30, d21, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d30, d22, d25);
                    class_08682.lllIIIllIIIIlllIlIIllIIll(d33, (double)n2 - 0.005, d31, d22, d24);
                }
            }
        }
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        return true;
    }

    public boolean llIIllIllIlIIlIIllIllllll(Block class_05492, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n4 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        double d = n;
        double d2 = n2;
        double d3 = n3;
        if (class_05492 == Blocks.IlIlIIlllIllllllllIIIlIlI) {
            long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
            l = l * l * 42317861L + l * 11L;
            d += ((double)((float)(l >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d2 += ((double)((float)(l >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            d3 += ((double)((float)(l >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
        } else if (class_05492 == Blocks.IIIIlIIlIIIllIIIIllIIIlII || class_05492 == Blocks.llIlllIIllIlllIlIlIlIIIll) {
            long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
            l = l * l * 42317861L + l * 11L;
            d += ((double)((float)(l >> 16 & 0xFL) / 15.0f) - 0.5) * 0.3;
            d3 += ((double)((float)(l >> 24 & 0xFL) / 15.0f) - 0.5) * 0.3;
        }
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, n, n2, n3, 2, class_21022);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_21022, d, d2, d3, 1.0f);
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1487 class_14872, int n, int n2, int n3) {
        int n4;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_14872.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n5 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_14872, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n5 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        long l = (long)(n * 3129871) ^ (long)n3 * 116129781L;
        l = l * l * 42317861L + l * 11L;
        double d = n;
        double d2 = n2;
        double d3 = n3;
        d += ((double)((float)(l >> 16 & 0xFL) / 15.0f) - 0.5) * 0.3;
        d3 += ((double)((float)(l >> 24 & 0xFL) / 15.0f) - 0.5) * 0.3;
        int n6 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl = false;
        boolean bl2 = class_1487.IllIIlllllllIIlIIlIIIIlIl(n6);
        if (bl2) {
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3) != class_14872) {
                return false;
            }
            n4 = class_1487.IIIllIllIIlIlIlIlIllllIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3));
        } else {
            n4 = class_1487.IIIllIllIIlIlIlIlIllllIIl(n6);
        }
        IIcon class_21022 = class_14872.lllIIIllIIIIlllIlIIllIIll(bl2, n4);
        this.lllIIIllIIIIlllIlIIllIIll(class_21022, d, d2, d3, 1.0f);
        if (bl2 && n4 == 0) {
            IIcon class_21023 = class_14872.lIlIIllllIlIIIIllIIIIlIIl[0];
            double d4 = Math.cos((double)l * 0.8) * Math.PI * 0.1;
            double d5 = Math.cos(d4);
            double d6 = Math.sin(d4);
            double d7 = class_21023.IlIllllllIIlIIllllIIlIIIl();
            double d8 = class_21023.IlIIIIIllllllIIlllIllllll();
            double d9 = class_21023.lIlllIlllIIIIlIIlllIllIII();
            double d10 = class_21023.lIllllIIlIIIlIllllllIIIll();
            double d11 = 0.3;
            double d12 = -0.05;
            double d13 = 0.5 + 0.3 * d5 - 0.5 * d6;
            double d14 = 0.5 + 0.5 * d5 + 0.3 * d6;
            double d15 = 0.5 + 0.3 * d5 + 0.5 * d6;
            double d16 = 0.5 + -0.5 * d5 + 0.3 * d6;
            double d17 = 0.5 + -0.05 * d5 + 0.5 * d6;
            double d18 = 0.5 + -0.5 * d5 + -0.05 * d6;
            double d19 = 0.5 + -0.05 * d5 - 0.5 * d6;
            double d20 = 0.5 + 0.5 * d5 + -0.05 * d6;
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d17, d2 + 1.0, d3 + d18, d7, d10);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d19, d2 + 1.0, d3 + d20, d9, d10);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d13, d2 + 0.0, d3 + d14, d9, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d15, d2 + 0.0, d3 + d16, d7, d8);
            IIcon class_21024 = class_14872.lIlIIllllIlIIIIllIIIIlIIl[1];
            d7 = class_21024.IlIllllllIIlIIllllIIlIIIl();
            d8 = class_21024.IlIIIIIllllllIIlllIllllll();
            d9 = class_21024.lIlllIlllIIIIlIIlllIllIII();
            d10 = class_21024.lIllllIIlIIIlIllllllIIIll();
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d19, d2 + 1.0, d3 + d20, d7, d10);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d17, d2 + 1.0, d3 + d18, d9, d10);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d15, d2 + 0.0, d3 + d16, d9, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d13, d2 + 0.0, d3 + d14, d7, d8);
        }
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        return true;
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI(Block class_05492, int n, int n2, int n3) {
        class_0895 class_08952 = (class_0895)class_05492;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_08952.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n4 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_08952, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        class_08952.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        int n5 = class_08952.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        if (n5 < 0) {
            this.lllIIIllIIIIlllIlIIllIIll((Block)class_08952, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), this.llIIllIllIlIIlIIllIllllll, (double)n, (double)((float)n2 - 0.0625f), (double)n3);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll((Block)class_08952, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0.5, (double)n, (double)((float)n2 - 0.0625f), (double)n3);
            this.lllIIIllIIIIlllIlIIllIIll(class_08952, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), n5, this.llIIllIllIlIIlIIllIllllll, (double)n, (double)((float)n2 - 0.0625f), (double)n3);
        }
        return true;
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll(Block class_05492, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), (double)n, (double)((float)n2 - 0.0625f), (double)n3);
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, double d, double d2, double d3, double d4, double d5, int n) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d7 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d8 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d9 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d10 = class_21022.lllIIIllIIIIlllIlIIllIIll(7.0);
        double d11 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(6.0);
        double d12 = class_21022.lllIIIllIIIIlllIlIIllIIll(9.0);
        double d13 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(8.0);
        double d14 = class_21022.lllIIIllIIIIlllIlIIllIIll(7.0);
        double d15 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(13.0);
        double d16 = class_21022.lllIIIllIIIIlllIlIIllIIll(9.0);
        double d17 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(15.0);
        double d18 = (d += 0.5) - 0.5;
        double d19 = d + 0.5;
        double d20 = (d3 += 0.5) - 0.5;
        double d21 = d3 + 0.5;
        double d22 = 0.0625;
        double d23 = 0.625;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d4 * (1.0 - d23) - d22, d2 + d23, d3 + d5 * (1.0 - d23) - d22, d10, d11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d4 * (1.0 - d23) - d22, d2 + d23, d3 + d5 * (1.0 - d23) + d22, d10, d13);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d4 * (1.0 - d23) + d22, d2 + d23, d3 + d5 * (1.0 - d23) + d22, d12, d13);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d4 * (1.0 - d23) + d22, d2 + d23, d3 + d5 * (1.0 - d23) - d22, d12, d11);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d22 + d4, d2, d3 - d22 + d5, d16, d15);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d22 + d4, d2, d3 + d22 + d5, d16, d17);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d - d22 + d4, d2, d3 + d22 + d5, d14, d17);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d - d22 + d4, d2, d3 - d22 + d5, d14, d15);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d - d22, d2 + 1.0, d20, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d - d22 + d4, d2 + 0.0, d20 + d5, d6, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d - d22 + d4, d2 + 0.0, d21 + d5, d8, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d - d22, d2 + 1.0, d21, d8, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d22, d2 + 1.0, d21, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d4 + d22, d2 + 0.0, d21 + d5, d6, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d4 + d22, d2 + 0.0, d20 + d5, d8, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d + d22, d2 + 1.0, d20, d8, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d18, d2 + 1.0, d3 + d22, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d18 + d4, d2 + 0.0, d3 + d22 + d5, d6, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d19 + d4, d2 + 0.0, d3 + d22 + d5, d8, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d2 + 1.0, d3 + d22, d8, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d19, d2 + 1.0, d3 - d22, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d19 + d4, d2 + 0.0, d3 - d22 + d5, d6, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d18 + d4, d2 + 0.0, d3 - d22 + d5, d8, d9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d18, d2 + 1.0, d3 - d22, d8, d7);
    }

    public void lllIIIllIIIIlllIlIIllIIll(IIcon class_21022, double d, double d2, double d3, float f) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d4 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d5 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d6 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d7 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d8 = 0.45 * (double)f;
        double d9 = d + 0.5 - d8;
        double d10 = d + 0.5 + d8;
        double d11 = d3 + 0.5 - d8;
        double d12 = d3 + 0.5 + d8;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + (double)f, d11, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d11, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + 0.0, d12, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + (double)f, d12, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + (double)f, d12, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + 0.0, d12, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d11, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + (double)f, d11, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + (double)f, d12, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d12, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + 0.0, d11, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + (double)f, d11, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + (double)f, d11, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d2 + 0.0, d11, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d12, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + (double)f, d12, d6, d5);
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, double d, double d2, double d3, double d4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d5 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d6 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(d * 16.0);
        double d9 = d2 + 0.5 - (double)0.45f;
        double d10 = d2 + 0.5 + (double)0.45f;
        double d11 = d4 + 0.5 - (double)0.45f;
        double d12 = d4 + 0.5 + (double)0.45f;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + d, d11, d5, d6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + 0.0, d11, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + 0.0, d12, d7, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + d, d12, d7, d6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + d, d12, d7, d6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + 0.0, d12, d7, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + 0.0, d11, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + d, d11, d5, d6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + d, d12, d5, d6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + 0.0, d12, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + 0.0, d11, d7, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + d, d11, d7, d6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + d, d11, d7, d6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + 0.0, d11, d7, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + 0.0, d12, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + d, d12, d5, d6);
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl(Block class_05492, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, n, n2, n3, 1, class_21022);
        }
        float f = 0.015625f;
        double d = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d2 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d3 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d4 = class_21022.lIllllIIlIIIlIllllllIIIll();
        long l = (long)(n * 3129871) ^ (long)n3 * 116129781L ^ (long)n2;
        l = l * l * 42317861L + l * 11L;
        int n4 = (int)(l >> 16 & 3L);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        float f2 = (float)n + 0.5f;
        float f3 = (float)n3 + 0.5f;
        float f4 = (float)(n4 & 1) * 0.5f * (float)(1 - n4 / 2 % 2 * 2);
        float f5 = (float)(n4 + 1 & 1) * 0.5f * (float)(1 - (n4 + 1) / 2 % 2 * 2);
        int n5 = class_1689.IlIllllllIIlIIllllIIlIIIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(n5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 + f4 - f5, (float)n2 + f, f3 + f4 + f5, d, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 + f4 + f5, (float)n2 + f, f3 - f4 + f5, d3, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 - f4 + f5, (float)n2 + f, f3 - f4 - f5, d3, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 - f4 - f5, (float)n2 + f, f3 + f4 - f5, d, d4);
        class_08682.IlIllllllIIlIIllllIIlIIIl((n5 & 0xFEFEFE) >> 1);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 - f4 - f5, (float)n2 + f, f3 + f4 - f5, d, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 - f4 + f5, (float)n2 + f, f3 - f4 - f5, d3, d4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 + f4 + f5, (float)n2 + f, f3 - f4 + f5, d3, d2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f2 + f4 - f5, (float)n2 + f, f3 + f4 + f5, d, d2);
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0895 class_08952, int n, int n2, double d, double d2, double d3, double d4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = class_08952.llIlllIIllIlllIlIlIlIIIll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d5 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d6 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d8 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d9 = d2 + 0.5 - 0.5;
        double d10 = d2 + 0.5 + 0.5;
        double d11 = d4 + 0.5 - 0.5;
        double d12 = d4 + 0.5 + 0.5;
        double d13 = d2 + 0.5;
        double d14 = d4 + 0.5;
        if ((n2 + 1) / 2 % 2 == 1) {
            double d15 = d7;
            d7 = d5;
            d5 = d15;
        }
        if (n2 < 2) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + d, d14, d5, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + 0.0, d14, d5, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + 0.0, d14, d7, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + d, d14, d7, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + d, d14, d7, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d10, d3 + 0.0, d14, d7, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + 0.0, d14, d5, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d3 + d, d14, d5, d6);
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + d, d12, d5, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + 0.0, d12, d5, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + 0.0, d11, d7, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + d, d11, d7, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + d, d11, d7, d6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + 0.0, d11, d7, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + 0.0, d12, d5, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d3 + d, d12, d5, d6);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, double d, double d2, double d3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n);
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        double d4 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        double d5 = class_21022.IlIIIIIllllllIIlllIllllll();
        double d6 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        double d7 = class_21022.lIllllIIlIIIlIllllllIIIll();
        double d8 = d + 0.5 - 0.25;
        double d9 = d + 0.5 + 0.25;
        double d10 = d3 + 0.5 - 0.5;
        double d11 = d3 + 0.5 + 0.5;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d10, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d10, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d11, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d11, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d11, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d11, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d10, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d10, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d11, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d11, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d10, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d10, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d10, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d10, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d11, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d11, d6, d5);
        d8 = d + 0.5 - 0.5;
        d9 = d + 0.5 + 0.5;
        d10 = d3 + 0.5 - 0.25;
        d11 = d3 + 0.5 + 0.25;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d10, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d10, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d10, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d10, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d10, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d10, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d10, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d10, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d11, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d11, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d11, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d11, d6, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 1.0, d11, d4, d5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d8, d2 + 0.0, d11, d4, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 0.0, d11, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d9, d2 + 1.0, d11, d6, d5);
    }

    public boolean lllllIlllIIllIlIIlIIIllII(Block class_05492, int n, int n2, int n3) {
        float f;
        float f2;
        float f3;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n4 = class_1689.lllIlIIlIIIlIlIIIllIlllIl(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f4 = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f5 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f6 = (float)(n4 & 0xFF) / 255.0f;
        boolean bl = class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3, 1);
        boolean bl2 = class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3, 0);
        boolean[] arrbl = new boolean[]{class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1, 2), class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1, 3), class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3, 4), class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3, 5)};
        if (!(bl || bl2 || arrbl[0] || arrbl[1] || arrbl[2] || arrbl[3])) {
            return false;
        }
        boolean bl3 = false;
        float f7 = 0.5f;
        float f8 = 1.0f;
        float f9 = 0.8f;
        float f10 = 0.6f;
        double d7 = 0.0;
        double d8 = 1.0;
        class_1855 class_18552 = class_05492.lIllllIIlIIIlIllllllIIIll();
        int n5 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        double d9 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_18552);
        double d10 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1, class_18552);
        double d11 = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 + 1, class_18552);
        double d12 = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3, class_18552);
        double d13 = 0.001f;
        if (this.IlIIIIIllllllIIlllIllllll || bl) {
            double d14;
            double d15;
            bl3 = true;
            IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1, n5);
            float f11 = (float)class_0816.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, class_18552);
            if (f11 > -999.0f) {
                class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2, n5);
            }
            d9 -= d13;
            d10 -= d13;
            d11 -= d13;
            d12 -= d13;
            if (f11 < -999.0f) {
                d15 = class_21022.lllIIIllIIIIlllIlIIllIIll(0.0);
                d6 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(0.0);
                d5 = d15;
                d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0);
                d2 = d4;
                d = d3;
                d14 = d6;
            } else {
                f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f11) * 0.25f;
                f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f11) * 0.25f;
                f = 8.0f;
                d15 = class_21022.lllIIIllIIIIlllIlIIllIIll(8.0f + (-f2 - f3) * 16.0f);
                d6 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(8.0f + (-f2 + f3) * 16.0f);
                d5 = class_21022.lllIIIllIIIIlllIlIIllIIll(8.0f + (-f2 + f3) * 16.0f);
                d4 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(8.0f + (f2 + f3) * 16.0f);
                d3 = class_21022.lllIIIllIIIIlllIlIIllIIll(8.0f + (f2 + f3) * 16.0f);
                d2 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(8.0f + (f2 - f3) * 16.0f);
                d = class_21022.lllIIIllIIIIlllIlIIllIIll(8.0f + (f2 - f3) * 16.0f);
                d14 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(8.0f + (-f2 - f3) * 16.0f);
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f8 * f4, f8 * f5, f8 * f6);
            double d16 = 3.90625E-5;
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (double)n2 + d9, n3 + 0, d15 + d16, d6 + d16);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (double)n2 + d10, n3 + 1, d5 + d16, d4 - d16);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d11, n3 + 1, d3 - d16, d2 - d16);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d12, n3 + 0, d - d16, d14 + d16);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (double)n2 + d9, n3 + 0, d15 + d16, d6 + d16);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d12, n3 + 0, d - d16, d14 + d16);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 1, (double)n2 + d11, n3 + 1, d3 - d16, d2 - d16);
            class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, (double)n2 + d10, n3 + 1, d5 + d16, d4 - d16);
        }
        if (this.IlIIIIIllllllIIlllIllllll || bl2) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f7 * f4, f7 * f5, f7 * f6);
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2 + d13, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0));
            bl3 = true;
        }
        for (int i = 0; i < 4; ++i) {
            int n6 = n;
            int n7 = n3;
            if (i == 0) {
                n7 = n3 - 1;
            }
            if (i == 1) {
                ++n7;
            }
            if (i == 2) {
                n6 = n - 1;
            }
            if (i == 3) {
                ++n6;
            }
            IIcon class_21023 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, i + 2, n5);
            if (!this.IlIIIIIllllllIIlllIllllll && !arrbl[i]) continue;
            if (i == 0) {
                d5 = d9;
                d3 = d12;
                d = n;
                d4 = n + 1;
                d6 = (double)n3 + d13;
                d2 = (double)n3 + d13;
            } else if (i == 1) {
                d5 = d11;
                d3 = d10;
                d = n + 1;
                d4 = n;
                d6 = (double)(n3 + 1) - d13;
                d2 = (double)(n3 + 1) - d13;
            } else if (i == 2) {
                d5 = d10;
                d3 = d9;
                d = (double)n + d13;
                d4 = (double)n + d13;
                d6 = n3 + 1;
                d2 = n3;
            } else {
                d5 = d12;
                d3 = d11;
                d = (double)(n + 1) - d13;
                d4 = (double)(n + 1) - d13;
                d6 = n3;
                d2 = n3 + 1;
            }
            bl3 = true;
            float f12 = class_21023.lllIIIllIIIIlllIlIIllIIll(0.0);
            f3 = class_21023.lllIIIllIIIIlllIlIIllIIll(8.0);
            f2 = class_21023.lllIlIIlIIIlIlIIIllIlllIl((1.0 - d5) * 16.0 * 0.5);
            f = class_21023.lllIlIIlIIIlIlIIIllIlllIl((1.0 - d3) * 16.0 * 0.5);
            float f13 = class_21023.lllIlIIlIIIlIlIIIllIlllIl(8.0);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n6, n2, n7));
            float f14 = 1.0f;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f8 * (f14 *= i < 2 ? f9 : f10) * f4, f8 * f14 * f5, f8 * f14 * f6);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, (double)n2 + d5, d6, f12, f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, (double)n2 + d3, d2, f3, f);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, n2 + 0, d2, f3, f13);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, n2 + 0, d6, f12, f13);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, n2 + 0, d6, f12, f13);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, n2 + 0, d2, f3, f13);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, (double)n2 + d3, d2, f3, f);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, (double)n2 + d5, d6, f12, f2);
        }
        this.llIIlllIllIllllIIIlIIIIII = d7;
        this.llIIllIllIlIIlIIllIllllll = d8;
        return bl3;
    }

    public float lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, class_1855 class_18552) {
        int n4 = 0;
        float f = 0.0f;
        for (int i = 0; i < 4; ++i) {
            int n5 = n - (i & 1);
            int n6 = n3 - (i >> 1 & 1);
            if (this.lllIIIllIIIIlllIlIIllIIll.a_(n5, n2 + 1, n6).lIllllIIlIIIlIllllllIIIll() == class_18552) {
                return 1.0f;
            }
            class_1855 class_18553 = this.lllIIIllIIIIlllIlIIllIIll.a_(n5, n2, n6).lIllllIIlIIIlIllllllIIIll();
            if (class_18553 == class_18552) {
                int n7 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n5, n2, n6);
                if (n7 >= 8 || n7 == 0) {
                    f += class_0816.IllIIlllllllIIlIIlIIIIlIl(n7) * 10.0f;
                    n4 += 10;
                }
                f += class_0816.IllIIlllllllIIlIIlIIIIlIl(n7);
                ++n4;
                continue;
            }
            if (class_18553.lllIlIIlIIIlIlIIIllIlllIl()) continue;
            f += 1.0f;
            ++n4;
        }
        return 1.0f - f / (float)n4;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, class_1334 class_13342, int n, int n2, int n3, int n4) {
        float f = 0.5f;
        float f2 = 1.0f;
        float f3 = 0.8f;
        float f4 = 0.6f;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIlIIlIIIlIlIIIllIlllIl((class_1843)class_13342, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f, f);
        this.lllIIIllIIIIlllIlIIllIIll(class_05492, -0.5, -0.5, -0.5, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n4));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f2, f2);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, -0.5, -0.5, -0.5, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1, n4));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f3, f3, f3);
        this.IlIllllllIIlIIllllIIlIIIl(class_05492, -0.5, -0.5, -0.5, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2, n4));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f3, f3, f3);
        this.lIlllIlllIIIIlIIlllIllIII(class_05492, -0.5, -0.5, -0.5, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3, n4));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f4, f4, f4);
        this.IlIIIIIllllllIIlllIllllll(class_05492, -0.5, -0.5, -0.5, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4, n4));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f4, f4, f4);
        this.lIllllIIlIIIlIllllllIIIll(class_05492, -0.5, -0.5, -0.5, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5, n4));
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public boolean IlIlIIlllIIlIllIIIlllllIl(Block class_05492, int n, int n2, int n3) {
        int n4 = class_1689.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        return Minecraft.IlIIlllllIIlIlIlllllIllll() && class_05492.lIlllIlllIIIIlIIlllIllIII() == 0 ? (this.lllllIlllIIllIlIIlIIIllII ? this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, n, n2, n3, f, f2, f3) : this.lllIIIllIIIIlllIlIIllIIll(class_05492, n, n2, n3, f, f2, f3)) : this.IlIllllllIIlIIllllIIlIIIl(class_05492, n, n2, n3, f, f2, f3);
    }

    public boolean lIIlIIIIIlIlllIlIIlIlIlll(Block class_05492, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 0xC;
        if (n5 == 4) {
            this.lIIlIIIIIlIlllIlIIlIlIlll = 2;
            this.lIlIlIIlIIIIlIIIIIlllIIII = 1;
            this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
            this.llIIlIllIllllIlIIIIlIIlll = 2;
        } else if (n5 == 8) {
            this.IlIIIlIIIIllIIIllIIIIIIll = 2;
            this.IIlllIlIlllIllIIIlllIIlIl = 1;
            this.lIlIllIIlIIlIIlIIlIIlIIll = 3;
            this.llIIlIllIllllIlIIIIlIIlll = 3;
        }
        boolean bl = this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
        this.IlIIIlIIIIllIIIllIIIIIIll = 0;
        this.lIIlIIIIIlIlllIlIIlIlIlll = 0;
        this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
        this.IIlllIlIlllIllIIIlllIIlIl = 0;
        this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
        this.llIIlIllIllllIlIIIIlIIlll = 0;
        return bl;
    }

    public boolean lIlIlIIlIIIIlIIIIIlllIIII(Block class_05492, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 == 3) {
            this.lIIlIIIIIlIlllIlIIlIlIlll = 2;
            this.lIlIlIIlIIIIlIIIIIlllIIII = 1;
            this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
            this.llIIlIllIllllIlIIIIlIIlll = 2;
        } else if (n4 == 4) {
            this.IlIIIlIIIIllIIIllIIIIIIll = 2;
            this.IIlllIlIlllIllIIIlllIIlIl = 1;
            this.lIlIllIIlIIlIIlIIlIIlIIll = 3;
            this.llIIlIllIllllIlIIIIlIIlll = 3;
        }
        boolean bl = this.IlIlIIlllIIlIllIIIlllllIl(class_05492, n, n2, n3);
        this.IlIIIlIIIIllIIIllIIIIIIll = 0;
        this.lIIlIIIIIlIlllIlIIlIlIlll = 0;
        this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
        this.IIlllIlIlllIllIIIlllIIlIl = 0;
        this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
        this.llIIlIllIllllIlIIIIlIIlll = 0;
        return bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, int n2, int n3, float f, float f2, float f3) {
        IIcon class_21022;
        float f4;
        int n4;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.llIllllIlIllIIIlIllIIlIlI = true;
        boolean bl5 = class_0868.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl;
        boolean bl6 = Config.llllIIllIlIlllllllIIlIIlI() && bl5;
        boolean bl7 = class_05492 == Blocks.lIlIllIIlIIlIIlIIlIIlIIll;
        boolean bl8 = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        boolean bl9 = true;
        int n5 = -1;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(983055);
        if (class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl) {
            bl9 = false;
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            bl9 = false;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3, 0)) {
            if (this.llIIlllIllIllllIIIlIIIIII <= 0.0) {
                --n2;
            }
            this.IIIIlIlIIlIIIIlIlllIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llIlIIlllIIIIIllIIlIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.IllIIIlllllIlIlllIlllllII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.lIIIllIIIIIllllIlIlIllIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            this.IlIIlllllIIlIlIlllllIllll = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.IllIIIIllIIllIllIlllIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.IIIIIIIIlIllIIllIIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            this.llIIIlllIlllIlIllIIIIllIl = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl && !bl3) {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.IlIIlllllIIlIlIlllllIllll;
                this.llllIlIIIIIIIIIlllIIlIIIl = this.IIIIlIlIIlIIIIlIlllIlIIII;
            } else {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 - 1);
                this.llllIlIIIIIIIIIlllIIlIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.llIIlIlIlllIIllIlIlllIllI = this.IlIIlllllIIlIlIlllllIllll;
                this.lllIIIIlIlIIlIIlllIIIIIIl = this.IIIIlIlIIlIIIIlIlllIlIIII;
            } else {
                this.llIIlIlIlllIIllIlIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 + 1);
                this.lllIIIIlIlIIlIIlllIIIIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 + 1);
            }
            if (!bl && !bl4) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.llIIIlllIlllIlIllIIIIllIl;
                this.llIlllIlIIllIlIIIIllIIlIl = this.lIIIllIIIIIllllIlIlIllIll;
            } else {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 - 1);
                this.llIlllIlIIllIlIIIIllIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl4) {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.llIIIlllIlllIlIllIIIIllIl;
                this.lIIIlIIIlIlllIllIIIlIIIlI = this.lIIIllIIIIIllllIlIlIllIll;
            } else {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 + 1);
                this.lIIIlIIIlIlllIllIIIlIIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 + 1);
            }
            if (this.llIIlllIllIllllIIIlIIIIII <= 0.0) {
                ++n2;
            }
            if (n5 < 0) {
                n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            n4 = n5;
            if (this.llIIlllIllIllllIIIlIIIIII <= 0.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            }
            f4 = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            f5 = (this.llIIlIlIlllIIllIlIlllIllI + this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI + f4) / 4.0f;
            f8 = (this.IIIIIIIIlIllIIllIIlllIllI + f4 + this.IIIIlIllIlIIlIIlIllIlIlll + this.llIIIlllIlllIlIllIIIIllIl) / 4.0f;
            f7 = (f4 + this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl + this.IIlIIlIlIlIllIIlIlIIIIlll) / 4.0f;
            f6 = (this.IlIIlllllIIlIlIlllllIllll + this.lIlllIlllIlIIIIlllIlIlIIl + f4 + this.IllIIIIllIIllIllIlllIlIIl) / 4.0f;
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIIlIlIIlIIlllIIIIIIl, this.IIIIlIlIIlIIIIlIlllIlIIII, this.IllIIIlllllIlIlllIlllllII, n4);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIlllllIlIlllIlllllII, this.lIIIlIIIlIlllIllIIIlIIIlI, this.lIIIllIIIIIllllIlIlIllIll, n4);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.llIlIIlllIIIIIllIIlIlIIII, this.lIIIllIIIIIllllIlIlIllIll, this.llIlllIlIIllIlIIIIllIIlIl, n4);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIlIIlIIIIlIlllIlIIII, this.llllIlIIIIIIIIIlllIIlIIIl, this.llIlIIlllIIIIIllIIlIlIIII, n4);
            if (bl7) {
                f6 = f4;
                f7 = f4;
                f8 = f4;
                f5 = f4;
                this.lIlIIllIllIIIIIlIllllIIIl = this.IlIIllIlIlIllIIIlIIlIlIIl = n4;
                this.lIlllIIllIIIIIIlIlIIlIllI = this.IlIIllIlIlIllIIIlIIlIlIIl;
                this.IlIlIllIIlIIIIlllIlIllIlI = this.IlIIllIlIlIllIIIlIIlIlIIl;
            }
            if (bl9) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.5f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.5f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.5f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.5f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.5f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.5f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.5f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.5f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.5f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.5f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.5f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.5f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.5f;
                this.lIIllllllllIlIllllllllIlI = 0.5f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.5f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f5;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f5;
            this.IlIIIlIIlllllIIIllIlIlIll *= f5;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f6;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f6;
            this.lIIllllllllIlIllllllllIlI *= f6;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f7;
            this.lIIIlIIllIllIIlIIlIIIllII *= f7;
            this.lIIIIllIIllIIIlIIIllIllII *= f7;
            this.lIlIlIIllIIIlllIllIIlIllI *= f8;
            this.lIlIllIIllIIIIlllIlIlllIl *= f8;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f8;
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 0));
            bl8 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3, 1)) {
            if (this.llIIllIllIlIIlIIllIllllll >= 1.0) {
                ++n2;
            }
            this.IIlIllIIlllllIIlIIllllIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llllIIllIlIlllllllIIlIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            this.IllIlIlIIIlllIIllIIIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.IlllIIlllllllIIllIlIllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.llllIIIIlIIIlIIIIIIlIllll = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.lIlIIllllIlIIIIllIIIIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            this.IIllIllIIllIIlllIIIlIlllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.llIlllIIllIlllIlIlIlIIIll = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl && !bl3) {
                this.IlIlIIlllIllllllllIIIlIlI = this.llllIIIIlIIIlIIIIIIlIllll;
                this.lIIlIlllIllIlIlllIIIIIIII = this.IIlIllIIlllllIIlIIllllIIl;
            } else {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 - 1);
                this.lIIlIlllIllIlIlllIIIIIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 - 1);
            }
            if (!bl && !bl4) {
                this.llllllIlIllllIlIlIlIIIIlI = this.lIlIIllllIlIIIIllIIIIlIIl;
                this.IlIIIlIllIIIllIIIIlIIlIll = this.llllIIllIlIlllllllIIlIIlI;
            } else {
                this.llllllIlIllllIlIlIlIIIIlI = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 - 1);
                this.IlIIIlIllIIIllIIIIlIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.llllIIIIlIIIlIIIIIIlIllll;
                this.IllllIIlIIIllIlllIlllIllI = this.IIlIllIIlllllIIlIIllllIIl;
            } else {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 + 1);
                this.IllllIIlIIIllIlllIlllIllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lIlIIllllIlIIIIllIIIIlIIl;
                this.IlllIIIllllIIllIllIlIIlIl = this.llllIIllIlIlllllllIIlIIlI;
            } else {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 + 1);
                this.IlllIIIllllIIllIllIlIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 + 1);
            }
            if (this.llIIllIllIlIIlIIllIllllll >= 1.0) {
                --n2;
            }
            if (n5 < 0) {
                n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            n4 = n5;
            if (this.llIIllIllIlIIlIIllIllllll >= 1.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            }
            f4 = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            f8 = (this.llIIIIllIIIIIIIlIIIlIIIIl + this.llllIIIIlIIIlIIIIIIlIllll + this.llIlllIIllIlllIlIlIlIIIll + f4) / 4.0f;
            f5 = (this.llIlllIIllIlllIlIlIlIIIll + f4 + this.IIIIlIIlIIIllIIIIllIIIlII + this.lIlIIllllIlIIIIllIIIIlIIl) / 4.0f;
            f6 = (f4 + this.IIllIllIIllIIlllIIIlIlllI + this.lIlIIllllIlIIIIllIIIIlIIl + this.llllllIlIllllIlIlIlIIIIlI) / 4.0f;
            f7 = (this.llllIIIIlIIIlIIIIIIlIllll + this.IlIlIIlllIllllllllIIIlIlI + f4 + this.IIllIllIIllIIlllIIIlIlllI) / 4.0f;
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.IllllIIlIIIllIlllIlllIllI, this.IIlIllIIlllllIIlIIllllIIl, this.IlllIIlllllllIIllIlIllllI, n4);
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.IlllIIIllllIIllIllIlIIlIl, this.llllIIllIlIlllllllIIlIIlI, n4);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IllIlIlIIIlllIIllIIIIlIll, this.llllIIllIlIlllllllIIlIIlI, this.IlIIIlIllIIIllIIIIlIIlIll, n4);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IIlIllIIlllllIIlIIllllIIl, this.lIIlIlllIllIlIlllIIIIIIII, this.IllIlIlIIIlllIIllIIIIlIll, n4);
            if (bl7) {
                f6 = f4;
                f7 = f4;
                f8 = f4;
                f5 = f4;
                this.lIlIIllIllIIIIIlIllllIIIl = this.IlIIllIlIlIllIIIlIIlIlIIl = n4;
                this.lIlllIIllIIIIIIlIlIIlIllI = this.IlIIllIlIlIllIIIlIIlIlIIl;
                this.IlIlIllIIlIIIIlllIlIllIlI = this.IlIIllIlIlIllIIIlIIlIlIIl;
            }
            this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f;
            this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
            this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
            this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2;
            this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
            this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
            this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3;
            this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
            this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            this.llIIIlIlIlIIlIllIIIllIlIl *= f5;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f5;
            this.IlIIIlIIlllllIIIllIlIlIll *= f5;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f6;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f6;
            this.lIIllllllllIlIllllllllIlI *= f6;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f7;
            this.lIIIlIIllIllIIlIIlIIIllII *= f7;
            this.lIIIIllIIllIIIlIIIllIllII *= f7;
            this.lIlIlIIllIIIlllIllIIlIllI *= f8;
            this.lIlIllIIllIIIIlllIlIlllIl *= f8;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f8;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 1));
            bl8 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1, 2)) {
            if (this.lllIIlIIIllllllIIIIlIlIlI <= 0.0) {
                --n3;
            }
            this.lllIIIIIIlIlllIIlIlIIIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.IllIIIIllIIllIllIlllIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.IIllIllIIllIIlllIIIlIlllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.llIIlIIllIIllIlIIllIIllII = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            this.lllIIIlIIlIlIllIIIIIlIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llIlIIlllIIIIIllIIlIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.IllIlIlIIIlllIIllIIIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            this.IIIlIlIllIlllllIlIllllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl3 && !bl) {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3);
                this.llllIlIIIIIIIIIlllIIlIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.lIIlIlllIllIlIlllIIIIIIII = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + 1, n3);
                this.lIIlIlllIllIlIlllIIIIIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.llIIlIIllIIllIlIIllIIllII;
                this.llIlllIlIIllIlIIIIllIIlIl = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1, n3);
                this.llIlllIlIIllIlIIIIllIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.llllllIlIllllIlIlIlIIIIlI = this.llIIlIIllIIllIlIIllIIllII;
                this.IlIIIlIllIIIllIIIIlIIlIll = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.llllllIlIllllIlIlIlIIIIlI = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, n3);
                this.IlIIIlIllIIIllIIIIlIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 + 1, n3);
            }
            if (this.lllIIlIIIllllllIIIIlIlIlI <= 0.0) {
                ++n3;
            }
            if (n5 < 0) {
                n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            n4 = n5;
            if (this.lllIIlIIIllllllIIIIlIlIlI <= 0.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1).IlIlllIIIIIIlIIllIIllIlll()) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            }
            f4 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            f5 = (this.lllIIIIIIlIlllIIlIlIIIllI + this.IlIlIIlllIllllllllIIIlIlI + f4 + this.IIllIllIIllIIlllIIIlIlllI) / 4.0f;
            f6 = (f4 + this.IIllIllIIllIIlllIIIlIlllI + this.llIIlIIllIIllIlIIllIIllII + this.llllllIlIllllIlIlIlIIIIlI) / 4.0f;
            f7 = (this.IllIIIIllIIllIllIlllIlIIl + f4 + this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIlIIllIIllIlIIllIIllII) / 4.0f;
            f8 = (this.lIlllIlllIlIIIIlllIlIlIIl + this.lllIIIIIIlIlllIIlIlIIIllI + this.IllIIIIllIIllIllIlllIlIIl + f4) / 4.0f;
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlIIlIlIllIIIIIlIIll, this.lIIlIlllIllIlIlllIIIIIIII, this.IllIlIlIIIlllIIllIIIIlIll, n4);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IllIlIlIIIlllIIllIIIIlIll, this.IIIlIlIllIlllllIlIllllllI, this.IlIIIlIllIIIllIIIIlIIlIll, n4);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.llIlIIlllIIIIIllIIlIlIIII, this.llIlllIlIIllIlIIIIllIIlIl, this.IIIlIlIllIlllllIlIllllllI, n4);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.llllIlIIIIIIIIIlllIIlIIIl, this.lllIIIlIIlIlIllIIIIIlIIll, this.llIlIIlllIIIIIllIIlIlIIII, n4);
            if (bl7) {
                f6 = f4;
                f7 = f4;
                f8 = f4;
                f5 = f4;
                this.lIlIIllIllIIIIIlIllllIIIl = this.IlIIllIlIlIllIIIlIIlIlIIl = n4;
                this.lIlllIIllIIIIIIlIlIIlIllI = this.IlIIllIlIlIllIIIlIIlIlIIl;
                this.IlIlIllIIlIIIIlllIlIllIlI = this.IlIIllIlIlIllIIIlIIlIlIIl;
            }
            if (bl9) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.8f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.8f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.8f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.8f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.8f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.8f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.8f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.8f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.8f;
                this.lIIllllllllIlIllllllllIlI = 0.8f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.8f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f5;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f5;
            this.IlIIIlIIlllllIIIllIlIlIll *= f5;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f6;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f6;
            this.lIIllllllllIlIllllllllIlI *= f6;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f7;
            this.lIIIlIIllIllIIlIIlIIIllII *= f7;
            this.lIIIIllIIllIIIlIIIllIllII *= f7;
            this.lIlIlIIllIIIlllIllIIlIllI *= f8;
            this.lIlIllIIllIIIIlllIlIlllIl *= f8;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f8;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2);
            if (bl6) {
                class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_21022, n, n2, n3, 2, f, f2, f3);
            }
            this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, class_21022);
            if (bl5 && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl8 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1, 3)) {
            if (this.IlIlllIIIIIIlIIllIIllIlll >= 1.0) {
                ++n3;
            }
            this.lIlIlIIIIIIlIIllllIlIIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.IllllIIIIlIIlIIIIlllIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            this.IIIIIIIIlIllIIllIIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.llIlllIIllIlllIlIlIlIIIll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.IIIIlIllIlIIIIIllllIIlllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llllIlIIllIIlllllIIllIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            this.IllIIIlllllIlIlllIlllllII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.IlllIIlllllllIIllIlIllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl3 && !bl) {
                this.llIIlIlIlllIIllIlIlllIllI = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.lllIIIIlIlIIlIIlllIIIIIIl = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIlIlIlllIIllIlIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3);
                this.lllIIIIlIlIIlIIlllIIIIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.IllllIIlIIIllIlllIlllIllI = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + 1, n3);
                this.IllllIIlIIIllIlllIlllIllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.lIIIlIIIlIlllIllIIIlIIIlI = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1, n3);
                this.lIIIlIIIlIlllIllIIIlIIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.IlllIIIllllIIllIllIlIIlIl = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, n3);
                this.IlllIIIllllIIllIllIlIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 + 1, n3);
            }
            if (this.IlIlllIIIIIIlIIllIIllIlll >= 1.0) {
                --n3;
            }
            if (n5 < 0) {
                n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            n4 = n5;
            if (this.IlIlllIIIIIIlIIllIIllIlll >= 1.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1).IlIlllIIIIIIlIIllIIllIlll()) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            }
            f4 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            f5 = (this.lIlIlIIIIIIlIIllllIlIIllI + this.llIIIIllIIIIIIIlIIIlIIIIl + f4 + this.llIlllIIllIlllIlIlIlIIIll) / 4.0f;
            f8 = (f4 + this.llIlllIIllIlllIlIlIlIIIll + this.IllllIIIIlIIlIIIIlllIIIIl + this.IIIIlIIlIIIllIIIIllIIIlII) / 4.0f;
            f7 = (this.IIIIIIIIlIllIIllIIlllIllI + f4 + this.IIIIlIllIlIIlIIlIllIlIlll + this.IllllIIIIlIIlIIIIlllIIIIl) / 4.0f;
            f6 = (this.llIIlIlIlllIIllIlIlllIllI + this.lIlIlIIIIIIlIIllllIlIIllI + this.IIIIIIIIlIllIIllIIlllIllI + f4) / 4.0f;
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIIIIllllIIlllI, this.IllllIIlIIIllIlllIlllIllI, this.IlllIIlllllllIIllIlIllllI, n4);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.llllIlIIllIIlllllIIllIIll, this.IlllIIIllllIIllIllIlIIlIl, n4);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIlllllIlIlllIlllllII, this.lIIIlIIIlIlllIllIIIlIIIlI, this.llllIlIIllIIlllllIIllIIll, n4);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIIlIlIIlIIlllIIIIIIl, this.IIIIlIllIlIIIIIllllIIlllI, this.IllIIIlllllIlIlllIlllllII, n4);
            if (bl7) {
                f6 = f4;
                f7 = f4;
                f8 = f4;
                f5 = f4;
                this.lIlIIllIllIIIIIlIllllIIIl = this.IlIIllIlIlIllIIIlIIlIlIIl = n4;
                this.lIlllIIllIIIIIIlIlIIlIllI = this.IlIIllIlIlIllIIIlIIlIlIIl;
                this.IlIlIllIIlIIIIlllIlIllIlI = this.IlIIllIlIlIllIIIlIIlIlIIl;
            }
            if (bl9) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.8f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.8f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.8f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.8f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.8f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.8f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.8f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.8f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.8f;
                this.lIIllllllllIlIllllllllIlI = 0.8f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.8f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f5;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f5;
            this.IlIIIlIIlllllIIIllIlIlIll *= f5;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f6;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f6;
            this.lIIllllllllIlIllllllllIlI *= f6;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f7;
            this.lIIIlIIllIllIIlIIlIIIllII *= f7;
            this.lIIIIllIIllIIIlIIIllIllII *= f7;
            this.lIlIlIIllIIIlllIllIIlIllI *= f8;
            this.lIlIllIIllIIIIlllIlIlllIl *= f8;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f8;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3);
            if (bl6) {
                class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_21022, n, n2, n3, 3, f, f2, f3);
            }
            this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, class_21022);
            if (bl5 && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl8 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3, 4)) {
            if (this.IllIIIllIIIIlIlIlIllIIlll <= 0.0) {
                --n;
            }
            this.IlIIlllllIIlIlIlllllIllll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.lllIIIIIIlIlllIIlIlIIIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.lIlIlIIIIIIlIIllllIlIIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            this.llllIIIIlIIIlIIIIIIlIllll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.IIIIlIlIIlIIIIlIlllIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.lllIIIlIIlIlIllIIIIIlIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.IIIIlIllIlIIIIIllllIIlllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.IIlIllIIlllllIIlIIllllIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl2 && !bl3) {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 - 1);
                this.llllIlIIIIIIIIIlllIIlIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 - 1);
            }
            if (!bl && !bl3) {
                this.llIIlIlIlllIIllIlIlllIllI = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.lllIIIIlIlIIlIIlllIIIIIIl = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIlIlIlllIIllIlIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + 1);
                this.lllIIIIlIlIIlIIlllIIIIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.lIIlIlllIllIlIlllIIIIIIII = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 - 1);
                this.lIIlIlllIllIlIlllIIIIIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 - 1);
            }
            if (!bl && !bl4) {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.IllllIIlIIIllIlllIlllIllI = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 + 1);
                this.IllllIIlIIIllIlllIlllIllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 + 1);
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll <= 0.0) {
                ++n;
            }
            if (n5 < 0) {
                n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            n4 = n5;
            if (this.IllIIIllIIIIlIlIlIllIIlll <= 0.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            }
            f4 = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            f8 = (this.IlIIlllllIIlIlIlllllIllll + this.llIIlIlIlllIIllIlIlllIllI + f4 + this.lIlIlIIIIIIlIIllllIlIIllI) / 4.0f;
            f5 = (f4 + this.lIlIlIIIIIIlIIllllIlIIllI + this.llllIIIIlIIIlIIIIIIlIllll + this.llIIIIllIIIIIIIlIIIlIIIIl) / 4.0f;
            f6 = (this.lllIIIIIIlIlllIIlIlIIIllI + f4 + this.IlIlIIlllIllllllllIIIlIlI + this.llllIIIIlIIIlIIIIIIlIllll) / 4.0f;
            f7 = (this.lIlllIlllIlIIIIlllIlIlIIl + this.IlIIlllllIIlIlIlllllIllll + this.lllIIIIIIlIlllIIlIlIIIllI + f4) / 4.0f;
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIlIIlIIIIlIlllIlIIII, this.lllIIIIlIlIIlIIlllIIIIIIl, this.IIIIlIllIlIIIIIllllIIlllI, n4);
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIIIIllllIIlllI, this.IIlIllIIlllllIIlIIllllIIl, this.IllllIIlIIIllIlllIlllIllI, n4);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlIIlIlIllIIIIIlIIll, this.lIIlIlllIllIlIlllIIIIIIII, this.IIlIllIIlllllIIlIIllllIIl, n4);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.llllIlIIIIIIIIIlllIIlIIIl, this.IIIIlIlIIlIIIIlIlllIlIIII, this.lllIIIlIIlIlIllIIIIIlIIll, n4);
            if (bl7) {
                f6 = f4;
                f7 = f4;
                f8 = f4;
                f5 = f4;
                this.lIlIIllIllIIIIIlIllllIIIl = this.IlIIllIlIlIllIIIlIIlIlIIl = n4;
                this.lIlllIIllIIIIIIlIlIIlIllI = this.IlIIllIlIlIllIIIlIIlIlIIl;
                this.IlIlIllIIlIIIIlllIlIllIlI = this.IlIIllIlIlIllIIIlIIlIlIIl;
            }
            if (bl9) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.6f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.6f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.6f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.6f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.6f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.6f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.6f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.6f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.6f;
                this.lIIllllllllIlIllllllllIlI = 0.6f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.6f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f5;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f5;
            this.IlIIIlIIlllllIIIllIlIlIll *= f5;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f6;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f6;
            this.lIIllllllllIlIllllllllIlI *= f6;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f7;
            this.lIIIlIIllIllIIlIIlIIIllII *= f7;
            this.lIIIIllIIllIIIlIIIllIllII *= f7;
            this.lIlIlIIllIIIlllIllIIlIllI *= f8;
            this.lIlIllIIllIIIIlllIlIlllIl *= f8;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f8;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4);
            if (bl6) {
                class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_21022, n, n2, n3, 4, f, f2, f3);
            }
            this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, class_21022);
            if (bl5 && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl8 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3, 5)) {
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 1.0) {
                ++n;
            }
            this.llIIIlllIlllIlIllIIIIllIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.llIIlIIllIIllIlIIllIIllII = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.IllllIIIIlIIlIIIIlllIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            this.lIlIIllllIlIIIIllIIIIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.lIIIllIIIIIllllIlIlIllIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.IIIlIlIllIlllllIlIllllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.llllIlIIllIIlllllIIllIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.llllIIllIlIlllllllIIlIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl3 && !bl) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.llIIlIIllIIllIlIIllIIllII;
                this.llIlllIlIIllIlIIIIllIIlIl = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 - 1);
                this.llIlllIlIIllIlIIIIllIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 - 1);
            }
            if (!bl3 && !bl2) {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.lIIIlIIIlIlllIllIIIlIIIlI = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + 1);
                this.lIIIlIIIlIlllIllIIIlIIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 + 1);
            }
            if (!bl4 && !bl) {
                this.llllllIlIllllIlIlIlIIIIlI = this.llIIlIIllIIllIlIIllIIllII;
                this.IlIIIlIllIIIllIIIIlIIlIll = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.llllllIlIllllIlIlIlIIIIlI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 - 1);
                this.IlIIIlIllIIIllIIIIlIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 - 1);
            }
            if (!bl4 && !bl2) {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.IlllIIIllllIIllIllIlIIlIl = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 + 1);
                this.IlllIIIllllIIllIllIlIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 + 1);
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 1.0) {
                --n;
            }
            if (n5 < 0) {
                n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            n4 = n5;
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 1.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            }
            f4 = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            f5 = (this.llIIIlllIlllIlIllIIIIllIl + this.IIIIlIllIlIIlIIlIllIlIlll + f4 + this.IllllIIIIlIIlIIIIlllIIIIl) / 4.0f;
            f6 = (this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIIlllIlllIlIllIIIIllIl + this.llIIlIIllIIllIlIIllIIllII + f4) / 4.0f;
            f7 = (this.llIIlIIllIIllIlIIllIIllII + f4 + this.llllllIlIllllIlIlIlIIIIlI + this.lIlIIllllIlIIIIllIIIIlIIl) / 4.0f;
            f8 = (f4 + this.IllllIIIIlIIlIIIIlllIIIIl + this.lIlIIllllIlIIIIllIIIIlIIl + this.IIIIlIIlIIIllIIIIllIIIlII) / 4.0f;
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lIIIllIIIIIllllIlIlIllIll, this.lIIIlIIIlIlllIllIIIlIIIlI, this.llllIlIIllIIlllllIIllIIll, n4);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.llllIlIIllIIlllllIIllIIll, this.llllIIllIlIlllllllIIlIIlI, this.IlllIIIllllIIllIllIlIIlIl, n4);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IIIlIlIllIlllllIlIllllllI, this.IlIIIlIllIIIllIIIIlIIlIll, this.llllIIllIlIlllllllIIlIIlI, n4);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.llIlllIlIIllIlIIIIllIIlIl, this.lIIIllIIIIIllllIlIlIllIll, this.IIIlIlIllIlllllIlIllllllI, n4);
            if (bl7) {
                f6 = f4;
                f7 = f4;
                f8 = f4;
                f5 = f4;
                this.lIlIIllIllIIIIIlIllllIIIl = this.IlIIllIlIlIllIIIlIIlIlIIl = n4;
                this.lIlllIIllIIIIIIlIlIIlIllI = this.IlIIllIlIlIllIIIlIIlIlIIl;
                this.IlIlIllIIlIIIIlllIlIllIlI = this.IlIIllIlIlIllIIIlIIlIlIIl;
            }
            if (bl9) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.6f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.6f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.6f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.6f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.6f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.6f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.6f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.6f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.6f;
                this.lIIllllllllIlIllllllllIlI = 0.6f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.6f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f5;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f5;
            this.IlIIIlIIlllllIIIllIlIlIll *= f5;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f6;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f6;
            this.lIIllllllllIlIllllllllIlI *= f6;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f7;
            this.lIIIlIIllIllIIlIIlIIIllII *= f7;
            this.lIIIIllIIllIIIlIIIllIllII *= f7;
            this.lIlIlIIllIIIlllIllIIlIllI *= f8;
            this.lIlIllIIllIIIIlllIlIlllIl *= f8;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f8;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5);
            if (bl6) {
                class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_21022, n, n2, n3, 5, f, f2, f3);
            }
            this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, class_21022);
            if (bl5 && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl8 = true;
        }
        this.llIllllIlIllIIIlIllIIlIlI = false;
        return bl8;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492, int n, int n2, int n3, float f, float f2, float f3) {
        IIcon class_21022;
        int n4;
        int n5;
        int n6;
        int n7;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int n8;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.llIllllIlIllIIIlIllIIlIlI = true;
        boolean bl5 = false;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean bl6 = true;
        int n9 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(983055);
        if (class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl) {
            bl6 = false;
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            bl6 = false;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3, 0)) {
            if (this.llIIlllIllIllllIIIlIIIIII <= 0.0) {
                --n2;
            }
            this.IIIIlIlIIlIIIIlIlllIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llIlIIlllIIIIIllIIlIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.IllIIIlllllIlIlllIlllllII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.lIIIllIIIIIllllIlIlIllIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            this.IlIIlllllIIlIlIlllllIllll = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.IllIIIIllIIllIllIlllIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.IIIIIIIIlIllIIllIIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            this.llIIIlllIlllIlIllIIIIllIl = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl && !bl3) {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.IlIIlllllIIlIlIlllllIllll;
                this.llllIlIIIIIIIIIlllIIlIIIl = this.IIIIlIlIIlIIIIlIlllIlIIII;
            } else {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 - 1);
                this.llllIlIIIIIIIIIlllIIlIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.llIIlIlIlllIIllIlIlllIllI = this.IlIIlllllIIlIlIlllllIllll;
                this.lllIIIIlIlIIlIIlllIIIIIIl = this.IIIIlIlIIlIIIIlIlllIlIIII;
            } else {
                this.llIIlIlIlllIIllIlIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 + 1);
                this.lllIIIIlIlIIlIIlllIIIIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 + 1);
            }
            if (!bl && !bl4) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.llIIIlllIlllIlIllIIIIllIl;
                this.llIlllIlIIllIlIIIIllIIlIl = this.lIIIllIIIIIllllIlIlIllIll;
            } else {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 - 1);
                this.llIlllIlIIllIlIIIIllIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl4) {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.llIIIlllIlllIlIllIIIIllIl;
                this.lIIIlIIIlIlllIllIIIlIIIlI = this.lIIIllIIIIIllllIlIlIllIll;
            } else {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 + 1);
                this.lIIIlIIIlIlllIllIIIlIIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 + 1);
            }
            if (this.llIIlllIllIllllIIIlIIIIII <= 0.0) {
                ++n2;
            }
            n8 = n9;
            if (this.llIIlllIllIllllIIIlIIIIII <= 0.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n8 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            }
            f8 = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            f9 = (this.llIIlIlIlllIIllIlIlllIllI + this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI + f8) / 4.0f;
            f12 = (this.IIIIIIIIlIllIIllIIlllIllI + f8 + this.IIIIlIllIlIIlIIlIllIlIlll + this.llIIIlllIlllIlIllIIIIllIl) / 4.0f;
            f11 = (f8 + this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl + this.IIlIIlIlIlIllIIlIlIIIIlll) / 4.0f;
            f10 = (this.IlIIlllllIIlIlIlllllIllll + this.lIlllIlllIlIIIIlllIlIlIIl + f8 + this.IllIIIIllIIllIllIlllIlIIl) / 4.0f;
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIIlIlIIlIIlllIIIIIIl, this.IIIIlIlIIlIIIIlIlllIlIIII, this.IllIIIlllllIlIlllIlllllII, n8);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIlllllIlIlllIlllllII, this.lIIIlIIIlIlllIllIIIlIIIlI, this.lIIIllIIIIIllllIlIlIllIll, n8);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.llIlIIlllIIIIIllIIlIlIIII, this.lIIIllIIIIIllllIlIlIllIll, this.llIlllIlIIllIlIIIIllIIlIl, n8);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIlIIlIIIIlIlllIlIIII, this.llllIlIIIIIIIIIlllIIlIIIl, this.llIlIIlllIIIIIllIIlIlIIII, n8);
            if (bl6) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.5f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.5f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.5f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.5f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.5f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.5f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.5f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.5f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.5f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.5f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.5f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.5f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.5f;
                this.lIIllllllllIlIllllllllIlI = 0.5f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.5f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f9;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f9;
            this.IlIIIlIIlllllIIIllIlIlIll *= f9;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f10;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f10;
            this.lIIllllllllIlIllllllllIlI *= f10;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f11;
            this.lIIIlIIllIllIIlIIlIIIllII *= f11;
            this.lIIIIllIIllIIIlIIIllIllII *= f11;
            this.lIlIlIIllIIIlllIllIIlIllI *= f12;
            this.lIlIllIIllIIIIlllIlIlllIl *= f12;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f12;
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 0));
            bl5 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3, 1)) {
            if (this.llIIllIllIlIIlIIllIllllll >= 1.0) {
                ++n2;
            }
            this.IIlIllIIlllllIIlIIllllIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llllIIllIlIlllllllIIlIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            this.IllIlIlIIIlllIIllIIIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.IlllIIlllllllIIllIlIllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.llllIIIIlIIIlIIIIIIlIllll = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.lIlIIllllIlIIIIllIIIIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            this.IIllIllIIllIIlllIIIlIlllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.llIlllIIllIlllIlIlIlIIIll = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl && !bl3) {
                this.IlIlIIlllIllllllllIIIlIlI = this.llllIIIIlIIIlIIIIIIlIllll;
                this.lIIlIlllIllIlIlllIIIIIIII = this.IIlIllIIlllllIIlIIllllIIl;
            } else {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 - 1);
                this.lIIlIlllIllIlIlllIIIIIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 - 1);
            }
            if (!bl && !bl4) {
                this.llllllIlIllllIlIlIlIIIIlI = this.lIlIIllllIlIIIIllIIIIlIIl;
                this.IlIIIlIllIIIllIIIIlIIlIll = this.llllIIllIlIlllllllIIlIIlI;
            } else {
                this.llllllIlIllllIlIlIlIIIIlI = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 - 1);
                this.IlIIIlIllIIIllIIIIlIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 - 1);
            }
            if (!bl2 && !bl3) {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.llllIIIIlIIIlIIIIIIlIllll;
                this.IllllIIlIIIllIlllIlllIllI = this.IIlIllIIlllllIIlIIllllIIl;
            } else {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3 + 1);
                this.IllllIIlIIIllIlllIlllIllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lIlIIllllIlIIIIllIIIIlIIl;
                this.IlllIIIllllIIllIllIlIIlIl = this.llllIIllIlIlllllllIIlIIlI;
            } else {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3 + 1);
                this.IlllIIIllllIIllIllIlIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3 + 1);
            }
            if (this.llIIllIllIlIIlIIllIllllll >= 1.0) {
                --n2;
            }
            n8 = n9;
            if (this.llIIllIllIlIIlIIllIllllll >= 1.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n8 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            }
            f8 = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            f12 = (this.llIIIIllIIIIIIIlIIIlIIIIl + this.llllIIIIlIIIlIIIIIIlIllll + this.llIlllIIllIlllIlIlIlIIIll + f8) / 4.0f;
            f9 = (this.llIlllIIllIlllIlIlIlIIIll + f8 + this.IIIIlIIlIIIllIIIIllIIIlII + this.lIlIIllllIlIIIIllIIIIlIIl) / 4.0f;
            f10 = (f8 + this.IIllIllIIllIIlllIIIlIlllI + this.lIlIIllllIlIIIIllIIIIlIIl + this.llllllIlIllllIlIlIlIIIIlI) / 4.0f;
            f11 = (this.llllIIIIlIIIlIIIIIIlIllll + this.IlIlIIlllIllllllllIIIlIlI + f8 + this.IIllIllIIllIIlllIIIlIlllI) / 4.0f;
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(this.IllllIIlIIIllIlllIlllIllI, this.IIlIllIIlllllIIlIIllllIIl, this.IlllIIlllllllIIllIlIllllI, n8);
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.IlllIIIllllIIllIllIlIIlIl, this.llllIIllIlIlllllllIIlIIlI, n8);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IllIlIlIIIlllIIllIIIIlIll, this.llllIIllIlIlllllllIIlIIlI, this.IlIIIlIllIIIllIIIIlIIlIll, n8);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IIlIllIIlllllIIlIIllllIIl, this.lIIlIlllIllIlIlllIIIIIIII, this.IllIlIlIIIlllIIllIIIIlIll, n8);
            this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f;
            this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
            this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
            this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2;
            this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
            this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
            this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3;
            this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
            this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            this.llIIIlIlIlIIlIllIIIllIlIl *= f9;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f9;
            this.IlIIIlIIlllllIIIllIlIlIll *= f9;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f10;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f10;
            this.lIIllllllllIlIllllllllIlI *= f10;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f11;
            this.lIIIlIIllIllIIlIIlIIIllII *= f11;
            this.lIIIIllIIllIIIlIIIllIllII *= f11;
            this.lIlIlIIllIIIlllIllIIlIllI *= f12;
            this.lIlIllIIllIIIIlllIlIlllIl *= f12;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f12;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 1));
            bl5 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1, 2)) {
            if (this.lllIIlIIIllllllIIIIlIlIlI <= 0.0) {
                --n3;
            }
            this.lllIIIIIIlIlllIIlIlIIIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.IllIIIIllIIllIllIlllIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.IIllIllIIllIIlllIIIlIlllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.llIIlIIllIIllIlIIllIIllII = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            this.lllIIIlIIlIlIllIIIIIlIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llIlIIlllIIIIIllIIlIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.IllIlIlIIIlllIIllIIIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            this.IIIlIlIllIlllllIlIllllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl3 && !bl) {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3);
                this.llllIlIIIIIIIIIlllIIlIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.lIIlIlllIllIlIlllIIIIIIII = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + 1, n3);
                this.lIIlIlllIllIlIlllIIIIIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.llIIlIIllIIllIlIIllIIllII;
                this.llIlllIlIIllIlIIIIllIIlIl = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1, n3);
                this.llIlllIlIIllIlIIIIllIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.llllllIlIllllIlIlIlIIIIlI = this.llIIlIIllIIllIlIIllIIllII;
                this.IlIIIlIllIIIllIIIIlIIlIll = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.llllllIlIllllIlIlIlIIIIlI = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, n3);
                this.IlIIIlIllIIIllIIIIlIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 + 1, n3);
            }
            if (this.lllIIlIIIllllllIIIIlIlIlI <= 0.0) {
                ++n3;
            }
            n8 = n9;
            if (this.lllIIlIIIllllllIIIIlIlIlI <= 0.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1).IlIlllIIIIIIlIIllIIllIlll()) {
                n8 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            }
            f8 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            f7 = (this.lllIIIIIIlIlllIIlIlIIIllI + this.IlIlIIlllIllllllllIIIlIlI + f8 + this.IIllIllIIllIIlllIIIlIlllI) / 4.0f;
            f6 = (f8 + this.IIllIllIIllIIlllIIIlIlllI + this.llIIlIIllIIllIlIIllIIllII + this.llllllIlIllllIlIlIlIIIIlI) / 4.0f;
            f5 = (this.IllIIIIllIIllIllIlllIlIIl + f8 + this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIlIIllIIllIlIIllIIllII) / 4.0f;
            f4 = (this.lIlllIlllIlIIIIlllIlIlIIl + this.lllIIIIIIlIlllIIlIlIIIllI + this.IllIIIIllIIllIllIlllIlIIl + f8) / 4.0f;
            f9 = (float)((double)f7 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll) + (double)f6 * this.llIIllIllIlIIlIIllIllllll * this.IllIIIllIIIIlIlIlIllIIlll + (double)f5 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IllIIIllIIIIlIlIlIllIIlll + (double)f4 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll));
            f10 = (float)((double)f7 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII) + (double)f6 * this.llIIllIllIlIIlIIllIllllll * this.lIIIIlIlIIlllllIIllIIlIII + (double)f5 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lIIIIlIlIIlllllIIllIIlIII + (double)f4 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII));
            f11 = (float)((double)f7 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII) + (double)f6 * this.llIIlllIllIllllIIIlIIIIII * this.lIIIIlIlIIlllllIIllIIlIII + (double)f5 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lIIIIlIlIIlllllIIllIIlIII + (double)f4 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII));
            f12 = (float)((double)f7 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll) + (double)f6 * this.llIIlllIllIllllIIIlIIIIII * this.IllIIIllIIIIlIlIlIllIIlll + (double)f5 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IllIIIllIIIIlIlIlIllIIlll + (double)f4 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll));
            n7 = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlIIlIlIllIIIIIlIIll, this.lIIlIlllIllIlIlllIIIIIIII, this.IllIlIlIIIlllIIllIIIIlIll, n8);
            n6 = this.lllIIIllIIIIlllIlIIllIIll(this.IllIlIlIIIlllIIllIIIIlIll, this.IIIlIlIllIlllllIlIllllllI, this.IlIIIlIllIIIllIIIIlIIlIll, n8);
            n5 = this.lllIIIllIIIIlllIlIIllIIll(this.llIlIIlllIIIIIllIIlIlIIII, this.llIlllIlIIllIlIIIIllIIlIl, this.IIIlIlIllIlllllIlIllllllI, n8);
            n4 = this.lllIIIllIIIIlllIlIIllIIll(this.llllIlIIIIIIIIIlllIIlIIIl, this.lllIIIlIIlIlIllIIIIIlIIll, this.llIlIIlllIIIIIllIIlIlIIII, n8);
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, n4, this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll), this.llIIllIllIlIIlIIllIllllll * this.IllIIIllIIIIlIlIlIllIIlll, (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IllIIIllIIIIlIlIlIllIIlll, (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll));
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, n4, this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII), this.llIIllIllIlIIlIIllIllllll * this.lIIIIlIlIIlllllIIllIIlIII, (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lIIIIlIlIIlllllIIllIIlIII, (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII));
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, n4, this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII), this.llIIlllIllIllllIIIlIIIIII * this.lIIIIlIlIIlllllIIllIIlIII, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lIIIIlIlIIlllllIIllIIlIII, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII));
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(n7, n6, n5, n4, this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll), this.llIIlllIllIllllIIIlIIIIII * this.IllIIIllIIIIlIlIlIllIIlll, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IllIIIllIIIIlIlIlIllIIlll, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll));
            if (bl6) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.8f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.8f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.8f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.8f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.8f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.8f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.8f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.8f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.8f;
                this.lIIllllllllIlIllllllllIlI = 0.8f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.8f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f9;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f9;
            this.IlIIIlIIlllllIIIllIlIlIll *= f9;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f10;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f10;
            this.lIIllllllllIlIllllllllIlI *= f10;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f11;
            this.lIIIlIIllIllIIlIIlIIIllII *= f11;
            this.lIIIIllIIllIIIlIIIllIllII *= f11;
            this.lIlIlIIllIIIlllIllIIlIllI *= f12;
            this.lIlIllIIllIIIIlllIlIlllIl *= f12;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f12;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2);
            this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, class_21022);
            if (lIllllIIlIIIlIllllllIIIll && class_21022.IIIllIIlIIIIIIlIlIIllIIlI().equals("grass_side") && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl5 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1, 3)) {
            if (this.IlIlllIIIIIIlIIllIIllIlll >= 1.0) {
                ++n3;
            }
            this.lIlIlIIIIIIlIIllllIlIIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            this.IllllIIIIlIIlIIIIlllIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            this.IIIIIIIIlIllIIllIIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.llIlllIIllIlllIlIlIlIIIll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.IIIIlIllIlIIIIIllllIIlllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            this.llllIlIIllIIlllllIIllIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            this.IllIIIlllllIlIlllIlllllII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.IlllIIlllllllIIllIlIllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl3 && !bl) {
                this.llIIlIlIlllIIllIlIlllIllI = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.lllIIIIlIlIIlIIlllIIIIIIl = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIlIlIlllIIllIlIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 - 1, n3);
                this.lllIIIIlIlIIlIIlllIIIIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 - 1, n3);
            }
            if (!bl3 && !bl2) {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.IllllIIlIIIllIlllIlllIllI = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + 1, n3);
                this.IllllIIlIIIllIlllIlllIllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2 + 1, n3);
            }
            if (!bl4 && !bl) {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.lIIIlIIIlIlllIllIIIlIIIlI = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1, n3);
                this.lIIIlIIIlIlllIllIIIlIIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 - 1, n3);
            }
            if (!bl4 && !bl2) {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.IlllIIIllllIIllIllIlIIlIl = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + 1, n3);
                this.IlllIIIllllIIllIllIlIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2 + 1, n3);
            }
            if (this.IlIlllIIIIIIlIIllIIllIlll >= 1.0) {
                --n3;
            }
            n8 = n9;
            if (this.IlIlllIIIIIIlIIllIIllIlll >= 1.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1).IlIlllIIIIIIlIIllIIllIlll()) {
                n8 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            }
            f8 = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            f7 = (this.lIlIlIIIIIIlIIllllIlIIllI + this.llIIIIllIIIIIIIlIIIlIIIIl + f8 + this.llIlllIIllIlllIlIlIlIIIll) / 4.0f;
            f6 = (f8 + this.llIlllIIllIlllIlIlIlIIIll + this.IllllIIIIlIIlIIIIlllIIIIl + this.IIIIlIIlIIIllIIIIllIIIlII) / 4.0f;
            f5 = (this.IIIIIIIIlIllIIllIIlllIllI + f8 + this.IIIIlIllIlIIlIIlIllIlIlll + this.IllllIIIIlIIlIIIIlllIIIIl) / 4.0f;
            f4 = (this.llIIlIlIlllIIllIlIlllIllI + this.lIlIlIIIIIIlIIllllIlIIllI + this.IIIIIIIIlIllIIllIIlllIllI + f8) / 4.0f;
            f9 = (float)((double)f7 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll) + (double)f6 * this.llIIllIllIlIIlIIllIllllll * this.IllIIIllIIIIlIlIlIllIIlll + (double)f5 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IllIIIllIIIIlIlIlIllIIlll + (double)f4 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll));
            f10 = (float)((double)f7 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll) + (double)f6 * this.llIIlllIllIllllIIIlIIIIII * this.IllIIIllIIIIlIlIlIllIIlll + (double)f5 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IllIIIllIIIIlIlIlIllIIlll + (double)f4 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll));
            f11 = (float)((double)f7 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII) + (double)f6 * this.llIIlllIllIllllIIIlIIIIII * this.lIIIIlIlIIlllllIIllIIlIII + (double)f5 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lIIIIlIlIIlllllIIllIIlIII + (double)f4 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII));
            f12 = (float)((double)f7 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII) + (double)f6 * this.llIIllIllIlIIlIIllIllllll * this.lIIIIlIlIIlllllIIllIIlIII + (double)f5 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lIIIIlIlIIlllllIIllIIlIII + (double)f4 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII));
            n7 = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIIIIllllIIlllI, this.IllllIIlIIIllIlllIlllIllI, this.IlllIIlllllllIIllIlIllllI, n8);
            n6 = this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.llllIlIIllIIlllllIIllIIll, this.IlllIIIllllIIllIllIlIIlIl, n8);
            n5 = this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIlllllIlIlllIlllllII, this.lIIIlIIIlIlllIllIIIlIIIlI, this.llllIlIIllIIlllllIIllIIll, n8);
            n4 = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIIlIlIIlIIlllIIIIIIl, this.IIIIlIllIlIIIIIllllIIlllI, this.IllIIIlllllIlIlllIlllllII, n8);
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll), (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll), (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IllIIIllIIIIlIlIlIllIIlll, this.llIIllIllIlIIlIIllIllllll * this.IllIIIllIIIIlIlIlIllIIlll);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IllIIIllIIIIlIlIlIllIIlll), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IllIIIllIIIIlIlIlIllIIlll, this.llIIlllIllIllllIIIlIIIIII * this.IllIIIllIIIIlIlIlIllIIlll);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII * this.lIIIIlIlIIlllllIIllIIlIII);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII), (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lIIIIlIlIIlllllIIllIIlIII), (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lIIIIlIlIIlllllIIllIIlIII, this.llIIllIllIlIIlIIllIllllll * this.lIIIIlIlIIlllllIIllIIlIII);
            if (bl6) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.8f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.8f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.8f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.8f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.8f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.8f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.8f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.8f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.8f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.8f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.8f;
                this.lIIllllllllIlIllllllllIlI = 0.8f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.8f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f9;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f9;
            this.IlIIIlIIlllllIIIllIlIlIll *= f9;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f10;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f10;
            this.lIIllllllllIlIllllllllIlI *= f10;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f11;
            this.lIIIlIIllIllIIlIIlIIIllII *= f11;
            this.lIIIIllIIllIIIlIIIllIllII *= f11;
            this.lIlIlIIllIIIlllIllIIlIllI *= f12;
            this.lIlIllIIllIIIIlllIlIlllIl *= f12;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f12;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3);
            this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, class_21022);
            if (lIllllIIlIIIlIllllllIIIll && class_21022.IIIllIIlIIIIIIlIlIIllIIlI().equals("grass_side") && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl5 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3, 4)) {
            if (this.IllIIIllIIIIlIlIlIllIIlll <= 0.0) {
                --n;
            }
            this.IlIIlllllIIlIlIlllllIllll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.lllIIIIIIlIlllIIlIlIIIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.lIlIlIIIIIIlIIllllIlIIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            this.llllIIIIlIIIlIIIIIIlIllll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.IIIIlIlIIlIIIIlIlllIlIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.lllIIIlIIlIlIllIIIIIlIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.IIIIlIllIlIIIIIllllIIlllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.IIlIllIIlllllIIlIIllllIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl2 && !bl3) {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 - 1);
                this.llllIlIIIIIIIIIlllIIlIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 - 1);
            }
            if (!bl && !bl3) {
                this.llIIlIlIlllIIllIlIlllIllI = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.lllIIIIlIlIIlIIlllIIIIIIl = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIlIlIlllIIllIlIlllIllI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + 1);
                this.lllIIIIlIlIIlIIlllIIIIIIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 + 1);
            }
            if (!bl2 && !bl4) {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIIIIlIlllIIlIlIIIllI;
                this.lIIlIlllIllIlIlllIIIIIIII = this.lllIIIlIIlIlIllIIIIIlIIll;
            } else {
                this.IlIlIIlllIllllllllIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 - 1);
                this.lIIlIlllIllIlIlllIIIIIIII = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 - 1);
            }
            if (!bl && !bl4) {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lIlIlIIIIIIlIIllllIlIIllI;
                this.IllllIIlIIIllIlllIlllIllI = this.IIIIlIllIlIIIIIllllIIlllI;
            } else {
                this.llIIIIllIIIIIIIlIIIlIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 + 1);
                this.IllllIIlIIIllIlllIlllIllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 + 1);
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll <= 0.0) {
                ++n;
            }
            n8 = n9;
            if (this.IllIIIllIIIIlIlIlIllIIlll <= 0.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n8 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
            }
            f8 = this.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3);
            f7 = (this.IlIIlllllIIlIlIlllllIllll + this.llIIlIlIlllIIllIlIlllIllI + f8 + this.lIlIlIIIIIIlIIllllIlIIllI) / 4.0f;
            f6 = (f8 + this.lIlIlIIIIIIlIIllllIlIIllI + this.llllIIIIlIIIlIIIIIIlIllll + this.llIIIIllIIIIIIIlIIIlIIIIl) / 4.0f;
            f5 = (this.lllIIIIIIlIlllIIlIlIIIllI + f8 + this.IlIlIIlllIllllllllIIIlIlI + this.llllIIIIlIIIlIIIIIIlIllll) / 4.0f;
            f4 = (this.lIlllIlllIlIIIIlllIlIlIIl + this.IlIIlllllIIlIlIlllllIllll + this.lllIIIIIIlIlllIIlIlIIIllI + f8) / 4.0f;
            f9 = (float)((double)f6 * this.llIIllIllIlIIlIIllIllllll * this.IlIlllIIIIIIlIIllIIllIlll + (double)f5 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f4 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f7 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IlIlllIIIIIIlIIllIIllIlll);
            f10 = (float)((double)f6 * this.llIIllIllIlIIlIIllIllllll * this.lllIIlIIIllllllIIIIlIlIlI + (double)f5 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f4 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f7 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lllIIlIIIllllllIIIIlIlIlI);
            f11 = (float)((double)f6 * this.llIIlllIllIllllIIIlIIIIII * this.lllIIlIIIllllllIIIIlIlIlI + (double)f5 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f4 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f7 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lllIIlIIIllllllIIIIlIlIlI);
            f12 = (float)((double)f6 * this.llIIlllIllIllllIIIlIIIIII * this.IlIlllIIIIIIlIIllIIllIlll + (double)f5 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f4 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f7 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IlIlllIIIIIIlIIllIIllIlll);
            n7 = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIlIIlIIIIlIlllIlIIII, this.lllIIIIlIlIIlIIlllIIIIIIl, this.IIIIlIllIlIIIIIllllIIlllI, n8);
            n6 = this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIIIIllllIIlllI, this.IIlIllIIlllllIIlIIllllIIl, this.IllllIIlIIIllIlllIlllIllI, n8);
            n5 = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlIIlIlIllIIIIIlIIll, this.lIIlIlllIllIlIlllIIIIIIII, this.IIlIllIIlllllIIlIIllllIIl, n8);
            n4 = this.lllIIIllIIIIlllIlIIllIIll(this.llllIlIIIIIIIIIlllIIlIIIl, this.IIIIlIlIIlIIIIlIlllIlIIII, this.lllIIIlIIlIlIllIIIIIlIIll, n8);
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, n7, this.llIIllIllIlIIlIIllIllllll * this.IlIlllIIIIIIlIIllIIllIlll, this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IlIlllIIIIIIlIIllIIllIlll);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, n7, this.llIIllIllIlIIlIIllIllllll * this.lllIIlIIIllllllIIIIlIlIlI, this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lllIIlIIIllllllIIIIlIlIlI);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, n7, this.llIIlllIllIllllIIIlIIIIII * this.lllIIlIIIllllllIIIIlIlIlI, this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lllIIlIIIllllllIIIIlIlIlI);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, n7, this.llIIlllIllIllllIIIlIIIIII * this.IlIlllIIIIIIlIIllIIllIlll, this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IlIlllIIIIIIlIIllIIllIlll);
            if (bl6) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.6f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.6f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.6f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.6f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.6f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.6f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.6f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.6f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.6f;
                this.lIIllllllllIlIllllllllIlI = 0.6f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.6f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f9;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f9;
            this.IlIIIlIIlllllIIIllIlIlIll *= f9;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f10;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f10;
            this.lIIllllllllIlIllllllllIlI *= f10;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f11;
            this.lIIIlIIllIllIIlIIlIIIllII *= f11;
            this.lIIIIllIIllIIIlIIIllIllII *= f11;
            this.lIlIlIIllIIIlllIllIIlIllI *= f12;
            this.lIlIllIIllIIIIlllIlIlllIl *= f12;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f12;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4);
            this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, class_21022);
            if (lIllllIIlIIIlIllllllIIIll && class_21022.IIIllIIlIIIIIIlIlIIllIIlI().equals("grass_side") && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl5 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3, 5)) {
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 1.0) {
                ++n;
            }
            this.llIIIlllIlllIlIllIIIIllIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3);
            this.llIIlIIllIIllIlIIllIIllII = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1);
            this.IllllIIIIlIIlIIIIlllIIIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1);
            this.lIlIIllllIlIIIIllIIIIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3);
            this.lIIIllIIIIIllllIlIlIllIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3);
            this.IIIlIlIllIlllllIlIllllllI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
            this.llllIlIIllIIlllllIIllIIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
            this.llllIIllIlIlllllllIIlIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3);
            bl4 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 + 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl3 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2 - 1, n3).IlIllllllIIlIIllllIIlIIIl();
            bl2 = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 + 1).IlIllllllIIlIIllllIIlIIIl();
            bl = this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3 - 1).IlIllllllIIlIIllllIIlIIIl();
            if (!bl3 && !bl) {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.llIIlIIllIIllIlIIllIIllII;
                this.llIlllIlIIllIlIIIIllIIlIl = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.IIlIIlIlIlIllIIlIlIIIIlll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 - 1);
                this.llIlllIlIIllIlIIIIllIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 - 1);
            }
            if (!bl3 && !bl2) {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.lIIIlIIIlIlllIllIIIlIIIlI = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIllIlIIlIIlIllIlIlll = this.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + 1);
                this.lIIIlIIIlIlllIllIIIlIIIlI = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3 + 1);
            }
            if (!bl4 && !bl) {
                this.llllllIlIllllIlIlIlIIIIlI = this.llIIlIIllIIllIlIIllIIllII;
                this.IlIIIlIllIIIllIIIIlIIlIll = this.IIIlIlIllIlllllIlIllllllI;
            } else {
                this.llllllIlIllllIlIlIlIIIIlI = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 - 1);
                this.IlIIIlIllIIIllIIIIlIIlIll = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 - 1);
            }
            if (!bl4 && !bl2) {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.IllllIIIIlIIlIIIIlllIIIIl;
                this.IlllIIIllllIIllIllIlIIlIl = this.llllIlIIllIIlllllIIllIIll;
            } else {
                this.IIIIlIIlIIIllIIIIllIIIlII = this.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 + 1);
                this.IlllIIIllllIIllIllIlIIlIl = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3 + 1);
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 1.0) {
                --n;
            }
            n8 = n9;
            if (this.lIIIIlIlIIlllllIIllIIlIII >= 1.0 || !this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3).IlIlllIIIIIIlIIllIIllIlll()) {
                n8 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
            }
            f8 = this.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3);
            f7 = (this.llIIIlllIlllIlIllIIIIllIl + this.IIIIlIllIlIIlIIlIllIlIlll + f8 + this.IllllIIIIlIIlIIIIlllIIIIl) / 4.0f;
            f6 = (this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIIlllIlllIlIllIIIIllIl + this.llIIlIIllIIllIlIIllIIllII + f8) / 4.0f;
            f5 = (this.llIIlIIllIIllIlIIllIIllII + f8 + this.llllllIlIllllIlIlIlIIIIlI + this.lIlIIllllIlIIIIllIIIIlIIl) / 4.0f;
            f4 = (f8 + this.IllllIIIIlIIlIIIIlllIIIIl + this.lIlIIllllIlIIIIllIIIIlIIl + this.IIIIlIIlIIIllIIIIllIIIlII) / 4.0f;
            f9 = (float)((double)f7 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IlIlllIIIIIIlIIllIIllIlll + (double)f6 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f5 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f4 * this.llIIlllIllIllllIIIlIIIIII * this.IlIlllIIIIIIlIIllIIllIlll);
            f10 = (float)((double)f7 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lllIIlIIIllllllIIIIlIlIlI + (double)f6 * (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f5 * this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f4 * this.llIIlllIllIllllIIIlIIIIII * this.lllIIlIIIllllllIIIIlIlIlI);
            f11 = (float)((double)f7 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lllIIlIIIllllllIIIIlIlIlI + (double)f6 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f5 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI) + (double)f4 * this.llIIllIllIlIIlIIllIllllll * this.lllIIlIIIllllllIIIIlIlIlI);
            f12 = (float)((double)f7 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IlIlllIIIIIIlIIllIIllIlll + (double)f6 * (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f5 * this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll) + (double)f4 * this.llIIllIllIlIIlIIllIllllll * this.IlIlllIIIIIIlIIllIIllIlll);
            n7 = this.lllIIIllIIIIlllIlIIllIIll(this.lIIIllIIIIIllllIlIlIllIll, this.lIIIlIIIlIlllIllIIIlIIIlI, this.llllIlIIllIIlllllIIllIIll, n8);
            n6 = this.lllIIIllIIIIlllIlIIllIIll(this.llllIlIIllIIlllllIIllIIll, this.llllIIllIlIlllllllIIlIIlI, this.IlllIIIllllIIllIllIlIIlIl, n8);
            n5 = this.lllIIIllIIIIlllIlIIllIIll(this.IIIlIlIllIlllllIlIllllllI, this.IlIIIlIllIIIllIIIIlIIlIll, this.llllIIllIlIlllllllIIlIIlI, n8);
            n4 = this.lllIIIllIIIIlllIlIIllIIll(this.llIlllIlIIllIlIIIIllIIlIl, this.lIIIllIIIIIllllIlIlIllIll, this.IIIlIlIllIlllllIlIllllllI, n8);
            this.IlIlIllIIlIIIIlllIlIllIlI = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.IlIlllIIIIIIlIIllIIllIlll, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), this.llIIlllIllIllllIIIlIIIIII * this.IlIlllIIIIIIlIIllIIllIlll);
            this.IlIIllIlIlIllIIIlIIlIlIIl = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * this.lllIIlIIIllllllIIIIlIlIlI, (1.0 - this.llIIlllIllIllllIIIlIIIIII) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), this.llIIlllIllIllllIIIlIIIIII * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), this.llIIlllIllIllllIIIlIIIIII * this.lllIIlIIIllllllIIIIlIlIlI);
            this.lIlIIllIllIIIIIlIllllIIIl = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.lllIIlIIIllllllIIIIlIlIlI, (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), this.llIIllIllIlIIlIIllIllllll * (1.0 - this.lllIIlIIIllllllIIIIlIlIlI), this.llIIllIllIlIIlIIllIllllll * this.lllIIlIIIllllllIIIIlIlIlI);
            this.lIlllIIllIIIIIIlIlIIlIllI = this.lllIIIllIIIIlllIlIIllIIll(n7, n4, n5, n6, (1.0 - this.llIIllIllIlIIlIIllIllllll) * this.IlIlllIIIIIIlIIllIIllIlll, (1.0 - this.llIIllIllIlIIlIIllIllllll) * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), this.llIIllIllIlIIlIIllIllllll * (1.0 - this.IlIlllIIIIIIlIIllIIllIlll), this.llIIllIllIlIIlIIllIllllll * this.IlIlllIIIIIIlIIllIIllIlll);
            if (bl6) {
                this.llIIIIIlIIlIIIIllIIIlIIII = this.lIlIlIIllIIIlllIllIIlIllI = f * 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = this.lIlIlIIllIIIlllIllIIlIllI;
                this.llIIIlIlIlIIlIllIIIllIlIl = this.lIlIlIIllIIIlllIllIIlIllI;
                this.lIIIlIIllIllIIlIIlIIIllII = this.lIlIllIIllIIIIlllIlIlllIl = f2 * 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = this.lIlIllIIllIIIIlllIlIlllIl;
                this.IlIIIIIllIlllIIIIlIIIllIl = this.lIlIllIIllIIIIlllIlIlllIl;
                this.lIIIIllIIllIIIlIIIllIllII = this.lIIllIIlIIIlllIlllIIlIIlI = f3 * 0.6f;
                this.lIIllllllllIlIllllllllIlI = this.lIIllIIlIIIlllIlllIIlIIlI;
                this.IlIIIlIIlllllIIIllIlIlIll = this.lIIllIIlIIIlllIlllIIlIIlI;
            } else {
                this.lIlIlIIllIIIlllIllIIlIllI = 0.6f;
                this.llIIIIIlIIlIIIIllIIIlIIII = 0.6f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI = 0.6f;
                this.llIIIlIlIlIIlIllIIIllIlIl = 0.6f;
                this.lIlIllIIllIIIIlllIlIlllIl = 0.6f;
                this.lIIIlIIllIllIIlIIlIIIllII = 0.6f;
                this.lIIlIlIIllIIIlIIlIlIIIlII = 0.6f;
                this.IlIIIIIllIlllIIIIlIIIllIl = 0.6f;
                this.lIIllIIlIIIlllIlllIIlIIlI = 0.6f;
                this.lIIIIllIIllIIIlIIIllIllII = 0.6f;
                this.lIIllllllllIlIllllllllIlI = 0.6f;
                this.IlIIIlIIlllllIIIllIlIlIll = 0.6f;
            }
            this.llIIIlIlIlIIlIllIIIllIlIl *= f9;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f9;
            this.IlIIIlIIlllllIIIllIlIlIll *= f9;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f10;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f10;
            this.lIIllllllllIlIllllllllIlI *= f10;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f11;
            this.lIIIlIIllIllIIlIIlIIIllII *= f11;
            this.lIIIIllIIllIIIlIIIllIllII *= f11;
            this.lIlIlIIllIIIlllIllIIlIllI *= f12;
            this.lIlIllIIllIIIIlllIlIlllIl *= f12;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f12;
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5);
            this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, class_21022);
            if (lIllllIIlIIIlIllllllIIIll && class_21022.IIIllIIlIIIIIIlIlIIllIIlI().equals("grass_side") && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                this.llIIIlIlIlIIlIllIIIllIlIl *= f;
                this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
                this.llIIIIIlIIlIIIIllIIIlIIII *= f;
                this.lIlIlIIllIIIlllIllIIlIllI *= f;
                this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
                this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
                this.lIIIlIIllIllIIlIIlIIIllII *= f2;
                this.lIlIllIIllIIIIlllIlIlllIl *= f2;
                this.IlIIIlIIlllllIIIllIlIlIll *= f3;
                this.lIIllllllllIlIllllllllIlI *= f3;
                this.lIIIIllIIllIIIlIIIllIllII *= f3;
                this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
                this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl5 = true;
        }
        this.llIllllIlIllIIIlIllIIlIlI = false;
        return bl5;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, double d, double d2, double d3, double d4) {
        int n5 = (int)((double)(n >> 16 & 0xFF) * d + (double)(n2 >> 16 & 0xFF) * d2 + (double)(n3 >> 16 & 0xFF) * d3 + (double)(n4 >> 16 & 0xFF) * d4) & 0xFF;
        int n6 = (int)((double)(n & 0xFF) * d + (double)(n2 & 0xFF) * d2 + (double)(n3 & 0xFF) * d3 + (double)(n4 & 0xFF) * d4) & 0xFF;
        return n5 << 16 | n6;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492, int n, int n2, int n3, float f, float f2, float f3) {
        IIcon class_21022;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        this.llIllllIlIllIIIlIllIIlIlI = false;
        boolean bl = class_0868.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl;
        boolean bl2 = Config.llllIIllIlIlllllllIIlIIlI() && bl;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        boolean bl3 = false;
        int n4 = -1;
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3, 0)) {
            if (n4 < 0) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            f7 = f8 = 0.5f;
            f6 = f8;
            f5 = f8;
            if (class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl) {
                f7 = f8 * f;
                f6 = f8 * f2;
                f5 = f8 * f3;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII > 0.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f7, f6, f5);
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 0));
            bl3 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3, 1)) {
            if (n4 < 0) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            f8 = 1.0f;
            f7 = f8 * f;
            f6 = f8 * f2;
            f5 = f8 * f3;
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll < 1.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f7, f6, f5);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 1));
            bl3 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1, 2)) {
            if (n4 < 0) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            f6 = f7 = 0.8f;
            f5 = f7;
            f4 = f7;
            if (class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl) {
                f6 = f7 * f;
                f5 = f7 * f2;
                f4 = f7 * f3;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI > 0.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6, f5, f4);
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2);
            if (bl2) {
                if ((class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll || class_21022 == class_1384.IlllIIIllllIIllIllIlIIlIl) && (class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2, class_21022)) == class_1384.IllllIIlIIIllIlllIlllIllI) {
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                }
                if (class_21022 == class_1384.IlllIIlllllllIIllIlIllllI) {
                    class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2);
                }
            }
            this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, class_21022);
            if (bl && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl3 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1, 3)) {
            if (n4 < 0) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            f6 = f7 = 0.8f;
            f5 = f7;
            f4 = f7;
            if (class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl) {
                f6 = f7 * f;
                f5 = f7 * f2;
                f4 = f7 * f3;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll < 1.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6, f5, f4);
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3);
            if (bl2) {
                if ((class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll || class_21022 == class_1384.IlllIIIllllIIllIllIlIIlIl) && (class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3, class_21022)) == class_1384.IllllIIlIIIllIlllIlllIllI) {
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                }
                if (class_21022 == class_1384.IlllIIlllllllIIllIlIllllI) {
                    class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3);
                }
            }
            this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, class_21022);
            if (bl && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl3 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3, 4)) {
            if (n4 < 0) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            f6 = f7 = 0.6f;
            f5 = f7;
            f4 = f7;
            if (class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl) {
                f6 = f7 * f;
                f5 = f7 * f2;
                f4 = f7 * f3;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll > 0.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6, f5, f4);
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4);
            if (bl2) {
                if ((class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll || class_21022 == class_1384.IlllIIIllllIIllIllIlIIlIl) && (class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4, class_21022)) == class_1384.IllllIIlIIIllIlllIlllIllI) {
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                }
                if (class_21022 == class_1384.IlllIIlllllllIIllIlIllllI) {
                    class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4);
                }
            }
            this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, class_21022);
            if (bl && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl3 = true;
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3, 5)) {
            if (n4 < 0) {
                n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            }
            f6 = f7 = 0.6f;
            f5 = f7;
            f4 = f7;
            if (class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl) {
                f6 = f7 * f;
                f5 = f7 * f2;
                f4 = f7 * f3;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII < 1.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6, f5, f4);
            class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5);
            if (bl2) {
                if ((class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll || class_21022 == class_1384.IlllIIIllllIIllIllIlIIlIl) && (class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5, class_21022)) == class_1384.IllllIIlIIIllIlllIlllIllI) {
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                }
                if (class_21022 == class_1384.IlllIIlllllllIIllIlIllllI) {
                    class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5);
                }
            }
            this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, class_21022);
            if (bl && lIllllIIlIIIlIllllllIIIll && class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll && !this.lllIlIIlIIIlIlIIIllIlllIl()) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl(f6 * f, f5 * f2, f4 * f3);
                this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, class_0876.llIlllIIllIlllIlIlIlIIIll());
            }
            bl3 = true;
        }
        return bl3;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1084 class_10842, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_10842.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(1.0f, 1.0f, 1.0f);
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_0143.IllIIIllIIIIlIlIlIllIIlll(n4);
        int n6 = class_1084.IIIllIllIIlIlIlIlIllllIIl(n4);
        IIcon class_21022 = class_10842.IllIIlllllllIIlIIlIIIIlIl(n6);
        int n7 = 4 + n6 * 2;
        int n8 = 5 + n6 * 2;
        double d = 15.0 - (double)n7;
        double d2 = 15.0;
        double d3 = 4.0;
        double d4 = 4.0 + (double)n8;
        double d5 = class_21022.lllIIIllIIIIlllIlIIllIIll(d);
        double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(d2);
        double d7 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(d3);
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(d4);
        double d9 = 0.0;
        double d10 = 0.0;
        switch (n5) {
            case 0: {
                d9 = 8.0 - (double)(n7 / 2);
                d10 = 15.0 - (double)n7;
                break;
            }
            case 1: {
                d9 = 1.0;
                d10 = 8.0 - (double)(n7 / 2);
                break;
            }
            case 2: {
                d9 = 8.0 - (double)(n7 / 2);
                d10 = 1.0;
                break;
            }
            case 3: {
                d9 = 15.0 - (double)n7;
                d10 = 8.0 - (double)(n7 / 2);
            }
        }
        double d11 = (double)n + d9 / 16.0;
        double d12 = (double)n + (d9 + (double)n7) / 16.0;
        double d13 = (double)n2 + (12.0 - (double)n8) / 16.0;
        double d14 = (double)n2 + 0.75;
        double d15 = (double)n3 + d10 / 16.0;
        double d16 = (double)n3 + (d10 + (double)n7) / 16.0;
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d15, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d16, d6, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d16, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d15, d5, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d16, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d15, d6, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d15, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d16, d5, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d15, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d15, d6, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d15, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d15, d5, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d16, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d16, d6, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d16, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d16, d5, d7);
        int n9 = n7;
        if (n6 >= 2) {
            n9 = n7 - 1;
        }
        d5 = class_21022.IlIllllllIIlIIllllIIlIIIl();
        d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(n9);
        d7 = class_21022.IlIIIIIllllllIIlllIllllll();
        d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(n9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d16, d5, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d16, d6, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d15, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d15, d5, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d15, d5, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d15, d6, d7);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d16, d6, d8);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d16, d5, d8);
        d5 = class_21022.lllIIIllIIIIlllIlIIllIIll(12.0);
        d6 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        d7 = class_21022.IlIIIIIllllllIIlllIllllll();
        d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(4.0);
        d9 = 8.0;
        d10 = 0.0;
        switch (n5) {
            case 0: {
                d9 = 8.0;
                d10 = 12.0;
                double d17 = d5;
                d5 = d6;
                d6 = d17;
                break;
            }
            case 1: {
                d9 = 0.0;
                d10 = 8.0;
                break;
            }
            case 2: {
                d9 = 8.0;
                d10 = 0.0;
                break;
            }
            case 3: {
                d9 = 12.0;
                d10 = 8.0;
                double d18 = d5;
                d5 = d6;
                d6 = d18;
            }
        }
        d11 = (double)n + d9 / 16.0;
        d12 = (double)n + (d9 + 4.0) / 16.0;
        d13 = (double)n2 + 0.75;
        d14 = (double)n2 + 1.0;
        d15 = (double)n3 + d10 / 16.0;
        d16 = (double)n3 + (d10 + 4.0) / 16.0;
        if (n5 != 2 && n5 != 0) {
            if (n5 == 1 || n5 == 3) {
                class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d15, d5, d8);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d15, d6, d8);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d15, d6, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d15, d5, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d15, d6, d8);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d13, d15, d5, d8);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d12, d14, d15, d5, d7);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d15, d6, d7);
            }
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d15, d6, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d16, d5, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d16, d5, d7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d15, d6, d7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d16, d5, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d13, d15, d6, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d15, d6, d7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d11, d14, d16, d5, d7);
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0587 class_05872, int n, int n2, int n3) {
        float f = 0.1875f;
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.lIlIllIIlIIlIIlIIlIIlIIll));
        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        this.IlIlIIlllIIlIllIIIlllllIl(class_05872, n, n2, n3);
        this.IlIIIIIllllllIIlllIllllll = true;
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.obsidian));
        this.lllIIIllIIIIlllIlIIllIIll(0.125, 0.00625f, 0.125, 0.875, (double)f, 0.875);
        this.IlIlIIlllIIlIllIIIlllllIl(class_05872, n, n2, n3);
        IIcon class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.beacon);
        if (Config.llIllllIIIIIlIIlIlllIIlll()) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05872, n, n2, n3, -1, class_21022);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_21022);
        this.lllIIIllIIIIlllIlIIllIIll(0.1875, f, 0.1875, 0.8125, 0.875, 0.8125);
        this.IlIlIIlllIIlIllIIIlllllIl(class_05872, n, n2, n3);
        this.IlIIIIIllllllIIlllIllllll = false;
        this.lllIIIllIIIIlllIlIIllIIll();
        return true;
    }

    public boolean IlIIIlIIIIllIIIllIIIIIIll(Block class_05492, int n, int n2, int n3) {
        int n4 = class_05492.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        return this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, f, f2, f3);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(Block class_05492, int n, int n2, int n3, float f, float f2, float f3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        boolean bl = false;
        float f4 = 0.5f;
        float f5 = 1.0f;
        float f6 = 0.8f;
        float f7 = 0.6f;
        float f8 = f4 * f;
        float f9 = f5 * f;
        float f10 = f6 * f;
        float f11 = f7 * f;
        float f12 = f4 * f2;
        float f13 = f5 * f2;
        float f14 = f6 * f2;
        float f15 = f7 * f2;
        float f16 = f4 * f3;
        float f17 = f5 * f3;
        float f18 = f6 * f3;
        float f19 = f7 * f3;
        float f20 = 0.0625f;
        int n4 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3, 0)) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII > 0.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f8, f12, f16);
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 0));
        }
        if (this.IlIIIIIllllllIIlllIllllll || class_05492.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3, 1)) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll < 1.0 ? n4 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3));
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f9, f13, f17);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 1));
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(n4);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f10, f14, f18);
        class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, f20);
        this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2));
        class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, -f20);
        class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, -f20);
        this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3));
        class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, f20);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f11, f15, f19);
        class_08682.lIlllIlllIIIIlIIlllIllIII(f20, 0.0f, 0.0f);
        this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4));
        class_08682.lIlllIlllIIIIlIIlllIllIII(-f20, 0.0f, 0.0f);
        class_08682.lIlllIlllIIIIlIIlllIllIII(-f20, 0.0f, 0.0f);
        this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5));
        class_08682.lIlllIlllIIIIlIIlllIllIII(f20, 0.0f, 0.0f);
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1417 class_14172, int n, int n2, int n3) {
        boolean bl = false;
        float f = 0.375f;
        float f2 = 0.625f;
        this.lllIIIllIIIIlllIlIIllIIll(f, 0.0, (double)f, (double)f2, 1.0, (double)f2);
        this.IlIlIIlllIIlIllIIIlllllIl(class_14172, n, n2, n3);
        bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        if (class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3) || class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3)) {
            bl2 = true;
        }
        if (class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1) || class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1)) {
            bl3 = true;
        }
        boolean bl4 = class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
        boolean bl5 = class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
        boolean bl6 = class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
        boolean bl7 = class_14172.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
        if (!bl2 && !bl3) {
            bl2 = true;
        }
        f = 0.4375f;
        f2 = 0.5625f;
        float f3 = 0.75f;
        float f4 = 0.9375f;
        float f5 = bl4 ? 0.0f : f;
        float f6 = bl5 ? 1.0f : f2;
        float f7 = bl6 ? 0.0f : f;
        float f8 = bl7 ? 1.0f : f2;
        this.lIlllIlllIIIIlIIlllIllIII = true;
        if (bl2) {
            this.lllIIIllIIIIlllIlIIllIIll(f5, f3, (double)f, (double)f6, (double)f4, (double)f2);
            this.IlIlIIlllIIlIllIIIlllllIl(class_14172, n, n2, n3);
            bl = true;
        }
        if (bl3) {
            this.lllIIIllIIIIlllIlIIllIIll(f, f3, (double)f7, (double)f2, (double)f4, (double)f8);
            this.IlIlIIlllIIlIllIIIlllllIl(class_14172, n, n2, n3);
            bl = true;
        }
        f3 = 0.375f;
        f4 = 0.5625f;
        if (bl2) {
            this.lllIIIllIIIIlllIlIIllIIll(f5, f3, (double)f, (double)f6, (double)f4, (double)f2);
            this.IlIlIIlllIIlIllIIIlllllIl(class_14172, n, n2, n3);
            bl = true;
        }
        if (bl3) {
            this.lllIIIllIIIIlllIlIIllIIll(f, f3, (double)f7, (double)f2, (double)f4, (double)f8);
            this.IlIlIIlllIIlIllIIIlllllIl(class_14172, n, n2, n3);
            bl = true;
        }
        this.lIlllIlllIIIIlIIlllIllIII = false;
        class_14172.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        return bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1482 class_14822, int n, int n2, int n3) {
        boolean bl = class_14822.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3);
        boolean bl2 = class_14822.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3);
        boolean bl3 = class_14822.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1);
        boolean bl4 = class_14822.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1);
        boolean bl5 = bl3 && bl4 && !bl && !bl2;
        boolean bl6 = !bl3 && !bl4 && bl && bl2;
        boolean bl7 = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3);
        if ((bl5 || bl6) && bl7) {
            if (bl5) {
                this.lllIIIllIIIIlllIlIIllIIll(0.3125, 0.0, 0.0, 0.6875, 0.8125, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_14822, n, n2, n3);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                this.IlIlIIlllIIlIllIIIlllllIl(class_14822, n, n2, n3);
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
            this.IlIlIIlllIIlIllIIIlllllIl(class_14822, n, n2, n3);
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.3125, 0.25, 0.8125, 0.6875);
                this.IlIlIIlllIIlIllIIIlllllIl(class_14822, n, n2, n3);
            }
            if (bl2) {
                this.lllIIIllIIIIlllIlIIllIIll(0.75, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                this.IlIlIIlllIIlIllIIIlllllIl(class_14822, n, n2, n3);
            }
            if (bl3) {
                this.lllIIIllIIIIlllIlIIllIIll(0.3125, 0.0, 0.0, 0.6875, 0.8125, 0.25);
                this.IlIlIIlllIIlIllIIIlllllIl(class_14822, n, n2, n3);
            }
            if (bl4) {
                this.lllIIIllIIIIlllIlIIllIIll(0.3125, 0.0, 0.75, 0.6875, 0.8125, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_14822, n, n2, n3);
            }
        }
        class_14822.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1141 class_11412, int n, int n2, int n3) {
        boolean bl = false;
        int n4 = 0;
        for (int i = 0; i < 8; ++i) {
            int n5 = 0;
            int n6 = 1;
            if (i == 0) {
                n5 = 2;
            }
            if (i == 1) {
                n5 = 3;
            }
            if (i == 2) {
                n5 = 4;
            }
            if (i == 3) {
                n5 = 5;
                n6 = 2;
            }
            if (i == 4) {
                n5 = 6;
                n6 = 3;
            }
            if (i == 5) {
                n5 = 7;
                n6 = 5;
            }
            if (i == 6) {
                n5 = 6;
                n6 = 2;
            }
            if (i == 7) {
                n5 = 3;
            }
            float f = (float)n5 / 16.0f;
            float f2 = 1.0f - (float)n4 / 16.0f;
            float f3 = 1.0f - (float)(n4 + n6) / 16.0f;
            n4 += n6;
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, f3, (double)(0.5f - f), (double)(0.5f + f), (double)f2, (double)(0.5f + f));
            this.IlIlIIlllIIlIllIIIlllllIl(class_11412, n, n2, n3);
        }
        bl = true;
        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2172 class_21722, int n, int n2, int n3) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean bl = true;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl2 = class_2172.IllIIlllllllIIlIIlIIIIlIl(n4);
        int n5 = class_0143.IllIIIllIIIIlIlIlIllIIlll(n4);
        float f5 = 0.375f;
        float f6 = 0.5625f;
        float f7 = 0.75f;
        float f8 = 0.9375f;
        float f9 = 0.3125f;
        float f10 = 1.0f;
        if ((n5 == 2 || n5 == 0) && this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3) == Blocks.lIllIIlIlllIllIlIlIlIllII && this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3) == Blocks.lIllIIlIlllIllIlIlIlIllII || (n5 == 3 || n5 == 1) && this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1) == Blocks.lIllIIlIlllIllIlIlIlIllII && this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1) == Blocks.lIllIIlIlllIllIlIlIlIllII) {
            f5 -= 0.1875f;
            f6 -= 0.1875f;
            f7 -= 0.1875f;
            f8 -= 0.1875f;
            f9 -= 0.1875f;
            f10 -= 0.1875f;
        }
        this.IlIIIIIllllllIIlllIllllll = true;
        if (n5 != 3 && n5 != 1) {
            f4 = 0.0f;
            f3 = 0.125f;
            f2 = 0.4375f;
            f = 0.5625f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f9, (double)f2, (double)f3, (double)f10, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f4 = 0.875f;
            f3 = 1.0f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f9, (double)f2, (double)f3, (double)f10, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
        } else {
            this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
            f4 = 0.4375f;
            f3 = 0.5625f;
            f2 = 0.0f;
            f = 0.125f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f9, (double)f2, (double)f3, (double)f10, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f2 = 0.875f;
            f = 1.0f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f9, (double)f2, (double)f3, (double)f10, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
        }
        if (bl2) {
            if (n5 == 2 || n5 == 0) {
                this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
            }
            if (n5 == 3) {
                f4 = 0.0f;
                f3 = 0.125f;
                f2 = 0.875f;
                f = 1.0f;
                float f11 = 0.5625f;
                float f12 = 0.8125f;
                float f13 = 0.9375f;
                this.lllIIIllIIIIlllIlIIllIIll(0.8125, f5, 0.0, 0.9375, (double)f8, 0.125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.8125, f5, 0.875, 0.9375, (double)f8, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.5625, f5, 0.0, 0.8125, (double)f6, 0.125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.5625, f5, 0.875, 0.8125, (double)f6, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.5625, f7, 0.0, 0.8125, (double)f8, 0.125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.5625, f7, 0.875, 0.8125, (double)f8, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            } else if (n5 == 1) {
                f4 = 0.0f;
                f3 = 0.125f;
                f2 = 0.875f;
                f = 1.0f;
                float f14 = 0.0625f;
                float f15 = 0.1875f;
                float f16 = 0.4375f;
                this.lllIIIllIIIIlllIlIIllIIll(0.0625, f5, 0.0, 0.1875, (double)f8, 0.125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.0625, f5, 0.875, 0.1875, (double)f8, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.1875, f5, 0.0, 0.4375, (double)f6, 0.125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.1875, f5, 0.875, 0.4375, (double)f6, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.1875, f7, 0.0, 0.4375, (double)f8, 0.125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.1875, f7, 0.875, 0.4375, (double)f8, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            } else if (n5 == 0) {
                f4 = 0.0f;
                f3 = 0.125f;
                f2 = 0.875f;
                f = 1.0f;
                float f17 = 0.5625f;
                float f18 = 0.8125f;
                float f19 = 0.9375f;
                this.lllIIIllIIIIlllIlIIllIIll(0.0, f5, 0.8125, 0.125, (double)f8, 0.9375);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.875, f5, 0.8125, 1.0, (double)f8, 0.9375);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.0, f5, 0.5625, 0.125, (double)f6, 0.8125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.875, f5, 0.5625, 1.0, (double)f6, 0.8125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.0, f7, 0.5625, 0.125, (double)f8, 0.8125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.875, f7, 0.5625, 1.0, (double)f8, 0.8125);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            } else if (n5 == 2) {
                f4 = 0.0f;
                f3 = 0.125f;
                f2 = 0.875f;
                f = 1.0f;
                float f20 = 0.0625f;
                float f21 = 0.1875f;
                float f22 = 0.4375f;
                this.lllIIIllIIIIlllIlIIllIIll(0.0, f5, 0.0625, 0.125, (double)f8, 0.1875);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.875, f5, 0.0625, 1.0, (double)f8, 0.1875);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.0, f5, 0.1875, 0.125, (double)f6, 0.4375);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.875, f5, 0.1875, 1.0, (double)f6, 0.4375);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.0, f7, 0.1875, 0.125, (double)f8, 0.4375);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(0.875, f7, 0.1875, 1.0, (double)f8, 0.4375);
                this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            }
        } else if (n5 != 3 && n5 != 1) {
            f4 = 0.375f;
            f3 = 0.5f;
            f2 = 0.4375f;
            f = 0.5625f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f4 = 0.5f;
            f3 = 0.625f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f4 = 0.625f;
            f3 = 0.875f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f6, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            this.lllIIIllIIIIlllIlIIllIIll(f4, f7, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f4 = 0.125f;
            f3 = 0.375f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f6, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            this.lllIIIllIIIIlllIlIIllIIll(f4, f7, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
        } else {
            this.lIlIllIIlIIlIIlIIlIIlIIll = 1;
            f4 = 0.4375f;
            f3 = 0.5625f;
            f2 = 0.375f;
            f = 0.5f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f2 = 0.5f;
            f = 0.625f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f2 = 0.625f;
            f = 0.875f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f6, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            this.lllIIIllIIIIlllIlIIllIIll(f4, f7, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            f2 = 0.125f;
            f = 0.375f;
            this.lllIIIllIIIIlllIlIIllIIll(f4, f5, (double)f2, (double)f3, (double)f6, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
            this.lllIIIllIIIIlllIlIIllIIll(f4, f7, (double)f2, (double)f3, (double)f8, (double)f);
            this.IlIlIIlllIIlIllIIIlllllIl(class_21722, n, n2, n3);
        }
        if (Config.lIIlIlIIllIIIlIIlIlIIIlII() && this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIllIIlIIIlllIlllIIlIIlI.IlIIIlIIIIllIIIllIIIIIIll());
        }
        this.IlIIIIIllllllIIlllIllllll = false;
        this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        return bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1700 class_17002, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_17002.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
        int n4 = class_17002.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        float f = (float)(n4 >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n4 >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n4 & 0xFF) / 255.0f;
        if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
            float f4 = (f * 30.0f + f2 * 59.0f + f3 * 11.0f) / 100.0f;
            float f5 = (f * 30.0f + f2 * 70.0f) / 100.0f;
            float f6 = (f * 30.0f + f3 * 70.0f) / 100.0f;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
        return this.lllIIIllIIIIlllIlIIllIIll(class_17002, n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), false);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1700 class_17002, int n, int n2, int n3, int n4, boolean bl) {
        float f;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n5 = class_1700.IllIIlllllllIIlIIlIIIIlIl(n4);
        double d = 0.625;
        this.lllIIIllIIIIlllIlIIllIIll(0.0, d, 0.0, 1.0, 1.0, 1.0);
        if (bl) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
            this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 0, n4));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_17002, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 1, n4));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
            this.IlIllllllIIlIIllllIIlIIIl((Block)class_17002, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 2, n4));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
            this.lIlllIlllIIIIlIIlllIllIII(class_17002, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 3, n4));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
            this.IlIIIIIllllllIIlllIllllll(class_17002, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 4, n4));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
            this.lIllllIIlIIIlIllllllIIIll(class_17002, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 5, n4));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        } else {
            this.IlIlIIlllIIlIllIIIlllllIl(class_17002, n, n2, n3);
        }
        if (!bl) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(class_17002.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3));
            int n6 = class_17002.lIlllIlllIIIIlIIlllIllIII(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
            float f2 = (float)(n6 >> 16 & 0xFF) / 255.0f;
            f = (float)(n6 >> 8 & 0xFF) / 255.0f;
            float f3 = (float)(n6 & 0xFF) / 255.0f;
            if (class_0817.lllIIIllIIIIlllIlIIllIIll) {
                float f4 = (f2 * 30.0f + f * 59.0f + f3 * 11.0f) / 100.0f;
                float f5 = (f2 * 30.0f + f * 70.0f) / 100.0f;
                float f6 = (f2 * 30.0f + f3 * 70.0f) / 100.0f;
                f2 = f4;
                f = f5;
                f3 = f6;
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f, f3);
        }
        IIcon class_21022 = class_1700.lIlllIlllIIIIlIIlllIllIII("hopper_outside");
        IIcon class_21023 = class_1700.lIlllIlllIIIIlIIlllIllIII("hopper_inside");
        f = 0.125f;
        if (bl) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
            this.lIllllIIlIIIlIllllllIIIll(class_17002, -1.0f + f, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
            this.IlIIIIIllllllIIlllIllllll(class_17002, 1.0f - f, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
            this.lIlllIlllIIIIlIIlllIllIII(class_17002, 0.0, 0.0, -1.0f + f, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
            this.IlIllllllIIlIIllllIIlIIIl((Block)class_17002, 0.0, 0.0, 1.0f - f, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_17002, 0.0, -1.0 + d, 0.0, class_21023);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        } else {
            this.lIllllIIlIIIlIllllllIIIll(class_17002, (float)n - 1.0f + f, n2, n3, class_21022);
            this.IlIIIIIllllllIIlllIllllll(class_17002, (float)n + 1.0f - f, n2, n3, class_21022);
            this.lIlllIlllIIIIlIIlllIllIII(class_17002, n, n2, (float)n3 - 1.0f + f, class_21022);
            this.IlIllllllIIlIIllllIIlIIIl((Block)class_17002, (double)n, (double)n2, (float)n3 + 1.0f - f, class_21022);
            this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_17002, (double)n, (double)((float)n2 - 1.0f) + d, (double)n3, class_21023);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_21022);
        double d2 = 0.25;
        double d3 = 0.25;
        this.lllIIIllIIIIlllIlIIllIIll(d2, d3, d2, 1.0 - d2, d - 0.002, 1.0 - d2);
        if (bl) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
            this.lIllllIIlIIIlIllllllIIIll(class_17002, 0.0, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
            this.IlIIIIIllllllIIlllIllllll(class_17002, 0.0, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
            this.lIlllIlllIIIIlIIlllIllIII(class_17002, 0.0, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
            this.IlIllllllIIlIIllllIIlIIIl((Block)class_17002, 0.0, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl((Block)class_17002, 0.0, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
            this.lllIIIllIIIIlllIlIIllIIll((Block)class_17002, 0.0, 0.0, 0.0, class_21022);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        } else {
            this.IlIlIIlllIIlIllIIIlllllIl(class_17002, n, n2, n3);
        }
        if (!bl) {
            double d4 = 0.375;
            double d5 = 0.25;
            this.lllIIIllIIIIlllIlIIllIIll(class_21022);
            if (n5 == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(d4, 0.0, d4, 1.0 - d4, 0.25, 1.0 - d4);
                this.IlIlIIlllIIlIllIIIlllllIl(class_17002, n, n2, n3);
            }
            if (n5 == 2) {
                this.lllIIIllIIIIlllIlIIllIIll(d4, d3, 0.0, 1.0 - d4, d3 + d5, d2);
                this.IlIlIIlllIIlIllIIIlllllIl(class_17002, n, n2, n3);
            }
            if (n5 == 3) {
                this.lllIIIllIIIIlllIlIIllIIll(d4, d3, 1.0 - d2, 1.0 - d4, d3 + d5, 1.0);
                this.IlIlIIlllIIlIllIIIlllllIl(class_17002, n, n2, n3);
            }
            if (n5 == 4) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0, d3, d4, d2, d3 + d5, 1.0 - d4);
                this.IlIlIIlllIIlIllIIIlllllIl(class_17002, n, n2, n3);
            }
            if (n5 == 5) {
                this.lllIIIllIIIIlllIlIIllIIll(1.0 - d2, d3, d4, 1.0, d3 + d5, 1.0 - d4);
                this.IlIlIIlllIIlIllIIIlllllIl(class_17002, n, n2, n3);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll();
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1254 class_12542, int n, int n2, int n3) {
        class_12542.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll(class_12542);
        this.IlIlIIlllIIlIllIIIlllllIl(class_12542, n, n2, n3);
        this.lIlllIlllIIIIlIIlllIllIII = true;
        boolean bl = class_12542.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll(class_12542);
        this.IlIlIIlllIIlIllIIIlllllIl(class_12542, n, n2, n3);
        if (bl && class_12542.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_12542);
            this.IlIlIIlllIIlIllIIIlllllIl(class_12542, n, n2, n3);
        }
        this.lIlllIlllIIIIlIIlllIllIII = false;
        return true;
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl(Block class_05492, int n, int n2, int n3) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        int n4 = this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if ((n4 & 8) != 0 ? this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3) != class_05492 : this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 + 1, n3) != class_05492) {
            return false;
        }
        boolean bl = false;
        float f = 0.5f;
        float f2 = 1.0f;
        float f3 = 0.8f;
        float f4 = 0.6f;
        int n5 = class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII > 0.0 ? n5 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f, f, f);
        this.lllIIIllIIIIlllIlIIllIIll(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 0));
        bl = true;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll < 1.0 ? n5 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2 + 1, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f2, f2, f2);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, (double)n, (double)n2, (double)n3, this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 1));
        bl = true;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI > 0.0 ? n5 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 - 1));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f3, f3, f3);
        IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 2);
        this.IlIllllllIIlIIllllIIlIIIl(class_05492, (double)n, (double)n2, (double)n3, class_21022);
        bl = true;
        this.IlIllllllIIlIIllllIIlIIIl = false;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll < 1.0 ? n5 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3 + 1));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f3, f3, f3);
        class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 3);
        this.lIlllIlllIIIIlIIlllIllIII(class_05492, n, n2, n3, class_21022);
        bl = true;
        this.IlIllllllIIlIIllllIIlIIIl = false;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll > 0.0 ? n5 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n - 1, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f4, f4, f4);
        class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 4);
        this.IlIIIIIllllllIIlllIllllll(class_05492, n, n2, n3, class_21022);
        bl = true;
        this.IlIllllllIIlIIllllIIlIIIl = false;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII < 1.0 ? n5 : class_05492.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, n + 1, n2, n3));
        class_08682.lllIlIIlIIIlIlIIIllIlllIl(f4, f4, f4);
        class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, 5);
        this.lIllllIIlIIIlIllllllIIIll(class_05492, n, n2, n3, class_21022);
        bl = true;
        this.IlIllllllIIlIIllllIIlIIIl = false;
        return bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, double d, double d2, double d3, IIcon class_21022) {
        double d4;
        double d5;
        class_1363 class_13632;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, (int)d, (int)d2, (int)d3, 0, class_21022);
        }
        boolean bl = false;
        if (Config.IIIIlllIIlIllllllIllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null && this.llIIlIllIllllIlIIIIlIIlll == 0 && (class_13632 = class_1446.lllIIIllIIIIlllIlIIllIIll(class_21022)) != null) {
            int n = Config.lllIIIllIIIIlllIlIIllIIll((int)d, (int)d2, (int)d3, 0);
            if (class_13632.lllIIIllIIIIlllIlIIllIIll > 1) {
                this.llIIlIllIllllIlIIIIlIIlll = n & 3;
            }
            if (class_13632.lllIIIllIIIIlllIlIIllIIll == 2) {
                this.llIIlIllIllllIlIIIIlIIlll = this.llIIlIllIllllIlIIIIlIIlll / 2 * 3;
            }
            if (class_13632.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIllllllIIlIIllllIIlIIIl = (n & 4) != 0;
            }
            bl = true;
        }
        double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
        double d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
        double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
        if (this.IllIIIllIIIIlIlIlIllIIlll < 0.0 || this.lIIIIlIlIIlllllIIllIIlIII > 1.0) {
            d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI < 0.0 || this.IlIlllIIIIIIlIIllIIllIlll > 1.0) {
            d8 = class_21022.IlIIIIIllllllIIlllIllllll();
            d9 = class_21022.lIllllIIlIIIlIllllllIIIll();
        }
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.llIIlIllIllllIlIIIIlIIlll == 2) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.llIIlIllIllllIlIIIIlIIlll == 1) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d6 = d7;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.llIIlIllIllllIlIIIIlIIlll == 3) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        if (bl) {
            this.llIIlIllIllllIlIIIIlIIlll = 0;
            this.IlIllllllIIlIIllllIIlIIIl = false;
        }
        d4 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        double d13 = d + this.lIIIIlIlIIlllllIIllIIlIII;
        double d14 = d2 + this.llIIlllIllIllllIIIlIIIIII;
        double d15 = d3 + this.lllIIlIIIllllllIIIIlIlIlI;
        double d16 = d3 + this.IlIlllIIIIIIlIIllIIllIlll;
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            d4 = d + this.lIIIIlIlIIlllllIIllIIlIII;
            d13 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        }
        if (this.llIllllIlIllIIIlIllIIlIlI) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIlIlIlIIlIllIIIllIlIl, this.IlIIIIIllIlllIIIIlIIIllIl, this.IlIIIlIIlllllIIIllIlIlIll);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIllIIlIIIIlllIlIllIlI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d10, d12);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIlIIlIllIlIIlIlIIlIlIlI, this.lIIlIlIIllIIIlIIlIlIIIlII, this.lIIllllllllIlIllllllllIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIllIlIlIllIIIlIIlIlIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d6, d8);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIIIlIIlIIIIllIIIlIIII, this.lIIIlIIllIllIIlIIlIIIllII, this.lIIIIllIIllIIIlIIIllIllII);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIIllIllIIIIIlIllllIIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d15, d5, d11);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIlIIllIIIlllIllIIlIllI, this.lIlIllIIllIIIIlllIlIlllIl, this.lIIllIIlIIIlllIlllIIlIIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIIllIIIIIIlIlIIlIllI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d7, d9);
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d10, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d6, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d15, d5, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d7, d9);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Block class_05492, double d, double d2, double d3, IIcon class_21022) {
        double d4;
        double d5;
        class_1363 class_13632;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, (int)d, (int)d2, (int)d3, 1, class_21022);
        }
        boolean bl = false;
        if (Config.IIIIlllIIlIllllllIllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null && this.lIlIllIIlIIlIIlIIlIIlIIll == 0 && (class_13632 = class_1446.lllIIIllIIIIlllIlIIllIIll(class_21022)) != null) {
            int n = Config.lllIIIllIIIIlllIlIIllIIll((int)d, (int)d2, (int)d3, 1);
            if (class_13632.lllIIIllIIIIlllIlIIllIIll > 1) {
                this.lIlIllIIlIIlIIlIIlIIlIIll = n & 3;
            }
            if (class_13632.lllIIIllIIIIlllIlIIllIIll == 2) {
                this.lIlIllIIlIIlIIlIIlIIlIIll = this.lIlIllIIlIIlIIlIIlIIlIIll / 2 * 3;
            }
            if (class_13632.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIllllllIIlIIllllIIlIIIl = (n & 4) != 0;
            }
            bl = true;
        }
        double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
        double d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
        double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll < 0.0 || this.lIIIIlIlIIlllllIIllIIlIII > 1.0) {
            d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI < 0.0 || this.IlIlllIIIIIIlIIllIIllIlll > 1.0) {
            d8 = class_21022.IlIIIIIllllllIIlllIllllll();
            d9 = class_21022.lIllllIIlIIIlIllllllIIIll();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll == 1) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.lIlIllIIlIIlIIlIIlIIlIIll == 2) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d6 = d7;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.lIlIllIIlIIlIIlIIlIIlIIll == 3) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        if (bl) {
            this.lIlIllIIlIIlIIlIIlIIlIIll = 0;
            this.IlIllllllIIlIIllllIIlIIIl = false;
        }
        d4 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        double d13 = d + this.lIIIIlIlIIlllllIIllIIlIII;
        double d14 = d2 + this.llIIllIllIlIIlIIllIllllll;
        double d15 = d3 + this.lllIIlIIIllllllIIIIlIlIlI;
        double d16 = d3 + this.IlIlllIIIIIIlIIllIIllIlll;
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            d4 = d + this.lIIIIlIlIIlllllIIllIIlIII;
            d13 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        }
        if (this.llIllllIlIllIIIlIllIIlIlI) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIlIlIlIIlIllIIIllIlIl, this.IlIIIIIllIlllIIIIlIIIllIl, this.IlIIIlIIlllllIIIllIlIlIll);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIllIIlIIIIlllIlIllIlI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d7, d9);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIlIIlIllIlIIlIlIIlIlIlI, this.lIIlIlIIllIIIlIIlIlIIIlII, this.lIIllllllllIlIllllllllIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIllIlIlIllIIIlIIlIlIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d15, d5, d11);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIIIlIIlIIIIllIIIlIIII, this.lIIIlIIllIllIIlIIlIIIllII, this.lIIIIllIIllIIIlIIIllIllII);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIIllIllIIIIIlIllllIIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d6, d8);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIlIIllIIIlllIllIIlIllI, this.lIlIllIIllIIIIlllIlIlllIl, this.lIIllIIlIIIlllIlllIIlIIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIIllIIIIIIlIlIIlIllI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d10, d12);
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d7, d9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d15, d5, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d6, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d10, d12);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(Block class_05492, double d, double d2, double d3, IIcon class_21022) {
        double d4;
        double d5;
        class_1363 class_13632;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, (int)d, (int)d2, (int)d3, 2, class_21022);
        }
        boolean bl = false;
        if (Config.IIIIlllIIlIllllllIllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null && this.lIIlIIIIIlIlllIlIIlIlIlll == 0 && (class_13632 = class_1446.lllIIIllIIIIlllIlIIllIIll(class_21022)) != null) {
            int n = Config.lllIIIllIIIIlllIlIIllIIll((int)d, (int)d2, (int)d3, 2);
            if (class_13632.lllIIIllIIIIlllIlIIllIIll > 1) {
                this.lIIlIIIIIlIlllIlIIlIlIlll = n & 3;
            }
            if (class_13632.lllIIIllIIIIlllIlIIllIIll == 2) {
                this.lIIlIIIIIlIlllIlIIlIlIlll = this.lIIlIIIIIlIlllIlIIlIlIlll / 2 * 3;
            }
            if (class_13632.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIllllllIIlIIllllIIlIIIl = (n & 4) != 0;
            }
            bl = true;
        }
        double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
        double d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll((1.0 - this.IllIIIllIIIIlIlIlIllIIlll) * 16.0);
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll((1.0 - this.lIIIIlIlIIlllllIIllIIlIII) * 16.0);
        }
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
        double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll < 0.0 || this.lIIIIlIlIIlllllIIllIIlIII > 1.0) {
            d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        }
        if (this.llIIlllIllIllllIIIlIIIIII < 0.0 || this.llIIllIllIlIIlIIllIllllll > 1.0) {
            d8 = class_21022.IlIIIIIllllllIIlllIllllll();
            d9 = class_21022.lIllllIIlIIIlIllllllIIIll();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.lIIlIIIIIlIlllIlIIlIlIlll == 2) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.lIIlIIIIIlIlllIlIIlIlIlll == 1) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d6 = d7;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.lIIlIIIIIlIlllIlIIlIlIlll == 3) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        if (bl) {
            this.lIIlIIIIIlIlllIlIIlIlIlll = 0;
            this.IlIllllllIIlIIllllIIlIIIl = false;
        }
        d4 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        double d13 = d + this.lIIIIlIlIIlllllIIllIIlIII;
        double d14 = d2 + this.llIIlllIllIllllIIIlIIIIII;
        double d15 = d2 + this.llIIllIllIlIIlIIllIllllll;
        double d16 = d3 + this.lllIIlIIIllllllIIIIlIlIlI;
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            d4 = d + this.lIIIIlIlIIlllllIIllIIlIII;
            d13 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        }
        if (this.llIllllIlIllIIIlIllIIlIlI) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIlIlIlIIlIllIIIllIlIl, this.IlIIIIIllIlllIIIIlIIIllIl, this.IlIIIlIIlllllIIIllIlIlIll);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIllIIlIIIIlllIlIllIlI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d15, d16, d5, d11);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIlIIlIllIlIIlIlIIlIlIlI, this.lIIlIlIIllIIIlIIlIlIIIlII, this.lIIllllllllIlIllllllllIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIllIlIlIllIIIlIIlIlIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d15, d16, d6, d8);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIIIlIIlIIIIllIIIlIIII, this.lIIIlIIllIllIIlIIlIIIllII, this.lIIIIllIIllIIIlIIIllIllII);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIIllIllIIIIIlIllllIIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d10, d12);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIlIIllIIIlllIllIIlIllI, this.lIlIllIIllIIIIlllIlIlllIl, this.lIIllIIlIIIlllIlllIIlIIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIIllIIIIIIlIlIIlIllI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d7, d9);
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d15, d16, d5, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d15, d16, d6, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d10, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d7, d9);
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(Block class_05492, double d, double d2, double d3, IIcon class_21022) {
        double d4;
        double d5;
        class_1363 class_13632;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, (int)d, (int)d2, (int)d3, 3, class_21022);
        }
        boolean bl = false;
        if (Config.IIIIlllIIlIllllllIllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null && this.lIlIlIIlIIIIlIIIIIlllIIII == 0 && (class_13632 = class_1446.lllIIIllIIIIlllIlIIllIIll(class_21022)) != null) {
            int n = Config.lllIIIllIIIIlllIlIIllIIll((int)d, (int)d2, (int)d3, 3);
            if (class_13632.lllIIIllIIIIlllIlIIllIIll > 1) {
                this.lIlIlIIlIIIIlIIIIIlllIIII = n & 3;
            }
            if (class_13632.lllIIIllIIIIlllIlIIllIIll == 2) {
                this.lIlIlIIlIIIIlIIIIIlllIIII = this.lIlIlIIlIIIIlIIIIIlllIIII / 2 * 3;
            }
            if (class_13632.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIllllllIIlIIllllIIlIIIl = (n & 4) != 0;
            }
            bl = true;
        }
        double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
        double d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
        double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll < 0.0 || this.lIIIIlIlIIlllllIIllIIlIII > 1.0) {
            d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        }
        if (this.llIIlllIllIllllIIIlIIIIII < 0.0 || this.llIIllIllIlIIlIIllIllllll > 1.0) {
            d8 = class_21022.IlIIIIIllllllIIlllIllllll();
            d9 = class_21022.lIllllIIlIIIlIllllllIIIll();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.lIlIlIIlIIIIlIIIIIlllIIII == 1) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.lIlIlIIlIIIIlIIIIIlllIIII == 2) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d6 = d7;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.lIlIlIIlIIIIlIIIIIlllIIII == 3) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IllIIIllIIIIlIlIlIllIIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lIIIIlIlIIlllllIIllIIlIII * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        if (bl) {
            this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
            this.IlIllllllIIlIIllllIIlIIIl = false;
        }
        d4 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        double d13 = d + this.lIIIIlIlIIlllllIIllIIlIII;
        double d14 = d2 + this.llIIlllIllIllllIIIlIIIIII;
        double d15 = d2 + this.llIIllIllIlIIlIIllIllllll;
        double d16 = d3 + this.IlIlllIIIIIIlIIllIIllIlll;
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            d4 = d + this.lIIIIlIlIIlllllIIllIIlIII;
            d13 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        }
        if (this.llIllllIlIllIIIlIllIIlIlI) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIlIlIlIIlIllIIIllIlIl, this.IlIIIIIllIlllIIIIlIIIllIl, this.IlIIIlIIlllllIIIllIlIlIll);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIllIIlIIIIlllIlIllIlI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d15, d16, d6, d8);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIlIIlIllIlIIlIlIIlIlIlI, this.lIIlIlIIllIIIlIIlIlIIIlII, this.lIIllllllllIlIllllllllIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIllIlIlIllIIIlIIlIlIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d10, d12);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIIIlIIlIIIIllIIIlIIII, this.lIIIlIIllIllIIlIIlIIIllII, this.lIIIIllIIllIIIlIIIllIllII);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIIllIllIIIIIlIllllIIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d7, d9);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIlIIllIIIlllIllIIlIllI, this.lIlIllIIllIIIIlllIlIlllIl, this.lIIllIIlIIIlllIlllIIlIIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIIllIIIIIIlIlIIlIllI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d15, d16, d5, d11);
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d15, d16, d6, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d10, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d14, d16, d7, d9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d13, d15, d16, d5, d11);
        }
    }

    public void IlIIIIIllllllIIlllIllllll(Block class_05492, double d, double d2, double d3, IIcon class_21022) {
        double d4;
        double d5;
        class_1363 class_13632;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, (int)d, (int)d2, (int)d3, 4, class_21022);
        }
        boolean bl = false;
        if (Config.IIIIlllIIlIllllllIllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null && this.IIlllIlIlllIllIIIlllIIlIl == 0 && (class_13632 = class_1446.lllIIIllIIIIlllIlIIllIIll(class_21022)) != null) {
            int n = Config.lllIIIllIIIIlllIlIIllIIll((int)d, (int)d2, (int)d3, 4);
            if (class_13632.lllIIIllIIIIlllIlIIllIIll > 1) {
                this.IIlllIlIlllIllIIIlllIIlIl = n & 3;
            }
            if (class_13632.lllIIIllIIIIlllIlIIllIIll == 2) {
                this.IIlllIlIlllIllIIIlllIIlIl = this.IIlllIlIlllIllIIIlllIIlIl / 2 * 3;
            }
            if (class_13632.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIllllllIIlIIllllIIlIIIl = (n & 4) != 0;
            }
            bl = true;
        }
        double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
        double d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
        double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI < 0.0 || this.IlIlllIIIIIIlIIllIIllIlll > 1.0) {
            d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        }
        if (this.llIIlllIllIllllIIIlIIIIII < 0.0 || this.llIIllIllIlIIlIIllIllllll > 1.0) {
            d8 = class_21022.IlIIIIIllllllIIlllIllllll();
            d9 = class_21022.lIllllIIlIIIlIllllllIIIll();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.IIlllIlIlllIllIIIlllIIlIl == 1) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.IIlllIlIlllIllIIIlllIIlIl == 2) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d6 = d7;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.IIlllIlIlllIllIIIlllIIlIl == 3) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        if (bl) {
            this.IIlllIlIlllIllIIIlllIIlIl = 0;
            this.IlIllllllIIlIIllllIIlIIIl = false;
        }
        d4 = d + this.IllIIIllIIIIlIlIlIllIIlll;
        double d13 = d2 + this.llIIlllIllIllllIIIlIIIIII;
        double d14 = d2 + this.llIIllIllIlIIlIIllIllllll;
        double d15 = d3 + this.lllIIlIIIllllllIIIIlIlIlI;
        double d16 = d3 + this.IlIlllIIIIIIlIIllIIllIlll;
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            d15 = d3 + this.IlIlllIIIIIIlIIllIIllIlll;
            d16 = d3 + this.lllIIlIIIllllllIIIIlIlIlI;
        }
        if (this.llIllllIlIllIIIlIllIIlIlI) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIlIlIlIIlIllIIIllIlIl, this.IlIIIIIllIlllIIIIlIIIllIl, this.IlIIIlIIlllllIIIllIlIlIll);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIllIIlIIIIlllIlIllIlI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d5, d11);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIlIIlIllIlIIlIlIIlIlIlI, this.lIIlIlIIllIIIlIIlIlIIIlII, this.lIIllllllllIlIllllllllIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIllIlIlIllIIIlIIlIlIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d6, d8);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIIIlIIlIIIIllIIIlIIII, this.lIIIlIIllIllIIlIIlIIIllII, this.lIIIIllIIllIIIlIIIllIllII);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIIllIllIIIIIlIllllIIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d15, d10, d12);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIlIIllIIIlllIllIIlIllI, this.lIlIllIIllIIIIlllIlIlllIl, this.lIIllIIlIIIlllIlllIIlIIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIIllIIIIIIlIlIIlIllI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d16, d7, d9);
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d5, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d6, d8);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d15, d10, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d16, d7, d9);
        }
    }

    public void lIllllIIlIIIlIllllllIIIll(Block class_05492, double d, double d2, double d3, IIcon class_21022) {
        double d4;
        double d5;
        class_1363 class_13632;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_21022 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (Config.llIllllIIIIIlIIlIlllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            class_21022 = class_1245.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, class_05492, (int)d, (int)d2, (int)d3, 5, class_21022);
        }
        boolean bl = false;
        if (Config.IIIIlllIIlIllllllIllIIlll() && this.lllIlIIlIIIlIlIIIllIlllIl == null && this.IlIIIlIIIIllIIIllIIIIIIll == 0 && (class_13632 = class_1446.lllIIIllIIIIlllIlIIllIIll(class_21022)) != null) {
            int n = Config.lllIIIllIIIIlllIlIIllIIll((int)d, (int)d2, (int)d3, 5);
            if (class_13632.lllIIIllIIIIlllIlIIllIIll > 1) {
                this.IlIIIlIIIIllIIIllIIIIIIll = n & 3;
            }
            if (class_13632.lllIIIllIIIIlllIlIIllIIll == 2) {
                this.IlIIIlIIIIllIIIllIIIIIIll = this.IlIIIlIIIIllIIIllIIIIIIll / 2 * 3;
            }
            if (class_13632.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIllllllIIlIIllllIIlIIIl = (n & 4) != 0;
            }
            bl = true;
        }
        double d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
        double d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll((1.0 - this.lllIIlIIIllllllIIIIlIlIlI) * 16.0);
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll((1.0 - this.IlIlllIIIIIIlIIllIIllIlll) * 16.0);
        }
        double d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
        double d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
        if (this.IlIllllllIIlIIllllIIlIIIl) {
            d5 = d6;
            d6 = d7;
            d7 = d5;
        }
        if (this.lllIIlIIIllllllIIIIlIlIlI < 0.0 || this.IlIlllIIIIIIlIIllIIllIlll > 1.0) {
            d6 = class_21022.IlIllllllIIlIIllllIIlIIIl();
            d7 = class_21022.lIlllIlllIIIIlIIlllIllIII();
        }
        if (this.llIIlllIllIllllIIIlIIIIII < 0.0 || this.llIIllIllIlIIlIIllIllllll > 1.0) {
            d8 = class_21022.IlIIIIIllllllIIlllIllllll();
            d9 = class_21022.lIllllIIlIIIlIllllllIIIll();
        }
        d5 = d7;
        double d10 = d6;
        double d11 = d8;
        double d12 = d9;
        if (this.IlIIIlIIIIllIIIllIIIIIIll == 2) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d11 = d8;
            d12 = d9;
            d5 = d6;
            d10 = d7;
            d8 = d9;
            d9 = d11;
        } else if (this.IlIIIlIIIIllIIIllIIIIIIll == 1) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIllIllIlIIlIIllIllllll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.llIIlllIllIllllIIIlIIIIII * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d6 = d7;
            d7 = d10;
            d11 = d9;
            d12 = d8;
        } else if (this.IlIIIlIIIIllIIIllIIIIIIll == 3) {
            d6 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.lllIIlIIIllllllIIIIlIlIlI * 16.0);
            d7 = class_21022.lllIIIllIIIIlllIlIIllIIll(16.0 - this.IlIlllIIIIIIlIIllIIllIlll * 16.0);
            d8 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll * 16.0);
            d9 = class_21022.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII * 16.0);
            if (this.IlIllllllIIlIIllllIIlIIIl) {
                d4 = d6;
                d6 = d7;
                d7 = d4;
            }
            d5 = d7;
            d10 = d6;
            d11 = d8;
            d12 = d9;
        }
        if (bl) {
            this.IlIIIlIIIIllIIIllIIIIIIll = 0;
            this.IlIllllllIIlIIllllIIlIIIl = false;
        }
        d4 = d + this.lIIIIlIlIIlllllIIllIIlIII;
        double d13 = d2 + this.llIIlllIllIllllIIIlIIIIII;
        double d14 = d2 + this.llIIllIllIlIIlIIllIllllll;
        double d15 = d3 + this.lllIIlIIIllllllIIIIlIlIlI;
        double d16 = d3 + this.IlIlllIIIIIIlIIllIIllIlll;
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            d15 = d3 + this.IlIlllIIIIIIlIIllIIllIlll;
            d16 = d3 + this.lllIIlIIIllllllIIIIlIlIlI;
        }
        if (this.llIllllIlIllIIIlIllIIlIlI) {
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIlIlIlIIlIllIIIllIlIl, this.IlIIIIIllIlllIIIIlIIIllIl, this.IlIIIlIIlllllIIIllIlIlIll);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIllIIlIIIIlllIlIllIlI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d16, d10, d12);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIIlIIlIllIlIIlIlIIlIlIlI, this.lIIlIlIIllIIIlIIlIlIIIlII, this.lIIllllllllIlIllllllllIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIllIlIlIllIIIlIIlIlIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d15, d7, d9);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.llIIIIIlIIlIIIIllIIIlIIII, this.lIIIlIIllIllIIlIIlIIIllII, this.lIIIIllIIllIIIlIIIllIllII);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIIllIllIIIIIlIllllIIIl);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d5, d11);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIlIIllIIIlllIllIIlIllI, this.lIlIllIIllIIIIlllIlIlllIl, this.lIIllIIlIIIlllIlllIIlIIlI);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIIllIIIIIIlIlIIlIllI);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d6, d8);
        } else {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d16, d10, d12);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d13, d15, d7, d9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d15, d5, d11);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d4, d14, d16, d6, d8);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, float f) {
        float f2;
        float f3;
        float f4;
        int n2;
        boolean bl;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        boolean bl2 = bl = class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl;
        if (class_05492 == Blocks.lIlllIlllIlIIIIlllIlIlIIl || class_05492 == Blocks.IIllllllIIllIlIllllIIIlll || class_05492 == Blocks.furnace) {
            n = 3;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl) {
            n2 = class_05492.lIllllIIlIIIlIllllllIIIll(n);
            if (bl) {
                n2 = 0xFFFFFF;
            }
            f4 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            f2 = (float)(n2 & 0xFF) / 255.0f;
            GL11.glColor4f((float)(f4 * f), (float)(f3 * f), (float)(f2 * f), (float)1.0f);
        }
        n2 = class_05492.lIIIIlIlIIlllllIIllIIlIII();
        this.lllIIIllIIIIlllIlIIllIIll(class_05492);
        if (n2 != 0 && n2 != 31 && n2 != 39 && n2 != 16 && n2 != 26) {
            if (n2 == 1) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                IIcon class_21022 = this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n);
                this.lllIIIllIIIIlllIlIIllIIll(class_21022, -0.5, -0.5, -0.5, 1.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            } else if (n2 == 19) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                class_05492.lIlllIlllIlIIIIlllIlIlIIl();
                this.lllIIIllIIIIlllIlIIllIIll(class_05492, n, this.llIIllIllIlIIlIIllIllllll, -0.5, -0.5, -0.5);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            } else if (n2 == 23) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                class_05492.lIlllIlllIlIIIIlllIlIlIIl();
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            } else if (n2 == 13) {
                class_05492.lIlllIlllIlIIIIlllIlIlIIl();
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                f4 = 0.0625f;
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0));
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1));
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, f4);
                this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2));
                class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, -f4);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, -f4);
                this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3));
                class_08682.lIlllIlllIIIIlIIlllIllIII(0.0f, 0.0f, f4);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                class_08682.lIlllIlllIIIIlIIlllIllIII(f4, 0.0f, 0.0f);
                this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4));
                class_08682.lIlllIlllIIIIlIIlllIllIII(-f4, 0.0f, 0.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                class_08682.lIlllIlllIIIIlIIlllIllIII(-f4, 0.0f, 0.0f);
                this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5));
                class_08682.lIlllIlllIIIIlIIlllIllIII(f4, 0.0f, 0.0f);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            } else if (n2 == 22) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                class_1177.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_05492, n, f);
                GL11.glEnable((int)32826);
            } else if (n2 == 6) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                this.lllIIIllIIIIlllIlIIllIIll(class_05492, n, -0.5, -0.5, -0.5);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            } else if (n2 == 2) {
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                this.lllIIIllIIIIlllIlIIllIIll(class_05492, -0.5, -0.5, -0.5, 0.0, 0.0, 0);
                class_08682.lllIIIllIIIIlllIlIIllIIll();
            } else if (n2 == 10) {
                for (int i = 0; i < 2; ++i) {
                    if (i == 0) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 0.5);
                    }
                    if (i == 1) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.5, 1.0, 0.5, 1.0);
                    }
                    GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                    this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                    this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                    this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                    this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
                }
            } else if (n2 == 27) {
                int n3 = 0;
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                for (int i = 0; i < 8; ++i) {
                    int n4 = 0;
                    int n5 = 1;
                    if (i == 0) {
                        n4 = 2;
                    }
                    if (i == 1) {
                        n4 = 3;
                    }
                    if (i == 2) {
                        n4 = 4;
                    }
                    if (i == 3) {
                        n4 = 5;
                        n5 = 2;
                    }
                    if (i == 4) {
                        n4 = 6;
                        n5 = 3;
                    }
                    if (i == 5) {
                        n4 = 7;
                        n5 = 5;
                    }
                    if (i == 6) {
                        n4 = 6;
                        n5 = 2;
                    }
                    if (i == 7) {
                        n4 = 3;
                    }
                    float f5 = (float)n4 / 16.0f;
                    float f6 = 1.0f - (float)n3 / 16.0f;
                    float f7 = 1.0f - (float)(n3 + n5) / 16.0f;
                    n3 += n5;
                    this.lllIIIllIIIIlllIlIIllIIll(0.5f - f5, f7, (double)(0.5f - f5), (double)(0.5f + f5), (double)f6, (double)(0.5f + f5));
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0));
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1));
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                    this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2));
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                    this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3));
                    class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                    this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4));
                    class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                    this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5));
                }
                class_08682.lllIIIllIIIIlllIlIIllIIll();
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            } else if (n2 == 11) {
                for (int i = 0; i < 4; ++i) {
                    f3 = 0.125f;
                    if (i == 0) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, 0.0, 0.0, (double)(0.5f + f3), 1.0, (double)(f3 * 2.0f));
                    }
                    if (i == 1) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, 0.0, (double)(1.0f - f3 * 2.0f), (double)(0.5f + f3), 1.0, 1.0);
                    }
                    f3 = 0.0625f;
                    if (i == 2) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, 1.0f - f3 * 3.0f, (double)(-f3 * 2.0f), (double)(0.5f + f3), (double)(1.0f - f3), (double)(1.0f + f3 * 2.0f));
                    }
                    if (i == 3) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, 0.5f - f3 * 3.0f, (double)(-f3 * 2.0f), (double)(0.5f + f3), (double)(0.5f - f3), (double)(1.0f + f3 * 2.0f));
                    }
                    GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                    this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                    this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                    this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                    this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
                }
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            } else if (n2 == 21) {
                for (int i = 0; i < 3; ++i) {
                    f3 = 0.0625f;
                    if (i == 0) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, 0.3f, 0.0, (double)(0.5f + f3), 1.0, (double)(f3 * 2.0f));
                    }
                    if (i == 1) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, 0.3f, (double)(1.0f - f3 * 2.0f), (double)(0.5f + f3), 1.0, 1.0);
                    }
                    f3 = 0.0625f;
                    if (i == 2) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, 0.5, 0.0, (double)(0.5f + f3), (double)(1.0f - f3), 1.0);
                    }
                    GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                    this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                    this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                    this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                    this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
                }
            } else if (n2 == 32) {
                for (int i = 0; i < 2; ++i) {
                    if (i == 0) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.3125, 1.0, 0.8125, 0.6875);
                    }
                    if (i == 1) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
                    }
                    GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                    this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                    this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                    this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                    this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
                }
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
            } else if (n2 == 35) {
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                this.lllIIIllIIIIlllIlIIllIIll((class_0628)class_05492, 0, 0, 0, n << 2, true);
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            } else if (n2 == 34) {
                for (int i = 0; i < 3; ++i) {
                    if (i == 0) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.125, 0.0, 0.125, 0.875, 0.1875, 0.875);
                        this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.obsidian));
                    } else if (i == 1) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.1875, 0.1875, 0.1875, 0.8125, 0.875, 0.8125);
                        this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.beacon));
                    } else if (i == 2) {
                        this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                        this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.lIlIllIIlIIlIIlIIlIIlIIll));
                    }
                    GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
                    this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
                    this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
                    this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
                    this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    class_08682.lllIlIIlIIIlIlIIIllIlllIl();
                    class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
                    this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5, n));
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                    GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
                }
                this.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                this.lllIIIllIIIIlllIlIIllIIll();
            } else if (n2 == 38) {
                GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
                this.lllIIIllIIIIlllIlIIllIIll((class_1700)class_05492, 0, 0, 0, 0, true);
                GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
            }
        } else {
            if (n2 == 16) {
                n = 1;
            }
            class_05492.lIlllIlllIlIIIIlllIlIlIIl();
            this.lllIIIllIIIIlllIlIIllIIll(class_05492);
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
            this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 0, n));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            if (bl && this.IllIIlllllllIIlIIlIIIIlIl) {
                int n6 = class_05492.lIllllIIlIIIlIllllllIIIll(n);
                f3 = (float)(n6 >> 16 & 0xFF) / 255.0f;
                f2 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f8 = (float)(n6 & 0xFF) / 255.0f;
                GL11.glColor4f((float)(f3 * f), (float)(f2 * f), (float)(f8 * f), (float)1.0f);
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
            this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 1, n));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            if (bl && this.IllIIlllllllIIlIIlIIIIlIl) {
                GL11.glColor4f((float)f, (float)f, (float)f, (float)1.0f);
            }
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
            this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 2, n));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
            this.lIlllIlllIIIIlIIlllIllIII(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 3, n));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
            this.IlIIIIIllllllIIlllIllllll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 4, n));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
            this.lIllllIIlIIIlIllllllIIIll(class_05492, 0.0, 0.0, 0.0, this.lllIIIllIIIIlllIlIIllIIll(class_05492, 5, n));
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        }
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        switch (n) {
            case -1: {
                return false;
            }
            case 0: 
            case 10: 
            case 11: 
            case 13: 
            case 16: 
            case 21: 
            case 22: 
            case 26: 
            case 27: 
            case 31: 
            case 32: 
            case 34: 
            case 35: 
            case 39: {
                return true;
            }
        }
        return false;
    }

    public IIcon lllIIIllIIIIlllIlIIllIIll(Block class_05492, class_1843 class_18432, int n, int n2, int n3, int n4) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_05492.IlIllllllIIlIIllllIIlIIIl(class_18432, n, n2, n3, n4));
    }

    public IIcon lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n, int n2) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lllIIIllIIIIlllIlIIllIIll(n, n2));
    }

    public IIcon lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lIlllIlllIIIIlIIlllIllIII(n));
    }

    public IIcon lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_05492.lIlllIlllIIIIlIIlllIllIII(1));
    }

    public IIcon lllIlIIlIIIlIlIIIllIlllIl(IIcon class_21022) {
        if (class_21022 == null) {
            class_21022 = ((class_1511) Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIlIIlIIIlIlIIIllIlllIl(class_1511.lllIIIllIIIIlllIlIIllIIll)).lllIlIIlIIIlIlIIIllIlllIl("missingno");
        }
        return class_21022;
    }

    private float lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3);
        return class_05492.IllIIlllllllIIlIIlIIIIlIl() ? this.IIIlIllllIIIlllllIllIlIII : 1.0f;
    }

    private IIcon lllIIIllIIIIlllIlIIllIIll(IIcon class_21022, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        if ((class_21022 == class_1384.IllIlIlIIIlllIIllIIIIlIll || class_21022 == class_1384.IlllIIIllllIIllIllIlIIlIl) && (class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4, class_21022)) == class_1384.IllllIIlIIIllIlllIlllIllI) {
            this.llIIIlIlIlIIlIllIIIllIlIl *= f;
            this.lIIlIIlIllIlIIlIlIIlIlIlI *= f;
            this.llIIIIIlIIlIIIIllIIIlIIII *= f;
            this.lIlIlIIllIIIlllIllIIlIllI *= f;
            this.IlIIIIIllIlllIIIIlIIIllIl *= f2;
            this.lIIlIlIIllIIIlIIlIlIIIlII *= f2;
            this.lIIIlIIllIllIIlIIlIIIllII *= f2;
            this.lIlIllIIllIIIIlllIlIlllIl *= f2;
            this.IlIIIlIIlllllIIIllIlIlIll *= f3;
            this.lIIllllllllIlIllllllllIlI *= f3;
            this.lIIIIllIIllIIIlIIIllIllII *= f3;
            this.lIIllIIlIIIlllIlllIIlIIlI *= f3;
        }
        if (class_21022 == class_1384.IlllIIlllllllIIllIlIllllI) {
            class_21022 = Config.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2, n3, n4);
        }
        return class_21022;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        Block class_05492 = Blocks.lIIllIIlIIIlllIlllIIlIIlI;
        return this.lllIIIllIIIIlllIlIIllIIll.a_(n - 1, n2, n3) != class_05492 && this.lllIIIllIIIIlllIlIIllIIll.a_(n + 1, n2, n3) != class_05492 && this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 - 1) != class_05492 && this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3 + 1) != class_05492 ? false : this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2 - 1, n3).IlIlllIIIIIIlIIllIIllIlll();
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, double d) {
        if (this.IIIIIllIlIllIlIlIIlIllIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIllIIlIIIlllIlllIIlIIlI);
            this.llIIllIllIlIIlIIllIllllll = d;
            this.IlIlIIlllIIlIllIIIlllllIl(Blocks.lIIllIIlIIIlllIlllIIlIIlI, n, n2, n3);
        }
    }

    public static class_1333 lIlllIlllIIIIlIIlllIllIII() {
        if (lIIllIlIIlIIlllllIlIIllIl == null) {
            lIIllIlIIlIIlllllIlIIllIl = new class_1333();
        }
        return lIIllIlIIlIIlllllIlIIllIl;
    }
}

