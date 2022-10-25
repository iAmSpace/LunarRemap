package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class class_0526 {
    public int lllIlIIlIIIlIlIIIllIlllIl = 20;
    private String lllIIIllIIIIlllIlIIllIIll = "Pig";
    private List IlIIIIIllllllIIlllIllllll;
    private class_1190 lIllllIIlIIIlIllllllIIIll;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;
    private int IIIllIIlIIIIIIlIlIIllIIlI = 200;
    private int IllIIlllllllIIlIIlIIIIlIl = 800;
    private int IIIllIllIIlIlIlIlIllllIIl = 4;
    private class_1521 IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII = 6;
    private int llIIlllIllIllllIIIlIIIIII = 16;
    private int llIIllIllIlIIlIIllIllllll = 4;

    public String IlIIIIIllllllIIlllIllllll() {
        if (this.IIIllIllIIlIlIlIlIllllIIl() == null) {
            if (this.lllIIIllIIIIlllIlIIllIIll.equals("Minecart")) {
                this.lllIIIllIIIIlllIlIIllIIll = "MinecartRideable";
            }
            return this.lllIIIllIIIIlllIlIIllIIll;
        }
        return this.IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll((double)this.lllIlIIlIIIlIlIIIllIlllIl() + 0.5, (double)this.IlIllllllIIlIIllllIIlIIIl() + 0.5, (double)this.lIlllIlllIIIIlIIlllIllIII() + 0.5, (double)this.llIIlllIllIllllIIIlIIIIII) != null;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        if (this.lIllllIIlIIIlIllllllIIIll()) {
            if (this.lllIIIllIIIIlllIlIIllIIll().IllIIIIllIIllIllIlllIlIIl) {
                double d = (float)this.lllIlIIlIIIlIlIIIllIlllIl() + this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextFloat();
                double d2 = (float)this.IlIllllllIIlIIllllIIlIIIl() + this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextFloat();
                double d3 = (float)this.lIlllIlllIIIIlIIlllIllIII() + this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextFloat();
                this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll("smoke", d, d2, d3, 0.0, 0.0, 0.0);
                this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll("flame", d, d2, d3, 0.0, 0.0, 0.0);
                if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    --this.lllIlIIlIIIlIlIIIllIlllIl;
                }
                this.lIlllIlllIIIIlIIlllIllIII = this.IlIllllllIIlIIllllIIlIIIl;
                this.IlIllllllIIlIIllllIIlIIIl = (this.IlIllllllIIlIIllllIIlIIIl + (double)(1000.0f / ((float)this.lllIlIIlIIIlIlIIIllIlllIl + 200.0f))) % 360.0;
            } else {
                if (this.lllIlIIlIIIlIlIIIllIlllIl == -1) {
                    this.IllIIIllIIIIlIlIlIllIIlll();
                }
                if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                    --this.lllIlIIlIIIlIlIIIllIlllIl;
                    return;
                }
                boolean bl = false;
                for (int i = 0; i < this.IIIllIllIIlIlIlIlIllllIIl; ++i) {
                    class_1521 class_15212 = class_0054.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll(), this.lllIIIllIIIIlllIlIIllIIll());
                    if (class_15212 == null) {
                        return;
                    }
                    int n = this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_15212.getClass(), class_1974.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(), this.IlIllllllIIlIIllllIIlIIIl(), this.lIlllIlllIIIIlIIlllIllIII(), this.lllIlIIlIIIlIlIIIllIlllIl() + 1, this.IlIllllllIIlIIllllIIlIIIl() + 1, this.lIlllIlllIIIIlIIlllIllIII() + 1).lllIlIIlIIIlIlIIIllIlllIl(this.llIIllIllIlIIlIIllIllllll * 2, 4.0, this.llIIllIllIlIIlIIllIllllll * 2)).size();
                    if (n >= this.lIIIIlIlIIlllllIIllIIlIII) {
                        this.IllIIIllIIIIlIlIlIllIIlll();
                        return;
                    }
                    double d = (double)this.lllIlIIlIIIlIlIIIllIlllIl() + (this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextDouble() - this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextDouble()) * (double)this.llIIllIllIlIIlIIllIllllll;
                    double d4 = this.IlIllllllIIlIIllllIIlIIIl() + this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextInt(3) - 1;
                    double d5 = (double)this.lIlllIlllIIIIlIIlllIllIII() + (this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextDouble() - this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextDouble()) * (double)this.llIIllIllIlIIlIIllIllllll;
                    class_0339 class_03392 = class_15212 instanceof class_0339 ? (class_0339)class_15212 : null;
                    class_15212.lllIlIIlIIIlIlIIIllIlllIl(d, d4, d5, this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextFloat() * 360.0f, 0.0f);
                    if (class_03392 != null && !class_03392.lllIIlIIIllllllIIIIlIlIlI()) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_15212);
                    this.lllIIIllIIIIlllIlIIllIIll().IlIllllllIIlIIllllIIlIIIl(2004, this.lllIlIIlIIIlIlIIIllIlllIl(), this.IlIllllllIIlIIllllIIlIIIl(), this.lIlllIlllIIIIlIIlllIllIII(), 0);
                    if (class_03392 != null) {
                        class_03392.lIlIIlllllIlllllIlIIIllll();
                    }
                    bl = true;
                }
                if (bl) {
                    this.IllIIIllIIIIlIlIlIllIIlll();
                }
            }
        }
    }

    public class_1521 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        if (this.IIIllIllIIlIlIlIlIllllIIl() != null && class_15212 != null) {
            Object object;
            Object object2 = new class_0775();
            class_15212.lIlllIlllIIIIlIIlllIllIII((class_0775)object2);
            for (Object object3 : this.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII()) {
                object = this.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll((String)object3);
                ((class_0775)object2).lllIIIllIIIIlllIlIIllIIll((String)object3, ((class_2037)object).lllIlIIlIIIlIlIIIllIlllIl());
            }
            class_15212.lIllllIIlIIIlIllllllIIIll((class_0775)object2);
            if (class_15212.lIlIllIIlIIlIIlIIlIIlIIll != null) {
                class_15212.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_15212);
            }
            object = class_15212;
            while (((class_0775)object2).lllIlIIlIIIlIlIIIllIlllIl("Riding", 10)) {
                Object object3;
                object3 = ((class_0775)object2).llIIllIllIlIIlIIllIllllll("Riding");
                class_1521 class_15213 = class_0054.lllIIIllIIIIlllIlIIllIIll(((class_0775)object3).IllIIIllIIIIlIlIlIllIIlll("id"), class_15212.lIlIllIIlIIlIIlIIlIIlIIll);
                if (class_15213 != null) {
                    class_0775 class_07752 = new class_0775();
                    class_15213.lIlllIlllIIIIlIIlllIllIII(class_07752);
                    for (String string : ((class_0775)object3).lIlllIlllIIIIlIIlllIllIII()) {
                        class_2037 class_20372 = ((class_0775)object3).lllIIIllIIIIlllIlIIllIIll(string);
                        class_07752.lllIIIllIIIIlllIlIIllIIll(string, class_20372.lllIlIIlIIIlIlIIIllIlllIl());
                    }
                    class_15213.lIllllIIlIIIlIllllllIIIll(class_07752);
                    class_15213.lllIlIIlIIIlIlIIIllIlllIl(((class_1521)object).IlIIlllllIIlIlIlllllIllll, ((class_1521)object).llIIlIlIlllIIllIlIlllIllI, ((class_1521)object).IllIIIIllIIllIllIlllIlIIl, ((class_1521)object).IIIIlIllIlIIlIIlIllIlIlll, ((class_1521)object).IlIlIIlllIllllllllIIIlIlI);
                    if (class_15212.lIlIllIIlIIlIIlIIlIIlIIll != null) {
                        class_15212.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_15213);
                    }
                    ((class_1521)object).lllIIIllIIIIlllIlIIllIIll(class_15213);
                }
                object = class_15213;
                object2 = object3;
            }
        } else if (class_15212 instanceof class_1965 && class_15212.lIlIllIIlIIlIIlIIlIIlIIll != null) {
            ((class_0339)class_15212).lllIIIllIIIIlllIlIIllIIll((class_2025)null);
            this.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_15212);
        }
        return class_15212;
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        if (this.IllIIlllllllIIlIIlIIIIlIl <= this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.lllIlIIlIIIlIlIIIllIlllIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
        } else {
            int n = this.IllIIlllllllIIlIIlIIIIlIl - this.IIIllIIlIIIIIIlIlIIllIIlI;
            this.lllIlIIlIIIlIlIIIllIlllIl = this.IIIllIIlIIIIIIlIlIIllIIlI + this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII.nextInt(n);
        }
        if (this.IlIIIIIllllllIIlllIllllll != null && this.IlIIIIIllllllIIlllIllllll.size() > 0) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1190)class_0242.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll().lllllIlllIIllIlIIlIIIllII, this.IlIIIIIllllllIIlllIllllll));
        }
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.IllIIIllIIIIlIlIlIllIIlll("EntityId");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.IlIIIIIllllllIIlllIllllll("Delay");
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SpawnPotentials", 9)) {
            this.IlIIIIIllllllIIlllIllllll = new ArrayList();
            class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("SpawnPotentials", 10);
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                this.IlIIIIIllllllIIlllIllllll.add(new class_1190(this, class_21452.lllIlIIlIIIlIlIIIllIlllIl(i)));
            }
        } else {
            this.IlIIIIIllllllIIlllIllllll = null;
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SpawnData", 10)) {
            this.lllIIIllIIIIlllIlIIllIIll(new class_1190(this, class_07752.llIIllIllIlIIlIIllIllllll("SpawnData"), this.lllIIIllIIIIlllIlIIllIIll));
        } else {
            this.lllIIIllIIIIlllIlIIllIIll((class_1190)null);
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("MinSpawnDelay", 99)) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.IlIIIIIllllllIIlllIllllll("MinSpawnDelay");
            this.IllIIlllllllIIlIIlIIIIlIl = class_07752.IlIIIIIllllllIIlllIllllll("MaxSpawnDelay");
            this.IIIllIllIIlIlIlIlIllllIIl = class_07752.IlIIIIIllllllIIlllIllllll("SpawnCount");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("MaxNearbyEntities", 99)) {
            this.lIIIIlIlIIlllllIIllIIlIII = class_07752.IlIIIIIllllllIIlllIllllll("MaxNearbyEntities");
            this.llIIlllIllIllllIIIlIIIIII = class_07752.IlIIIIIllllllIIlllIllllll("RequiredPlayerRange");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SpawnRange", 99)) {
            this.llIIllIllIlIIlIIllIllllll = class_07752.IlIIIIIllllllIIlllIllllll("SpawnRange");
        }
        if (this.lllIIIllIIIIlllIlIIllIIll() != null && this.lllIIIllIIIIlllIlIIllIIll().IllIIIIllIIllIllIlllIlIIl) {
            this.IllIIIllIIIIlIlIlIllIIlll = null;
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("EntityId", this.IlIIIIIllllllIIlllIllllll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Delay", (short)this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("MinSpawnDelay", (short)this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("MaxSpawnDelay", (short)this.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnCount", (short)this.IIIllIllIIlIlIlIlIllllIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("MaxNearbyEntities", (short)this.lIIIIlIlIIlllllIIllIIlIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("RequiredPlayerRange", (short)this.llIIlllIllIllllIIIlIIIIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnRange", (short)this.llIIllIllIlIIlIIllIllllll);
        if (this.IIIllIllIIlIlIlIlIllllIIl() != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnData", this.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl());
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl() != null || this.IlIIIIIllllllIIlllIllllll != null && this.IlIIIIIllllllIIlllIllllll.size() > 0) {
            class_2145 class_21452 = new class_2145();
            if (this.IlIIIIIllllllIIlllIllllll != null && this.IlIIIIIllllllIIlllIllllll.size() > 0) {
                for (class_1190 class_11902 : this.IlIIIIIllllllIIlllIllllll) {
                    class_21452.lllIIIllIIIIlllIlIIllIIll(class_11902.lllIIIllIIIIlllIlIIllIIll());
                }
            } else {
                class_21452.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll());
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnPotentials", class_21452);
        }
    }

    public class_1521 IllIIlllllllIIlIIlIIIIlIl() {
        if (this.IllIIIllIIIIlIlIlIllIIlll == null) {
            class_1521 class_15212 = class_0054.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll(), (class_1334)null);
            this.IllIIIllIIIIlIlIlIllIIlll = class_15212 = this.lllIIIllIIIIlllIlIIllIIll(class_15212);
        }
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (n == 1 && this.lllIIIllIIIIlllIlIIllIIll().IllIIIIllIIllIllIlllIlIIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
            return true;
        }
        return false;
    }

    public class_1190 IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1190 class_11902) {
        this.lIllllIIlIIIlIllllllIIIll = class_11902;
    }

    public abstract void lllIIIllIIIIlllIlIIllIIll(int var1);

    public abstract class_1334 lllIIIllIIIIlllIlIIllIIll();

    public abstract int lllIlIIlIIIlIlIIIllIlllIl();

    public abstract int IlIllllllIIlIIllllIIlIIIl();

    public abstract int lIlllIlllIIIIlIIlllIllIII();
}

