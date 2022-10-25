package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.moonsworth.client.nethandler.LCPacket
 *  com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd
 *  com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove
 */
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointAdd;
import com.moonsworth.client.nethandler.shared.LCPacketWaypointRemove;
import com.moonsworth.lunar.client.LunarClient;

import java.awt.Color;
import java.util.Random;
import java.util.TreeSet;

public class class_1400
extends class_1634
implements class_0945 {
    private final class_0229 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_2013 IllIIlllllllIIlIIlIIIIlIl;
    protected final class_1835 lllIIIllIIIIlllIlIIllIIll;
    protected final class_0153 lllIlIIlIIIlIlIIIllIlllIl;
    protected String IlIllllllIIlIIllllIIlIIIl = "Waypoints";
    private class_0629 IIIllIllIIlIlIlIlIllllIIl;
    private class_1197 IllIIIllIIIIlIlIlIllIIlll;
    protected boolean lIlllIlllIIIIlIIlllIllIII = false;
    private class_1197 lIIIIlIlIIlllllIIllIIlIII;
    private boolean lIlllIlllIlIIIIlllIlIlIIl = false;
    private class_1197 IlIIlllllIIlIlIlllllIllll;
    private class_1197 llIIlIlIlllIIllIlIlllIllI;
    private class_1197 IllIIIIllIIllIllIlllIlIIl;
    private class_1197 IIIIIIIIlIllIIllIIlllIllI;
    private class_1197 IIlIIlIlIlIllIIlIlIIIIlll;
    private boolean llIIIlllIlllIlIllIIIIllIl = false;
    private String IIIIlIllIlIIlIIlIllIlIlll = null;
    protected class_0368 IlIIIIIllllllIIlllIllllll = null;
    protected class_0368 lIllllIIlIIIlIllllllIIIll = null;
    private Random IlIlIIlllIllllllllIIIlIlI = new Random();
    private boolean llllIIIIlIIIlIIIIIIlIllll = false;

    public class_1400(class_0229 class_02292, class_2013 class_20132) {
        this.IllIIlllllllIIlIIlIIIIlIl = class_20132;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_02292;
        this.lllIIIllIIIIlllIlIIllIIll = class_20132.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20132.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void n_() {
        boolean bl;
        boolean bl2 = false;
        this.IlIllllllIIlIIllllIIlIIIl = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.title");
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0629(this);
        this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII(7, 8);
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.llIIlIlIlllIIllIlIlllIllI = new class_1197(2, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 154, 34, 77, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbyname"));
        this.llIIllIllIlIIlIIllIllllll().add(this.llIIlIlIlllIIllIlIlllIllI);
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.IIIIIIIIlIllIIllIIlllIllI = new class_1197(3, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 77, 34, 77, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbydistance"));
        this.llIIllIllIlIIlIIllIllllll().add(this.IIIIIIIIlIllIIllIIlllIllI);
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.IllIIIIllIIllIllIlllIlIIl = new class_1197(1, this.lIIIIlIlIIlllllIIllIIlIII() / 2, 34, 77, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbycreated"));
        this.llIIllIllIlIIlIIllIllllll().add(this.IllIIIIllIIllIllIlllIlIIl);
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.IIlIIlIlIlIllIIlIlIIIIlll = new class_1197(4, this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 77, 34, 77, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbycolor"));
        this.llIIllIllIlIIlIIllIllllll().add(this.IIlIIlIlIlIllIIlIlIIIIlll);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1197(-1, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 154, this.llIIlllIllIllllIIIlIIIIII() - 52, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("selectServer.edit"));
        this.llIIllIllIlIIlIIllIllllll().add(this.IllIIIllIIIIlIlIlIllIIlll);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1197(-2, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 50, this.llIIlllIllIllllIIIlIIIIII() - 52, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("selectServer.delete"));
        this.llIIllIllIlIIlIIllIllllll().add(this.lIIIIlIlIIlllllIIllIIlIII);
        this.IlIIlllllIIlIlIlllllIllll = new class_1197(-3, this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 4 + 50, this.llIIlllIllIllllIIIlIIIIII() - 52, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.teleportto"));
        this.llIIllIllIlIIlIIllIllllll().add(this.IlIIlllllIIlIlIlllllIllll);
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(-4, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 154, this.llIIlllIllIllllIIIlIIIIII() - 28, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.newwaypoint")));
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(-5, this.lIIIIlIlIIlllllIIllIIlIII() / 2 - 50, this.llIIlllIllIllllIIIlIIIIII() - 28, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("menu.options")));
        this.llIIllIllIlIIlIIllIllllll().add(new class_1197(65336, this.lIIIIlIlIIlllllIIllIIlIII() / 2 + 4 + 50, this.llIIlllIllIllllIIIlIIIIII() - 28, 100, 20, class_0950.lllIIIllIIIIlllIlIIllIIll("gui.done")));
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIIllIIIIlIlIlIllIIlll = bl = this.IlIIIIIllllllIIlllIllllll != null;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIIllIIIIlIlIlIllIIlll = bl;
        this.IlIIlllllIIlIlIlllllIllll.IllIIIllIIIIlIlIlIllIIlll = bl && this.IllIIlllllllIIlIIlIIIIlIl();
        this.IlIlllIIIIIIlIIllIIllIlll();
    }

    private void IlIlllIIIIIIlIIllIIllIlll() {
        int n = Math.abs(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll);
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll > 0;
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, bl);
        String string = bl ? "\u2191" : "\u2193";
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.llIIlIlIlllIIllIlIlllIllI.IllIIlllllllIIlIIlIIIIlIl = n == 2 ? string + " " + class_0950.lllIIIllIIIIlllIlIIllIIll("mco.configure.world.name") + " " + string : class_0950.lllIIIllIIIIlllIlIIllIIll("mco.configure.world.name");
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.IIIIIIIIlIllIIllIIlllIllI.IllIIlllllllIIlIIlIIIIlIl = n == 3 ? string + " " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbydistance") + " " + string : class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbydistance");
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.IllIIIIllIIllIllIlllIlIIl.IllIIlllllllIIlIIlIIIIlIl = n == 1 ? string + " " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbycreated") + " " + string : class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbycreated");
        this.lllIIIllIIIIlllIlIIllIIll.getClass();
        this.IIlIIlIlIlIllIIlIlIIIIlll.IllIIlllllllIIlIIlIIIIlIl = n == 4 ? string + " " + class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbycolor") + " " + string : class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.sortbycolor");
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1197 class_11972) {
        if (class_11972.IllIIIllIIIIlIlIlIllIIlll) {
            String string;
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl > 0) {
                this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII(class_11972.IIIllIllIIlIlIlIlIllllIIl);
                this.llllIIIIlIIIlIIIIIIlIllll = true;
                this.IlIlllIIIIIIlIIllIIllIlll();
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -1 && !this.IlIIIIIllllllIIlllIllllll.llIIllIllIlIIlIIllIllllll) {
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIIIIllllllIIlllIllllll);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -2 && (string = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll) != null && !this.IlIIIIIllllllIIlllIllllll.llIIllIllIlIIlIIllIllllll) {
                this.lIlllIlllIlIIIIlllIlIlIIl = true;
                String string2 = class_0950.lllIIIllIIIIlllIlIIllIIll("minimap.waypoints.deleteconfirm");
                String string3 = "'" + string + "' " + class_0950.lllIIIllIIIIlllIlIIllIIll("selectServer.deleteWarning");
                String string4 = class_0950.lllIIIllIIIIlllIlIIllIIll("selectServer.deleteButton");
                String string5 = class_0950.lllIIIllIIIIlllIlIIllIIll("gui.cancel");
                class_0923 class_09232 = new class_0923(this, string2, string3, string4, string5, this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll().indexOf(this.IlIIIIIllllllIIlllIllllll));
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(class_09232);
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -3) {
                if (this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.IIIIlIllIlIIlIIlIllIlIlll()) {
                    this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl("/ztp " + this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll);
                    this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                } else {
                    if (this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll() > 0) {
                        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl("/tp " + this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.llllIIIIlIIIlIIIIIIlIllll() + " " + this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() + " " + this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll() + " " + this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
                        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl("/tppos " + this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() + " " + this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll() + " " + this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
                    } else {
                        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl("/tp " + this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.llllIIIIlIIIlIIIIIIlIllll() + " " + this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() + " " + (this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI != -1 ? "128" : "64") + " " + this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
                        this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lllIlIIlIIIlIlIIIllIlllIl("/tppos " + this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl() + " " + (this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI != -1 ? "256" : "64") + " " + this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
                    }
                    this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                }
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -4) {
                this.lIllllIIlIIIlIllllllIIIll();
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == -5) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_1994(this, this.lllIIIllIIIIlllIlIIllIIll));
            }
            if (class_11972.IIIllIllIIlIlIlIlIllllIIl == 65336) {
                this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (this.lIlllIlllIlIIIIlllIlIlIIl) {
            this.lIlllIlllIlIIIIlllIlIlIIl = false;
            if (bl) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
                this.IlIIIIIllllllIIlllIllllll = null;
            }
            this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII = false;
            if (bl) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII();
            }
            this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this);
        }
        if (this.llIIIlllIlllIlIllIIIIllIl) {
            this.llIIIlllIlllIlIllIIIIllIl = false;
            if (bl) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll);
                this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
            }
            this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(this);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0368 class_03682) {
        boolean bl;
        this.IlIIIIIllllllIIlllIllllll = class_03682;
        this.IllIIIllIIIIlIlIlIllIIlll.IllIIIllIIIIlIlIlIllIIlll = bl = this.IlIIIIIllllllIIlllIllllll != null && !class_03682.llIIllIllIlIIlIIllIllllll;
        this.lIIIIlIlIIlllllIIllIIlIII.IllIIIllIIIIlIlIlIllIIlll = bl;
        this.IlIIlllllIIlIlIlllllIllll.IllIIIllIIIIlIlIlIllIIlll = bl && this.IllIIlllllllIIlIIlIIIIlIl();
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0368 class_03682) {
        this.lIlllIlllIIIIlIIlllIllIII = true;
        this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_1661(this.IllIIlllllllIIlIIlIIIIlIl, this, class_03682, true));
    }

    protected void lIllllIIlIIIlIllllllIIIll() {
        float f;
        float f2;
        float f3;
        this.llIIIlllIlllIlIllIIIIllIl = true;
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll().size() == 0) {
            f3 = 0.0f;
            f2 = 1.0f;
            f = 0.0f;
        } else {
            f3 = this.IlIlIIlllIllllllllIIIlIlI.nextFloat();
            f2 = this.IlIlIIlllIllllllllIIIlIlI.nextFloat();
            f = this.IlIlIIlllIllllllllIIIlIlI.nextFloat();
        }
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI);
        this.lIllllIIlIIIlIllllllIIIll = new class_0368("", this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI != -1 ? class_0006.lIlllIlllIIIIlIIlllIllIII() : class_0006.lIlllIlllIIIIlIIlllIllIII() * 8, this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI != -1 ? class_0006.IlIIIIIllllllIIlllIllllll() : class_0006.IlIIIIIllllllIIlllIllllll() * 8, class_0006.lIllllIIlIIIlIllllllIIIll() - 1, true, f3, f2, f, "", this.IllIIlllllllIIlIIlIIIIlIl.IIIllIIlIIIIIIlIlIIllIIlI().IlIllllllIIlIIllllIIlIIIl(), treeSet);
        this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll = LunarClient.getInstance().getNetworkManager().IIIllIllIIlIlIlIlIllllIIl();
        this.IllIIIllIIIIlIlIlIllIIlll().lllIIIllIIIIlllIlIIllIIll(new class_1661(this.IllIIlllllllIIlIIlIIIIlIl, this, this.lIllllIIlIIIlIllllllIIIll, false));
    }

    protected void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII = !this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII;
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII();
        if (!this.IlIIIIIllllllIIlllIllllll.llIIllIllIlIIlIIllIllllll && this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII) {
            LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketWaypointRemove(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll));
            LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketWaypointAdd(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll, new Color(this.IlIIIIIllllllIIlllIllllll.IlIlIIlIlIllIIlIlIIllIIIl, this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII, this.IlIIIIIllllllIIlllIllllll.IlIlIIlllIIlIllIIIlllllIl).getRGB(), this.IlIIIIIllllllIIlllIllllll.IIIllIllIIlIlIlIlIllllIIl, this.IlIIIIIllllllIIlllIllllll.lIIIIlIlIIlllllIIllIIlIII, this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll, false, this.IlIIIIIllllllIIlllIllllll.llIIlllIllIllllIIIlIIIIII));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f) {
        super.IIIllIllIIlIlIlIlIllllIIl();
        this.IIIIlIllIlIIlIIlIllIlIlll = null;
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI(), this.IlIllllllIIlIIllllIIlIIIl, this.lIIIIlIlIIlllllIIllIIlIII() / 2, 20, 0xFFFFFF);
        super.lllIIIllIIIIlllIlIIllIIll(n, n2, f);
        if (this.IIIIlIllIlIIlIIlIllIlIlll != null) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll, n, n2);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        if (string != null) {
            int n3 = n + 12;
            int n4 = n2 - 12;
            int n5 = this.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll(string);
            class_1400.lllIIIllIIIIlllIlIIllIIll((float)(n3 - 3), (float)(n4 - 3), (float)(n3 + n5 + 3), (float)(n4 + 8 + 3), -1073741824, -1073741824);
            this.lllIIlIIIllllllIIIIlIlIlI().lllIIIllIIIIlllIlIIllIIll(string, (float)n3, (float)n4, -1);
        }
    }

    static String lllIIIllIIIIlllIlIIllIIll(class_1400 class_14002, String string) {
        class_14002.IIIIlIllIlIIlIIlIllIlIlll = string;
        return class_14002.IIIIlIllIlIIlIIlIllIlIlll;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.llIIlIIllIIllIlIIllIIllII.IIIIlIllIlIIlIIlIllIlIlll();
        if (bl) {
            return class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl[0].lIlllIlllIlIIIIlllIlIlIIl().IIlllIlIlllIllIIIlllIIlIl();
        }
        return true;
    }

    static class_1197 lllIIIllIIIIlllIlIIllIIll(class_1400 class_14002) {
        return class_14002.IllIIIllIIIIlIlIlIllIIlll;
    }

    static class_1197 lllIlIIlIIIlIlIIIllIlllIl(class_1400 class_14002) {
        return class_14002.lIIIIlIlIIlllllIIllIIlIII;
    }

    static class_1197 IlIllllllIIlIIllllIIlIIIl(class_1400 class_14002) {
        return class_14002.IlIIlllllIIlIlIlllllIllll;
    }

    @Override
    public void o_() {
        if (this.llllIIIIlIIIlIIIIIIlIllll) {
            super.o_();
        }
    }
}

