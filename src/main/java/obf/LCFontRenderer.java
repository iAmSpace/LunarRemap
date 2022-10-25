package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class LCFontRenderer
extends class_0626 {
    private char lllIIlIIIllllllIIIIlIlIlI = (char)167;
    protected class_0522[] IllIIlllllllIIlIIlIIIIlIl = new class_0522[256];
    protected class_0522[] IIIllIllIIlIlIlIlIllllIIl = new class_0522[256];
    protected class_0522[] IllIIIllIIIIlIlIlIllIIlll = new class_0522[256];
    private final int[] IlIlllIIIIIIlIIllIIllIlll = new int[32];
    private final String IlIlIIlIlIllIIlIlIIllIIIl = "0123456789abcdefklmnor";
    protected class_2202 lIIIIlIlIIlllllIIllIIlIII;
    protected class_2202 llIIlllIllIllllIIIlIIIIII;
    protected class_2202 llIIllIllIlIIlIIllIllllll;

    public LCFontRenderer(ResourceLocation class_17732, float f) {
        super(class_17732, f);
        this.lIllllIIlIIIlIllllllIIIll();
        this.IlIIIIIllllllIIlllIllllll();
    }

    public float lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, int n, int n2) {
        float f = this.lllIIIllIIIIlllIlIIllIIll(string, d + 1.0, d2 + 1.0, n2, false);
        return Math.max(f, this.lllIIIllIIIIlllIlIIllIIll(string, d, d2, n, false));
    }

    public float lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, int n) {
        float f = this.lllIIIllIIIIlllIlIIllIIll(string, d + 1.0, d2 + 1.0, n, true);
        return Math.max(f, this.lllIIIllIIIIlllIlIIllIIll(string, d, d2, n, false));
    }

    public float lllIIIllIIIIlllIlIIllIIll(String string, float f, float f2, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(string, (double)f, (double)f2, n, false);
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(String string, float f, float f2, int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(string, f - (float)(this.lllIlIIlIIIlIlIIIllIlllIl(string) / 2), f2, n);
    }

    public float IlIllllllIIlIIllllIIlIIIl(String string, float f, float f2, int n) {
        float f3 = this.lllIIIllIIIIlllIlIIllIIll(string, (double)(f - (float)(this.lllIlIIlIIIlIlIIIllIlllIl(string) / 2)) + 1.0, (double)f2 + 1.0, n, true);
        return this.lllIIIllIIIIlllIlIIllIIll(string, f - (float)(this.lllIlIIlIIIlIlIIIllIlllIl(string) / 2), f2, n);
    }

    public float lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2, int n, boolean bl) {
        d -= 1.0;
        if (string == null) {
            return 0.0f;
        }
        if (n == 0x20FFFFFF) {
            n = 0xFFFFFF;
        }
        if ((n & 0xFC000000) == 0) {
            n |= 0xFF000000;
        }
        if (bl) {
            n = (n & 0xFCFCFC) >> 2 | n & 0xFF000000;
        }
        class_0522[] arrclass_0522 = this.lllIIIllIIIIlllIlIIllIIll;
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = true;
        d *= 2.0;
        d2 = (d2 - 3.0) * 2.0;
        if (bl7) {
            GL11.glPushMatrix();
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glColor4f((float)((float)(n >> 16 & 0xFF) / 255.0f), (float)((float)(n >> 8 & 0xFF) / 255.0f), (float)((float)(n & 0xFF) / 255.0f), (float)f);
            int n2 = string.length();
            GL11.glEnable((int)3553);
            GL11.glBindTexture((int)3553, (int)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
            for (int i = 0; i < n2; ++i) {
                char c = string.charAt(i);
                if (c == this.lllIIlIIIllllllIIIIlIlIlI && i < n2) {
                    int n3 = 21;
                    try {
                        n3 = "0123456789abcdefklmnor".indexOf(string.charAt(i + 1));
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    if (n3 < 16) {
                        bl3 = false;
                        bl4 = false;
                        bl2 = false;
                        bl6 = false;
                        bl5 = false;
                        GL11.glBindTexture((int)3553, (int)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                        arrclass_0522 = this.lllIIIllIIIIlllIlIIllIIll;
                        if (n3 < 0 || n3 > 15) {
                            n3 = 15;
                        }
                        if (bl) {
                            n3 += 16;
                        }
                        int n4 = this.IlIlllIIIIIIlIIllIIllIlll[n3];
                        GL11.glColor4f((float)((float)(n4 >> 16 & 0xFF) / 255.0f), (float)((float)(n4 >> 8 & 0xFF) / 255.0f), (float)((float)(n4 & 0xFF) / 255.0f), (float)f);
                    } else if (n3 == 16) {
                        bl2 = true;
                    } else if (n3 == 17) {
                        bl3 = true;
                        if (bl4) {
                            GL11.glBindTexture((int)3553, (int)this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll());
                            arrclass_0522 = this.IllIIIllIIIIlIlIlIllIIlll;
                        } else {
                            GL11.glBindTexture((int)3553, (int)this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll());
                            arrclass_0522 = this.IllIIlllllllIIlIIlIIIIlIl;
                        }
                    } else if (n3 == 18) {
                        bl5 = true;
                    } else if (n3 == 19) {
                        bl6 = true;
                    } else if (n3 == 20) {
                        bl4 = true;
                        if (bl3) {
                            GL11.glBindTexture((int)3553, (int)this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll());
                            arrclass_0522 = this.IllIIIllIIIIlIlIlIllIIlll;
                        } else {
                            GL11.glBindTexture((int)3553, (int)this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll());
                            arrclass_0522 = this.IIIllIllIIlIlIlIlIllllIIl;
                        }
                    } else if (n3 == 21) {
                        bl3 = false;
                        bl4 = false;
                        bl2 = false;
                        bl6 = false;
                        bl5 = false;
                        GL11.glColor4f((float)((float)(n >> 16 & 0xFF) / 255.0f), (float)((float)(n >> 8 & 0xFF) / 255.0f), (float)((float)(n & 0xFF) / 255.0f), (float)f);
                        GL11.glBindTexture((int)3553, (int)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll());
                        arrclass_0522 = this.lllIIIllIIIIlllIlIIllIIll;
                    }
                    ++i;
                    continue;
                }
                if (c >= arrclass_0522.length || c < '\u0000') continue;
                GL11.glBegin((int)4);
                this.lllIIIllIIIIlllIlIIllIIll(arrclass_0522, c, (float)d, (float)d2 + 6.0f);
                GL11.glEnd();
                if (bl5) {
                    this.lllIIIllIIIIlllIlIIllIIll(d, d2 + (double)(arrclass_0522[c].lllIlIIlIIIlIlIIIllIlllIl / 2), d + (double)arrclass_0522[c].lllIIIllIIIIlllIlIIllIIll - 8.0, d2 + (double)(arrclass_0522[c].lllIlIIlIIIlIlIIIllIlllIl / 2), 1.0f);
                }
                if (bl6) {
                    this.lllIIIllIIIIlllIlIIllIIll(d, d2 + (double)arrclass_0522[c].lllIlIIlIIIlIlIIIllIlllIl - 2.0, d + (double)arrclass_0522[c].lllIIIllIIIIlllIlIIllIIll - 8.0, d2 + (double)arrclass_0522[c].lllIlIIlIIIlIlIIIllIlllIl - 2.0, 1.0f);
                }
                d += (double)(arrclass_0522[c].lllIIIllIIIIlllIlIIllIIll - 8 + this.lIllllIIlIIIlIllllllIIIll);
            }
            GL11.glHint((int)3155, (int)4352);
            GL11.glPopMatrix();
        }
        return (float)d / 2.0f;
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string, double d) {
        return this.lllIIIllIIIIlllIlIIllIIll(string, d, false);
    }

    public String lllIIIllIIIIlllIlIIllIIll(String string, double d, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        int n = bl ? string.length() - 1 : 0;
        int n2 = bl ? -1 : 1;
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i = n; i >= 0 && i < string.length() && f < (float)d; i += n2) {
            char c = string.charAt(i);
            double d2 = this.lllIlIIlIIIlIlIIIllIlllIl(String.valueOf(c));
            if (bl2) {
                bl2 = false;
                if (c != 'l' && c != 'L') {
                    if (c == 'r' || c == 'R') {
                        bl3 = false;
                    }
                } else {
                    bl3 = true;
                }
            } else if (d2 < 0.0) {
                bl2 = true;
            } else {
                f = (float)((double)f + d2);
                if (bl3) {
                    f += 1.0f;
                }
            }
            if (f > (float)d) break;
            if (bl) {
                stringBuilder.insert(0, c);
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string == null) {
            return 0;
        }
        int n = 0;
        class_0522[] arrclass_0522 = this.lllIIIllIIIIlllIlIIllIIll;
        boolean bl = false;
        boolean bl2 = false;
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            char c = string.charAt(i);
            if (c == this.lllIIlIIIllllllIIIIlIlIlI && i < n2) {
                int n3 = "0123456789abcdefklmnor".indexOf(c);
                if (n3 < 16) {
                    bl = false;
                    bl2 = false;
                } else if (n3 == 17) {
                    bl = true;
                    arrclass_0522 = bl2 ? this.IllIIIllIIIIlIlIlIllIIlll : this.IllIIlllllllIIlIIlIIIIlIl;
                } else if (n3 == 20) {
                    bl2 = true;
                    arrclass_0522 = bl ? this.IllIIIllIIIIlIlIlIllIIlll : this.IIIllIllIIlIlIlIlIllllIIl;
                } else if (n3 == 21) {
                    bl = false;
                    bl2 = false;
                    arrclass_0522 = this.lllIIIllIIIIlllIlIIllIIll;
                }
                ++i;
                continue;
            }
            if (c >= arrclass_0522.length || c < '\u0000') continue;
            n += arrclass_0522[c].lllIIIllIIIIlllIlIIllIIll - 8 + this.lIllllIIlIIIlIllllllIIIll;
        }
        return n / 2;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        super.lllIIIllIIIIlllIlIIllIIll(bl);
        this.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        super.lllIlIIlIIIlIlIIIllIlllIl(bl);
        this.IlIIIIIllllllIIlllIllllll();
    }

    private void IlIIIIIllllllIIlllIllllll() {
        this.lIIIIlIlIIlllllIIllIIlIII = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.deriveFont(1), this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIlllllllIIlIIlIIIIlIl);
        this.llIIlllIllIllllIIIlIIIIII = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.deriveFont(2), this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIllIIlIlIlIlIllllIIl);
        this.llIIllIllIlIIlIIllIllllll = this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.deriveFont(3), this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IllIIIllIIIIlIlIlIllIIlll);
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, float f) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }

    public String lllIlIIlIIIlIlIIIllIlllIl(String string, double d) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        boolean bl = false;
        for (char c : string.toCharArray()) {
            String string2;
            String string3;
            if (bl) {
                stringBuilder.append(c);
                bl = false;
                continue;
            }
            if (c == '\u00a7') {
                stringBuilder.append(c);
                bl = true;
                continue;
            }
            stringBuilder.append(c);
            int n = this.lllIlIIlIIIlIlIIIllIlllIl(stringBuilder.toString());
            if (!((double)n >= d)) continue;
            String string4 = stringBuilder.toString();
            if (string4.contains(" ")) {
                string3 = string4.substring(0, string4.lastIndexOf(" "));
                string2 = string4.substring(string4.lastIndexOf(" "), string4.length());
                if (string2.startsWith(" ")) {
                    string2 = string2.replaceFirst(" ", "");
                }
            } else {
                string3 = string4.substring(0, string4.length() - 1);
                string2 = string4.substring(string4.length() - 1, string4.length());
            }
            stringBuilder2.append(string3).append("\n");
            String string5 = class_1227.IlIllllllIIlIIllllIIlIIIl(stringBuilder.toString());
            stringBuilder.setLength(0);
            stringBuilder.append(string2).append(string5);
        }
        stringBuilder2.append((CharSequence)stringBuilder);
        return stringBuilder2.length() == 0 ? string : stringBuilder2.toString();
    }

    public List IlIllllllIIlIIllllIIlIIIl(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((double)this.lllIlIIlIIIlIlIIIllIlllIl(string) > d) {
            String[] arrstring = string.split(" ");
            String string2 = "";
            int n = 65535;
            for (String string3 : arrstring) {
                for (int i = 0; i < string3.toCharArray().length; ++i) {
                    char c = string3.toCharArray()[i];
                    if (c != this.lllIIlIIIllllllIIIIlIlIlI || i >= string3.toCharArray().length - 1) continue;
                    n = string3.toCharArray()[i + 1];
                }
                StringBuilder stringBuilder = new StringBuilder();
                if ((double)this.lllIlIIlIIIlIlIIIllIlllIl(stringBuilder.append(string2).append(string3).append(" ").toString()) < d) {
                    string2 = string2 + string3 + " ";
                    continue;
                }
                arrayList.add(string2);
                string2 = this.lllIIlIIIllllllIIIIlIlIlI + n + string3 + " ";
            }
            if (string2.length() > 0) {
                if ((double)this.lllIlIIlIIIlIlIIIllIlllIl(string2) < d) {
                    arrayList.add(this.lllIIlIIIllllllIIIIlIlIlI + n + string2 + " ");
                    string2 = "";
                } else {
                    for (String string4 : this.lIlllIlllIIIIlIIlllIllIII(string2, d)) {
                        arrayList.add(string4);
                    }
                }
            }
        } else {
            arrayList.add(string);
        }
        return arrayList;
    }

    public List lIlllIlllIIIIlIIlllIllIII(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = "";
        int n = 65535;
        char[] arrc = string.toCharArray();
        for (int i = 0; i < arrc.length; ++i) {
            char c = arrc[i];
            if (c == this.lllIIlIIIllllllIIIIlIlIlI && i < arrc.length - 1) {
                n = arrc[i + 1];
            }
            StringBuilder stringBuilder = new StringBuilder();
            if ((double)this.lllIlIIlIIIlIlIIIllIlllIl(stringBuilder.append(string2).append(c).toString()) < d) {
                string2 = string2 + c;
                continue;
            }
            arrayList.add(string2);
            string2 = this.lllIIlIIIllllllIIIIlIlIlI + n + String.valueOf(c);
        }
        if (string2.length() > 0) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        for (int i = 0; i < 32; ++i) {
            int n = (i >> 3 & 1) * 85;
            int n2 = (i >> 2 & 1) * 170 + n;
            int n3 = (i >> 1 & 1) * 170 + n;
            int n4 = (i & 1) * 170 + n;
            if (i == 6) {
                n2 += 85;
            }
            if (i >= 16) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            this.IlIlllIIIIIIlIIllIIllIlll[i] = (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
        }
    }
}

