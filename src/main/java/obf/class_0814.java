package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class class_0814
extends class_1965
implements class_1969 {
    public class_0503 lllIIlIIIllllllIIIIlIlIlI = new class_0503(this);
    private class_0407 lllIIIllIIIIlllIlIIllIIll = new class_0407();
    public class_1071 IlIlllIIIIIIlIIllIIllIlll;
    public class_1071 lIIIlIllllIlllIIIIIllIIIl;
    protected class_0955 lllIIIlllIlllIIlIllllIIlI = new class_0955();
    private Cosmetic lllIlIIlIIIlIlIIIllIlllIl = null;
    private Cosmetic IlIllllllIIlIIllllIIlIIIl = null;
    protected int lIIlIlllIIlllIIlllIIlIlII;
    public float lIIlIIIlIlIIlllIlIllIllIl;
    public float lIIlIlIIIIIllIIIIllIlIlII;
    public int lIIIIlIIIIllIlIIllllIlIII;
    public double lIIIlllllllIlllIIllllllll;
    public double IIllllIIlIlIlIlllIIIllIIl;
    public double IIIllIIIlIlllllllIIIlllll;
    public double lIlIlllIllllIIlllIlllIIIl;
    public double lIlIllllIlIIIIIllIIIIlIlI;
    public double IIlllllIIlIIlIlIIlIIlIlII;
    public float IIlIlIIIIlIlllIlIlIIIIIlI = 0.0f;
    protected boolean IlIlIIllIlIlIIIIIlIlllllI;
    public class_2208 lIlIIIlIlIllIlIlIIIlIlIII;
    private int lIlllIlllIIIIlIIlllIllIII;
    public float lIllIIlIlllIllIlIlIlIllII;
    public float IIIIIllIIlIlIlIIlIlIlIllI;
    public float lIlIIlIIlIIIIllIIlIllIlll;
    private class_2208 IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private class_2208 IIIllIIlIIIIIIlIlIIllIIlI;
    public class_0372 lIIlIlIlIlIllIIlIIllllIll = new class_0372();
    public int lllIlllllIllIlIIlIlIIIlll;
    public int llllIllIIIlIllIllllllIlIl;
    public float llIlllllIIlIIlIIllllIllll;
    private ItemStack IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    protected float lIllIlIlIIIIlIlIIlIlIlllI = 0.1f;
    protected float lllIIIlIllIlllIlIIllIllIl = 0.02f;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private final GameProfile lIIIIlIlIIlllllIIllIIlIII;
    public class_2050 IIlIlIIIIlIlllIIlIIlIIIII;

    public Cosmetic lIlIIIllIIllIIlIllllllIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean lIlIIlllllIlllllIlIIIllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl != null;
    }

    public boolean lllllllIlIIlIlIIIlIlIIlll() {
        return this.IlIllllllIIlIIllllIIlIIIl != null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Cosmetic class_04332) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_04332;
    }

    public Cosmetic llIllllIIIIIlIIlIlllIIlll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Cosmetic class_04332) {
        this.IlIllllllIIlIIllllIIlIIIl = class_04332;
    }

    public class_0814(class_1334 class_13342, GameProfile gameProfile) {
        super(class_13342);
        this.lIIllIIlIIIlllIlllIIlIIlI = class_0814.lllIIIllIIIIlllIlIIllIIll(gameProfile);
        this.lIIIIlIlIIlllllIIllIIlIII = gameProfile;
        this.lIIIlIllllIlllIIIIIllIIIl = this.IlIlllIIIIIIlIIllIIllIlll = new class_1414(this.lllIIlIIIllllllIIIIlIlIlI, !class_13342.IllIIIIllIIllIllIlllIlIIl, this);
        this.llllIlIIIIIIIIIlllIIlIIIl = 1.62f;
        class_2208 class_22082 = class_13342.lIlIllIIlIIlIIlIIlIIlIIll();
        this.lllIlIIlIIIlIlIIIllIlllIl((double)class_22082.lllIIIllIIIIlllIlIIllIIll + 0.5, class_22082.lllIlIIlIIIlIlIIIllIlllIl + 1, (double)class_22082.IlIllllllIIlIIllllIIlIIIl + 0.5, 0.0f, 0.0f);
        this.IlIIIIIIIIIIlIIlllIIIlIlI = 180.0f;
        this.lllIIIlIIlIlIllIIIIIlIIll = 20;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(class_1152.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(1.0);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17, Float.valueOf(0.0f));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, (Object)0);
    }

    public ItemStack IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int IllIlllIIIlllllIllIIlIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public boolean IIIlllIlIIllIIlIlIllIlIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl != null;
    }

    public int llllIIIlIlIlIlIIlIIIIIlIl() {
        return this.IIIlllIlIIllIIlIlIllIlIIl() ? this.IllIIlllllllIIlIIlIIIIlIl.lllIIlIIIllllllIIIIlIlIlI() - this.IIIllIllIIlIlIlIlIllllIIl : 0;
    }

    public void llIIIlIIllIIllIllIIlIlllI() {
        if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
            this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this, this.IIIllIllIIlIlIlIlIllllIIl);
        }
        this.lllllIllllIIIIllIIlIlIlII();
    }

    public void lllllIllllIIIIllIIlIlIlII() {
        this.IllIIlllllllIIlIIlIIIIlIl = null;
        this.IIIllIllIIlIlIlIlIllllIIl = 0;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIllllIIlIIIlIllllllIIIll(false);
        }
    }

    public boolean lIIllIlIllIlIlIIlIlIIIIll() {
        return this.IIIlllIlIIllIIlIlIllIlIIl() && this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll().IlIIIIIllllllIIlllIllllll(this.IllIIlllllllIIlIIlIIIIlIl) == class_1484.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void s_() {
        if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
            ItemStack class_08972 = this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
            if (class_08972 == this.IllIIlllllllIIlIIlIIIIlIl) {
                if (this.IIIllIllIIlIlIlIlIllllIIl <= 25 && this.IIIllIllIIlIlIlIlIllllIIl % 4 == 0) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_08972, 5);
                }
                if (--this.IIIllIllIIlIlIlIlIllllIIl == 0 && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                    this.lIIllllIllIlllllIIllIllIl();
                }
            } else {
                this.lllllIllllIIIIllIIlIlIlII();
            }
        }
        if (this.lIIIIlIIIIllIlIIllllIlIII > 0) {
            --this.lIIIIlIIIIllIlIIllllIlIII;
        }
        if (this.IIIIIllIIlIlIlIIlIlIlIllI()) {
            ++this.lIlllIlllIIIIlIIlllIllIII;
            if (this.lIlllIlllIIIIlIIlllIllIII > 100) {
                this.lIlllIlllIIIIlIIlllIllIII = 100;
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                if (!this.IlIIIIIllllllIIlllIllllll()) {
                    this.lllIIIllIIIIlllIlIIllIIll(true, true, false);
                } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII()) {
                    this.lllIIIllIIIIlllIlIIllIIll(false, true, true);
                }
            }
        } else if (this.lIlllIlllIIIIlIIlllIllIII > 0) {
            ++this.lIlllIlllIIIIlIIlllIllIII;
            if (this.lIlllIlllIIIIlIIlllIllIII >= 110) {
                this.lIlllIlllIIIIlIIlllIllIII = 0;
            }
        }
        super.s_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIIIlIllllIlllIIIIIllIIIl != null && !this.lIIIlIllllIlllIIIIIllIIIl.lllIIIllIIIIlllIlIIllIIll(this)) {
            this.IlIIIlIIIIllIIIllIIIIIIll();
            this.lIIIlIllllIlllIIIIIllIIIl = this.IlIlllIIIIIIlIIllIIllIlll;
        }
        if (this.llIIIIIlIIlIIIIllIIIlIIII() && this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll) {
            this.IllllIIIIlIIlIIIIlllIIIIl();
        }
        this.lIIIlllllllIlllIIllllllll = this.lIlIlllIllllIIlllIlllIIIl;
        this.IIllllIIlIlIlIlllIIIllIIl = this.lIlIllllIlIIIIIllIIIIlIlI;
        this.IIIllIIIlIlllllllIIIlllll = this.IIlllllIIlIIlIlIIlIIlIlII;
        double d = this.IlIIlllllIIlIlIlllllIllll - this.lIlIlllIllllIIlllIlllIIIl;
        double d2 = this.llIIlIlIlllIIllIlIlllIllI - this.lIlIllllIlIIIIIllIIIIlIlI;
        double d3 = this.IllIIIIllIIllIllIlllIlIIl - this.IIlllllIIlIIlIlIIlIIlIlII;
        double d4 = 10.0;
        if (d > d4) {
            this.lIIIlllllllIlllIIllllllll = this.lIlIlllIllllIIlllIlllIIIl = this.IlIIlllllIIlIlIlllllIllll;
        }
        if (d3 > d4) {
            this.IIIllIIIlIlllllllIIIlllll = this.IIlllllIIlIIlIlIIlIIlIlII = this.IllIIIIllIIllIllIlllIlIIl;
        }
        if (d2 > d4) {
            this.IIllllIIlIlIlIlllIIIllIIl = this.lIlIllllIlIIIIIllIIIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        }
        if (d < -d4) {
            this.lIIIlllllllIlllIIllllllll = this.lIlIlllIllllIIlllIlllIIIl = this.IlIIlllllIIlIlIlllllIllll;
        }
        if (d3 < -d4) {
            this.IIIllIIIlIlllllllIIIlllll = this.IIlllllIIlIIlIlIIlIIlIlII = this.IllIIIIllIIllIllIlllIlIIl;
        }
        if (d2 < -d4) {
            this.IIllllIIlIlIlIlllIIIllIIl = this.lIlIllllIlIIIIIllIIIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        }
        this.lIlIlllIllllIIlllIlllIIIl += d * 0.25;
        this.IIlllllIIlIIlIlIIlIIlIlII += d3 * 0.25;
        this.lIlIllllIlIIIIIllIIIIlIlI += d2 * 0.25;
        if (this.IlIIIlIIIIllIIIllIIIIIIll == null) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = null;
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll(this);
            this.lllIIIllIIIIlllIlIIllIIll(StatList.IIIllIIlIIIIIIlIlIIllIIlI, 1);
        }
    }

    @Override
    public int llIIlIIllIIllIlIIllIIllII() {
        return this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll ? 0 : 80;
    }

    @Override
    protected String IIIIlIlIIlIIIIlIlllIlIIII() {
        return "game.player.swim";
    }

    @Override
    protected String lIIIlIIIlIlllIllIIIlIIIlI() {
        return "game.player.swim.splash";
    }

    @Override
    public int lIlllIIllIIIIIIlIlIIlIllI() {
        return 10;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, float f, float f2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, string, f, f2);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, int n) {
        if (class_08972.IlIlllIIIIIIlIIllIIllIlll() == class_1484.IlIllllllIIlIIllllIIlIIIl) {
            this.lllIIIllIIIIlllIlIIllIIll("random.drink", 0.5f, this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.1f + 0.9f);
        }
        if (class_08972.IlIlllIIIIIIlIIllIIllIlll() == class_1484.lllIlIIlIIIlIlIIIllIlllIl) {
            for (int i = 0; i < n; ++i) {
                class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                class_08642.lllIIIllIIIIlllIlIIllIIll(-this.IlIlIIlllIllllllllIIIlIlI * (float)Math.PI / 180.0f);
                class_08642.lllIlIIlIIIlIlIIIllIlllIl(-this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
                class_0864 class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(((double)this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5) * 0.3, (double)(-this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.6 - 0.3, 0.6);
                class_08643.lllIIIllIIIIlllIlIIllIIll(-this.IlIlIIlllIllllllllIIIlIlI * (float)Math.PI / 180.0f);
                class_08643.lllIlIIlIIIlIlIIIllIlllIl(-this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f);
                class_08643 = class_08643.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll(), this.IllIIIIllIIllIllIlllIlIIl);
                String string = "iconcrack_" + Item.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll());
                if (class_08972.IIIllIIlIIIIIIlIlIIllIIlI()) {
                    string = string + "_" + class_08972.IllIIIllIIIIlIlIlIllIIlll();
                }
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(string, class_08643.lllIIIllIIIIlllIlIIllIIll, class_08643.lllIlIIlIIIlIlIIIllIlllIl, class_08643.IlIllllllIIlIIllllIIlIIIl, class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl + 0.05, class_08642.IlIllllllIIlIIllllIIlIIIl);
            }
            this.lllIIIllIIIIlllIlIIllIIll("random.eat", 0.5f + 0.5f * (float)this.IlllIIlllllllIIllIlIllllI.nextInt(2), (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f + 1.0f);
        }
    }

    protected void lIIllllIllIlllllIIllIllIl() {
        if (this.IllIIlllllllIIlIIlIIIIlIl != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl(this.IllIIlllllllIIlIIlIIIIlIl, 16);
            int n = this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl;
            ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this);
            if (class_08972 != this.IllIIlllllllIIlIIlIIIIlIl || class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl != n) {
                this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = class_08972;
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                    this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll[this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl] = null;
                }
            }
            this.lllllIllllIIIIllIIlIlIlII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 9) {
            this.lIIllllIllIlllllIIllIllIl();
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    @Override
    protected boolean lIlIIIlIlIllIlIlIIIlIlIII() {
        return this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f || this.IIIIIllIIlIlIlIIlIlIlIllI();
    }

    protected void IlIIIlIIIIllIIIllIIIIIIll() {
        this.lIIIlIllllIlllIIIIIllIIIl = this.IlIlllIIIIIIlIIllIIllIlll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        if (this.IlIIIlIIIIllIIIllIIIIIIll != null && class_15212 == null) {
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.llIIlllIllIllllIIIlIIIIII(this.IlIIIlIIIIllIIIllIIIIIIll);
            }
            if (this.IlIIIlIIIIllIIIllIIIIIIll != null) {
                this.IlIIIlIIIIllIIIllIIIIIIll.lIlIlIIlIIIIlIIIIIlllIIII = null;
            }
            this.IlIIIlIIIIllIIIllIIIIIIll = null;
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_15212);
        }
    }

    @Override
    public void lllIIIlIIlIlIllIIIIIlIIll() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IIlIIlIlIlIllIIlIlIIIIlll()) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
            this.lIlllIlllIIIIlIIlllIllIII(false);
        } else {
            double d = this.IlIIlllllIIlIlIlllllIllll;
            double d2 = this.llIIlIlIlllIIllIlIlllIllI;
            double d3 = this.IllIIIIllIIllIllIlllIlIIl;
            float f = this.IIIIlIllIlIIlIIlIllIlIlll;
            float f2 = this.IlIlIIlllIllllllllIIIlIlI;
            super.lllIIIlIIlIlIllIIIIIlIIll();
            this.lIIlIIIlIlIIlllIlIllIllIl = this.lIIlIlIIIIIllIIIIllIlIlII;
            this.lIIlIlIIIIIllIIIIllIlIlII = 0.0f;
            this.llIIlllIllIllllIIIlIIIIII(this.IlIIlllllIIlIlIlllllIllll - d, this.llIIlIlIlllIIllIlIlllIllI - d2, this.IllIIIIllIIllIllIlllIlIIl - d3);
            if (this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_0161) {
                this.IlIlIIlllIllllllllIIIlIlI = f2;
                this.IIIIlIllIlIIlIIlIllIlIlll = f;
                this.lllllIllllIIIIllIIlIlIlII = ((class_0161)this.IlIIIlIIIIllIIIllIIIIIIll).lllllIllllIIIIllIIlIlIlII;
            }
        }
    }

    @Override
    public void llIlllIIllIlllIlIlIlIIIll() {
        this.llllIlIIIIIIIIIlllIIlIIIl = 1.62f;
        this.IlIIIIIllllllIIlllIllllll(0.6f, 1.8f);
        super.llIlllIIllIlllIlIlIlIIIll();
        this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl());
        this.lIlIIIllIIllIIlIllllllIll = 0;
    }

    @Override
    protected void llIIlIlIlllIIllIlIlllIllI() {
        super.llIIlIlIlllIIllIlIlllIllI();
        this.lIlIlllIllllIIlllIlllIIIl();
    }

    @Override
    public void d_() {
        if (this.lIIlIlllIIlllIIlllIIlIlII > 0) {
            --this.lIIlIlllIIlllIIlllIIlIlII;
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIIIllIIIIlllIlIIllIIll && this.lllIIIlllIlllIIlIllllIIlI() < this.IIllllIIlIlIlIlllIIIllIIl() && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("naturalRegeneration") && this.IlllIIIllllIIllIllIlIIlIl % 20 * 12 == 0) {
            this.IlIllllllIIlIIllllIIlIIIl(1.0f);
        }
        this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII();
        this.lIIlIIIlIlIIlllIlIllIllIl = this.lIIlIlIIIIIllIIIIllIlIlII;
        super.d_();
        class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_16852.lllIIIllIIIIlllIlIIllIIll(this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl());
        }
        this.llllIIllllIllIlllllIIlIlI = this.lllIIIlIllIlllIlIIllIllIl;
        if (this.IlIIIIIllIlllIIIIlIIIllIl()) {
            this.llllIIllllIllIlllllIIlIlI = (float)((double)this.llllIIllllIllIlllllIIlIlI + (double)this.lllIIIlIllIlllIlIIllIllIl * 0.3);
        }
        this.IIIllIllIIlIlIlIlIllllIIl((float)class_16852.IlIIIIIllllllIIlllIllllll());
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
        float f2 = (float)Math.atan(-this.IIlIIlIlIlIllIIlIlIIIIlll * (double)0.2f) * 15.0f;
        if (f > 0.1f) {
            f = 0.1f;
        }
        if (!this.llllllIlIllllIlIlIlIIIIlI || this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            f = 0.0f;
        }
        if (this.llllllIlIllllIlIlIlIIIIlI || this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            f2 = 0.0f;
        }
        this.lIIlIlIIIIIllIIIIllIlIlII += (f - this.lIIlIlIIIIIllIIIIllIlIlII) * 0.4f;
        this.llllIIIlIlIlIlIIlIIIIIlIl += (f2 - this.llllIIIlIlIlIlIIlIIIIIlIl) * 0.8f;
        if (this.lllIIIlllIlllIIlIllllIIlI() > 0.0f) {
            class_1974 class_19742 = null;
            class_19742 = this.IlIIIlIIIIllIIIllIIIIIIll != null && !this.IlIIIlIIIIllIIIllIIIIIIll.IllllIIIIlIIlIIIIlllIIIIl ? this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(this.IlIIIlIIIIllIIIllIIIIIIll.IIllIllIIllIIlllIIIlIlllI).lllIlIIlIIIlIlIIIllIlllIl(1.0, 0.0, 1.0) : this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(1.0, 0.5, 1.0);
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, class_19742);
            if (list != null) {
                for (int i = 0; i < list.size(); ++i) {
                    class_1521 class_15212 = (class_1521)list.get(i);
                    if (class_15212.IllllIIIIlIIlIIIIlllIIIIl) continue;
                    this.IlIlIIlllIIlIllIIIlllllIl(class_15212);
                }
            }
        }
    }

    private void IlIlIIlllIIlIllIIIlllllIl(class_1521 class_15212) {
        class_15212.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int IIIIIlllIIllllIlllIlllIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(18);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, n);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = this.IIIIIlllIIllllIlllIlllIIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, n2 + n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582) {
        super.lllIIIllIIIIlllIlIIllIIll(class_00582);
        this.IlIIIIIllllllIIlllIllllll(0.2f, 0.2f);
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.1f;
        if (this.llllIIIIlIIIlIIIIIIlIllll().equals("Notch")) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.IlIIIIIllllllIIlllIllllll, 1), true, false);
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("keepInventory")) {
            this.lllIIlIIIllllllIIIIlIlIlI.IIIllIIlIIIIIIlIlIIllIIlI();
        }
        if (class_00582 != null) {
            this.IIIIIIIIlIllIIllIIlllIllI = -MathHelper.lllIlIIlIIIlIlIIIllIlllIl((this.IlIIlIIlllllIlIIlIlIlIlIl + this.IIIIlIllIlIIlIIlIllIlIlll) * (float)Math.PI / 180.0f) * 0.1f;
            this.llIIIlllIlllIlIllIIIIllIl = -MathHelper.lllIIIllIIIIlllIlIIllIIll((this.IlIIlIIlllllIlIIlIlIlIlIl + this.IIIIlIllIlIIlIIlIllIlIlll) * (float)Math.PI / 180.0f) * 0.1f;
        } else {
            this.llIIIlllIlllIlIllIIIIllIl = 0.0;
            this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        }
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.1f;
        this.lllIIIllIIIIlllIlIIllIIll(StatList.IIlllIlIlllIllIIIlllIIlIl, 1);
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "game.player.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "game.player.die";
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        Collection collection = this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(IScoreObjectiveCriteria.IlIIIIIllllllIIlllIllllll);
        if (class_15212 instanceof class_0814) {
            this.lllIIIllIIIIlllIlIIllIIll(StatList.llIllllIlIllIIIlIllIIlIlI, 1);
            collection.addAll(this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(IScoreObjectiveCriteria.lIlllIlllIIIIlIIlllIllIII));
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(StatList.lIlIllIIlIIlIIlIIlIIlIIll, 1);
        }
        for (class_0693 class_06932 : collection) {
            class_0678 class_06782 = this.lIlIlIIllIlIIIIIlIIlllIlI().lllIIIllIIIIlllIlIIllIIll(this.llllIIIIlIIIlIIIIIIlIllll(), class_06932);
            class_06782.lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public class_1781 lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, bl && this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll() != null ? this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl : 1), false, true);
    }

    public class_1781 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, boolean bl) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_08972, false, false);
    }

    public class_1781 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, boolean bl, boolean bl2) {
        if (class_08972 == null) {
            return null;
        }
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            return null;
        }
        class_1781 class_17812 = new class_1781(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI - (double)0.3f + (double)this.llIIllIllIlIIlIIllIllllll(), this.IllIIIIllIIllIllIlllIlIIl, class_08972);
        class_17812.lllIlIIlIIIlIlIIIllIlllIl = 40;
        if (bl2) {
            class_17812.lllIlIIlIIIlIlIIIllIlllIl(this.llllIIIIlIIIlIIIIIIlIllll());
        }
        float f = 0.1f;
        if (bl) {
            float f2 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.5f;
            float f3 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * (float)Math.PI * 2.0f;
            class_17812.IIIIIIIIlIllIIllIIlllIllI = -MathHelper.lllIIIllIIIIlllIlIIllIIll(f3) * f2;
            class_17812.llIIIlllIlllIlIllIIIIllIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f3) * f2;
            class_17812.IIlIIlIlIlIllIIlIlIIIIlll = 0.2f;
        } else {
            f = 0.3f;
            class_17812.IIIIIIIIlIllIIllIIlllIllI = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f;
            class_17812.llIIIlllIlllIlIllIIIIllIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f;
            class_17812.IIlIIlIlIlIllIIlIlIIIIlll = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f + 0.1f;
            f = 0.02f;
            float f4 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * (float)Math.PI * 2.0f;
            class_17812.IIIIIIIIlIllIIllIIlllIllI += Math.cos(f4) * (double)(f *= this.IlllIIlllllllIIllIlIllllI.nextFloat());
            class_17812.IIlIIlIlIlIllIIlIlIIIIlll += (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.1f);
            class_17812.llIIIlllIlllIlIllIIIIllIl += Math.sin(f4) * (double)f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_17812);
        this.lllIIIllIIIIlllIlIIllIIll(StatList.lIIlIIIIIlIlllIlIIlIlIlll, 1);
        return class_17812;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1781 class_17812) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_17812);
    }

    public float lllIIIllIIIIlllIlIIllIIll(Block class_05492, boolean bl) {
        float f = this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_05492);
        if (f > 1.0f) {
            int n = class_1250.IlIllllllIIlIIllllIIlIIIl(this);
            ItemStack class_08972 = this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
            if (n > 0 && class_08972 != null) {
                float f2 = n * n + 1;
                f = !class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_05492) && f <= 1.0f ? (f += f2 * 0.08f) : (f += f2);
            }
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0700.IlIIIIIllllllIIlllIllllll)) {
            f *= 1.0f + (float)(this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.IlIIIIIllllllIIlllIllllll).IlIllllllIIlIIllllIIlIIIl() + 1) * 0.2f;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_0700.lIllllIIlIIIlIllllllIIIll)) {
            f *= 1.0f - (float)(this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.lIllllIIlIIIlIllllllIIIll).IlIllllllIIlIIllllIIlIIIl() + 1) * 0.2f;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl) && !class_1250.IIIllIllIIlIlIlIlIllllIIl(this)) {
            f /= 5.0f;
        }
        if (!this.llllllIlIllllIlIlIlIIIIlI) {
            f /= 5.0f;
        }
        return f;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        return this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_05492);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIllIIlIIIlllIlllIIlIIlI = class_0814.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Inventory", 10);
        this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_21452);
        this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("SelectedItemSlot");
        this.IlIlIIllIlIlIIIIIlIlllllI = class_07752.lllIIlIIIllllllIIIIlIlIlI("Sleeping");
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.IlIIIIIllllllIIlllIllllll("SleepTimer");
        this.llIlllllIIlIIlIIllllIllll = class_07752.IllIIlllllllIIlIIlIIIIlIl("XpP");
        this.lllIlllllIllIlIIlIlIIIlll = class_07752.lIllllIIlIIIlIllllllIIIll("XpLevel");
        this.llllIllIIIlIllIllllllIlIl = class_07752.lIllllIIlIIIlIllllllIIIll("XpTotal");
        this.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("Score"));
        if (this.IlIlIIllIlIlIIIIIlIlllllI) {
            this.lIlIIIlIlIllIlIlIIIlIlIII = new class_2208(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
            this.lllIIIllIIIIlllIlIIllIIll(true, true, false);
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("SpawnX", 99) && class_07752.lllIlIIlIIIlIlIIIllIlllIl("SpawnY", 99) && class_07752.lllIlIIlIIIlIlIIIllIlllIl("SpawnZ", 99)) {
            this.IlIIIIIllllllIIlllIllllll = new class_2208(class_07752.lIllllIIlIIIlIllllllIIIll("SpawnX"), class_07752.lIllllIIlIIIlIllllllIIIll("SpawnY"), class_07752.lIllllIIlIIIlIllllllIIIll("SpawnZ"));
            this.lIllllIIlIIIlIllllllIIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("SpawnForced");
        }
        this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("EnderItems", 9)) {
            class_2145 class_21453 = class_07752.IlIllllllIIlIIllllIIlIIIl("EnderItems", 10);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_21453);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Inventory", this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new class_2145()));
        class_07752.lllIIIllIIIIlllIlIIllIIll("SelectedItemSlot", this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Sleeping", this.IlIlIIllIlIlIIIIIlIlllllI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("SleepTimer", (short)this.lIlllIlllIIIIlIIlllIllIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("XpP", this.llIlllllIIlIIlIIllllIllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("XpLevel", this.lllIlllllIllIlIIlIlIIIlll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("XpTotal", this.llllIllIIIlIllIllllllIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Score", this.IIIIIlllIIllllIlllIlllIIl());
        if (this.IlIIIIIllllllIIlllIllllll != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnX", this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll);
            class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnY", this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl);
            class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnZ", this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl);
            class_07752.lllIIIllIIIIlllIlIIllIIll("SpawnForced", this.lIllllIIlIIIlIllllllIIIll);
        }
        this.lllIIIlllIlllIIlIllllIIlI.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("EnderItems", this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0879 class_08792) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2252 class_22522) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1627 class_16272, class_0850 class_08502) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, String string) {
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
    }

    @Override
    public float llIIllIllIlIIlIIllIllllll() {
        return 0.12f;
    }

    protected void e_() {
        this.llllIlIIIIIIIIIlllIIlIIIl = 1.62f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll && !class_00582.IIIllIIlIIIIIIlIlIIllIIlI()) {
            return false;
        }
        this.lIIlIlllIIlIIIIlIlIIIIlll = 0;
        if (this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            return false;
        }
        if (this.IIIIIllIIlIlIlIIlIlIlIllI() && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(true, true, false);
        }
        if (class_00582.IlIlIIlllIIlIllIIIlllllIl()) {
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIIIllIIIIlllIlIIllIIll) {
                f = 0.0f;
            }
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lllIlIIlIIIlIlIIIllIlllIl) {
                f = f / 2.0f + 1.0f;
            }
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII) {
                f = f * 3.0f / 2.0f;
            }
        }
        if (f == 0.0f) {
            return false;
        }
        class_1521 class_15212 = class_00582.IllIIIllIIIIlIlIlIllIIlll();
        if (class_15212 instanceof class_0369 && ((class_0369)class_15212).IlIllllllIIlIIllllIIlIIIl != null) {
            class_15212 = ((class_0369)class_15212).IlIllllllIIlIIllllIIlIIIl;
        }
        this.lllIIIllIIIIlllIlIIllIIll(StatList.IlIIIlIIIIllIIIllIIIIIIll, Math.round(f * 10.0f));
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        class_0827 class_08272 = this.llllIllIIIlIllIllllllIlIl();
        class_0827 class_08273 = class_08142.llllIllIIIlIllIllllllIlIl();
        return class_08272 == null ? true : (!class_08272.lllIIIllIIIIlllIlIIllIIll(class_08273) ? true : class_08272.lIllllIIlIIIlIllllllIIIll());
    }

    @Override
    protected void lIIIIlIlIIlllllIIllIIlIII(float f) {
        this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(f);
    }

    @Override
    public int lIIlIlIIIIIllIIIIllIlIlII() {
        return this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll();
    }

    public float llllIIllllIllIlllllIIlIlI() {
        int n = 0;
        for (ItemStack class_08972 : this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_08972 == null) continue;
            ++n;
        }
        return (float)n / (float)this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl.length;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0058 class_00582, float f) {
        if (!this.lIIllIIlIIIlllIlllIIlIIlI()) {
            if (!class_00582.IlIIIIIllllllIIlllIllllll() && this.lIIllIlIllIlIlIIlIlIIIIll() && f > 0.0f) {
                f = (1.0f + f) * 0.5f;
            }
            f = this.IlIllllllIIlIIllllIIlIIIl(class_00582, f);
            float f2 = f = this.lIlllIlllIIIIlIIlllIllIII(class_00582, f);
            f = Math.max(f - this.lllIlllllIllIlIIlIlIIIlll(), 0.0f);
            this.IlIlllIIIIIIlIIllIIllIlll(this.lllIlllllIllIlIIlIlIIIlll() - (f2 - f));
            if (f != 0.0f) {
                this.IlIIIIIllllllIIlllIllllll(class_00582.lIllllIIlIIIlIllllllIIIll());
                float f3 = this.lllIIIlllIlllIIlIllllIIlI();
                this.IllIIIllIIIIlIlIlIllIIlll(this.lllIIIlllIlllIIlIllllIIlI() - f);
                this.lIIIIlIIIIllIlIIllllIlIII().lllIIIllIIIIlllIlIIllIIll(class_00582, f3, f);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1587 class_15872) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1646 class_16462) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0484 class_04842) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0647 class_06472) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0396 class_03962) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1510 class_15102, String string) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
    }

    public boolean IlIlIIlIlIllIIlIlIIllIIIl(class_1521 class_15212) {
        ItemStack class_08972;
        ItemStack class_08973 = this.IllIlIlIIIlIllIlIlIIlllII();
        ItemStack class_08974 = class_08972 = class_08973 != null ? class_08973.llIIlllIllIllllIIIlIIIIII() : null;
        if (!class_15212.b_(this)) {
            if (class_08973 != null && class_15212 instanceof class_1965) {
                if (this.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    class_08973 = class_08972;
                }
                if (class_08973.lllIIIllIIIIlllIlIIllIIll(this, (class_1965)class_15212)) {
                    if (class_08973.lllIlIIlIIIlIlIIIllIlllIl <= 0 && !this.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIIllIlIlIlIIIllIlIlIllI();
                    }
                    return true;
                }
            }
            return false;
        }
        if (class_08973 != null && class_08973 == this.IllIlIlIIIlIllIlIlIIlllII()) {
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl <= 0 && !this.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                this.lIIIllIlIlIlIIIllIlIlIllI();
            } else if (class_08973.lllIlIIlIIIlIlIIIllIlllIl < class_08972.lllIlIIlIIIlIlIIIllIlllIl && this.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                class_08973.lllIlIIlIIIlIlIIIllIlllIl = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
        }
        return true;
    }

    public ItemStack IllIlIlIIIlIllIlIlIIlllII() {
        return this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lIIIllIlIlIlIIIllIlIlIllI() {
        this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
    }

    @Override
    public double IIIIlIllIlIIIIIllllIIlllI() {
        return this.llllIlIIIIIIIIIlllIIlIIIl - 0.5f;
    }

    public void lllllIlllIIllIlIIlIIIllII(class_1521 class_15212) {
        if (class_15212.m_() && !class_15212.IIIllIllIIlIlIlIlIllllIIl(this)) {
            float f = (float)this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).IlIIIIIllllllIIlllIllllll();
            int n = 0;
            float f2 = 0.0f;
            if (class_15212 instanceof class_1965) {
                f2 = class_1250.lllIIIllIIIIlllIlIIllIIll((class_1965)this, (class_1965)class_15212);
                n += class_1250.lllIlIIlIIIlIlIIIllIlllIl((class_1965)this, (class_1965)class_15212);
            }
            if (this.IlIIIIIllIlllIIIIlIIIllIl()) {
                ++n;
            }
            if (f > 0.0f || f2 > 0.0f) {
                boolean bl;
                boolean bl2;
                boolean bl3 = bl2 = this.lIIIllIIIIIllllIlIlIllIll > 0.0f && !this.llllllIlIllllIlIlIlIIIIlI && !this.h_() && !this.llIlllIlIIllIlIIIIllIIlIl() && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII) && this.IlIIIlIIIIllIIIllIIIIIIll == null && class_15212 instanceof class_1965;
                if (bl2 && f > 0.0f) {
                    f *= 1.5f;
                }
                f += f2;
                boolean bl4 = false;
                int n2 = class_1250.lllIIIllIIIIlllIlIIllIIll(this);
                if (class_15212 instanceof class_1965 && n2 > 0 && !class_15212.llIIIIIlIIlIIIIllIIIlIIII()) {
                    bl4 = true;
                    class_15212.IlIIIIIllllllIIlllIllllll(1);
                }
                if (bl = class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), f)) {
                    class_0859 class_08592;
                    if (n > 0) {
                        class_15212.IllIIlllllllIIlIIlIIIIlIl(-MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f) * (float)n * 0.5f, 0.1, MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f) * (float)n * 0.5f);
                        this.IIIIIIIIlIllIIllIIlllIllI *= 0.6;
                        this.llIIIlllIlllIlIllIIIIllIl *= 0.6;
                        this.lllIlIIlIIIlIlIIIllIlllIl(false);
                    }
                    if (bl2) {
                        this.lllIlIIlIIIlIlIIIllIlllIl(class_15212);
                    }
                    if (f2 > 0.0f) {
                        this.IlIllllllIIlIIllllIIlIIIl(class_15212);
                    }
                    if (f >= 18.0f) {
                        this.lllIIIllIIIIlllIlIIllIIll(AchievementList.overkill);
                    }
                    this.lIIIIlIlIIlllllIIllIIlIII(class_15212);
                    if (class_15212 instanceof class_1965) {
                        class_1250.lllIIIllIIIIlllIlIIllIIll((class_1965)class_15212, (class_1521)this);
                    }
                    class_1250.lllIlIIlIIIlIlIIIllIlllIl((class_1965)this, class_15212);
                    ItemStack class_08972 = this.IllIlIlIIIlIllIlIlIIlllII();
                    class_1521 class_15213 = class_15212;
                    if (class_15212 instanceof class_1172 && (class_08592 = ((class_1172)class_15212).lllIIIllIIIIlllIlIIllIIll) != null && class_08592 instanceof class_1965) {
                        class_15213 = (class_1965)((Object)class_08592);
                    }
                    if (class_08972 != null && class_15213 instanceof class_1965) {
                        class_08972.lllIIIllIIIIlllIlIIllIIll((class_1965)class_15213, this);
                        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                            this.lIIIllIlIlIlIIIllIlIlIllI();
                        }
                    }
                    if (class_15212 instanceof class_1965) {
                        this.lllIIIllIIIIlllIlIIllIIll(StatList.lIlIlIIlIIIIlIIIIIlllIIII, Math.round(f * 10.0f));
                        if (n2 > 0) {
                            class_15212.IlIIIIIllllllIIlllIllllll(n2 * 4);
                        }
                    }
                    this.IlIIIIIllllllIIlllIllllll(0.3f);
                } else if (bl4) {
                    class_15212.IllllIIIIlIIlIIIIlllIIIIl();
                }
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII() {
    }

    @Override
    public void IIIIlIIlIIIllIIIIllIIIlII() {
        super.IIIIlIIlIIIllIIIIllIIIlII();
        this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl(this);
        if (this.lIIIlIllllIlllIIIIIllIIIl != null) {
            this.lIIIlIllllIlllIIIIIllIIIl.lllIlIIlIIIlIlIIIllIlllIl(this);
        }
    }

    @Override
    public boolean IlllIIIllllIIllIllIlIIlIl() {
        return !this.IlIlIIllIlIlIIIIIlIlllllI && super.IlllIIIllllIIllIllIlIIlIl();
    }

    public GameProfile lIIlIlllIIlIIIIlIlIIIIlll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public class_0690 IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (this.IIIIIllIIlIlIlIIlIlIlIllI() || !this.IlllIIlllllllIIllIlIllllI()) {
                return class_0690.IlIIIIIllllllIIlllIllllll;
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII()) {
                return class_0690.lllIlIIlIIIlIlIIIllIlllIl;
            }
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII()) {
                return class_0690.IlIllllllIIlIIllllIIlIIIl;
            }
            if (Math.abs(this.IlIIlllllIIlIlIlllllIllll - (double)n) > 3.0 || Math.abs(this.llIIlIlIlllIIllIlIlllIllI - (double)n2) > 2.0 || Math.abs(this.IllIIIIllIIllIllIlllIlIIl - (double)n3) > 3.0) {
                return class_0690.lIlllIlllIIIIlIIlllIllIII;
            }
            double d = 8.0;
            double d2 = 5.0;
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1168.class, class_1974.lllIIIllIIIIlllIlIIllIIll((double)n - d, (double)n2 - d2, (double)n3 - d, (double)n + d, (double)n2 + d2, (double)n3 + d));
            if (!list.isEmpty()) {
                return class_0690.lIllllIIlIIIlIllllllIIIll;
            }
        }
        if (this.lIlIlIIllIIIlllIllIIlIllI()) {
            this.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
        }
        this.IlIIIIIllllllIIlllIllllll(0.2f, 0.2f);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.2f;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll(n, n2, n3)) {
            int n4 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            int n5 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n4);
            float f = 0.5f;
            float f2 = 0.5f;
            switch (n5) {
                case 0: {
                    f2 = 0.9f;
                    break;
                }
                case 1: {
                    f = 0.1f;
                    break;
                }
                case 2: {
                    f2 = 0.1f;
                    break;
                }
                case 3: {
                    f = 0.9f;
                }
            }
            this.IIlllIlIlllIllIIIlllIIlIl(n5);
            this.IlIllllllIIlIIllllIIlIIIl((float)n + f, (float)n2 + 0.9375f, (float)n3 + f2);
        } else {
            this.IlIllllllIIlIIllllIIlIIIl((float)n + 0.5f, (float)n2 + 0.9375f, (float)n3 + 0.5f);
        }
        this.IlIlIIllIlIlIIIIIlIlllllI = true;
        this.lIlllIlllIIIIlIIlllIllIII = 0;
        this.lIlIIIlIlIllIlIlIIIlIlIII = new class_2208(n, n2, n3);
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.llIIlIlIlllIIllIlIlllIllI();
        }
        return class_0690.lllIIIllIIIIlllIlIIllIIll;
    }

    private void IIlllIlIlllIllIIIlllIIlIl(int n) {
        this.lIllIIlIlllIllIlIlIlIllII = 0.0f;
        this.lIlIIlIIlIIIIllIIlIllIlll = 0.0f;
        switch (n) {
            case 0: {
                this.lIlIIlIIlIIIIllIIlIllIlll = -1.8f;
                break;
            }
            case 1: {
                this.lIllIIlIlllIllIlIlIlIllII = 1.8f;
                break;
            }
            case 2: {
                this.lIlIIlIIlIIIIllIIlIllIlll = 1.8f;
                break;
            }
            case 3: {
                this.lIllIIlIlllIllIlIlIlIllII = -1.8f;
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2, boolean bl3) {
        this.IlIIIIIllllllIIlllIllllll(0.6f, 1.8f);
        this.e_();
        class_2208 class_22082 = this.lIlIIIlIlIllIlIlIIIlIlIII;
        class_2208 class_22083 = this.lIlIIIlIlIllIlIlIIIlIlIII;
        if (class_22082 != null && this.lIlIllIIlIIlIIlIIlIIlIIll.a_(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl) == Blocks.IllIIIIllIIllIllIlllIlIIl) {
            class_0736.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, false);
            class_22083 = class_0736.IIIllIIlIIIIIIlIlIIllIIlI(this.lIlIllIIlIIlIIlIIlIIlIIll, class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, 0);
            if (class_22083 == null) {
                class_22083 = new class_2208(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl + 1, class_22082.IlIllllllIIlIIllllIIlIIIl);
            }
            this.IlIllllllIIlIIllllIIlIIIl((float)class_22083.lllIIIllIIIIlllIlIIllIIll + 0.5f, (float)class_22083.lllIlIIlIIIlIlIIIllIlllIl + this.llllIlIIIIIIIIIlllIIlIIIl + 0.1f, (float)class_22083.IlIllllllIIlIIllllIIlIIIl + 0.5f);
        }
        this.IlIlIIllIlIlIIIIIlIlllllI = false;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && bl2) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.llIIlIlIlllIIllIlIlllIllI();
        }
        this.lIlllIlllIIIIlIIlllIllIII = bl ? 0 : 100;
        if (bl3) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlIIIlIlIllIlIlIIIlIlIII, false);
        }
    }

    private boolean IlIIIIIllllllIIlllIllllll() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.lIlIIIlIlIllIlIlIIIlIlIII.lllIIIllIIIIlllIlIIllIIll, this.lIlIIIlIlIllIlIlIIIlIlIII.lllIlIIlIIIlIlIIIllIlllIl, this.lIlIIIlIlIllIlIlIIIlIlIII.IlIllllllIIlIIllllIIlIIIl) == Blocks.IllIIIIllIIllIllIlllIlIIl;
    }

    public static class_2208 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2208 class_22082, boolean bl) {
        class_1848 class_18482 = class_13342.llIIlIllIllllIlIIIIlIIlll();
        class_18482.IlIllllllIIlIIllllIIlIIIl(class_22082.lllIIIllIIIIlllIlIIllIIll - 3 >> 4, class_22082.IlIllllllIIlIIllllIIlIIIl - 3 >> 4);
        class_18482.IlIllllllIIlIIllllIIlIIIl(class_22082.lllIIIllIIIIlllIlIIllIIll + 3 >> 4, class_22082.IlIllllllIIlIIllllIIlIIIl - 3 >> 4);
        class_18482.IlIllllllIIlIIllllIIlIIIl(class_22082.lllIIIllIIIIlllIlIIllIIll - 3 >> 4, class_22082.IlIllllllIIlIIllllIIlIIIl + 3 >> 4);
        class_18482.IlIllllllIIlIIllllIIlIIIl(class_22082.lllIIIllIIIIlllIlIIllIIll + 3 >> 4, class_22082.IlIllllllIIlIIllllIIlIIIl + 3 >> 4);
        if (class_13342.a_(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl) == Blocks.IllIIIIllIIllIllIlllIlIIl) {
            class_2208 class_22083 = class_0736.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl, 0);
            return class_22083;
        }
        class_1855 class_18552 = class_13342.a_(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl).lIllllIIlIIIlIllllllIIIll();
        class_1855 class_18553 = class_13342.a_(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl + 1, class_22082.IlIllllllIIlIIllllIIlIIIl).lIllllIIlIIIlIllllllIIIll();
        boolean bl2 = !class_18552.lllIlIIlIIIlIlIIIllIlllIl() && !class_18552.lllIIIllIIIIlllIlIIllIIll();
        boolean bl3 = !class_18553.lllIlIIlIIIlIlIIIllIlllIl() && !class_18553.lllIIIllIIIIlllIlIIllIIll();
        return bl && bl2 && bl3 ? class_22082 : null;
    }

    public float IIIlIIllIIlIlIIlIIllIIIIl() {
        if (this.lIlIIIlIlIllIlIlIIIlIlIII != null) {
            int n = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(this.lIlIIIlIlIllIlIlIIIlIlIII.lllIIIllIIIIlllIlIIllIIll, this.lIlIIIlIlIllIlIlIIIlIlIII.lllIlIIlIIIlIlIIIllIlllIl, this.lIlIIIlIlIllIlIlIIIlIlIII.IlIllllllIIlIIllllIIlIIIl);
            int n2 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n);
            switch (n2) {
                case 0: {
                    return 90.0f;
                }
                case 1: {
                    return 0.0f;
                }
                case 2: {
                    return 270.0f;
                }
                case 3: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    @Override
    public boolean IIIIIllIIlIlIlIIlIlIlIllI() {
        return this.IlIlIIllIlIlIIIIIlIlllllI;
    }

    public boolean IIIIlIIIllIIIlIIlIIIIIlll() {
        return this.IlIlIIllIlIlIIIIIlIlllllI && this.lIlllIlllIIIIlIIlllIllIII >= 100;
    }

    public int lIIIIIlIllIllIlIlIIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    protected boolean lIIIIlIlIIlllllIIllIIlIII(int n) {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 1 << n) != 0;
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 1 << n));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & ~(1 << n)));
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(IChatComponent class_22552) {
    }

    public class_2208 lIIIlllIlIIIlIllIIIlIllll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean lllIIIlIllIlllIlIIllIllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2208 class_22082, boolean bl) {
        if (class_22082 != null) {
            this.IlIIIIIllllllIIlllIllllll = new class_2208(class_22082);
            this.lIllllIIlIIIlIllllllIIIll = bl;
        } else {
            this.IlIIIIIllllllIIlllIllllll = null;
            this.lIllllIIlIIIlIllllllIIIll = false;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(StatBase class_03192) {
        this.lllIIIllIIIIlllIlIIllIIll(class_03192, 1);
    }

    public void lllIIIllIIIIlllIlIIllIIll(StatBase class_03192, int n) {
    }

    @Override
    public void f_() {
        super.f_();
        this.lllIIIllIIIIlllIlIIllIIll(StatList.IlIlIIlllIIlIllIIIlllllIl, 1);
        if (this.IlIIIIIllIlllIIIIlIIIllIl()) {
            this.IlIIIIIllllllIIlllIllllll(0.8f);
        } else {
            this.IlIIIIIllllllIIlllIllllll(0.2f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        double d = this.IlIIlllllIIlIlIlllllIllll;
        double d2 = this.llIIlIlIlllIIllIlIlllIllI;
        double d3 = this.IllIIIIllIIllIllIlllIlIIl;
        if (this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl && this.IlIIIlIIIIllIIIllIIIIIIll == null) {
            double d4 = this.IIlIIlIlIlIllIIlIlIIIIlll;
            float f3 = this.llllIIllllIllIlllllIIlIlI;
            this.llllIIllllIllIlllllIIlIlI = this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll();
            super.lllIIIllIIIIlllIlIIllIIll(f, f2);
            this.IIlIIlIlIlIllIIlIlIIIIlll = d4 * 0.6;
            this.llllIIllllIllIlllllIIlIlI = f3;
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(f, f2);
        }
        this.lIIIIlIlIIlllllIIllIIlIII(this.IlIIlllllIIlIlIlllllIllll - d, this.llIIlIlIlllIIllIlIlllIllI - d2, this.IllIIIIllIIllIllIlllIlIIl - d3);
    }

    @Override
    public float lIllIIlIlllIllIlIlIlIllII() {
        return (float)this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).IlIIIIIllllllIIlllIllllll();
    }

    public void lIIIIlIlIIlllllIIllIIlIII(double d, double d2, double d3) {
        if (this.IlIIIlIIIIllIIIllIIIIIIll == null) {
            if (this.lllIIIllIIIIlllIlIIllIIll(class_1855.IllIIlllllllIIlIIlIIIIlIl)) {
                int n = Math.round(MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2 + d3 * d3) * 100.0f);
                if (n > 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(StatList.llIIllIllIlIIlIIllIllllll, n);
                    this.IlIIIIIllllllIIlllIllllll(0.015f * (float)n * 0.01f);
                }
            } else if (this.llIlllIlIIllIlIIIIllIIlIl()) {
                int n = Math.round(MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3) * 100.0f);
                if (n > 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(StatList.IIIllIllIIlIlIlIlIllllIIl, n);
                    this.IlIIIIIllllllIIlllIllllll(0.015f * (float)n * 0.01f);
                }
            } else if (this.h_()) {
                if (d2 > 0.0) {
                    this.lllIIIllIIIIlllIlIIllIIll(StatList.lIIIIlIlIIlllllIIllIIlIII, (int)Math.round(d2 * 100.0));
                }
            } else if (this.llllllIlIllllIlIlIlIIIIlI) {
                int n = Math.round(MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3) * 100.0f);
                if (n > 0) {
                    this.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIlllllllIIlIIlIIIIlIl, n);
                    if (this.IlIIIIIllIlllIIIIlIIIllIl()) {
                        this.IlIIIIIllllllIIlllIllllll(0.099999994f * (float)n * 0.01f);
                    } else {
                        this.IlIIIIIllllllIIlllIllllll(0.01f * (float)n * 0.01f);
                    }
                }
            } else {
                int n = Math.round(MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3) * 100.0f);
                if (n > 25) {
                    this.lllIIIllIIIIlllIlIIllIIll(StatList.llIIlllIllIllllIIIlIIIIII, n);
                }
            }
        }
    }

    private void llIIlllIllIllllIIIlIIIIII(double d, double d2, double d3) {
        int n;
        if (this.IlIIIlIIIIllIIIllIIIIIIll != null && (n = Math.round(MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2 + d3 * d3) * 100.0f)) > 0) {
            if (this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1860) {
                this.lllIIIllIIIIlllIlIIllIIll(StatList.lllIIlIIIllllllIIIIlIlIlI, n);
                if (this.IIIllIIlIIIIIIlIlIIllIIlI == null) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI = new class_2208(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
                } else if ((double)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)) >= 1000000.0) {
                    this.lllIIIllIIIIlllIlIIllIIll(AchievementList.onARail, 1);
                }
            } else if (this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_2263) {
                this.lllIIIllIIIIlllIlIIllIIll(StatList.IlIlllIIIIIIlIIllIIllIlll, n);
            } else if (this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_0161) {
                this.lllIIIllIIIIlllIlIIllIIll(StatList.IlIlIIlIlIllIIlIlIIllIIIl, n);
            } else if (this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1627) {
                this.lllIIIllIIIIlllIlIIllIIll(StatList.lllllIlllIIllIlIIlIIIllII, n);
            }
        }
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(float f) {
        if (!this.lIIlIlIlIlIllIIlIIllllIll.IlIllllllIIlIIllllIIlIIIl) {
            if (f >= 2.0f) {
                this.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIllIIIIlIlIlIllIIlll, (int)Math.round((double)f * 100.0));
            }
            super.lIllllIIlIIIlIllllllIIIll(f);
        }
    }

    @Override
    protected String lllllIlllIIllIlIIlIIIllII(int n) {
        return n > 4 ? "game.player.hurt.fall.big" : "game.player.hurt.fall.small";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        int n;
        class_1128 class_11282;
        if (class_19652 instanceof class_1310) {
            this.lllIIIllIIIIlllIlIIllIIll(AchievementList.killEnemy);
        }
        if ((class_11282 = (class_1128)class_0054.lllIIIllIIIIlllIlIIllIIll.get(n = class_0054.lllIIIllIIIIlllIlIIllIIll(class_19652))) != null) {
            this.lllIIIllIIIIlllIlIIllIIll(class_11282.lIlllIlllIIIIlIIlllIllIII, 1);
        }
    }

    @Override
    public void IlIIIlIIlllllIIIllIlIlIll() {
        if (!this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
            super.IlIIIlIIlllllIIIllIlIlIll();
        }
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        class_2102 class_21022 = super.lllIIIllIIIIlllIlIIllIIll(class_08972, n);
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.llIllllIIIIIlIIlIlllIIlll && this.IIlIlIIIIlIlllIIlIIlIIIII != null) {
            class_21022 = Items.llIllllIIIIIlIIlIlllIIlll.IlIIIlIIIIllIIIllIIIIIIll();
        } else {
            if (class_08972.lllIIIllIIIIlllIlIIllIIll().IlIlIIlIlIllIIlIlIIllIIIl()) {
                return class_08972.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(class_08972.IllIIIllIIIIlIlIlIllIIlll(), n);
            }
            if (this.IllIIlllllllIIlIIlIIIIlIl != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bow) {
                int n2 = class_08972.lllIIlIIIllllllIIIIlIlIlI() - this.IIIllIllIIlIlIlIlIllllIIl;
                if (n2 >= 18) {
                    return Items.bow.lIllllIIlIIIlIllllllIIIll(2);
                }
                if (n2 > 13) {
                    return Items.bow.lIllllIIlIIIlIllllllIIIll(1);
                }
                if (n2 > 0) {
                    return Items.bow.lIllllIIlIIIlIllllllIIIll(0);
                }
            }
        }
        return class_21022;
    }

    public ItemStack lIIlIIIIIlIlllIlIIlIlIlll(int n) {
        return this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(n);
    }

    public void lIlIlIIlIIIIlIIIIIlllIIII(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        int n2 = Integer.MAX_VALUE - this.llllIllIIIlIllIllllllIlIl;
        if (n > n2) {
            n = n2;
        }
        this.llIlllllIIlIIlIIllllIllll += (float)n / (float)this.IIlIlIIIIlIlllIIlIIlIIIII();
        this.llllIllIIIlIllIllllllIlIl += n;
        while (this.llIlllllIIlIIlIIllllIllll >= 1.0f) {
            this.llIlllllIIlIIlIIllllIllll = (this.llIlllllIIlIIlIIllllIllll - 1.0f) * (float)this.IIlIlIIIIlIlllIIlIIlIIIII();
            this.IlIIIlIIIIllIIIllIIIIIIll(1);
            this.llIlllllIIlIIlIIllllIllll /= (float)this.IIlIlIIIIlIlllIIlIIlIIIII();
        }
    }

    public void IlIIIlIIIIllIIIllIIIIIIll(int n) {
        this.lllIlllllIllIlIIlIlIIIlll += n;
        if (this.lllIlllllIllIlIIlIlIIIlll < 0) {
            this.lllIlllllIllIlIIlIlIIIlll = 0;
            this.llIlllllIIlIIlIIllllIllll = 0.0f;
            this.llllIllIIIlIllIllllllIlIl = 0;
        }
        if (n > 0 && this.lllIlllllIllIlIIlIlIIIlll % 5 == 0 && (float)this.IllIIIllIIIIlIlIlIllIIlll < (float)this.IlllIIIllllIIllIllIlIIlIl - 100.0f) {
            float f = this.lllIlllllIllIlIIlIlIIIlll > 30 ? 1.0f : (float)this.lllIlllllIllIlIIlIlIIIlll / 30.0f;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, "random.levelup", f * 0.75f, 1.0f);
            this.IllIIIllIIIIlIlIlIllIIlll = this.IlllIIIllllIIllIllIlIIlIl;
        }
    }

    public int IIlIlIIIIlIlllIIlIIlIIIII() {
        return this.lllIlllllIllIlIIlIlIIIlll >= 30 ? 62 + (this.lllIlllllIllIlIIlIlIIIlll - 30) * 7 : (this.lllIlllllIllIlIIlIlIIIlll >= 15 ? 17 + (this.lllIlllllIllIlIIlIlIIIlll - 15) * 3 : 17);
    }

    public void IlIIIIIllllllIIlllIllllll(float f) {
        if (!this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll(f);
        }
    }

    public class_0955 lIllIIlllIIIlIlIIIlllIlIl() {
        return this.lllIIIlllIlllIIlIllllIIlI;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        return (bl || this.lllIIIlllIlllIIlIllllIIlI.IlIllllllIIlIIllllIIlIIIl()) && !this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.lllIIIlllIlllIIlIllllIIlI() > 0.0f && this.lllIIIlllIlllIIlIllllIIlI() < this.IIllllIIlIlIlIlllIIIllIIl();
    }

    public void IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972, int n) {
        if (class_08972 != this.IllIIlllllllIIlIIlIIIIlIl) {
            this.IllIIlllllllIIlIIlIIIIlIl = class_08972;
            this.IIIllIllIIlIlIlIlIllllIIl = n;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.lIllllIIlIIIlIllllllIIIll(true);
            }
        }
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        if (this.lIIlIlIlIlIllIIlIIllllIll.IlIIIIIllllllIIlllIllllll) {
            return true;
        }
        Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3);
        if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            ItemStack class_08972;
            if (class_05492.lIllllIIlIIIlIllllllIIIll().IlIlIIlIlIllIIlIlIIllIIIl()) {
                return true;
            }
            if (this.IllIlIlIIIlIllIlIlIIlllII() != null && ((class_08972 = this.IllIlIlIIIlIllIlIlIIlllII()).lllIlIIlIIIlIlIIIllIlllIl(class_05492) || class_08972.lllIIIllIIIIlllIlIIllIIll(class_05492) > 1.0f)) {
                return true;
            }
        }
        return false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, ItemStack class_08972) {
        return this.lIIlIlIlIlIllIIlIIllllIll.IlIIIIIllllllIIlllIllllll ? true : (class_08972 != null ? class_08972.lIlllIlllIlIIIIlllIlIlIIl() : false);
    }

    @Override
    protected int IlIIIIIllllllIIlllIllllll(class_0814 class_08142) {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("keepInventory")) {
            return 0;
        }
        int n = this.lllIlllllIllIlIIlIlIIIlll * 7;
        return n > 100 ? 100 : n;
    }

    @Override
    protected boolean llIllIlllIllIlIIIIlIIlIII() {
        return true;
    }

    @Override
    public boolean IIIlIllIlllIlIIIlIlIIllII() {
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, boolean bl) {
        if (bl) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_08142.lllIIlIIIllllllIIIIlIlIlI);
            this.IllIIIllIIIIlIlIlIllIIlll(class_08142.lllIIIlllIlllIIlIllllIIlI());
            this.lllIIIlllIlllIIlIllllIIlI = class_08142.lllIIIlllIlllIIlIllllIIlI;
            this.lllIlllllIllIlIIlIlIIIlll = class_08142.lllIlllllIllIlIIlIlIIIlll;
            this.llllIllIIIlIllIllllllIlIl = class_08142.llllIllIIIlIllIllllllIlIl;
            this.llIlllllIIlIIlIIllllIllll = class_08142.llIlllllIIlIIlIIllllIllll;
            this.lllIIIllIIIIlllIlIIllIIll(class_08142.IIIIIlllIIllllIlllIlllIIl());
            this.lIIIIllIIllIIIlIIIllIllII = class_08142.lIIIIllIIllIIIlIIIllIllII;
        } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("keepInventory")) {
            this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_08142.lllIIlIIIllllllIIIIlIlIlI);
            this.lllIlllllIllIlIIlIlIIIlll = class_08142.lllIlllllIllIlIIlIlIIIlll;
            this.llllIllIIIlIllIllllllIlIl = class_08142.llllIllIIIlIllIllllllIlIl;
            this.llIlllllIIlIIlIIllllIllll = class_08142.llIlllllIIlIIlIIllllIllll;
            this.lllIIIllIIIIlllIlIIllIIll(class_08142.IIIIIlllIIllllIlllIlllIIl());
        }
        this.lllIIIllIIIIlllIlIIllIIll = class_08142.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lIlIllIIlIIlIIlIIlIIlIIll() {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2243 class_22432) {
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII.getName();
    }

    @Override
    public class_1334 IIllIllIIllIIlllIIIlIlllI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    public class_0407 lllIIIIlIIllIIIlIllIlllII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public ItemStack IlIllllllIIlIIllllIIlIIIl(int n) {
        return n == 0 ? this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll() : this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl[n - 1];
    }

    @Override
    public ItemStack lIIIIlIlIlIIIlIIllIIlIlIl() {
        return this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
        this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl[n] = class_08972;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(class_0814 class_08142) {
        if (!this.lIIlIlIIllIIIlIIlIlIIIlII()) {
            return false;
        }
        class_0827 class_08272 = this.llllIllIIIlIllIllllllIlIl();
        return class_08272 == null || class_08142 == null || class_08142.llllIllIIIlIllIllllllIlIl() != class_08272 || !class_08272.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public ItemStack[] lIIlIIlIllIlIIlIlIIlIlIlI() {
        return this.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean IlIllIIIIllllIIllIllIIIIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII(1);
    }

    @Override
    public boolean IlIIlIIlllllIlIIlIlIlIlIl() {
        return !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_0141 lIlIlIIllIlIIIIIlIIlllIlI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIllllllllIIIlIlI();
    }

    @Override
    public class_0827 llllIllIIIlIllIllllllIlIl() {
        return this.lIlIlIIllIlIIIIIlIIlllIlI().IIIllIIlIIIIIIlIlIIllIIlI(this.llllIIIIlIIIlIIIIIIlIllll());
    }

    @Override
    public IChatComponent llIIIIllIIIIIIIlIIIlIIIIl() {
        class_0722 class_07222 = new class_0722(class_0531.lllIIIllIIIIlllIlIIllIIll(this.llllIllIIIlIllIllllllIlIl(), this.llllIIIIlIIIlIIIIIIlIllll()));
        class_07222.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(new class_0203(class_1936.IlIIIIIllllllIIlllIllllll, "/msg " + this.llllIIIIlIIIlIIIIIIlIllll() + " "));
        return class_07222;
    }

    @Override
    public void IlIlllIIIIIIlIIllIIllIlll(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(17, Float.valueOf(f));
    }

    @Override
    public float lllIlllllIllIlIIlIlIIIlll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lIlllIlllIIIIlIIlllIllIII(17);
    }

    public static UUID lllIIIllIIIIlllIlIIllIIll(GameProfile gameProfile) {
        UUID uUID = gameProfile.getId();
        if (uUID == null) {
            uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(Charsets.UTF_8));
        }
        return uUID;
    }
}

