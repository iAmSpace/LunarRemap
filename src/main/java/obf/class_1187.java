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
import net.minecraft.client.Minecraft;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class class_1187
implements class_0153 {
    class_2013 lllIIIllIIIIlllIlIIllIIll;
    public class_1835 lllIlIIlIIIlIlIIIllIlllIl = null;
    private ArrayList IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private ArrayList lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    private ArrayList IlIIIIIllllllIIlllIllllll;
    private String lIllllIIlIIIlIllllllIIIll = "";
    private String IIIllIIlIIIIIIlIlIIllIIlI = "";
    private String IllIIlllllllIIlIIlIIIIlIl = "";
    private class_2163 IIIllIllIIlIlIlIlIllllIIl = null;
    private File IllIIIllIIIIlIlIlIllIIlll;
    private Object lIIIIlIlIIlllllIIllIIlIII = new Object();

    public class_1187(class_2013 class_20132) {
        this.lllIIIllIIIIlllIlIIllIIll = class_20132;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20132.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        boolean bl = true;
        for (class_0368 class_03682 : this.lllIIIllIIIIlllIlIIllIIll()) {
            if (!class_03682.lllIIIllIIIIlllIlIIllIIll.equalsIgnoreCase(string) || !class_03682.IllIIlllllllIIlIIlIIIIlIl.contains(n)) continue;
            bl = false;
        }
        return bl;
    }

    @Override
    public ArrayList lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
        Object object;
        TreeSet<Integer> treeSet3;
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
        for (TreeSet<Integer> treeSet3 : this.IlIllllllIIlIIllllIIlIIIl) {
            if (((class_0368)treeSet3).lllIIIllIIIIlllIlIIllIIll.equals("Latest Death")) {
                ((class_0368)treeSet3).lllIIIllIIIIlllIlIIllIIll = "Previous Death";
            }
            if (!((class_0368)treeSet3).lllIIIllIIIIlllIlIIllIIll.startsWith("Previous Death")) continue;
            if (this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIlIIIIlIIIIIlllIIII > 1) {
                int n = 0;
                try {
                    if (((class_0368)treeSet3).lllIIIllIIIIlllIlIIllIIll.length() > 15) {
                        n = Integer.parseInt(((class_0368)treeSet3).lllIIIllIIIIlllIlIIllIIll.substring(15));
                    }
                }
                catch (Exception exception) {
                    n = 0;
                }
                ((class_0368)treeSet3).IlIlIIlIlIllIIlIlIIllIIIl -= (((class_0368)treeSet3).IlIlIIlIlIllIIlIlIIllIIIl - 0.5f) / 8.0f;
                ((class_0368)treeSet3).lllllIlllIIllIlIIlIIIllII -= (((class_0368)treeSet3).lllllIlllIIllIlIIlIIIllII - 0.5f) / 8.0f;
                ((class_0368)treeSet3).IlIlIIlllIIlIllIIIlllllIl -= (((class_0368)treeSet3).IlIlIIlllIIlIllIIIlllllIl - 0.5f) / 8.0f;
                ((class_0368)treeSet3).lllIIIllIIIIlllIlIIllIIll = "Previous Death " + (n + 1);
                continue;
            }
            treeSet2.add(this.IlIllllllIIlIIllllIIlIIIl.indexOf(treeSet3));
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIlIIIIlIIIIIlllIIII < 2 && treeSet2.size() > 0) {
            object = (TreeSet)treeSet2.descendingSet();
            treeSet3 = ((TreeSet)object).iterator();
            while (treeSet3.hasNext()) {
                Integer n = (Integer)treeSet3.next();
                this.lllIlIIlIIIlIlIIIllIlllIl(n);
            }
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIlIIIIlIIIIIlllIIII > 0) {
            object = Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII;
            treeSet3 = new TreeSet<Integer>();
            treeSet3.add(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI);
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_0368("Latest Death", ((class_1389)object).lIIllllllllIlIllllllllIlI != -1 ? class_0006.lIlllIlllIIIIlIIlllIllIII() : class_0006.lIlllIlllIIIIlIIlllIllIII() * 8, ((class_1389)object).lIIllllllllIlIllllllllIlI != -1 ? class_0006.IlIIIIIllllllIIlllIllllll() : class_0006.IlIIIIIllllllIIlllIllllll() * 8, class_0006.lIllllIIlIIIlIllllllIIIll() - 1, true, 1.0f, 1.0f, 1.0f, "skull", this.lIllllIIlIIIlIllllllIIIll, treeSet3));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        Object object = this.lIIIIlIlIIlllllIIllIIlIII;
        synchronized (object) {
            for (class_0368 class_03682 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (class_03682.IllIIlllllllIIlIIlIIIIlIl.size() == 0 || class_03682.IllIIlllllllIIlIIlIIIIlIl.contains(n)) {
                    class_03682.IlIlllIIIIIIlIIllIIllIlll = true;
                    continue;
                }
                class_03682.IlIlllIIIIIIlIIllIIllIlll = false;
            }
            this.IllIIlllllllIIlIIlIIIIlIl();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IllIIlllllllIIlIIlIIIIlIl = string;
        Object object = this.lIIIIlIlIIlllllIIllIIlIII;
        synchronized (object) {
            String string2 = this.lIlllIlllIIIIlIIlllIllIII(string);
            for (class_0368 class_03682 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (string2 == "" || class_03682.IlIllllllIIlIIllllIIlIIIl == "" || string2.equals(class_03682.IlIllllllIIlIIllllIIlIIIl)) {
                    class_03682.lllIIlIIIllllllIIIIlIlIlI = true;
                    continue;
                }
                class_03682.lllIIlIIIllllllIIIIlIlIlI = false;
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lIllllIIlIIIlIllllllIIIll = string;
        this.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(String string) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = string;
        if (this.lIllllIIlIIIlIllllllIIIll.equals("")) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        File file;
        int n;
        String string = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().lIllllIIlIIIlIllllllIIIll();
        if (string.endsWith(":25565") && (n = string.lastIndexOf(":")) != -1) {
            string = string.substring(0, n);
        }
        string = this.IlIIIIIllllllIIlllIllllll(string);
        File file2 = class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft", true).getAbsoluteFile();
        if (!file2.equals(file = Minecraft.getMinecraft().mcDataDir.getAbsoluteFile())) {
            String string2 = "";
            if (Minecraft.getMinecraft().IIIIlIllIlIIlIIlIllIlIlll()) {
                string2 = file.getName();
                if ((string2.equalsIgnoreCase("minecraft") || string2.equalsIgnoreCase(".")) && file.getParentFile() != null) {
                    string2 = file.getParentFile().getName();
                }
                string2 = "~" + string2;
            }
            this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/VoxelMods/voxelMap", true), string + string2 + ".points");
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
            file2 = new File(Minecraft.getMinecraft().mcDataDir, "/mods/VoxelMods/voxelMap/");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            this.IllIIIllIIIIlIlIlIllIIlll = new File(Minecraft.getMinecraft().mcDataDir, "/mods/VoxelMods/voxelMap/" + string + ".points");
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
        } else {
            this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/VoxelMods/voxelMap", true), string + ".points");
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(File file) {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file));
            Date date = new Date();
            String string = new SimpleDateFormat("yyyyMMddHHmm").format(date);
            printWriter.println("filetimestamp:" + string);
            for (class_0368 class_03682 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (class_03682.lIlllIlllIIIIlIIlllIllIII || class_03682.IIIllIIlIIIIIIlIlIIllIIlI || class_03682.lIllllIIlIIIlIllllllIIIll || class_03682.lllIIIllIIIIlllIlIIllIIll.startsWith("^")) continue;
                String string2 = "";
                for (Integer n : class_03682.IllIIlllllllIIlIIlIIIIlIl) {
                    string2 = string2 + "" + n + "#";
                }
                if (string2.equals("")) {
                    string2 = "-1#0#";
                }
                printWriter.println("name:" + this.lIlllIlllIIIIlIIlllIllIII(class_03682.lllIIIllIIIIlllIlIIllIIll) + ",sworld:" + class_03682.IlIIIIIllllllIIlllIllllll + ",x:" + class_03682.IIIllIllIIlIlIlIlIllllIIl + ",z:" + class_03682.IllIIIllIIIIlIlIlIllIIlll + ",y:" + class_03682.lIIIIlIlIIlllllIIllIIlIII + ",enabled:" + Boolean.toString(class_03682.llIIlllIllIllllIIIlIIIIII) + ",red:" + class_03682.IlIlIIlIlIllIIlIlIIllIIIl + ",green:" + class_03682.lllllIlllIIllIlIIlIIIllII + ",blue:" + class_03682.IlIlIIlllIIlIllIIIlllllIl + ",suffix:" + class_03682.lllIlIIlIIIlIlIIIllIlllIl + ",world:" + this.lIlllIlllIIIIlIIlllIllIII(class_03682.IlIllllllIIlIIllllIIlIIIl) + ",dimensions:" + string2);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            class_1315.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "Error Saving Waypoints");
        }
    }

    public String lIlllIlllIIIIlIIlllIllIII(String string) {
        string = string.replace(":", "~colon~");
        string = string.replace(",", "~comma~");
        return string;
    }

    private String lIllllIIlIIIlIllllllIIIll(String string) {
        string = string.replace("~colon~", ":");
        string = string.replace("~comma~", ",");
        return string;
    }

    public String IlIIIIIllllllIIlllIllllll(String string) {
        string = string.replace("<", "~less~");
        string = string.replace(">", "~greater~");
        string = string.replace(":", "~colon~");
        string = string.replace("\"", "~quote~");
        string = string.replace("/", "~slash~");
        string = string.replace("\\", "~backslash~");
        string = string.replace("|", "~pipe~");
        string = string.replace("?", "~question~");
        string = string.replace("*", "~star~");
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        Object object = this.lIIIIlIlIIlllllIIllIIlIII;
        synchronized (object) {
            int n;
            boolean bl = false;
            this.IlIllllllIIlIIllllIIlIIIl = new ArrayList();
            String string = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().lIllllIIlIIIlIllllllIIIll();
            if (string.endsWith(":25565") && (n = string.lastIndexOf(":")) != -1) {
                string = string.substring(0, n);
            }
            string = this.IlIIIIIllllllIIlllIllllll(string);
            String string2 = this.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().lIllllIIlIIIlIllllllIIIll());
            String string3 = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().lIllllIIlIIIlIllllllIIIll();
            int n2 = string3.lastIndexOf(":");
            if (n2 != -1) {
                string3 = string3.substring(0, n2);
            }
            string3 = this.IlIIIIIllllllIIlllIllllll(string3);
            String string4 = this.IlIIIIIllllllIIlllIllllll(string3 + "~colon~25565");
            bl = this.IIIllIIlIIIIIIlIlIIllIIlI(string);
            if (!bl) {
                bl = this.lllIIIllIIIIlllIlIIllIIll(string3, string4, string2);
            }
            if (!bl) {
                bl = this.IllIIlllllllIIlIIlIIIIlIl(string3);
            }
            if (!bl) {
                class_1315.lllIIIllIIIIlllIlIIllIIll("\u00a7ENo waypoints exist for this world/server.");
            } else {
                this.lIllllIIlIIIlIllllllIIIll();
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl);
    }

    private boolean IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        String string2;
        File file;
        File file2 = class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft", false).getAbsoluteFile();
        if (!file2.equals(file = Minecraft.getMinecraft().mcDataDir.getAbsoluteFile())) {
            long l = -1L;
            long l2 = -1L;
            string2 = "";
            if (Minecraft.getMinecraft().IIIIlIllIlIIlIIlIllIlIlll()) {
                string2 = file.getName();
                if ((string2.equalsIgnoreCase("minecraft") || string2.equalsIgnoreCase(".")) && file.getParentFile() != null) {
                    string2 = file.getParentFile().getName();
                }
                string2 = "~" + string2;
            }
            File file3 = new File(Minecraft.getMinecraft().mcDataDir, "/mods/VoxelMods/voxelMap/" + string + ".points");
            l2 = this.lllIlIIlIIIlIlIIIllIlllIl(file3);
            File file4 = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/VoxelMods/voxelMap", false), string + string2 + ".points");
            if (!file4.exists() && !file3.exists()) {
                file4 = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/VoxelMods/voxelMap", false), string + ".points");
            }
            l = this.lllIlIIlIIIlIlIIIllIlllIl(file4);
            if (!file4.exists() && !file3.exists()) {
                return false;
            }
            this.IllIIIllIIIIlIlIlIllIIlll = !file4.exists() ? file3 : (!file3.exists() ? file4 : (l > l2 ? file4 : file3));
        } else {
            this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/VoxelMods/voxelMap", false), string + ".points");
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
            try {
                String string3;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.IllIIIllIIIIlIlIlIllIIlll));
                while ((string3 = bufferedReader.readLine()) != null) {
                    if (string3.startsWith("filetimestamp")) continue;
                    String[] arrstring = string3.split(",");
                    String string4 = "";
                    string2 = "";
                    int n = 0;
                    int n2 = 0;
                    int n3 = -1;
                    boolean bl = false;
                    float f = 0.5f;
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    String string5 = "";
                    String string6 = "";
                    TreeSet<Integer> treeSet = new TreeSet<Integer>();
                    for (int i = 0; i < arrstring.length; ++i) {
                        String[] arrstring2 = arrstring[i].split(":");
                        if (arrstring2.length != 2) continue;
                        String string7 = arrstring2[0];
                        String string8 = arrstring2[1];
                        if (string7.equals("name")) {
                            string4 = this.lIllllIIlIIIlIllllllIIIll(string8);
                            continue;
                        }
                        if (string7.equals("sworld")) {
                            string2 = this.lIllllIIlIIIlIllllllIIIll(string8);
                            continue;
                        }
                        if (string7.equals("x")) {
                            n = Integer.parseInt(string8);
                            continue;
                        }
                        if (string7.equals("z")) {
                            n2 = Integer.parseInt(string8);
                            continue;
                        }
                        if (string7.equals("y")) {
                            n3 = Integer.parseInt(string8);
                            continue;
                        }
                        if (string7.equals("enabled")) {
                            bl = Boolean.parseBoolean(string8);
                            continue;
                        }
                        if (string7.equals("red")) {
                            f = Float.parseFloat(string8);
                            continue;
                        }
                        if (string7.equals("green")) {
                            f2 = Float.parseFloat(string8);
                            continue;
                        }
                        if (string7.equals("blue")) {
                            f3 = Float.parseFloat(string8);
                            continue;
                        }
                        if (string7.equals("suffix")) {
                            string5 = string8;
                            continue;
                        }
                        if (string7.equals("world")) {
                            string6 = this.lIllllIIlIIIlIllllllIIIll(string8);
                            continue;
                        }
                        if (!string7.equals("dimensions")) continue;
                        String[] arrstring3 = string8.split("#");
                        for (int j = 0; j < arrstring3.length; ++j) {
                            treeSet.add(Integer.parseInt(arrstring3[j]));
                        }
                        if (treeSet.size() != 0) continue;
                        treeSet.add(0);
                        treeSet.add(-1);
                    }
                    if (string4.equals("")) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(string4, string2, n, n2, n3, bl, f, f2, f3, string5, string6, treeSet);
                }
                bufferedReader.close();
            }
            catch (Exception exception) {
                class_1315.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "Error Loading Waypoints");
                System.err.println("waypoint load error: " + exception.getLocalizedMessage());
                return false;
            }
            return true;
        }
        return false;
    }

    private long lllIlIIlIIIlIlIIIllIlllIl(File file) {
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String string = bufferedReader.readLine();
                String[] arrstring = string.split(":");
                bufferedReader.close();
                if (arrstring[0].equals("filetimestamp")) {
                    return Long.parseLong(arrstring[1]);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return -1L;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2, String string3) {
        try {
            this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/zan", false), string + ".points");
            if (!this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
                this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/zan", false), string2 + ".points");
            }
            if (!this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
                this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/zan", false), string3 + ".points");
            }
            if (!this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
                this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft", false), string3 + ".points");
            }
            if (this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
                String string4;
                TreeSet<Integer> treeSet = new TreeSet<Integer>();
                treeSet.add(-1);
                treeSet.add(0);
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.IllIIIllIIIIlIlIlIllIIlll));
                while ((string4 = bufferedReader.readLine()) != null) {
                    String[] arrstring = string4.split(":");
                    if (arrstring.length == 4) {
                        this.lllIIIllIIIIlllIlIIllIIll(arrstring[0], "", Integer.parseInt(arrstring[1]), Integer.parseInt(arrstring[2]), -1, Boolean.parseBoolean(arrstring[3]), 0.0f, 1.0f, 0.0f, "", "", treeSet);
                        continue;
                    }
                    if (arrstring.length == 7) {
                        this.lllIIIllIIIIlllIlIIllIIll(arrstring[0], "", Integer.parseInt(arrstring[1]), Integer.parseInt(arrstring[2]), -1, Boolean.parseBoolean(arrstring[3]), Float.parseFloat(arrstring[4]), Float.parseFloat(arrstring[5]), Float.parseFloat(arrstring[6]), "", "", treeSet);
                        continue;
                    }
                    if (arrstring.length == 8) {
                        if (arrstring[3].contains("true") || arrstring[3].contains("false")) {
                            this.lllIIIllIIIIlllIlIIllIIll(arrstring[0], "", Integer.parseInt(arrstring[1]), Integer.parseInt(arrstring[2]), -1, Boolean.parseBoolean(arrstring[3]), Float.parseFloat(arrstring[4]), Float.parseFloat(arrstring[5]), Float.parseFloat(arrstring[6]), arrstring[7], "", treeSet);
                            continue;
                        }
                        this.lllIIIllIIIIlllIlIIllIIll(arrstring[0], "", Integer.parseInt(arrstring[1]), Integer.parseInt(arrstring[2]), Integer.parseInt(arrstring[3]), Boolean.parseBoolean(arrstring[4]), Float.parseFloat(arrstring[5]), Float.parseFloat(arrstring[6]), Float.parseFloat(arrstring[7]), "", "", treeSet);
                        continue;
                    }
                    if (arrstring.length != 9) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(arrstring[0], "", Integer.parseInt(arrstring[1]), Integer.parseInt(arrstring[2]), Integer.parseInt(arrstring[3]), Boolean.parseBoolean(arrstring[4]), Float.parseFloat(arrstring[5]), Float.parseFloat(arrstring[6]), Float.parseFloat(arrstring[7]), arrstring[8], "", treeSet);
                }
                bufferedReader.close();
                return true;
            }
            return false;
        }
        catch (Exception exception) {
            class_1315.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "Error Loading Waypoints");
            System.err.println("waypoint load error: " + exception.getLocalizedMessage());
            return false;
        }
    }

    private boolean IllIIlllllllIIlIIlIIIIlIl(String string) {
        boolean bl = false;
        this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/rei_minimap", false), string + ".points");
        if (!this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
            this.IllIIIllIIIIlIlIlIllIIlll = new File(Minecraft.getMinecraft().mcDataDir, "/mods/rei_minimap/" + string + ".points");
        }
        if (this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
            this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, 0);
            bl = true;
        } else {
            for (int i = -25; i < 25; ++i) {
                this.IllIIIllIIIIlIlIlIllIIlll = new File(class_0501.lllIIIllIIIIlllIlIIllIIll("minecraft/mods/rei_minimap", false), string + ".DIM" + i + ".points");
                if (!this.IllIIIllIIIIlIlIlIllIIlll.exists()) {
                    this.IllIIIllIIIIlIlIlIllIIlll = new File(Minecraft.getMinecraft().mcDataDir, "/mods/rei_minimap/" + string + ".DIM" + i + ".points");
                }
                if (!this.IllIIIllIIIIlIlIlIllIIlll.exists()) continue;
                bl = true;
                this.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, i);
            }
        }
        return bl;
    }

    private void lllIIIllIIIIlllIlIIllIIll(File file, int n) {
        try {
            if (file.exists()) {
                String string;
                TreeSet<Integer> treeSet = new TreeSet<Integer>();
                treeSet.add(n);
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while ((string = bufferedReader.readLine()) != null) {
                    String[] arrstring = string.split(":");
                    if (arrstring.length != 6) continue;
                    int n2 = Integer.parseInt(arrstring[5], 16);
                    float f = (float)(n2 >> 16 & 0xFF) / 255.0f;
                    float f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                    float f3 = (float)(n2 >> 0 & 0xFF) / 255.0f;
                    int n3 = Integer.parseInt(arrstring[1]);
                    int n4 = Integer.parseInt(arrstring[3]);
                    if (n == -1) {
                        n3 *= 8;
                        n4 *= 8;
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(arrstring[0], "", n3, n4, Integer.parseInt(arrstring[2]), Boolean.parseBoolean(arrstring[4]), f, f2, f3, "", "", treeSet);
                }
                bufferedReader.close();
            }
        }
        catch (Exception exception) {
            class_1315.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "Error Loading Old Rei Waypoints");
            System.err.println("waypoint load error: " + exception.getLocalizedMessage());
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2, int n, int n2, int n3, boolean bl, float f, float f2, float f3, String string3, String string4, TreeSet treeSet) {
        class_0368 class_03682 = new class_0368(string, n, n2, n3, bl, f, f2, f3, string3, string4, treeSet);
        class_03682.IlIIIIIllllllIIlllIllllll = string2;
        this.IlIllllllIIlIIllllIIlIIIl.add(class_03682);
    }

    public void lIllllIIlIIIlIllllllIIIll() {
        this.lIlllIlllIIIIlIIlllIllIII = new ArrayList();
        for (class_0368 class_03682 : this.IlIllllllIIlIIllllIIlIIIl) {
            if (class_03682.IlIIIIIllllllIIlllIllllll() > 0) continue;
            this.lIlllIlllIIIIlIIlllIllIII.add(class_03682);
        }
    }

    @Override
    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        if (Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIIllllllllIlIllllllllIlI == 0 && this.lIlllIlllIIIIlIIlllIllIII.size() > 0) {
            this.IlIIIIIllllllIIlllIllllll = new ArrayList();
            for (class_0368 class_03682 : this.lIlllIlllIIIIlIIlllIllIII) {
                if (Math.abs(class_03682.IlIllllllIIlIIllllIIlIIIl() - class_0006.lIlllIlllIIIIlIIlllIllIII()) >= 400 || Math.abs(class_03682.lIlllIlllIIIIlIIlllIllIII() - class_0006.IlIIIIIllllllIIlllIllllll()) >= 400 || !Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII((int)class_03682.IlIllllllIIlIIllllIIlIIIl(), (int)class_03682.lIlllIlllIIIIlIIlllIllIII()).lIlllIlllIIIIlIIlllIllIII) continue;
                class_03682.IlIllllllIIlIIllllIIlIIIl(Minecraft.getMinecraft().lIIIIlIlIIlllllIIllIIlIII.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll(class_03682.IlIllllllIIlIIllllIIlIIIl(), class_03682.lIlllIlllIIIIlIIlllIllIII()));
                this.IlIIIIIllllllIIlllIllllll.add(class_03682);
                this.lIlllIlllIIIIlIIlllIllIII();
            }
            this.lIlllIlllIIIIlIIlllIllIII.removeAll(this.IlIIIIIllllllIIlllIllllll);
            System.out.println("remaining old 2d waypoints: " + this.lIlllIlllIIIIlIIlllIllIII.size());
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        class_0368 class_03682 = (class_0368)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        this.lIlllIlllIIIIlIIlllIllIII.remove(this.IlIllllllIIlIIllllIIlIIIl.get(n));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl((class_0368)this.IlIllllllIIlIIllllIIlIIIl.get(n));
        this.IlIllllllIIlIIllllIIlIIIl.remove(n);
        this.lIlllIlllIIIIlIIlllIllIII();
        if (class_03682.lIllllIIlIIIlIllllllIIIll) {
            LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketWaypointRemove(class_03682.lllIIIllIIIIlllIlIIllIIll, class_03682.IlIIIIIllllllIIlllIllllll));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0368 class_03682) {
        this.lIlllIlllIIIIlIIlllIllIII.remove(class_03682);
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl(class_03682);
        this.IlIllllllIIlIIllllIIlIIIl.remove(class_03682);
        this.lIlllIlllIIIIlIIlllIllIII();
        if (class_03682.lIllllIIlIIIlIllllllIIIll) {
            LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketWaypointRemove(class_03682.lllIIIllIIIIlllIlIIllIIll, class_03682.IlIIIIIllllllIIlllIllllll));
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0368 class_03682) {
        if (!class_03682.lIllllIIlIIIlIllllllIIIll && LunarClient.getInstance().getNetworkManager().IlIllllllIIlIIllllIIlIIIl()) {
            LunarClient.getInstance().getNetworkManager().lllIIIllIIIIlllIlIIllIIll((LCPacket)new LCPacketWaypointAdd(class_03682.lllIIIllIIIIlllIlIIllIIll, class_03682.IlIIIIIllllllIIlllIllllll, new Color(class_03682.IlIlIIlIlIllIIlIlIIllIIIl, class_03682.lllllIlllIIllIlIIlIIIllII, class_03682.IlIlIIlllIIlIllIIIlllllIl, 1.0f).getRGB(), class_03682.IIIllIllIIlIlIlIlIllllIIl, class_03682.lIIIIlIlIIlllllIIllIIlIII, class_03682.IllIIIllIIIIlIlIlIllIIlll, false, class_03682.llIIlllIllIllllIIIlIIIIII));
        } else {
            this.IlIllllllIIlIIllllIIlIIIl.add(class_03682);
            if (this.IIIllIllIIlIlIlIlIllllIIl != null) {
                this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_03682);
            }
            this.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    private void llIIllIllIlIIlIIllIllllll() {
        List list = Minecraft.getMinecraft().theWorld.IlIlIIlllIIlIllIIIlllllIl();
        for (int i = 0; i < list.size(); ++i) {
            class_1521 class_15212 = (class_1521)list.get(i);
            if (!(class_15212 instanceof class_2163)) continue;
            class_15212.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.IIIllIllIIlIlIlIlIllllIIl = new class_2163(Minecraft.getMinecraft().theWorld);
        for (class_0368 class_03682 : this.IlIllllllIIlIIllllIIlIIIl) {
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(class_03682);
        }
        Minecraft.getMinecraft().theWorld.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void IIIllIllIIlIlIlIlIllllIIl() {
        List list;
        List list2 = list = Minecraft.getMinecraft().theWorld.IlIlIIlllIIlIllIIIlllllIl();
        synchronized (list2) {
            int n = list.indexOf(this.IIIllIllIIlIlIlIlIllllIIl);
            if (n == -1) {
                this.llIIllIllIlIIlIIllIllllll();
                this.IllIIlllllllIIlIIlIIIIlIl();
                return;
            }
            if (n != list.size() - 1) {
                Collections.swap(list, n, list.size() - 1);
            }
        }
    }

    public ArrayList IllIIIllIIIIlIlIlIllIIlll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public ArrayList lIIIIlIlIIlllllIIllIIlIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_2163 llIIlllIllIllllIIIlIIIIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }
}

