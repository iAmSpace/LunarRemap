package obf;

import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0139
extends class_2174 {
    public class_0960 lIlllIlllIIIIlIIlllIllIII;
    protected Minecraft IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    public int IIIllIIlIIIIIIlIlIIllIIlI;
    public float IllIIlllllllIIlIIlIIIIlIl;
    public float IIIllIllIIlIlIlIlIllllIIl;
    public float IllIIIllIIIIlIlIlIllIIlll;
    public float lIIIIlIlIIlllllIIllIIlIII;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;
    private class_0322 lIllIIlllIIIlIlIIIlllIlIl = new class_0322();
    private class_0322 IIlIlIlIIlllIIIlIIIIlIIIl = new class_0322();
    private class_0322 lllIIIIlIIllIIIlIllIlllII = new class_0322();
    public float llIIlllIllIllllIIIlIIIIII;
    public float llIIllIllIlIIlIIllIllllll;
    private class_0020 IlIllIIIIllllIIllIllIIIIl;

    public class_0139(Minecraft class_06672, class_1334 class_13342, class_1220 class_12202, int n) {
        super(class_13342, class_12202.func_148256_e());
        this.IlIllIIIIllllIIllIllIIIIl = new class_0020(Minecraft.getMinecraft().gameSettings);
        this.IlIIIIIllllllIIlllIllllll = class_06672;
        this.lIIllllllllIlIllllllllIlI = n;
    }

    @Override
    public void llIIlIlIlllIIllIlIlllIllI() {
        super.llIIlIlIlllIIllIlIlllIllI();
        this.IlllIIIlIIlIIIIllllIllllI = this.lIlllIlllIIIIlIIlllIllIII.IIIllIIlIIIIIIlIlIIllIIlI;
        this.llIlIIIlllIIIllIllllIIIll = this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl;
        this.llIllIlllIllIlIIIIlIIlIII = this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl;
        this.IllIIIllIIIIlIlIlIllIIlll = this.IllIIlllllllIIlIIlIIIIlIl;
        this.lIIIIlIlIIlllllIIllIIlIII = this.IIIllIllIIlIlIlIlIllllIIl;
        this.IIIllIllIIlIlIlIlIllllIIl = (float)((double)this.IIIllIllIIlIlIlIlIllllIIl + (double)(this.IlIlIIlllIllllllllIIIlIlI - this.IIIllIllIIlIlIlIlIllllIIl) * 0.5);
        this.IllIIlllllllIIlIIlIIIIlIl = (float)((double)this.IllIIlllllllIIlIIlIIIIlIl + (double)(this.IIIIlIllIlIIlIIlIllIlIlll - this.IllIIlllllllIIlIIlIIIIlIl) * 0.5);
    }

    @Override
    public void d_() {
        if (LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll()) {
            this.IllIIIIllIIllIllIlllIlIIl();
        } else {
            if (this.IIIllIIlIIIIIIlIlIIllIIlI > 0) {
                --this.IIIllIIlIIIIIIlIlIIllIIlI;
                if (this.IIIllIIlIIIIIIlIlIIllIIlI == 0) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(false);
                }
            }
            if (this.lIllllIIlIIIlIllllllIIIll > 0) {
                --this.lIllllIIlIIIlIllllllIIIll;
            }
            if (this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll()) {
                this.IllIIIIllIIllIllIlllIlIIl = 0.5;
                this.IlIIlllllIIlIlIlllllIllll = 0.5;
                this.IlIIlllllIIlIlIlllllIllll = 0.0;
                this.IllIIIIllIIllIllIlllIlIIl = 0.0;
                this.IIIIlIllIlIIlIIlIllIlIlll = (float)this.IlllIIIllllIIllIllIlIIlIl / 12.0f;
                this.IlIlIIlllIllllllllIIIlIlI = 10.0f;
                this.llIIlIlIlllIIllIlIlllIllI = 68.5;
            } else {
                boolean bl;
                this.llIIllIllIlIIlIIllIllllll = this.llIIlllIllIllllIIIlIIIIII;
                if (this.lIlIllIIllIIIIlllIlIlllIl) {
                    if (this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII != null) {
                        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                    }
                    if (this.llIIlllIllIllllIIIlIIIIII == 0.0f) {
                        this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("portal.trigger"), this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.4f + 0.8f));
                    }
                    this.llIIlllIllIllllIIIlIIIIII += 0.0125f;
                    if (this.llIIlllIllIllllIIIlIIIIII >= 1.0f) {
                        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
                    }
                    this.lIlIllIIllIIIIlllIlIlllIl = false;
                } else if (this.lllIIIllIIIIlllIlIIllIIll(class_0700.lIIIIlIlIIlllllIIllIIlIII) && this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.lIIIIlIlIIlllllIIllIIlIII).lllIlIIlIIIlIlIIIllIlllIl() > 60) {
                    this.llIIlllIllIllllIIIlIIIIII += 0.006666667f;
                    if (this.llIIlllIllIllllIIIlIIIIII > 1.0f) {
                        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
                    }
                } else {
                    if (this.llIIlllIllIllllIIIlIIIIII > 0.0f) {
                        this.llIIlllIllIllllIIIlIIIIII -= 0.05f;
                    }
                    if (this.llIIlllIllIllllIIIlIIIIII < 0.0f) {
                        this.llIIlllIllIllllIIIlIIIIII = 0.0f;
                    }
                }
                if (this.lIIIlIIllIllIIlIIlIIIllII > 0) {
                    --this.lIIIlIIllIllIIlIIlIIIllII;
                }
                boolean bl2 = this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl;
                float f = 0.8f;
                boolean bl3 = this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl >= f;
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
                if (this.IIIlllIlIIllIIlIlIllIlIIl() && !this.lIlIlIIllIIIlllIllIIlIllI()) {
                    this.lIlllIlllIIIIlIIlllIllIII.IIIllIIlIIIIIIlIlIIllIIlI *= 0.2f;
                    this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl *= 0.2f;
                    this.lIllllIIlIIIlIllllllIIIll = 0;
                }
                if (this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll && this.IllllIIlIIIllIlllIlllIllI < 0.2f) {
                    this.IllllIIlIIIllIlllIlllIllI = 0.2f;
                }
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
                this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
                boolean bl4 = bl = (float)this.lIllIIlllIIIlIlIIIlllIlIl().lllIIIllIIIIlllIlIIllIIll() > 6.0f || this.lIIlIlIlIlIllIIlIIllllIll.IlIllllllIIlIIllllIIlIIIl;
                if (this.llllllIlIllllIlIlIlIIIIlI && !bl3 && this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl >= f && !this.IlIIIIIllIlllIIIIlIIIllIl() && bl && !this.IIIlllIlIIllIIlIlIllIlIIl() && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII)) {
                    if (this.lIllllIIlIIIlIllllllIIIll <= 0 && !this.IlIIIIIllllllIIlllIllllll.gameSettings.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII()) {
                        this.lIllllIIlIIIlIllllllIIIll = 7;
                    } else {
                        this.lllIlIIlIIIlIlIIIllIlllIl(true);
                    }
                }
                if (!this.IlIIIIIllIlllIIIIlIIIllIl() && this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl >= f && bl && !this.IIIlllIlIIllIIlIlIllIlIIl() && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII) && this.IlIIIIIllllllIIlllIllllll.gameSettings.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII()) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(true);
                }
                if (this.IlIIIIIllIlllIIIIlIIIllIl() && (this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl < f || this.lIlIIllllIlIIIIllIIIIlIIl || !bl)) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(false);
                }
                if (this.lIIlIlIlIlIllIIlIIllllIll.IlIllllllIIlIIllllIIlIIIl && !bl2 && this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                    if (this.lIIlIlllIIlllIIlllIIlIlII == 0) {
                        this.lIIlIlllIIlllIIlllIIlIlII = 7;
                    } else {
                        this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl = !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl;
                        this.lIlIllIIlIIlIIlIIlIIlIIll();
                        this.lIIlIlllIIlllIIlllIIlIlII = 0;
                    }
                }
                if (this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
                    if (this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll) {
                        this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.15;
                    }
                    if (this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                        this.IIlIIlIlIlIllIIlIlIIIIlll += 0.15;
                    }
                }
                if (this.IIIIlIllIlIIlIIlIllIlIlll()) {
                    if (this.lllIlIIlIIIlIlIIIllIlllIl < 0) {
                        ++this.lllIlIIlIIIlIlIIIllIlllIl;
                        if (this.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                            this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
                        }
                    }
                    if (bl2 && !this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                        this.lllIlIIlIIIlIlIIIllIlllIl = -10;
                        this.l_();
                    } else if (!bl2 && this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
                        this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
                    } else if (bl2) {
                        ++this.lllIlIIlIIIlIlIIIllIlllIl;
                        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl < 10 ? (float)this.lllIlIIlIIIlIlIIIllIlllIl * 0.1f : 0.8f + 2.0f / (float)(this.lllIlIIlIIIlIlIIIllIlllIl - 9) * 0.1f;
                    }
                } else {
                    this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
                }
                super.d_();
                if (this.llllllIlIllllIlIlIlIIIIlI && this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
                    this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl = false;
                    this.lIlIllIIlIIlIIlIIlIIlIIll();
                }
            }
        }
    }

    public void IllIIIIllIIllIllIlllIlIIl() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI > 0) {
            --this.IIIllIIlIIIIIIlIlIIllIIlI;
            if (this.IIIllIIlIIIIIIlIlIIllIIlI == 0) {
                this.lllIlIIlIIIlIlIIIllIlllIl(false);
            }
        }
        if (this.lIllllIIlIIIlIllllllIIIll > 0) {
            --this.lIllllIIlIIIlIllllllIIIll;
        }
        if (this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll()) {
            this.IllIIIIllIIllIllIlllIlIIl = 0.5;
            this.IlIIlllllIIlIlIlllllIllll = 0.5;
            this.IlIIlllllIIlIlIlllllIllll = 0.0;
            this.IllIIIIllIIllIllIlllIlIIl = 0.0;
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)this.IlllIIIllllIIllIllIlIIlIl / 12.0f;
            this.IlIlIIlllIllllllllIIIlIlI = 10.0f;
            this.llIIlIlIlllIIllIlIlllIllI = 68.5;
        } else {
            this.llIIllIllIlIIlIIllIllllll = this.llIIlllIllIllllIIIlIIIIII;
            if (this.lIlIllIIllIIIIlllIlIlllIl) {
                if (this.IlIIIIIllllllIIlllIllllll.lllllIlllIIllIlIIlIIIllII != null) {
                    this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
                }
                if (this.llIIlllIllIllllIIIlIIIIII == 0.0f) {
                    this.IlIIIIIllllllIIlllIllllll.IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("portal.trigger"), this.IlllIIIlIIlIIIIllllIllllI().nextFloat() * 0.4f + 0.8f));
                }
                this.llIIlllIllIllllIIIlIIIIII += 0.0125f;
                if (this.llIIlllIllIllllIIIlIIIIII >= 1.0f) {
                    this.llIIlllIllIllllIIIlIIIIII = 1.0f;
                }
                this.lIlIllIIllIIIIlllIlIlllIl = false;
            } else if (this.lllIIIllIIIIlllIlIIllIIll(class_0700.lIIIIlIlIIlllllIIllIIlIII) && this.lllIlIIlIIIlIlIIIllIlllIl(class_0700.lIIIIlIlIIlllllIIllIIlIII).lllIlIIlIIIlIlIIIllIlllIl() > 60) {
                this.llIIlllIllIllllIIIlIIIIII += 0.006666667f;
                if (this.llIIlllIllIllllIIIlIIIIII > 1.0f) {
                    this.llIIlllIllIllllIIIlIIIIII = 1.0f;
                }
            } else {
                if (this.llIIlllIllIllllIIIlIIIIII > 0.0f) {
                    this.llIIlllIllIllllIIIlIIIIII -= 0.05f;
                }
                if (this.llIIlllIllIllllIIIlIIIIII < 0.0f) {
                    this.llIIlllIllIllllIIIlIIIIII = 0.0f;
                }
            }
            if (this.lIIIlIIllIllIIlIIlIIIllII > 0) {
                --this.lIIIlIIllIllIIlIIlIIIllII;
            }
            boolean bl = this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl;
            float f = 0.8f;
            boolean bl2 = this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl >= f;
            class_0020.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, (class_1432)this.lIlllIlllIIIIlIIlllIllIII, this);
            if (this.IIIlllIlIIllIIlIlIllIlIIl() && !this.lIlIlIIllIIIlllIllIIlIllI()) {
                this.lIlllIlllIIIIlIIlllIllIII.IIIllIIlIIIIIIlIlIIllIIlI *= 0.2f;
                this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl *= 0.2f;
                this.lIllllIIlIIIlIllllllIIIll = 0;
            }
            if (this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll && this.IllllIIlIIIllIlllIlllIllI < 0.2f) {
                this.IllllIIlIIIllIlllIlllIllI = 0.2f;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl - (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
            this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5, this.IllIIIIllIIllIllIlllIlIIl + (double)this.IIIIlIlIIlIIIIlIlllIlIIII * 0.35);
            boolean bl3 = (float)this.lIllIIlllIIIlIlIIIlllIlIl().lllIIIllIIIIlllIlIIllIIll() > 6.0f || this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl;
            boolean bl4 = !LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll() || (Boolean)class_1046.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII() == false;
            boolean bl5 = (Boolean)class_1046.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII();
            if (class_1046.IlIlIIlllIIlIllIIIlllllIl) {
                this.lllIlIIlIIIlIlIIIllIlllIl(false);
                this.IlIllIIIIllllIIllIllIIIIl.lllIIIllIIIIlllIlIIllIIll(false, false);
                class_1046.IlIlIIlllIIlIllIIIlllllIl = false;
            }
            if (bl4) {
                if (((Boolean)class_1046.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && this.llllllIlIllllIlIlIlIIIIlI && !bl2 && this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl >= f && !this.IlIIIIIllIlllIIIIlIIIllIl() && bl3 && !this.IIIlllIlIIllIIlIlIllIlIIl() && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII)) {
                    if (this.lIllllIIlIIIlIllllllIIIll <= 0 && !this.IlIIIIIllllllIIlllIllllll.gameSettings.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII()) {
                        this.lIllllIIlIIIlIllllllIIIll = 7;
                    } else {
                        this.lllIlIIlIIIlIlIIIllIlllIl(true);
                        this.IlIllIIIIllllIIllIllIIIIl.lllIIIllIIIIlllIlIIllIIll(true, false);
                    }
                }
                if (!this.IlIIIIIllIlllIIIIlIIIllIl() && this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl >= f && bl3 && !this.IIIlllIlIIllIIlIlIllIlIIl() && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII) && this.IlIIIIIllllllIIlllIllllll.gameSettings.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII()) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(true);
                    this.IlIllIIIIllllIIllIllIIIIl.lllIIIllIIIIlllIlIIllIIll(true, false);
                }
            } else {
                boolean bl6 = class_0020.IlIllllllIIlIIllllIIlIIIl;
                if (!(!bl3 || this.IIIlllIlIIllIIlIlIllIlIIl() || this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII) || class_0020.lIlllIlllIIIIlIIlllIllIII || bl5 && this.IlIIIIIllIlllIIIIlIIIllIl())) {
                    this.lllIlIIlIIIlIlIIIllIlllIl(bl6);
                }
                if (bl5 && !bl6 && this.llllllIlIllllIlIlIlIIIIlI && !bl2 && this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl >= f && !this.IlIIIIIllIlllIIIIlIIIllIl() && bl3 && !this.IIIlllIlIIllIIlIlIllIlIIl() && !this.lllIIIllIIIIlllIlIIllIIll(class_0700.lllllIlllIIllIlIIlIIIllII)) {
                    if (this.lIllllIIlIIIlIllllllIIIll == 0) {
                        this.lIllllIIlIIIlIllllllIIIll = 7;
                    } else {
                        this.lllIlIIlIIIlIlIIIllIlllIl(true);
                        this.IlIllIIIIllllIIllIllIIIIl.lllIIIllIIIIlllIlIIllIIll(true, true);
                        this.lIllllIIlIIIlIllllllIIIll = 0;
                    }
                }
            }
            if (this.IlIIIIIllIlllIIIIlIIIllIl() && (this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl < f || this.lIlIIllllIlIIIIllIIIIlIIl || !bl3)) {
                this.lllIlIIlIIIlIlIIIllIlllIl(false);
                if (class_0020.lIlllIlllIIIIlIIlllIllIII || bl4 || class_0020.IlIIIIIllllllIIlllIllllll || this.lIlIlIIllIIIlllIllIIlIllI()) {
                    this.IlIllIIIIllllIIllIllIIIIl.lllIIIllIIIIlllIlIIllIIll(false, false);
                }
            }
            if (((Boolean)class_1046.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl && this.IlIIIIIllllllIIlllIllllll.gameSettings.IIlIlIIIIlIlllIlIlIIIIIlI.lIlllIlllIIIIlIIlllIllIII() && this.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll(0.05f * (float)((Integer)class_1046.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII()).intValue());
                if (this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.15 * (double)((Integer)class_1046.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII()).intValue();
                }
                if (this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll += 0.15 * (double)((Integer)class_1046.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII()).intValue();
                }
            } else if (this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll() != 0.05f) {
                this.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll(0.05f);
            }
            if (this.lIIlIlIlIlIllIIlIIllllIll.IlIllllllIIlIIllllIIlIIIl && !bl && this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                if (this.lIIlIlllIIlllIIlllIIlIlII == 0) {
                    this.lIIlIlllIIlllIIlllIIlIlII = 7;
                } else {
                    this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl = !this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl;
                    this.lIlIllIIlIIlIIlIIlIIlIIll();
                    this.lIIlIlllIIlllIIlllIIlIlII = 0;
                }
            }
            if (this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
                if (this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.15;
                }
                if (this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll += 0.15;
                }
            }
            if (this.IIIIlIllIlIIlIIlIllIlIlll()) {
                if (this.lllIlIIlIIIlIlIIIllIlllIl < 0) {
                    ++this.lllIlIIlIIIlIlIIIllIlllIl;
                    if (this.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                        this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
                    }
                }
                if (bl && !this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                    this.lllIlIIlIIIlIlIIIllIlllIl -= 10;
                    this.lllIlIIlIIIlIlIIIllIlllIl = -10;
                    ((class_1389)this).lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(new class_1233(this, 6, (int)(this.IlIlIIlllIllllllllIIIlIlI() * 100.0f)));
                } else if (!bl && this.lIlllIlllIIIIlIIlllIllIII.IIIllIllIIlIlIlIlIllllIIl) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = 0;
                    this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
                } else if (bl) {
                    ++this.lllIlIIlIIIlIlIIIllIlllIl;
                    this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl < 10 ? (float)this.lllIlIIlIIIlIlIIIllIlllIl * 0.1f : 0.8f + 2.0f / (float)(this.lllIlIIlIIIlIlIIIllIlllIl - 9) * 0.1f;
                }
            } else {
                this.IlIllllllIIlIIllllIIlIIIl = 0.0f;
            }
            super.d_();
            if (this.llllllIlIllllIlIlIlIIIIlI && this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
                this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl = false;
                this.lIlIllIIlIIlIIlIIlIIlIIll();
            }
        }
    }

    public float IIIIIIIIlIllIIllIIlllIllI() {
        float f = 1.0f;
        if (this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl) {
            f *= 1.1f;
        }
        class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
        f = (float)((double)f * ((class_16852.IlIIIIIllllllIIlllIllllll() / (double)this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl() + 1.0) / 2.0));
        if (this.lIIlIlIlIlIllIIlIIllllIll.lllIlIIlIIIlIlIIIllIlllIl() == 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
            f = 1.0f;
        }
        if (this.IIIlllIlIIllIIlIlIllIlIIl() && this.IIIIIIlIIIIIIIIIIlIlIlIlI().lllIIIllIIIIlllIlIIllIIll() == Items.bow) {
            int n = this.llllIIIlIlIlIlIIlIIIIIlIl();
            float f2 = (float)n / 20.0f;
            f2 = f2 > 1.0f ? 1.0f : (f2 *= f2);
            f *= 1.0f - f2 * 0.15f;
        }
        return f;
    }

    @Override
    public void IlIIIlIIIIllIIIllIIIIIIll() {
        super.IlIIIlIIIIllIIIllIIIIIIll();
        if (((Boolean) LunarClient.getInstance().getSettingsManager().llIllllIlIllIIIlIllIIlIlI.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
            Minecraft.getMinecraft().lIIlIIIIIlIlllIlIIlIlIlll.IlIllllllIIlIIllllIIlIIIl();
        }
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll((class_0229)null);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1774 class_17742) {
        if (class_17742 instanceof class_2219) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1679((class_2219)class_17742));
        } else if (class_17742 instanceof class_1345) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_0809(((class_1345)class_17742).lllIIIllIIIIlllIlIIllIIll()));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0484 class_04842) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_0809(class_04842));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        if (class_06112 == Items.lIIIlllllllIlllIIllllllll) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1752(this, class_08972, false));
        } else if (class_06112 == Items.lIIIIlIIIIllIlIIllllIlIII) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1752(this, class_08972, true));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1744(this.lllIIlIIIllllllIIIIlIlIlI, class_08502));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0879 class_08792) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1833(this.lllIIlIIIllllllIIIIlIlIlI, class_08792));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2252 class_22522) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1833(this.lllIIlIIIllllllIIIIlIlIlI, class_22522));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1627 class_16272, class_0850 class_08502) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1673(this.lllIIlIIIllllllIIIIlIlIlI, class_08502, class_16272));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_2162(this.lllIIlIIIllllllIIIIlIlIlI, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, String string) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_0363(this.lllIIlIIIllllllIIIIlIlIlI, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3, string));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_0466(this.lllIIlIIIllllllIIIIlIlIlI, this.lIlIllIIlIIlIIlIIlIIlIIll, n, n2, n3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1587 class_15872) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_0378(this.lllIIlIIIllllllIIIIlIlIlI, class_15872));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0647 class_06472) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_0226(this.lllIIlIIIllllllIIIIlIlIlI, class_06472));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0396 class_03962) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1653(this.lllIIlIIIllllllIIIIlIlIlI, class_03962));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1646 class_16462) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1569(this.lllIIlIIIllllllIIIIlIlIlI, class_16462));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1510 class_15102, String string) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(new class_1669(this.lllIIlIIIllllllIIIIlIlIlI, class_15102, this.lIlIllIIlIIlIIlIIlIIlIIll, string));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        this.IlIIIIIllllllIIlllIllllll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new class_0327(this.IlIIIIIllllllIIlllIllllll.theWorld, class_15212));
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1521 class_15212) {
        class_0327 class_03272 = new class_0327(this.IlIIIIIllllllIIlllIllllll.theWorld, class_15212, "magicCrit");
        this.IlIIIIIllllllIIlllIllllll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_03272);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n) {
        this.IlIIIIIllllllIIlllIllllll.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new class_0262((class_1334)this.IlIIIIIllllllIIlllIllllll.theWorld, class_15212, this, -0.5f));
    }

    @Override
    public boolean IIlIIlIlIlIllIIlIlIIIIlll() {
        return this.lIlllIlllIIIIlIIlllIllIII.IllIIIllIIIIlIlIlIllIIlll && !this.IlIlIIllIlIlIIIIIlIlllllI;
    }

    public void lIlllIlllIIIIlIIlllIllIII(float f) {
        float f2 = this.lllIIIlllIlllIIlIllllIIlI() - f;
        if (f2 <= 0.0f) {
            this.IllIIIllIIIIlIlIlIllIIlll(f);
            if (f2 < 0.0f) {
                this.IIIIlIllIlIIIIIllllIIlllI = this.IllIIIIlIIlllllllllIlIlII / 2;
            }
        } else {
            this.lllIlIIllllIllIIIlIlIIIll = f2;
            this.IllIIIllIIIIlIlIlIllIIlll(this.lllIIIlllIlllIIlIllllIIlI());
            this.IIIIlIllIlIIIIIllllIIlllI = this.IllIIIIlIIlllllllllIlIlII;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_0058.IllIIIllIIIIlIlIlIllIIlll, f2);
            this.lIIlllIIlIlIlIIIlIlllIIll = 10;
            this.lIIllIlIIlIIlllllIlIIllIl = 10;
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(IChatComponent class_22552) {
        this.IlIIIIIllllllIIlllIllllll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_22552);
    }

    private boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3) {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3).IIIllIllIIlIlIlIlIllllIIl();
    }

    @Override
    protected boolean lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3);
        double d4 = d - (double)n;
        double d5 = d3 - (double)n3;
        if (this.IlIIIIIllllllIIlllIllllll(n, n2, n3) || this.IlIIIIIllllllIIlllIllllll(n, n2 + 1, n3)) {
            boolean bl = !this.IlIIIIIllllllIIlllIllllll(n - 1, n2, n3) && !this.IlIIIIIllllllIIlllIllllll(n - 1, n2 + 1, n3);
            boolean bl2 = !this.IlIIIIIllllllIIlllIllllll(n + 1, n2, n3) && !this.IlIIIIIllllllIIlllIllllll(n + 1, n2 + 1, n3);
            boolean bl3 = !this.IlIIIIIllllllIIlllIllllll(n, n2, n3 - 1) && !this.IlIIIIIllllllIIlllIllllll(n, n2 + 1, n3 - 1);
            boolean bl4 = !this.IlIIIIIllllllIIlllIllllll(n, n2, n3 + 1) && !this.IlIIIIIllllllIIlllIllllll(n, n2 + 1, n3 + 1);
            int n4 = -1;
            double d6 = 9999.0;
            if (bl && d4 < d6) {
                d6 = d4;
                n4 = 0;
            }
            if (bl2 && 1.0 - d4 < d6) {
                d6 = 1.0 - d4;
                n4 = 1;
            }
            if (bl3 && d5 < d6) {
                d6 = d5;
                n4 = 4;
            }
            if (bl4 && 1.0 - d5 < d6) {
                d6 = 1.0 - d5;
                n4 = 5;
            }
            float f = 0.1f;
            if (n4 == 0) {
                this.IIIIIIIIlIllIIllIIlllIllI = -f;
            }
            if (n4 == 1) {
                this.IIIIIIIIlIllIIllIIlllIllI = f;
            }
            if (n4 == 4) {
                this.llIIIlllIlllIlIllIIIIllIl = -f;
            }
            if (n4 == 5) {
                this.llIIIlllIlllIlIllIIIIllIl = f;
            }
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        super.lllIlIIlIIIlIlIIIllIlllIl(bl);
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl ? 600 : 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f, int n, int n2) {
        this.llIlllllIIlIIlIIllllIllll = f;
        this.llllIllIIIlIllIllllllIlIl = n;
        this.lllIlllllIllIlIIlIlIIIlll = n2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(IChatComponent class_22552) {
        this.IlIIIIIllllllIIlllIllllll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(class_22552);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, String string) {
        return n <= 0;
    }

    @Override
    public class_2208 lllIIlIIIllllllIIIIlIlIlI() {
        return new class_2208(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + 0.5), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI + 0.5), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl + 0.5));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(String string, float f, float f2) {
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI - (double)this.llllIlIIIIIIIIIlllIIlIIIl, this.IllIIIIllIIllIllIlllIlIIl, string, f, f2, false);
    }

    @Override
    public boolean llIIIlllIlllIlIllIIIIllIl() {
        return true;
    }

    public boolean IIIIlIllIlIIlIIlIllIlIlll() {
        return this.IlIIIlIIIIllIIIllIIIIIIll != null && this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1627;
    }

    public float IlIlIIlllIllllllllIIIlIlI() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    protected void l_() {
    }
}

