package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Collection;
import java.util.HashMap;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.config.Setting;
import org.lwjgl.opengl.GL11;

public class class_0192
extends AbstractModule {
    private Setting lllIlIIlIIIlIlIIIllIlllIl;
    private Setting IlIllllllIIlIIllllIIlIIIl;
    private Setting lIlllIlllIIIIlIIlllIllIII;
    public Setting lllIIIllIIIIlllIlIIllIIll;
    private Setting IlIIIIIllllllIIlllIllllll;
    private Setting lIllllIIlIIIlIllllllIIIll;
    private Setting IIIllIIlIIIIIIlIlIIllIIlI;
    private Setting IllIIlllllllIIlIIlIIIIlIl;
    private Setting IIIllIllIIlIlIlIlIllllIIl;
    private Setting IllIIIllIIIIlIlIlIllIIlll;
    private final ResourceLocation lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation("textures/gui/container/inventory.png");
    private int llIIlllIllIllllIIIlIIIIII = 0;

    public class_0192() {
        super("Potion Effects");
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIlIIlIIIlIlIIIllIlllIl = new Setting(this, "label").setValue("General Options");
        this.IlIllllllIIlIIllllIIlIIIl = new Setting(this, "Show While Typing").setValue(true);
        this.lIlllIlllIIIIlIIlllIllIII = new Setting(this, "Effect Name").setValue(true);
        this.lllIIIllIIIIlllIlIIllIIll = new Setting(this, "Show Potion info in inventory").setValue(false);
        this.IllIIlllllllIIlIIlIIIIlIl = new Setting(this, "label").setValue("Blink Options");
        this.IIIllIllIIlIlIlIlIllllIIl = new Setting(this, "Blink").setValue(true);
        this.IllIIIllIIIIlIlIlIllIIlll = new Setting(this, "Blink Duration").setValue(10).setMinMax((Object)2, (Object)20);
        this.IlIIIIIllllllIIlllIllllll = new Setting(this, "label").setValue("Color Options");
        this.lIllllIIlIIIlIllllllIIIll = new Setting(this, "Name Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new Setting(this, "Duration Color").setValue(-1).setMinMax((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("client/icons/mods/speed_icon.png"), 28, 28);
        this.lllIIIllIIIIlllIlIIllIIll(class_0312.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_1217.class, this::lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_2201.class, this::lllIIIllIIIIlllIlIIllIIll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0312 class_03122) {
        ++this.llIIlllIllIllllIIIlIIIIII;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1217 class_12172) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        Collection collection = this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IIllIIIlIIllllIIIIIIIIlll();
        if (collection.isEmpty()) {
            GL11.glPushMatrix();
            this.lllIIIllIIIIlllIlIIllIIll(class_12172.lllIIIllIIIIlllIlIIllIIll());
            HashMap<Integer, class_1852> hashMap = new HashMap<Integer, class_1852>();
            class_1852 class_18522 = new class_1852(class_0700.IlIllllllIIlIIllllIIlIIIl.IlIlIIlllIllllllllIIIlIlI, 1200, 3);
            class_1852 class_18523 = new class_1852(class_0700.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIllllllllIIIlIlI, 30, 3);
            hashMap.put(class_18522.lllIIIllIIIIlllIlIIllIIll(), class_18522);
            hashMap.put(class_18523.lllIIIllIIIIlllIlIIllIIll(), class_18523);
            collection = hashMap.values();
            class_1564 class_15642 = this.IlIlIIlIlIllIIlIlIIllIIIl();
            int n = 0;
            int n2 = 0;
            int n3 = 22;
            for (class_1852 class_18524 : collection) {
                class_0700 class_07002;
                String string;
                boolean bl = this.IlIllllllIIlIIllllIIlIIIl(class_18524.lllIlIIlIIIlIlIIIllIlllIl());
                int n4 = 0;
                if (((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue()).booleanValue()) {
                    string = class_1586.lllIIIllIIIIlllIlIIllIIll(class_18524.IlIIIIIllllllIIlllIllllll()) + this.lllIIIllIIIIlllIlIIllIIll(class_18524.IlIllllllIIlIIllllIIlIIIl());
                    n4 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) + 20;
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() - (float)n4, (float)n, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", 20.0f, (float)n, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n4 / 2) + 20.0f, (float)n, this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll());
                    }
                    if (n4 > n2) {
                        n2 = n4;
                    }
                }
                string = class_0700.lllIIIllIIIIlllIlIIllIIll(class_18524);
                int n5 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) + 20;
                if (bl) {
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() - (float)n5, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n5 / 2) + 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    }
                }
                if ((class_07002 = class_0700.lllIIIllIIIIlllIlIIllIIll[class_18524.lllIIIllIIIIlllIlIIllIIll()]).lIlllIlllIIIIlIIlllIllIII()) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
                    int n6 = class_07002.IlIIIIIllllllIIlllIllllll();
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl() - 20.0f, (float)n, (float)(n6 % 8 * 18), (float)(198 + n6 / 8 * 18), 18, 18);
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0f, (float)n, (float)(n6 % 8 * 18), (float)(198 + n6 / 8 * 18), 18, 18);
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n4 / 2), (float)n, (float)(n6 % 8 * 18), (float)(198 + n6 / 8 * 18), 18, 18);
                    }
                }
                if (n5 > n2) {
                    n2 = n5;
                }
                n += n3;
            }
            this.IlIllllllIIlIIllllIIlIIIl(n2, n);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2201 class_22012) {
        if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
            return;
        }
        GL11.glPushMatrix();
        if (((Boolean)this.IlIllllllIIlIIllllIIlIIIl.getValue()).booleanValue() || !this.lIIlIIIIIlIlllIlIIlIlIlll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll()) {
            GL11.glPushMatrix();
            this.lllIIIllIIIIlllIlIIllIIll(class_22012.lllIIIllIIIIlllIlIIllIIll());
            Collection collection = this.lIIlIIIIIlIlllIlIIlIlIlll.lIIIIlIlIIlllllIIllIIlIII.IIllIIIlIIllllIIIIIIIIlll();
            if (collection.isEmpty()) {
                GL11.glPopMatrix();
                GL11.glPopMatrix();
                return;
            }
            class_1564 class_15642 = this.IlIlIIlIlIllIIlIlIIllIIIl();
            int n = 0;
            int n2 = 0;
            int n3 = 22;
            for (class_1852 class_18522 : collection) {
                class_0700 class_07002;
                String string;
                boolean bl = this.IlIllllllIIlIIllllIIlIIIl(class_18522.lllIlIIlIIIlIlIIIllIlllIl());
                int n4 = 0;
                if (((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue()).booleanValue()) {
                    string = class_1586.lllIIIllIIIIlllIlIIllIIll(class_18522.IlIIIIIllllllIIlllIllllll()) + this.lllIIIllIIIIlllIlIIllIIll(class_18522.IlIllllllIIlIIllllIIlIIIl());
                    n4 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) + 20;
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() - (float)n4, (float)n, (int)((Integer)this.lIllllIIlIIIlIllllllIIIll.getValue()));
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", 20.0f, (float)n, (int)((Integer)this.lIllllIIlIIIlIllllllIIIll.getValue()));
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n4 / 2) + 20.0f, (float)n, (int)((Integer)this.lIllllIIlIIIlIllllllIIIll.getValue()));
                    }
                    if (n4 > n2) {
                        n2 = n4;
                    }
                }
                string = class_0700.lllIIIllIIIIlllIlIIllIIll(class_18522);
                int n5 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) + 20;
                if (bl) {
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() - (float)n5, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n5 / 2) + 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.getValue() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    }
                }
                if ((class_07002 = class_0700.lllIIIllIIIIlllIlIIllIIll[class_18522.lllIIIllIIIIlllIlIIllIIll()]).lIlllIlllIIIIlIIlllIllIII()) {
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    this.lIIlIIIIIlIlllIlIIlIlIlll.llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIlIIlllllIIllIIlIII);
                    int n6 = class_07002.IlIIIIIllllllIIlllIllllll();
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl() - 20.0f, (float)n, (float)(n6 % 8 * 18), (float)(198 + n6 / 8 * 18), 18, 18);
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        class_0857.lllIIIllIIIIlllIlIIllIIll(0.0f, (float)n, (float)(n6 % 8 * 18), (float)(198 + n6 / 8 * 18), 18, 18);
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        class_0857.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n4 / 2), (float)n, (float)(n6 % 8 * 18), (float)(198 + n6 / 8 * 18), 18, 18);
                    }
                }
                if (n5 > n2) {
                    n2 = n5;
                }
                n += n3;
            }
            this.IlIllllllIIlIIllllIIlIIIl(n2, n);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(float f) {
        if (((Boolean)this.IIIllIllIIlIlIlIlIllllIIl.getValue()).booleanValue() && f <= (float)((Integer)this.IllIIIllIIIIlIlIlIllIIlll.getValue() * 22)) {
            if (this.llIIlllIllIllllIIIlIIIIII > 20) {
                this.llIIlllIllIllllIIIlIIIIII = 0;
            }
            return this.llIIlllIllIllllIIIlIIIIII <= 10;
        }
        return true;
    }

    private String lllIIIllIIIIlllIlIIllIIll(int n) {
        switch (n) {
            case 1: {
                return " II";
            }
            case 2: {
                return " III";
            }
            case 3: {
                return " IV";
            }
            case 4: {
                return " V";
            }
            case 5: {
                return " VI";
            }
            case 6: {
                return " VII";
            }
            case 7: {
                return " VIII";
            }
            case 8: {
                return " IX";
            }
            case 9: {
                return " X";
            }
        }
        if (n > 9) {
            return " " + n + 1;
        }
        return "";
    }
}

