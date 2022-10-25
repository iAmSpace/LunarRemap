package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class class_1835 {
    public class_1203 lllIIIllIIIIlllIlIIllIIll = null;
    private File IllllIIIIlIIlIIIIlllIIIIl;
    public boolean lllIlIIlIIIlIlIIIllIlllIl;
    private int llllIlIIIIIIIIIlllIIlIIIl = Runtime.getRuntime().availableProcessors();
    public boolean IlIllllllIIlIIllllIIlIIIl = this.llllIlIIIIIIIIIlllIIlIIIl > 0;
    public boolean lIlllIlllIIIIlIIlllIllIII = false;
    protected boolean IlIIIIIllllllIIlllIllllll = true;
    protected boolean lIllllIIlIIIlIllllllIIIll = true;
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    protected boolean IllIIlllllllIIlIIlIIIIlIl = this.IlIllllllIIlIIllllIIlIIIl;
    protected boolean IIIllIllIIlIlIlIlIllllIIl = true;
    protected boolean IllIIIllIIIIlIlIlIllIIlll = true;
    public boolean lIIIIlIlIIlllllIIllIIlIII = this.IlIllllllIIlIIllllIIlIIIl;
    public boolean llIIlllIllIllllIIIlIIIIII = this.IlIllllllIIlIIllllIIlIIIl;
    protected boolean llIIllIllIlIIlIIllIllllll = this.IlIllllllIIlIIllllIIlIIIl;
    protected int lllIIlIIIllllllIIIIlIlIlI = 0;
    protected boolean IlIlllIIIIIIlIIllIIllIlll = false;
    public boolean IlIlIIlIlIllIIlIlIIllIIIl = false;
    protected boolean lllllIlllIIllIlIIlIIIllII = false;
    public boolean IlIlIIlllIIlIllIIIlllllIl = true;
    public boolean lIIlIIIIIlIlllIlIIlIlIlll = true;
    public int lIlIlIIlIIIIlIIIIIlllIIII = 0;
    public int IlIIIlIIIIllIIIllIIIIIIll = -1;
    protected boolean IIlllIlIlllIllIIIlllIIlIl = true;
    public int lIlIllIIlIIlIIlIIlIIlIIll = 2;
    protected int llIIlIllIllllIlIIIIlIIlll = 2;
    public int llIllllIlIllIIIlIllIIlIlI = 0;
    public int lIlllIlllIlIIIIlllIlIlIIl = 1;
    public Boolean IlIIlllllIIlIlIlllllIllll = Boolean.TRUE;
    public Boolean llIIlIlIlllIIllIlIlllIllI = Boolean.TRUE;
    public final int IllIIIIllIIllIllIlllIlIIl = 1;
    public final int IIIIIIIIlIllIIllIIlllIllI = 2;
    public final int IIlIIlIlIlIllIIlIlIIIIlll = 3;
    public final int llIIIlllIlllIlIllIIIIllIl = 4;
    public int IIIIlIllIlIIlIIlIllIlIlll = 1;
    public boolean IlIlIIlllIllllllllIIIlIlI = false;
    protected boolean llllIIIIlIIIlIIIIIIlIllll = false;
    public class_1335 llIIIIllIIIIIIIlIIIlIIIIl = new class_1335("key.minimap.zoom", 44, "controls.minimap.title", true);
    public class_1335 IIllIllIIllIIlllIIIlIlllI = new class_1335("key.minimap.togglefullscreen", 45, "controls.minimap.title", true);
    public class_1335 llllllIlIllllIlIlIlIIIIlI = new class_1335("key.minimap.voxelmapmenu", 50, "controls.minimap.title", true);
    public class_1335 lIlIIllllIlIIIIllIIIIlIIl = new class_1335("key.minimap.waypointmenu", 0, "controls.minimap.title", true);
    public class_1335 llIlllIIllIlllIlIlIlIIIll = new class_1335("key.minimap.waypointhotkey", 0, "controls.minimap.title", true);
    public class_1335 IIIIlIIlIIIllIIIIllIIIlII = new class_1335("key.minimap.togglemobs", 0, "controls.minimap.title", true);
    public class_1335[] lllIIIIIIlIlllIIlIlIIIllI;
    public Minecraft llIIlIIllIIllIlIIllIIllII = null;
    private boolean IIIIlIlIIlIIIIlIlllIlIIII;
    public static class_1835 lIlIlIIIIIIlIIllllIlIIllI;

    public class_1835() {
        lIlIlIIIIIIlIIllllIlIIllI = this;
        this.llIIlIIllIIllIlIIllIIllII = Minecraft.getMinecraft();
        this.lllIIIIIIlIlllIIlIlIIIllI = new class_1335[]{this.llllllIlIllllIlIlIlIIIIlI, this.llIlllIIllIlllIlIlIlIIIll, this.llIIIIllIIIIIIIlIIIlIIIIl, this.IIllIllIIllIIlllIIIlIlllI, this.IIIIlIIlIIIllIIIIllIIIlII};
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1203 class_12032) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12032;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IllllIIIIlIIlIIIIlllIIIIl = new File(this.llIIlIIllIIllIlIIllIIllII.mcDataDir, "mods/VoxelMods/voxelmap.properties");
        try {
            if (this.IllllIIIIlIIlIIIIlllIIIIl.exists()) {
                String string;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.IllllIIIIlIIlIIIIlllIIIIl));
                while ((string = bufferedReader.readLine()) != null) {
                    String[] arrstring = string.split(":");
                    if (arrstring[0].equals("Zoom Level")) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll = Integer.parseInt(arrstring[1]);
                    } else if (arrstring[0].equals("Hide Minimap")) {
                        this.lIlllIlllIIIIlIIlllIllIII = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Show Coordinates")) {
                        this.IlIIIIIllllllIIlllIllllll = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Enable Cave Mode")) {
                        this.lIllllIIlIIIlIllllllIIIll = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Dynamic Lighting")) {
                        this.IIIllIIlIIIIIIlIlIIllIIlI = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Height Map")) {
                        this.IllIIlllllllIIlIIlIIIIlIl = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Slope Map")) {
                        this.IIIllIllIIlIlIlIlIllllIIl = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Filtering")) {
                        this.IllIIIllIIIIlIlIlIllIIlll = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Water Transparency")) {
                        this.lIIIIlIlIIlllllIIllIIlIII = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("net.minecraft.block.Block Transparency")) {
                        this.llIIlllIllIllllIIIlIIIIII = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Biomes")) {
                        this.llIIllIllIlIIlIIllIllllll = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Biome Overlay")) {
                        this.lllIIlIIIllllllIIIIlIlIlI = Integer.parseInt(arrstring[1]);
                    } else if (arrstring[0].equals("Chunk Grid")) {
                        this.IlIlllIIIIIIlIIllIIllIlll = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Square Map")) {
                        this.IlIlIIlIlIllIIlIlIIllIIIl = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Old North")) {
                        this.lllllIlllIIllIlIIlIIIllII = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Waypoint Beacons")) {
                        this.IlIlIIlllIIlIllIIIlllllIl = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Waypoint Signs")) {
                        this.lIIlIIIIIlIlllIlIIlIlIlll = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Deathpoints")) {
                        this.lIlIlIIlIIIIlIIIIIlllIIII = Integer.parseInt(arrstring[1]);
                    } else if (arrstring[0].equals("Waypoint Max Distance")) {
                        this.IlIIIlIIIIllIIIllIIIIIIll = Integer.parseInt(arrstring[1]);
                    } else if (arrstring[0].equals("Waypoint Sort By")) {
                        this.IIIIlIllIlIIlIIlIllIlIlll = Integer.parseInt(arrstring[1]);
                    } else if (arrstring[0].equals("Welcome Message")) {
                        this.IIlllIlIlllIllIIIlllIIlIl = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("World Download Compatibility")) {
                        this.IlIlIIlllIllllllllIIIlIlI = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Real Time Torch Flicker")) {
                        this.llllIIIIlIIIlIIIIIIlIllll = Boolean.parseBoolean(arrstring[1]);
                    } else if (arrstring[0].equals("Map Corner")) {
                        this.lIlllIlllIlIIIIlllIlIlIIl = Integer.parseInt(arrstring[1]);
                    } else if (arrstring[0].equals("Map Size")) {
                        this.llIllllIlIllIIIlIllIIlIlI = Integer.parseInt(arrstring[1]);
                    } else if (arrstring[0].equals("Zoom Key")) {
                        this.llIIIIllIIIIIIIlIIIlIIIIl.lllIlIIlIIIlIlIIIllIlllIl(Keyboard.getKeyIndex((String)arrstring[1]));
                    } else if (arrstring[0].equals("Fullscreen Key")) {
                        this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(Keyboard.getKeyIndex((String)arrstring[1]));
                    } else if (arrstring[0].equals("Menu Key")) {
                        this.llllllIlIllllIlIlIlIIIIlI.lllIlIIlIIIlIlIIIllIlllIl(Keyboard.getKeyIndex((String)arrstring[1]));
                    } else if (arrstring[0].equals("Waypoint Key")) {
                        this.llIlllIIllIlllIlIlIlIIIll.lllIlIIlIIIlIlIIIllIlllIl(Keyboard.getKeyIndex((String)arrstring[1]));
                    } else if (arrstring[0].equals("Mob Key")) {
                        this.IIIIlIIlIIIllIIIIllIIIlII.lllIlIIlIIIlIlIIIllIlllIl(Keyboard.getKeyIndex((String)arrstring[1]));
                    }
                    class_1335.lllIlIIlIIIlIlIIIllIlllIl();
                }
                if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                    this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.IllllIIIIlIIlIIIIlllIIIIl);
                }
                bufferedReader.close();
            }
            this.lllIlIIlIIIlIlIIIllIlllIl();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        File file = new File(this.llIIlIIllIIllIlIIllIIllII.mcDataDir, "/mods/VoxelMods/");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.IllllIIIIlIIlIIIIlllIIIIl = new File(file, "voxelmap.properties");
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.IllllIIIIlIIlIIIIlllIIIIl));
            printWriter.println("Zoom Level:" + Integer.toString(this.lIlIllIIlIIlIIlIIlIIlIIll));
            printWriter.println("Hide Minimap:" + Boolean.toString(this.lIlllIlllIIIIlIIlllIllIII));
            printWriter.println("Show Coordinates:" + Boolean.toString(this.IlIIIIIllllllIIlllIllllll));
            printWriter.println("Enable Cave Mode:" + Boolean.toString(this.lIllllIIlIIIlIllllllIIIll));
            printWriter.println("Dynamic Lighting:" + Boolean.toString(this.IIIllIIlIIIIIIlIlIIllIIlI));
            printWriter.println("Height Map:" + Boolean.toString(this.IllIIlllllllIIlIIlIIIIlIl));
            printWriter.println("Slope Map:" + Boolean.toString(this.IIIllIllIIlIlIlIlIllllIIl));
            printWriter.println("Filtering:" + Boolean.toString(this.IllIIIllIIIIlIlIlIllIIlll));
            printWriter.println("Water Transparency:" + Boolean.toString(this.lIIIIlIlIIlllllIIllIIlIII));
            printWriter.println("net.minecraft.block.Block Transparency:" + Boolean.toString(this.llIIlllIllIllllIIIlIIIIII));
            printWriter.println("Biomes:" + Boolean.toString(this.llIIllIllIlIIlIIllIllllll));
            printWriter.println("Biome Overlay:" + Integer.toString(this.lllIIlIIIllllllIIIIlIlIlI));
            printWriter.println("Chunk Grid:" + Boolean.toString(this.IlIlllIIIIIIlIIllIIllIlll));
            printWriter.println("Square Map:" + Boolean.toString(this.IlIlIIlIlIllIIlIlIIllIIIl));
            printWriter.println("Old North:" + Boolean.toString(this.lllllIlllIIllIlIIlIIIllII));
            printWriter.println("Waypoint Beacons:" + Boolean.toString(this.IlIlIIlllIIlIllIIIlllllIl));
            printWriter.println("Waypoint Signs:" + Boolean.toString(this.lIIlIIIIIlIlllIlIIlIlIlll));
            printWriter.println("Deathpoints:" + Integer.toString(this.lIlIlIIlIIIIlIIIIIlllIIII));
            printWriter.println("Waypoint Max Distance:" + Integer.toString(this.IlIIIlIIIIllIIIllIIIIIIll));
            printWriter.println("Waypoint Sort By:" + Integer.toString(this.IIIIlIllIlIIlIIlIllIlIlll));
            printWriter.println("Welcome Message:" + Boolean.toString(this.IIlllIlIlllIllIIIlllIIlIl));
            printWriter.println("Map Corner:" + Integer.toString(this.lIlllIlllIlIIIIlllIlIlIIl));
            printWriter.println("Map Size:" + Integer.toString(this.llIllllIlIllIIIlIllIIlIlI));
            printWriter.println("Zoom Key:" + class_1835.IlIllllllIIlIIllllIIlIIIl(this.llIIIIllIIIIIIIlIIIlIIIIl.IIIllIllIIlIlIlIlIllllIIl()));
            printWriter.println("Fullscreen Key:" + class_1835.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.IIIllIllIIlIlIlIlIllllIIl()));
            printWriter.println("Menu Key:" + class_1835.IlIllllllIIlIIllllIIlIIIl(this.llllllIlIllllIlIlIlIIIIlI.IIIllIllIIlIlIlIlIllllIIl()));
            printWriter.println("Waypoint Key:" + class_1835.IlIllllllIIlIIllllIIlIIIl(this.llIlllIIllIlllIlIlIlIIIll.IIIllIllIIlIlIlIlIllllIIl()));
            printWriter.println("Mob Key:" + class_1835.IlIllllllIIlIIllllIIlIIIl(this.IIIIlIIlIIIllIIIIllIIIlII.IIIllIllIIlIlIlIlIllllIIl()));
            if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(printWriter);
            }
            printWriter.close();
        }
        catch (Exception exception) {
            class_1315.lllIIIllIIIIlllIlIIllIIll((Object)((Object)class_1227.IlIlllIIIIIIlIIllIIllIlll) + "Error Saving Settings " + exception.getLocalizedMessage());
        }
    }

    public String lllIIIllIIIIlllIlIIllIIll(class_1002 class_10022) {
        String string = class_0950.lllIIIllIIIIlllIlIIllIIll(class_10022.IlIIIIIllllllIIlllIllllll()) + ": ";
        if (class_10022.lllIIIllIIIIlllIlIIllIIll()) {
            float f = this.lllIlIIlIIIlIlIIIllIlllIl(class_10022);
            if (class_10022 == class_1002.IllIIIllIIIIlIlIlIllIIlll) {
                return string + (int)f;
            }
            if (class_10022 == class_1002.IllIIIIllIIllIllIlllIlIIl) {
                if (f < 0.0f) {
                    return string + class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.waypoints.infinite");
                }
                return string + (int)f;
            }
            if (f == 0.0f) {
                return string + class_0950.lllIIIllIIIIlllIlIIllIIll("options.off");
            }
            return string + (int)f + "%";
        }
        if (class_10022.lllIlIIlIIIlIlIIIllIlllIl()) {
            boolean bl = this.IlIllllllIIlIIllllIIlIIIl(class_10022);
            if (bl) {
                return string + class_0950.lllIIIllIIIIlllIlIIllIIll("options.on");
            }
            return string + class_0950.lllIIIllIIIIlllIlIIllIIll("options.off");
        }
        if (class_10022.IlIllllllIIlIIllllIIlIIIl()) {
            String string2 = this.lIlllIlllIIIIlIIlllIllIII(class_10022);
            return string + string2;
        }
        return string;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(class_1002 class_10022) {
        if (class_10022 == class_1002.IllIIIllIIIIlIlIlIllIIlll) {
            return this.lIlIllIIlIIlIIlIIlIIlIIll;
        }
        if (class_10022 == class_1002.IllIIIIllIIllIllIlllIlIIl) {
            return this.IlIIIlIIIIllIIIllIIIIIIll;
        }
        return 0.0f;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_1002 class_10022) {
        switch (class_10022) {
            case lllIIIllIIIIlllIlIIllIIll: {
                return this.IlIIIIIllllllIIlllIllllll;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                return this.lIlllIlllIIIIlIIlllIllIII;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                return this.llIIlIlIlllIIllIlIlllIllI != false && this.lIllllIIlIIIlIllllllIIIll;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                return this.IIIllIIlIIIIIIlIlIIllIIlI;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                return this.IlIlIIlIlIllIIlIlIIllIIIl;
            }
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                return this.lllllIlllIIllIlIIlIIIllII;
            }
            case IIIllIllIIlIlIlIlIllllIIl: {
                return this.IIlllIlIlllIllIIIlllIIlIl;
            }
            case llIIllIllIlIIlIIllIllllll: {
                return this.IllIIIllIIIIlIlIlIllIIlll;
            }
            case lllIIlIIIllllllIIIIlIlIlI: {
                return this.lIIIIlIlIIlllllIIllIIlIII;
            }
            case IlIlllIIIIIIlIIllIIllIlll: {
                return this.llIIlllIllIllllIIIlIIIIII;
            }
            case IlIlIIlIlIllIIlIlIIllIIIl: {
                return this.llIIllIllIlIIlIIllIllllll;
            }
            case IlIlIIlllIIlIllIIIlllllIl: {
                return this.IlIlllIIIIIIlIIllIIllIlll;
            }
        }
        throw new IllegalArgumentException("Add code to handle EnumOptionMinimap: " + class_10022.IlIIIIIllllllIIlllIllllll() + ". (possibly not a boolean)");
    }

    public String lIlllIlllIIIIlIIlllIllIII(class_1002 class_10022) {
        switch (class_10022) {
            case IlIIIIIllllllIIlllIllllll: {
                if (this.IIIllIllIIlIlIlIlIllllIIl && this.IllIIlllllllIIlIIlIIIIlIl) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.terrain.both");
                }
                if (this.IllIIlllllllIIlIIlIIIIlIl) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.terrain.height");
                }
                if (this.IIIllIllIIlIlIlIlIllllIIl) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.terrain.slope");
                }
                return class_0950.lllIIIllIIIIlllIlIIllIIll("options.off");
            }
            case IllIIlllllllIIlIIlIIIIlIl: {
                if (this.IlIlIIlllIIlIllIIIlllllIl && this.lIIlIIIIIlIlllIlIIlIlIlll) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.ingamewaypoints.both");
                }
                if (this.IlIlIIlllIIlIllIIIlllllIl) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.ingamewaypoints.beacons");
                }
                if (this.lIIlIIIIIlIlllIlIIlIlIlll) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.ingamewaypoints.signs");
                }
                return class_0950.lllIIIllIIIIlllIlIIllIIll("options.off");
            }
            case lIIIIlIlIIlllllIIllIIlIII: {
                if (this.lIlllIlllIlIIIIlllIlIlIIl == 0) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.location.topleft");
                }
                if (this.lIlllIlllIlIIIIlllIlIlIIl == 1) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.location.topright");
                }
                if (this.lIlllIlllIlIIIIlllIlIlIIl == 2) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.location.bottomright");
                }
                if (this.lIlllIlllIlIIIIlllIlIlIIl == 3) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.location.bottomleft");
                }
                return "Error";
            }
            case llIIlllIllIllllIIIlIIIIII: {
                if (this.llIllllIlIllIIIlIllIIlIlI == -1) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.size.small");
                }
                if (this.llIllllIlIllIIIlIllIIlIlI == 0) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.size.medium");
                }
                if (this.llIllllIlIllIIIlIllIIlIlI == 1) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.size.large");
                }
                return "error";
            }
            case lllllIlllIIllIlIIlIIIllII: {
                if (this.lllIIlIIIllllllIIIIlIlIlI == 0) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.off");
                }
                if (this.lllIIlIIIllllllIIIIlIlIlI == 1) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.biomeoverlay.solid");
                }
                if (this.lllIIlIIIllllllIIIIlIlIlI == 2) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.biomeoverlay.transparent");
                }
                return "error";
            }
            case IIIIIIIIlIllIIllIIlllIllI: {
                if (this.lIlIlIIlIIIIlIIIIIlllIIII == 0) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.off");
                }
                if (this.lIlIlIIlIIIIlIIIIIlllIIII == 1) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.waypoints.deathpoints.mostrecent");
                }
                if (this.lIlIlIIlIIIIlIIIIIlllIIII == 2) {
                    return class_0950.lllIIIllIIIIlllIlIIllIIll("options.minimap.waypoints.deathpoints.all");
                }
                return "error";
            }
        }
        throw new IllegalArgumentException("Add code to handle EnumOptionMinimap: " + class_10022.IlIIIIIllllllIIlllIllllll() + ". (possibly not a list value)");
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1002 class_10022, float f) {
        if (class_10022 == class_1002.IllIIIIllIIllIllIlllIlIIl) {
            float f2 = f * 9951.0f + 50.0f;
            if (f2 > 10000.0f) {
                f2 = -1.0f;
            }
            this.IlIIIlIIIIllIIIllIIIIIIll = (int)f2;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1002 class_10022, int n) {
        switch (class_10022) {
            case lllIIIllIIIIlllIlIIllIIll: {
                this.IlIIIIIllllllIIlllIllllll = !this.IlIIIIIllllllIIlllIllllll;
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                this.lIlllIlllIIIIlIIlllIllIII = !this.lIlllIlllIIIIlIIlllIllIII;
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                this.lIllllIIlIIIlIllllllIIIll = !this.lIllllIIlIIIlIllllllIIIll;
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                this.IIIllIIlIIIIIIlIlIIllIIlI = !this.IIIllIIlIIIIIIlIlIIllIIlI;
                break;
            }
            case IlIIIIIllllllIIlllIllllll: {
                if (this.IIIllIllIIlIlIlIlIllllIIl && this.IllIIlllllllIIlIIlIIIIlIl) {
                    this.IIIllIllIIlIlIlIlIllllIIl = false;
                    this.IllIIlllllllIIlIIlIIIIlIl = false;
                    break;
                }
                if (this.IIIllIllIIlIlIlIlIllllIIl) {
                    this.IIIllIllIIlIlIlIlIllllIIl = false;
                    this.IllIIlllllllIIlIIlIIIIlIl = true;
                    break;
                }
                if (this.IllIIlllllllIIlIIlIIIIlIl) {
                    this.IIIllIllIIlIlIlIlIllllIIl = true;
                    this.IllIIlllllllIIlIIlIIIIlIl = true;
                    break;
                }
                this.IIIllIllIIlIlIlIlIllllIIl = true;
                this.IllIIlllllllIIlIIlIIIIlIl = false;
                break;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                this.IlIlIIlIlIllIIlIlIIllIIIl = !this.IlIlIIlIlIllIIlIlIIllIIIl;
                break;
            }
            case IIIllIIlIIIIIIlIlIIllIIlI: {
                this.lllllIlllIIllIlIIlIIIllII = !this.lllllIlllIIllIlIIlIIIllII;
                break;
            }
            case IllIIlllllllIIlIIlIIIIlIl: {
                if (this.IlIlIIlllIIlIllIIIlllllIl && this.lIIlIIIIIlIlllIlIIlIlIlll) {
                    this.IlIlIIlllIIlIllIIIlllllIl = false;
                    this.lIIlIIIIIlIlllIlIIlIlIlll = false;
                    break;
                }
                if (this.IlIlIIlllIIlIllIIIlllllIl) {
                    this.IlIlIIlllIIlIllIIIlllllIl = false;
                    this.lIIlIIIIIlIlllIlIIlIlIlll = true;
                    break;
                }
                if (this.lIIlIIIIIlIlllIlIIlIlIlll) {
                    this.lIIlIIIIIlIlllIlIIlIlIlll = true;
                    this.IlIlIIlllIIlIllIIIlllllIl = true;
                    break;
                }
                this.IlIlIIlllIIlIllIIIlllllIl = true;
                this.lIIlIIIIIlIlllIlIIlIlIlll = false;
                break;
            }
            case IIIllIllIIlIlIlIlIllllIIl: {
                this.IIlllIlIlllIllIIIlllIIlIl = !this.IIlllIlIlllIllIIIlllIIlIl;
                break;
            }
            case lIIIIlIlIIlllllIIllIIlIII: {
                this.lIlllIlllIlIIIIlllIlIlIIl = this.lIlllIlllIlIIIIlllIlIlIIl >= 3 ? 0 : this.lIlllIlllIlIIIIlllIlIlIIl + 1;
                break;
            }
            case llIIlllIllIllllIIIlIIIIII: {
                this.llIllllIlIllIIIlIllIIlIlI = this.llIllllIlIllIIIlIllIIlIlI >= 1 ? -1 : this.llIllllIlIllIIIlIllIIlIlI + 1;
                break;
            }
            case llIIllIllIlIIlIIllIllllll: {
                this.IllIIIllIIIIlIlIlIllIIlll = !this.IllIIIllIIIIlIlIlIllIIlll;
                break;
            }
            case lllIIlIIIllllllIIIIlIlIlI: {
                this.lIIIIlIlIIlllllIIllIIlIII = !this.lIIIIlIlIIlllllIIllIIlIII;
                break;
            }
            case IlIlllIIIIIIlIIllIIllIlll: {
                this.llIIlllIllIllllIIIlIIIIII = !this.llIIlllIllIllllIIIlIIIIII;
                break;
            }
            case IlIlIIlIlIllIIlIlIIllIIIl: {
                this.llIIllIllIlIIlIIllIllllll = !this.llIIllIllIlIIlIIllIllllll;
                break;
            }
            case lllllIlllIIllIlIIlIIIllII: {
                ++this.lllIIlIIIllllllIIIIlIlIlI;
                if (this.lllIIlIIIllllllIIIIlIlIlI <= 2) break;
                this.lllIIlIIIllllllIIIIlIlIlI = 0;
                break;
            }
            case IlIlIIlllIIlIllIIIlllllIl: {
                this.IlIlllIIIIIIlIIllIIllIlll = !this.IlIlllIIIIIIlIIllIIllIlll;
                break;
            }
            case IIIIIIIIlIllIIllIIlllIllI: {
                ++this.lIlIlIIlIIIIlIIIIIlllIIII;
                if (this.lIlIlIIlIIIIlIIIIIlllIIII <= 2) break;
                this.lIlIlIIlIIIIlIIIIIlllIIII = 0;
                break;
            }
            default: {
                throw new IllegalArgumentException("Add code to handle EnumOptionMinimap: " + class_10022.IlIIIIIllllllIIlllIllllll());
            }
        }
        this.IIIIlIlIIlIIIIlIlllIlIIII = true;
    }

    public String lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIIIIIIlIlllIIlIlIIIllI[n].IIIllIIlIIIIIIlIlIIllIIlI().equals("key.minimap.voxelmapmenu")) {
            return class_0950.lllIIIllIIIIlllIlIIllIIll("key.minimap.menu");
        }
        return class_0950.lllIIIllIIIIlllIlIIllIIll(this.lllIIIIIIlIlllIIlIlIIIllI[n].IIIllIIlIIIIIIlIlIIllIIlI());
    }

    public String lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = this.lllIIIIIIlIlllIIlIlIIIllI[n].IIIllIllIIlIlIlIlIllllIIl();
        return class_1835.IlIllllllIIlIIllllIIlIIIl(n2);
    }

    public static String IlIllllllIIlIIllllIIlIIIl(int n) {
        return n < 0 ? class_0616.lllIIIllIIIIlllIlIIllIIll("key.mouseButton", n + 101) : Keyboard.getKeyName((int)n);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIIIIIIlIlllIIlIlIIIllI[n].lllIlIIlIIIlIlIIIllIlllIl(n2);
        this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        this.IIIIlIllIlIIlIIlIllIlIlll = n == this.IIIIlIllIlIIlIIlIllIlIlll || n == -this.IIIIlIllIlIIlIIlIllIlIlll ? -this.IIIIlIllIlIIlIIlIllIlIlll : n;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        if (this.IIIIlIlIIlIIIIlIlllIlIIII) {
            this.IIIIlIlIIlIIIIlIlllIlIIII = false;
            return true;
        }
        return false;
    }
}

