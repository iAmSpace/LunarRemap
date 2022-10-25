package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Collection;
import java.util.HashMap;
import org.lwjgl.opengl.GL11;

public class class_0192
extends class_1665 {
    private class_1609 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1609 IlIllllllIIlIIllllIIlIIIl;
    private class_1609 lIlllIlllIIIIlIIlllIllIII;
    public class_1609 lllIIIllIIIIlllIlIIllIIll;
    private class_1609 IlIIIIIllllllIIlllIllllll;
    private class_1609 lIllllIIlIIIlIllllllIIIll;
    private class_1609 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1609 IllIIlllllllIIlIIlIIIIlIl;
    private class_1609 IIIllIllIIlIlIlIlIllllIIl;
    private class_1609 IllIIIllIIIIlIlIlIllIIlll;
    private final ResourceLocation lIIIIlIlIIlllllIIllIIlIII = new ResourceLocation("textures/gui/container/inventory.png");
    private int llIIlllIllIllllIIIlIIIIII = 0;

    public class_0192() {
        super("Potion Effects");
        this.lllIlIIlIIIlIlIIIllIlllIl(false);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_0767.lllIlIIlIIIlIlIIIllIlllIl);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1609(this, "label").lllIlIIlIIIlIlIIIllIlllIl("General Options");
        this.IlIllllllIIlIIllllIIlIIIl = new class_1609(this, "Show While Typing").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lIlllIlllIIIIlIIlllIllIII = new class_1609(this, "Effect Name").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1609(this, "Show Potion info in inventory").lllIlIIlIIIlIlIIIllIlllIl(false);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_1609(this, "label").lllIlIIlIIIlIlIIIllIlllIl("Blink Options");
        this.IIIllIllIIlIlIlIlIllllIIl = new class_1609(this, "Blink").lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1609(this, "Blink Duration").lllIlIIlIIIlIlIIIllIlllIl(10).lllIIIllIIIIlllIlIIllIIll((Object)2, (Object)20);
        this.IlIIIIIllllllIIlllIllllll = new class_1609(this, "label").lllIlIIlIIIlIlIIIllIlllIl("Color Options");
        this.lIllllIIlIIIlIllllllIIIll = new class_1609(this, "Name Color").lllIlIIlIIIlIlIIIllIlllIl(-1).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
        this.IIIllIIlIIIIIIlIlIIllIIlI = new class_1609(this, "Duration Color").lllIlIIlIIIlIlIIIllIlllIl(-1).lllIIIllIIIIlllIlIIllIIll((Object)Integer.MIN_VALUE, (Object)Integer.MAX_VALUE);
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
                if (((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
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
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() - (float)n5, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n5 / 2) + 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
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
        if (((Boolean)this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() || !this.lIIlIIIIIlIlllIlIIlIlIlll.IlIIIlIIIIllIIIllIIIIIIll.lllIlIIlIIIlIlIIIllIlllIl().IlIIIIIllllllIIlllIllllll()) {
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
                if (((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII()).booleanValue()) {
                    string = class_1586.lllIIIllIIIIlllIlIIllIIll(class_18522.IlIIIIIllllllIIlllIllllll()) + this.lllIIIllIIIIlllIlIIllIIll(class_18522.IlIllllllIIlIIllllIIlIIIl());
                    n4 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) + 20;
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() - (float)n4, (float)n, (int)((Integer)this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII()));
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", 20.0f, (float)n, (int)((Integer)this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII()));
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n4 / 2) + 20.0f, (float)n, (int)((Integer)this.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII()));
                    }
                    if (n4 > n2) {
                        n2 = n4;
                    }
                }
                string = class_0700.lllIIIllIIIIlllIlIIllIIll(class_18522);
                int n5 = this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string) + 20;
                if (bl) {
                    if (class_15642 == class_1564.IlIIIIIllllllIIlllIllllll) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() - (float)n5, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.lIlllIlllIIIIlIIlllIllIII) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                    } else if (class_15642 == class_1564.IlIllllllIIlIIllllIIlIIIl) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(string + "\u00a7r", this.IllIIlllllllIIlIIlIIIIlIl() / 2.0f - (float)(n5 / 2) + 20.0f, (float)(n + ((Boolean)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() != false ? 10 : 5)), this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
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
        if (((Boolean)this.IIIllIllIIlIlIlIlIllllIIl.lIlllIlllIIIIlIIlllIllIII()).booleanValue() && f <= (float)((Integer)this.IllIIIllIIIIlIlIlIllIIlll.lIlllIlllIIIIlIIlllIllIII() * 22)) {
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

