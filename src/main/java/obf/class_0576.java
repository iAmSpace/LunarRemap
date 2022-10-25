package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.settings.KeyBinding;
import com.moonsworth.lunar.client.config.Setting;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class class_0576 {
    public static final File lllIIIllIIIIlllIlIIllIIll = new File(Minecraft.getMinecraft().mcDataDir + File.separator + "config" + File.separator + "lunarclient");
    private File lllIlIIlIIIlIlIIIllIlllIl = new File(lllIIIllIIIIlllIlIIllIIll + File.separator + "global.cfg");
    private File IlIllllllIIlIIllllIIlIIIl = new File(lllIIIllIIIIlllIlIIllIIll + File.separator + "mutes.cfg");
    private File lIlllIlllIIIIlIIlllIllIII = new File(lllIIIllIIIIlllIlIIllIIll + File.separator + "default.cfg");

    public void lllIIIllIIIIlllIlIIllIIll() {
        try {
            if (this.IlIllllllIIlIIllllIIlIIIl()) {
                LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl();
                this.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl);
                this.lIlllIlllIIIIlIIlllIllIII(this.IlIllllllIIlIIllllIIlIIIl);
                this.lllIlIIlIIIlIlIIIllIlllIl(LunarClient.getInstance().activeProfile.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        try {
            if (this.IlIllllllIIlIIllllIIlIIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
                this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl);
                if (LunarClient.getInstance().activeProfile == null) {
                    LunarClient.getInstance().activeProfile = (Profile) LunarClient.getInstance().profiles.get(0);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(LunarClient.getInstance().activeProfile.getName());
                }
                LunarClient.getInstance().getModuleManager().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean IlIllllllIIlIIllllIIlIIIl() throws IOException {
        return !(!lllIIIllIIIIlllIlIIllIIll.exists() && !lllIIIllIIIIlllIlIIllIIll.mkdirs() || !this.lIlllIlllIIIIlIIlllIllIII.exists() && !this.lIlllIlllIIIIlIIlllIllIII.createNewFile() || !this.lllIlIIlIIIlIlIIIllIlllIl.exists() && !this.lllIlIIlIIIlIlIIIllIlllIl.createNewFile());
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        if (string.equalsIgnoreCase("default")) {
            LunarClient.getInstance().activeProfile = (Profile) LunarClient.getInstance().profiles.get(0);
            for (AbstractModule class_16652 : LunarClient.getInstance().getModuleManager().modules) {
                class_16652.lllIIIllIIIIlllIlIIllIIll(class_16652.lIlIlIIlIIIIlIIIIIlllIIII);
                class_16652.lllIIIllIIIIlllIlIIllIIll(class_16652.IlIIIlIIIIllIIIllIIIIIIll);
                class_16652.lllIIIllIIIIlllIlIIllIIll(class_16652.IIlllIlIlllIllIIIlllIIlIl, class_16652.lIlIllIIlIIlIIlIIlIIlIIll);
                class_16652.IlIIIIIllllllIIlllIllllll(class_16652.llIIlIllIllllIlIIIIlIIlll);
                for (int i = 0; i < class_16652.llIIlllIllIllllIIIlIIIIII().size(); ++i) {
                    try {
                        ((Setting)class_16652.llIIlllIllIllllIIIlIIIIII().get(i)).lllIIIllIIIIlllIlIIllIIll(class_16652.llIIllIllIlIIlIIllIllllll().get(i), false);
                        continue;
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
            return;
        }
        File file = new File(lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles");
        File file2 = file.exists() || file.mkdirs() ? new File(file + File.separator + string + ".cfg") : null;
        if (!file2.exists()) {
            this.lllIlIIlIIIlIlIIIllIlllIl(string);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LunarClient.getInstance().getModuleManager().modules);
        arrayList.addAll(LunarClient.getInstance().getModuleManager().staffModules);
        try {
            String string2;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
            Object object = null;
            block34: while ((string2 = bufferedReader.readLine()) != null) {
                try {
                    String[] arrstring;
                    Object object222;
                    if (string2.startsWith("#") || string2.length() == 0) continue;
                    if (string2.startsWith("[")) {
                        for (Object object2223 : arrayList) {
                            if (!("[" + ((AbstractModule)object2223).IIIllIIlIIIIIIlIlIIllIIlI() + "]").equalsIgnoreCase(string2)) continue;
                            object = object2223;
                            continue block34;
                        }
                        continue;
                    }
                    if (object == null) continue;
                    if (string2.startsWith("-")) {
                        arrstring = string2.replaceFirst("-", "").split("=", 2);
                        if (arrstring.length != 2) continue;
                        try {
                            block12 : switch (arrstring[0]) {
                                case "State": {
                                    if (((AbstractModule)object).lIlllIlllIIIIlIIlllIllIII()) break;
                                    ((AbstractModule)object).lllIIIllIIIIlllIlIIllIIll(Boolean.parseBoolean(arrstring[1]));
                                    break;
                                }
                                case "RenderHUD": {
                                    ((AbstractModule)object).IlIIIIIllllllIIlllIllllll(Boolean.parseBoolean(arrstring[1]));
                                    break;
                                }
                                case "Position": {
                                    if (((AbstractModule)object).IlIlllIIIIIIlIIllIIllIlll() == null) break;
                                    for (class_0767 class_07672 : class_0767.values()) {
                                        if (!class_07672.lllIIIllIIIIlllIlIIllIIll().toLowerCase().equalsIgnoreCase(arrstring[1].toLowerCase())) continue;
                                        ((AbstractModule)object).lllIIIllIIIIlllIlIIllIIll(class_07672);
                                        break block12;
                                    }
                                    continue block34;
                                }
                                case "xTranslation": {
                                    ((AbstractModule)object).lllIlIIlIIIlIlIIIllIlllIl(Float.parseFloat(arrstring[1]));
                                    break;
                                }
                                case "yTranslation": {
                                    ((AbstractModule)object).lllIIIllIIIIlllIlIIllIIll(Float.parseFloat(arrstring[1]));
                                }
                            }
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                        continue;
                    }
                    arrstring = string2.split("=", 2);
                    if (arrstring.length != 2) continue;
                    object222 = ((AbstractModule)object).llIIlllIllIllllIIIlIIIIII().iterator();
                    while (object222.hasNext()) {
                        Setting class_16092 = (Setting)object222.next();
                        if (class_16092.getName().equalsIgnoreCase("label") || !class_16092.getName().toLowerCase().equalsIgnoreCase(arrstring[0].toLowerCase())) continue;
                        try {
                            switch (class_16092.IllIIIllIIIIlIlIlIllIIlll()) {
                                case lIllllIIlIIIlIllllllIIIll: {
                                    class_16092.setValue(Boolean.parseBoolean(arrstring[1]));
                                    break;
                                }
                                case lIlllIlllIIIIlIIlllIllIII: {
                                    if (((AbstractModule)object).lIlllIlllIIIIlIIlllIllIII() && class_16092 == ((class_2256)object).lllIIIllIIIIlllIlIIllIIll()) {
                                        ((class_2256)object).lllIIIllIIIIlllIlIIllIIll().setValue(Integer.parseInt(arrstring[1]));
                                        break;
                                    }
                                    if (arrstring[1].contains("rainbow")) {
                                        String[] f = arrstring[1].split(";");
                                        int n = Integer.parseInt(f[0]);
                                        class_16092.lllIIIllIIIIlllIlIIllIIll = true;
                                        if (n > (Integer)class_16092.IlIllllllIIlIIllllIIlIIIl() || n < (Integer)class_16092.lllIlIIlIIIlIlIIIllIlllIl()) continue block34;
                                        class_16092.setValue(n);
                                        break;
                                    }
                                    int exception = Integer.parseInt(arrstring[1]);
                                    class_16092.lllIIIllIIIIlllIlIIllIIll = false;
                                    if (exception > (Integer)class_16092.IlIllllllIIlIIllllIIlIIIl() || exception < (Integer)class_16092.lllIlIIlIIIlIlIIIllIlllIl()) continue block34;
                                    class_16092.setValue(exception);
                                    break;
                                }
                                case IlIllllllIIlIIllllIIlIIIl: {
                                    float f = Float.parseFloat(arrstring[1]);
                                    if (!(f <= ((Float)class_16092.IlIllllllIIlIIllllIIlIIIl()).floatValue()) || !(f >= ((Float)class_16092.lllIlIIlIIIlIlIIIllIlllIl()).floatValue())) break;
                                    class_16092.setValue(Float.valueOf(f));
                                    break;
                                }
                                case IlIIIIIllllllIIlllIllllll: {
                                    double d = Double.parseDouble(arrstring[1]);
                                    if (!(d <= (Double)class_16092.IlIllllllIIlIIllllIIlIIIl()) || !(d >= (Double)class_16092.lllIlIIlIIIlIlIIIllIlllIl())) break;
                                    class_16092.setValue(d);
                                    break;
                                }
                                case lllIlIIlIIIlIlIIIllIlllIl: {
                                    boolean bl = false;
                                    for (Object object2 : class_16092.IllIIlllllllIIlIIlIIIIlIl()) {
                                        if (!((String)object2).toLowerCase().equalsIgnoreCase(arrstring[1].toLowerCase())) continue;
                                        bl = true;
                                    }
                                    if (!bl) break;
                                    class_16092.setValue(arrstring[1]);
                                    break;
                                }
                                case lllIIIllIIIIlllIlIIllIIll: {
                                    if (class_16092.getName().equalsIgnoreCase("label")) break;
                                    if (class_16092 == LunarClient.getInstance().getModuleManager().IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl) {
                                        arrstring[1] = arrstring[1].replaceAll("%FPS%", "%BOOST%");
                                    }
                                    class_16092.setValue(arrstring[1].replaceAll("&([abcdefghijklmrABCDEFGHIJKLMNR0-9])|(&$)", "\u00a7$1"));
                                }
                            }
                            continue block34;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            if (class_16092 != LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIlIIlIIIlIlIIIllIlllIl) continue;
                            LunarClient.getInstance().getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
                        }
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(string);
    }

    public void lllIIIllIIIIlllIlIIllIIll(File file) {
        if (!file.exists()) {
            this.lllIlIIlIIIlIlIIIllIlllIl(file);
            return;
        }
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            block21: while ((string = bufferedReader.readLine()) != null) {
                try {
                    Object object;
                    String[] arrstring;
                    if (string.startsWith("#") || string.length() == 0 || (arrstring = string.split("=", 2)).length != 2) continue;
                    if (arrstring[0].equalsIgnoreCase("FavoriteColors")) {
                        object = arrstring[1].split(",");
                        for (Object object2 : object) {
                            try {
                                LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII.add(new class_1788(1.0f, Integer.parseInt((String)object2), 1.0f));
                            }
                            catch (NumberFormatException numberFormatException) {
                                numberFormatException.printStackTrace();
                            }
                        }
                        continue;
                    }
                    if (arrstring[0].equalsIgnoreCase("FavoriteStations")) {
                        object = arrstring[1].split(",");
                        for (Object object2 : object) {
                            try {
                                for (class_1878 class_18782 : LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl()) {
                                    if (!class_18782.IIIllIIlIIIIIIlIlIIllIIlI().equalsIgnoreCase((String)object2)) continue;
                                    class_18782.lllIIIllIIIIlllIlIIllIIll(true);
                                }
                            }
                            catch (NumberFormatException numberFormatException) {
                                numberFormatException.printStackTrace();
                            }
                        }
                        continue;
                    }
                    if (arrstring[0].equalsIgnoreCase("XrayBlocks")) {
                        LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().clear();
                        object = arrstring[1].split(",");
                        for (Object object2 : object) {
                            try {
                                LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().add(Integer.parseInt((String)object2));
                            }
                            catch (NumberFormatException numberFormatException) {
                                numberFormatException.printStackTrace();
                            }
                        }
                        continue;
                    }
                    if (arrstring[0].startsWith("key_")) {
                        for (KeyBinding class_13352 : Minecraft.getMinecraft().gameSettings.keyBindings) {
                            if (!class_13352.lllIIIllIIIIlllIlIIllIIll || !arrstring[0].equalsIgnoreCase("key_" + class_13352.IIIllIIlIIIIIIlIlIIllIIlI())) continue;
                            class_13352.lllIlIIlIIIlIlIIIllIlllIl(Integer.parseInt(arrstring[1]));
                        }
                        continue;
                    }
                    if (arrstring[0].equalsIgnoreCase("ProfileIndexes")) {
                        object = arrstring[1].split("]\\[");
                        for (Object object2 : object) {
                            object2 = ((String)object2).replaceFirst("\\[", "");
                            String[] arrstring2 = ((String)object2).split(",", 2);
                            try {
                                int n = Integer.parseInt(arrstring2[1]);
                                for (Profile class_11652 : LunarClient.getInstance().profiles) {
                                    if (n == 0 || !class_11652.getName().equalsIgnoreCase(arrstring2[0])) continue;
                                    class_11652.index = n;
                                }
                            }
                            catch (NumberFormatException numberFormatException) {
                                // empty catch block
                            }
                        }
                        continue;
                    }
                    if (arrstring[0].equalsIgnoreCase("ActiveProfile")) {
                        object = null;
                        File file2 = new File(lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles");
                        if (file2.exists() || file2.mkdirs()) {
                            object = new File(file2 + File.separator + arrstring[1] + ".cfg");
                        }
                        if (object == null || !((File)object).exists()) continue;
                        Profile object3 = null;
                        for (Profile object2 : LunarClient.getInstance().profiles) {
                            if (!arrstring[1].equalsIgnoreCase(object2.getName())) continue;
                            object3 = object2;
                        }
                        if (object3 == null || object3.getName().equalsIgnoreCase("default")) continue;
                        LunarClient.getInstance().activeProfile = object3;
                        continue;
                    }
                    for (Setting class_16092 : LunarClient.getInstance().getSettingsManager().settingsList) {
                        if (class_16092.getName().equalsIgnoreCase("label") || !class_16092.getName().toLowerCase().equalsIgnoreCase(arrstring[0].toLowerCase())) continue;
                        try {
                            switch (class_16092.IllIIIllIIIIlIlIlIllIIlll()) {
                                case lIllllIIlIIIlIllllllIIIll: {
                                    class_16092.setValue(Boolean.parseBoolean(arrstring[1]));
                                    break;
                                }
                                case lIlllIlllIIIIlIIlllIllIII: {
                                    if (arrstring[1].contains("rainbow")) {
                                        String[] arrstring3 = arrstring[1].split(";");
                                        int n = Integer.parseInt(arrstring3[0]);
                                        class_16092.lllIIIllIIIIlllIlIIllIIll = true;
                                        if (n > (Integer)class_16092.IlIllllllIIlIIllllIIlIIIl() || n < (Integer)class_16092.lllIlIIlIIIlIlIIIllIlllIl()) continue block21;
                                        class_16092.setValue(n);
                                        break;
                                    }
                                    int n = Integer.parseInt(arrstring[1]);
                                    class_16092.lllIIIllIIIIlllIlIIllIIll = false;
                                    if (n > (Integer)class_16092.IlIllllllIIlIIllllIIlIIIl() || n < (Integer)class_16092.lllIlIIlIIIlIlIIIllIlllIl()) continue block21;
                                    class_16092.setValue(n);
                                    break;
                                }
                                case IlIllllllIIlIIllllIIlIIIl: {
                                    float f = Float.parseFloat(arrstring[1]);
                                    if (!(f <= ((Float)class_16092.IlIllllllIIlIIllllIIlIIIl()).floatValue()) || !(f >= ((Float)class_16092.lllIlIIlIIIlIlIIIllIlllIl()).floatValue())) break;
                                    class_16092.setValue(Float.valueOf(f));
                                    break;
                                }
                                case IlIIIIIllllllIIlllIllllll: {
                                    double d = Double.parseDouble(arrstring[1]);
                                    if (!(d <= (Double)class_16092.IlIllllllIIlIIllllIIlIIIl()) || !(d >= (Double)class_16092.lllIlIIlIIIlIlIIIllIlllIl())) break;
                                    class_16092.setValue(d);
                                    break;
                                }
                                case lllIlIIlIIIlIlIIIllIlllIl: {
                                    boolean bl = false;
                                    for (Object object4 : class_16092.IllIIlllllllIIlIIlIIIIlIl()) {
                                        if (!((String)object4).toLowerCase().equalsIgnoreCase(arrstring[1].toLowerCase())) continue;
                                        bl = true;
                                    }
                                    if (!bl) break;
                                    class_16092.setValue(arrstring[1]);
                                }
                            }
                            continue block21;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(file);
    }

    /*
     * WARNING - void declaration
     */
    public void lllIlIIlIIIlIlIIIllIlllIl(File file) {
        try {
            void var3_7;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("################################");
            bufferedWriter.newLine();
            bufferedWriter.write("# MC_Client: GLOBAL SETTINGS");
            bufferedWriter.newLine();
            bufferedWriter.write("################################");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            if (LunarClient.getInstance().activeProfile != null && !LunarClient.getInstance().activeProfile.getName().equals("default")) {
                bufferedWriter.write("ActiveProfile=" + LunarClient.getInstance().activeProfile.getName());
                bufferedWriter.newLine();
            }
            for (Setting class_16092 : LunarClient.getInstance().getSettingsManager().settingsList) {
                if (class_16092.getName().equalsIgnoreCase("label"))
                    continue;
                if (class_16092.lllIIIllIIIIlllIlIIllIIll) {
                    bufferedWriter.write(class_16092.getName() + "=" + class_16092.getValue() + ";rainbow");
                } else {
                    bufferedWriter.write(class_16092.getName() + "=" + class_16092.getValue());
                }
                bufferedWriter.newLine();
            }
            for (KeyBinding class_13352 : Minecraft.getMinecraft().gameSettings.keyBindings) {
                if (!class_13352.lllIIIllIIIIlllIlIIllIIll) continue;
                bufferedWriter.write("key_" + class_13352.IIIllIIlIIIIIIlIlIIllIIlI() + "=" + class_13352.IIIllIllIIlIlIlIlIllllIIl());
                bufferedWriter.newLine();
            }
            String string = "";
            for (class_1788 class_17882 : LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII) {
                String string2 = (String)var3_7 + class_17882.lllIIIllIIIIlllIlIIllIIll + (LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII.indexOf(class_17882) == LunarClient.getInstance().getSettingsManager().llIIlIIllIIllIlIIllIIllII.size() - 1 ? "" : ",");
            }
            if (var3_7 != "") {
                bufferedWriter.write("FavoriteColors=" + (String)var3_7);
                bufferedWriter.newLine();
            }
            Object object = "";
            for (class_1878 class_18782 : LunarClient.getInstance().lIlllIlllIlIIIIlllIlIlIIl().lllIlIIlIIIlIlIIIllIlllIl()) {
                if (!class_18782.IllIIlllllllIIlIIlIIIIlIl()) continue;
                if (((String)object).length() != 0) {
                    object = (String)object + ",";
                }
                object = (String)object + class_18782.IIIllIIlIIIIIIlIlIIllIIlI();
            }
            if (object != "") {
                bufferedWriter.write("FavoriteStations=" + (String)object);
                bufferedWriter.newLine();
            }
            Object object2 = "";
            Iterator iterator = LunarClient.getInstance().getModuleManager().lllllIlllIIllIlIIlIIIllII.llIIlIllIllllIlIIIIlIIlll().iterator();
            while (iterator.hasNext()) {
                int n = (Integer)iterator.next();
                if (((String)object2).length() != 0) {
                    object2 = (String)object2 + ",";
                }
                object2 = (String)object2 + n;
            }
            bufferedWriter.write("XrayBlocks=" + (String)object2);
            bufferedWriter.newLine();
            bufferedWriter.write("ProfileIndexes=");
            for (Profile class_11652 : LunarClient.getInstance().profiles) {
                bufferedWriter.write("[" + class_11652.getName() + "," + class_11652.index + "]");
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(File file) {
        try {
            String string;
            if (!file.exists()) {
                this.lIlllIlllIIIIlIIlllIllIII(file);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    UUID uUID = UUID.fromString(string);
                    LunarClient.getInstance().getNetworkManager().IllIIlllllllIIlIIlIIIIlIl().add(uUID);
                }
                catch (Exception exception) {}
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void lIlllIlllIIIIlIIlllIllIII(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (UUID uUID : LunarClient.getInstance().getNetworkManager().IllIIlllllllIIlIIlIIIIlIl()) {
                bufferedWriter.write(uUID.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        if (string.equalsIgnoreCase("default")) {
            return;
        }
        File file = new File(lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles");
        File file2 = file.exists() || file.mkdirs() ? new File(file + File.separator + string + ".cfg") : null;
        try {
            if (file2 != null && !file2.exists() && !file2.createNewFile()) {
                return;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LunarClient.getInstance().getModuleManager().modules);
        arrayList.addAll(LunarClient.getInstance().getModuleManager().staffModules);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write("################################");
            bufferedWriter.newLine();
            bufferedWriter.write("# MC_Client: MODULE SETTINGS");
            bufferedWriter.newLine();
            bufferedWriter.write("################################");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            for (AbstractModule class_16652 : arrayList) {
                bufferedWriter.write("[" + class_16652.IIIllIIlIIIIIIlIlIIllIIlI() + "]");
                bufferedWriter.newLine();
                bufferedWriter.write("-State=" + class_16652.lIllllIIlIIIlIllllllIIIll());
                bufferedWriter.newLine();
                if (class_16652.IlIlllIIIIIIlIIllIIllIlll() != null) {
                    bufferedWriter.write("-Position=" + class_16652.IlIlllIIIIIIlIIllIIllIlll().lllIIIllIIIIlllIlIIllIIll());
                    bufferedWriter.newLine();
                }
                bufferedWriter.write("-xTranslation=" + class_16652.IllIIIllIIIIlIlIlIllIIlll());
                bufferedWriter.newLine();
                bufferedWriter.write("-yTranslation=" + class_16652.lIIIIlIlIIlllllIIllIIlIII());
                bufferedWriter.newLine();
                bufferedWriter.write("-RenderHUD=" + class_16652.lllIIlIIIllllllIIIIlIlIlI());
                bufferedWriter.newLine();
                for (Setting class_16092 : class_16652.llIIlllIllIllllIIIlIIIIII()) {
                    if (class_16092 == LunarClient.getInstance().getModuleManager().IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll) {
                        bufferedWriter.write("# Customize your HUD info display string.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# (& color formatting is allowed)");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# Optional uses:");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %FPS% - Display current FPS.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %DIR% - Display current look direction.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %CPS% - Display CPS.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %COORDS% - Display coordinates.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %IP% - Current server IP.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %X% - Your X location.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %Y% - Your (foot) Y location.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %Z% - Your Z location.");
                        bufferedWriter.newLine();
                        bufferedWriter.write("# %NL% - Break into a new line.");
                        bufferedWriter.newLine();
                    }
                    if (class_16092.getName().equalsIgnoreCase("label")) continue;
                    if (class_16092.IllIIIllIIIIlIlIlIllIIlll() == class_1318.lllIIIllIIIIlllIlIIllIIll) {
                        bufferedWriter.write(class_16092.getName() + "=" + (class_16092.getValue() + "").replaceAll("\u00a7", "&"));
                    } else if (class_16092.lllIIIllIIIIlllIlIIllIIll) {
                        bufferedWriter.write(class_16092.getName() + "=" + class_16092.getValue() + ";rainbow");
                    } else {
                        bufferedWriter.write(class_16092.getName() + "=" + class_16092.getValue());
                    }
                    bufferedWriter.newLine();
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

