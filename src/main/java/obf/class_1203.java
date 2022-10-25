package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Minecraft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class class_1203 {
    public Minecraft lllIIIllIIIIlllIlIIllIIll = Minecraft.getMinecraft();
    private boolean llIIllIllIlIIlIIllIllllll;
    public boolean lllIlIIlIIIlIlIIIllIlllIl = true;
    public boolean IlIllllllIIlIIllllIIlIIIl = true;
    public boolean lIlllIlllIIIIlIIlllIllIII = true;
    public boolean IlIIIIIllllllIIlllIllllll = false;
    public boolean lIllllIIlIIIlIllllllIIIll = true;
    public boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    public boolean IllIIlllllllIIlIIlIIIIlIl = true;
    public boolean IIIllIllIIlIlIlIlIllllIIl = true;
    public boolean IllIIIllIIIIlIlIlIllIIlll = true;
    public boolean lIIIIlIlIIlllllIIllIIlIII = true;
    float llIIlllIllIllllIIIlIIIIII = 1.0f;

    public void lllIIIllIIIIlllIlIIllIIll(File file) {
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                String[] arrstring = string.split(":");
                if (arrstring[0].equals("Show Radar")) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Show Hostiles")) {
                    this.IlIllllllIIlIIllllIIlIIIl = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Show Players")) {
                    this.lIlllIlllIIIIlIIlllIllIII = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Show Neutrals")) {
                    this.IlIIIIIllllllIIlllIllllll = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Filter Mob Icons")) {
                    this.IllIIlllllllIIlIIlIIIIlIl = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Outline Mob Icons")) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Show Player Helmets")) {
                    this.IIIllIllIIlIlIlIlIllllIIl = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Show Mob Helmets")) {
                    this.IllIIIllIIIIlIlIlIllIIlll = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Show Player Names")) {
                    this.lIllllIIlIIIlIllllllIIIll = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Font Scale")) {
                    this.llIIlllIllIllllIIIlIIIIII = Float.parseFloat(arrstring[1]);
                    continue;
                }
                if (arrstring[0].equals("Randomobs")) {
                    this.lIIIIlIlIIlllllIIllIIlIII = Boolean.parseBoolean(arrstring[1]);
                    continue;
                }
                if (!arrstring[0].equals("Hidden Mobs")) continue;
                this.lllIIIllIIIIlllIlIIllIIll(arrstring[1]);
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(String string) {
        String[] arrstring = string.split(",");
        for (int i = 0; i < arrstring.length; ++i) {
            class_1667 class_16672 = class_1667.lllIIIllIIIIlllIlIIllIIll(arrstring[i]);
            if (class_16672 != null) {
                class_16672.lIIlIlllIllIlIlllIIIIIIII = false;
                continue;
            }
            class_0812.lllIIIllIIIIlllIlIIllIIll(arrstring[i], false);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(PrintWriter printWriter) {
        printWriter.println("Show Radar:" + Boolean.toString(this.lllIlIIlIIIlIlIIIllIlllIl));
        printWriter.println("Show Hostiles:" + Boolean.toString(this.IlIllllllIIlIIllllIIlIIIl));
        printWriter.println("Show Players:" + Boolean.toString(this.lIlllIlllIIIIlIIlllIllIII));
        printWriter.println("Show Neutrals:" + Boolean.toString(this.IlIIIIIllllllIIlllIllllll));
        printWriter.println("Filter Mob Icons:" + Boolean.toString(this.IllIIlllllllIIlIIlIIIIlIl));
        printWriter.println("Outline Mob Icons:" + Boolean.toString(this.IIIllIIlIIIIIIlIlIIllIIlI));
        printWriter.println("Show Player Helmets:" + Boolean.toString(this.IIIllIllIIlIlIlIlIllllIIl));
        printWriter.println("Show Mob Helmets:" + Boolean.toString(this.IllIIIllIIIIlIlIlIllIIlll));
        printWriter.println("Show Player Names:" + Boolean.toString(this.lIllllIIlIIIlIllllllIIIll));
        printWriter.println("Font Scale:" + Float.toString(this.llIIlllIllIllllIIIlIIIIII));
        printWriter.println("Randomobs:" + Boolean.toString(this.lIIIIlIlIIlllllIIllIIlIII));
        printWriter.print("Hidden Mobs:");
        for (class_1667 class_16672 : class_1667.values()) {
            if (!class_16672.IIIIlIlIIlIIIIlIlllIlIIII || class_16672.lIIlIlllIllIlIlllIIIIIIII) continue;
            printWriter.print(class_16672.llllIlIIIIIIIIIlllIIlIIIl + ",");
        }
        for (class_0562 class_05622 : class_0812.lllIIIllIIIIlllIlIIllIIll) {
            if (class_05622.lllIlIIlIIIlIlIIIllIlllIl) continue;
            printWriter.print(class_05622.lllIIIllIIIIlllIlIIllIIll + ",");
        }
        printWriter.println();
    }

    public String lllIIIllIIIIlllIlIIllIIll(class_1002 class_10022) {
        String string = class_0950.lllIIIllIIIIlllIlIIllIIll(class_10022.IlIIIIIllllllIIlllIllllll()) + ": ";
        if (class_10022.lllIlIIlIIIlIlIIIllIlllIl()) {
            boolean bl = this.lllIlIIlIIIlIlIIIllIlllIl(class_10022);
            if (bl) {
                return string + class_0950.lllIIIllIIIIlllIlIIllIIll("options.on");
            }
            return string + class_0950.lllIIIllIIIIlllIlIIllIIll("options.off");
        }
        return string;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1002 class_10022) {
        switch (class_10022) {
            case lIIlIIIIIlIlllIlIIlIlIlll: {
                return this.lllIlIIlIIIlIlIIIllIlllIl;
            }
            case lIlIlIIlIIIIlIIIIIlllIIII: {
                return this.IlIllllllIIlIIllllIIlIIIl;
            }
            case IlIIIlIIIIllIIIllIIIIIIll: {
                return this.lIlllIlllIIIIlIIlllIllIII;
            }
            case IIlllIlIlllIllIIIlllIIlIl: {
                return this.IlIIIIIllllllIIlllIllllll;
            }
            case lIlIllIIlIIlIIlIIlIIlIIll: {
                return this.IIIllIllIIlIlIlIlIllllIIl;
            }
            case llIIlIllIllllIlIIIIlIIlll: {
                return this.IllIIIllIIIIlIlIlIllIIlll;
            }
            case llIllllIlIllIIIlIllIIlIlI: {
                return this.lIllllIIlIIIlIllllllIIIll;
            }
            case lIlllIlllIlIIIIlllIlIlIIl: {
                return this.IIIllIIlIIIIIIlIlIIllIIlI;
            }
            case IlIIlllllIIlIlIlllllIllll: {
                return this.IllIIlllllllIIlIIlIIIIlIl;
            }
            case llIIlIlIlllIIllIlIlllIllI: {
                return this.lIIIIlIlIIlllllIIllIIlIII;
            }
        }
        throw new IllegalArgumentException("Add code to handle EnumOptionMinimap: " + class_10022.IlIIIIIllllllIIlllIllllll() + ". (possibly not a boolean)");
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1002 class_10022, int n) {
        switch (class_10022) {
            case lIIlIIIIIlIlllIlIIlIlIlll: {
                this.lllIlIIlIIIlIlIIIllIlllIl = !this.lllIlIIlIIIlIlIIIllIlllIl;
                break;
            }
            case lIlIlIIlIIIIlIIIIIlllIIII: {
                this.IlIllllllIIlIIllllIIlIIIl = !this.IlIllllllIIlIIllllIIlIIIl;
                break;
            }
            case IlIIIlIIIIllIIIllIIIIIIll: {
                this.lIlllIlllIIIIlIIlllIllIII = !this.lIlllIlllIIIIlIIlllIllIII;
                break;
            }
            case IIlllIlIlllIllIIIlllIIlIl: {
                this.IlIIIIIllllllIIlllIllllll = !this.IlIIIIIllllllIIlllIllllll;
                break;
            }
            case lIlIllIIlIIlIIlIIlIIlIIll: {
                this.IIIllIllIIlIlIlIlIllllIIl = !this.IIIllIllIIlIlIlIlIllllIIl;
                break;
            }
            case llIIlIllIllllIlIIIIlIIlll: {
                this.IllIIIllIIIIlIlIlIllIIlll = !this.IllIIIllIIIIlIlIlIllIIlll;
                break;
            }
            case llIllllIlIllIIIlIllIIlIlI: {
                this.lIllllIIlIIIlIllllllIIIll = !this.lIllllIIlIIIlIllllllIIIll;
                break;
            }
            case lIlllIlllIlIIIIlllIlIlIIl: {
                this.IIIllIIlIIIIIIlIlIIllIIlI = !this.IIIllIIlIIIIIIlIlIIllIIlI;
                break;
            }
            case IlIIlllllIIlIlIlllllIllll: {
                this.IllIIlllllllIIlIIlIIIIlIl = !this.IllIIlllllllIIlIIlIIIIlIl;
                break;
            }
            case llIIlIlIlllIIllIlIlllIllI: {
                this.lIIIIlIlIIlllllIIllIIlIII = !this.lIIIIlIlIIlllllIIllIIlIII;
                break;
            }
            default: {
                throw new IllegalArgumentException("Add code to handle EnumOptionMinimap: " + class_10022.IlIIIIIllllllIIlllIllllll());
            }
        }
        this.llIIllIllIlIIlIIllIllllll = true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.llIIllIllIlIIlIIllIllllll) {
            this.llIIllIllIlIIlIIllIllllll = false;
            return true;
        }
        return false;
    }
}

