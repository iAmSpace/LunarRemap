package com.moonsworth.lunar.client;

import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.IPCListener;
import com.jagrosh.discordipc.entities.DiscordBuild;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.entities.pipe.PipeStatus;
import com.moonsworth.lunar.client.config.SettingsManager;
import com.moonsworth.lunar.client.events.EventBus;
import com.moonsworth.lunar.client.events.type.PluginMessageEvent;
import com.moonsworth.lunar.client.font.FontRegistry;
import com.moonsworth.lunar.client.font.LCFontRenderer;
import com.moonsworth.lunar.client.module.ModuleManager;
import com.moonsworth.lunar.client.util.cosmetic.Cosmetic;
import com.moonsworth.lunar.client.util.dashmgr.DashManager;
import com.moonsworth.lunar.client.util.netmgr.NetworkManager;
import com.moonsworth.lunar.client.util.threads.LunarRPCUpdateThread;
import com.moonsworth.lunar.ipc.LunarIPCListener;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import obf.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LunarClient {
    private List<ResourceLocation> IIlllIlIlllIllIIIlllIIlIl = new ArrayList<>();
    public List<Profile> profiles = new ArrayList<>();
    public List<class_0227> lllIlIIlIIIlIlIIIllIlllIl = new ArrayList<>();
    public Profile activeProfile;
    private static LunarClient instance;
    private ModuleManager moduleManager;
    private SettingsManager settingsManager;
    private NetworkManager networkManager;
    public class_0576 lIlllIlllIIIIlIIlllIllIII;
    private EventBus eventBus;
    private static String gitCommitIdAbbrv;
    private static String gitCommitBranch;
    private static String gitCommitId;
    private boolean IIlIIlIlIlIllIIlIlIIIIlll;
    private boolean llIIIlllIlllIlIllIIIIllIl = true;
    private List IIIIlIllIlIIlIIlIllIlIlll = new ArrayList();
    private class_1982 websocket;
    private List<Cosmetic> llllIIIIlIIIlIIIIIIlIllll;
    private List<Cosmetic> llIIIIllIIIIIIIlIIIlIIIIl;
    private final class_0064 IIllIllIIllIIlllIIIlIlllI;
    private final DashManager dashManager;
    private final class_1354 lIlIIllllIlIIIIllIIIIlIIl;
    private final class_1740 llIlllIIllIlllIlIlIlIIIll;
    private final long startTime;
    private final class_1201 lllIIIIIIlIlllIIlIlIIIllI;
    private final class_1130 llIIlIIllIIllIlIIllIIllII;
    private static List<class_1098> lIlIlIIIIIIlIIllllIlIIllI;
    public static long IlIIIIIllllllIIlllIllllll;
    private IPCClient discordIPC;
    private class_0135 status = class_0135.lllIIIllIIIIlllIlIIllIIll;
    public LCFontRenderer robotoBold22px;
    public LCFontRenderer robotoLight22px;
    public LCFontRenderer ubuntuMedium16px;
    public LCFontRenderer robotoRegular24px;
    public LCFontRenderer robotoLight18px;
    public LCFontRenderer robotoMedium13px;
    public LCFontRenderer robotoLight16px;
    public LCFontRenderer robotoRegular13px;
    public LCFontRenderer robotoBold14px;
    public LCFontRenderer robotoBold12px;
    public LCFontRenderer lllllIlllIIllIlIIlIIIllII = new LCFontRenderer(ralewayExtraBold, 22.0f);
    public LCFontRenderer IlIlIIlllIIlIllIIIlllllIl = new LCFontRenderer(ralewayLight, 22.0f);
    private static final ResourceLocation ralewaySemiBold;
    public static final ResourceLocation ralewayExtraBold;
    private static final ResourceLocation robotoRegular;
    private static final ResourceLocation robotoBold;
    private final ResourceLocation playRegular = new ResourceLocation("client/font/Play-Regular.ttf");
    public static final ResourceLocation ralewayLight;
    private static final ResourceLocation ubuntuMedium;
    private final Map<String, ResourceLocation> lIIIllIIIIIllllIlIlIllIll = new HashMap<>();
    public static byte[] IlIIIlIIIIllIIIllIIIIIIll;

    public String lllIIIllIIIIlllIlIIllIIll() {
        return "Lunar-Client";
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return "LC-Binary";
    }

    public LunarClient() {
        this.startTime = System.currentTimeMillis();
        System.out.println("[LC] Starting Lunar Client setup");
        this.lIlIIllllIlIIIIllIIIIlIIl();
        System.out.println("[LC] Created default configuration presets");
        instance = this;
        this.settingsManager = new SettingsManager();
        System.out.println("[LC] Created settings");
        this.eventBus = new EventBus();
        System.out.println("[LC] Created EventBus");
        this.moduleManager = new ModuleManager(this.eventBus);
        System.out.println("[LC] Created Mod Manager");
        this.networkManager = new NetworkManager();
        System.out.println("[LC] Created Network Manager");
        this.dashManager = new DashManager();
        System.out.println("[LC] Created Dash Manager");
        this.IIllIllIIllIIlllIIIlIlllI = new class_0064();
        this.lIlIIllllIlIIIIllIIIIlIIl = new class_1354();
        this.llIlllIIllIlllIlIlIlIIIll = new class_1740();
        this.lllIIIIIIlIlllIIlIlIIIllI = new class_1201();
        this.llIIlIIllIIllIlIIllIIllII = new class_1130();
        System.out.println("[LC] Created Friend Manager");
        this.eventBus.addEvent(class_0780.class, this.networkManager::lllIIIllIIIIlllIlIIllIIll);
        this.eventBus.addEvent(class_1594.class, this.networkManager::lllIIIllIIIIlllIlIIllIIll);
        this.eventBus.addEvent(PluginMessageEvent.class, this.networkManager::onPluginMessage);
        this.eventBus.addEvent(class_0479.class, this.networkManager::lllIIIllIIIIlllIlIIllIIll);
        this.eventBus.addEvent(class_2201.class, this.lllIIIIIIlIlllIIlIlIIIllI::lllIIIllIIIIlllIlIIllIIll);
        this.eventBus.addEvent(class_0312.class, this.lllIIIIIIlIlllIIlIlIIIllI::lllIIIllIIIIlllIlIIllIIll);
        System.out.println("[LC] Registered network events");
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        LunarRPCUpdateThread class_05592 = new LunarRPCUpdateThread();
        UUID uuid;
        this.loadFonts();
        System.out.println("[LC] Loaded all fonts");
        this.loadProfiles();
        System.out.println("[LC] Loaded " + this.profiles.size() + " custom profiles");
        this.readClientProperties();
        System.out.println("[LC] Loaded client properties");
        this.llllllIlIllllIlIlIlIIIIlI();
        System.out.println("[LC] Loaded mojang session status entries");
        this.lIlllIlllIIIIlIIlllIllIII = new class_0576();
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl();
        System.out.println("[LC] Loaded configuration");
        System.out.println("[LC] Loaded Overlay Gui");
        class_0713.lllIIIllIIIIlllIlIIllIIll(new class_0713());
        try {
            this.lIlIIllllIlIIIIllIIIIlIIl.IlIIIIIllllllIIlllIllllll();
        }
        catch (IOException iOException) {
            throw new RuntimeException("Cannot load AccountManager", iOException);
        }
        boolean bl = this.lIlIIllllIlIIIIllIIIIlIIl.lIlllIlllIIIIlIIlllIllIII();
        try {
            uuid = this.lIlIIllllIlIIIIllIIIIlIIl.IIIllIllIIlIlIlIlIllllIIl() == null ? null :
                    UUID.fromString(class_2051.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl.IIIllIllIIlIlIlIlIllllIIl().get("profile").getAsString()));
            String _0559 = uuid == null ? null : this.lIlIIllllIlIIIIllIIIIlIIl.lllIIIllIIIIlllIlIIllIIll((UUID)((Object)uuid)).lllIIIllIIIIlllIlIIllIIll();
            if (!bl) {
                if (uuid != null) {
                    System.out.println("[LC] Could not login the user " + uuid + "(" + _0559 + ") with the token stored on disk. (Expired session?)");
                } else {
                    System.out.println("[LC] No currentUser in launcher_profiles, what do?");
                }
            } else {
                System.out.println("[LC] Logged in user " + uuid + "(" + _0559 + ") with the token stored on disk.");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(class_05592, 0L, this.settingsManager.IllIIIllIIIIlIlIlIllIIlll, TimeUnit.SECONDS);
        System.out.println("[LC] Scheduled session server status updates");
        this.llllIIIIlIIIlIIIIIIlIllll = new ArrayList<>();
        this.llIIIIllIIIIIIIlIIIlIIIIl = new ArrayList<>();
        this.getModuleManager().IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        System.out.println("[LC] Finished startup in " + (System.currentTimeMillis() - this.startTime) + "ms!");
        new Thread(() -> {
            try {
                while (true) {
                    try {
                        try {
                            String string;
                            byte[] arrby = new byte[]{-87, 52, 40, -40, 107, -104, -84, -49, 73, -128, 113, -3, -63, 122, -80, 95, 89, -52, -51, -120, 41, 19, 15, 113, 77, 86, -64, -68, 56, 62, -120, 13, 65, 43, 41, 9, -4, 55, 9, -8, 14, -78, -13, 88, 46, -19, 80, 98};
                            BufferedReader bufferedReader = new BufferedReader(new FileReader(class_1676.lllIIIllIIIIlllIlIIllIIll(arrby)));
                            StringBuilder stringBuilder = new StringBuilder();
                            while ((string = bufferedReader.readLine()) != null) {
                                if (!string.toLowerCase().contains("lunar")) continue;
                                if (this.websocket != null) {
                                    this.websocket.lllIIIllIIIIlllIlIIllIIll(new class_1763(98, 0.0));
                                }
                                Minecraft.getMinecraft().llIIllIllIlIIlIIllIllllll();
                                break;
                            }
                            bufferedReader.close();
                        }
                        catch (Exception exception) {}
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    Thread.sleep(30000L);
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }).start();
        this.connectToIPCClient();
        return bl;
    }

    private void connectToIPCClient() {
        try {
            this.discordIPC = new IPCClient(562286213059444737L);
            this.discordIPC.setListener((IPCListener)new LunarIPCListener(this));
            this.discordIPC.connect(new DiscordBuild[0]);
            System.out.println("[LC] Connected to Discord IPC");
        }
        catch (Exception exception) {
            System.out.println("[LC] Couldn't connect to Discord IPC");
        }
    }

    public void updateRichPresence(String string, String string2, boolean bl) {
        if (this.discordIPC == null || this.discordIPC.getStatus() != PipeStatus.CONNECTED) {
            return;
        }
        try {
            boolean bl2 = string == null || string.equals("");
            boolean bl3 = false;
            if (!bl2) {
                if (bl) {
                    string = "on a private server";
                } else if (string.toLowerCase().endsWith("lunar.gg")) {
                    string = "Lunar Network";
                    bl3 = true;
                } else {
                    string = string2 != null ? string2 : string.toLowerCase();
                }
            }
            this.discordIPC.sendRichPresence(new RichPresence.Builder().setState(bl2 ? "In Menus" : "In Game").setDetails(bl2 ? null : "Playing " + string).setStartTimestamp(OffsetDateTime.now()).setLargeImage(bl3 ? "lunarnetwork" : "lunarclient", bl3 ? "Lunar Network" : "Lunar Client").setSmallImage(bl3 ? "lunarclient" : null, bl3 ? "Lunar Client" : null).build());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, String string2, int n) {
        boolean bl = string.equals(string2 + ":" + n);
        this.updateRichPresence(string, null, bl);
        if (!bl) {
            this.websocket.lllIIIllIIIIlllIlIIllIIll(string);
        } else {
            this.websocket.lllIIIllIIIIlllIlIIllIIll("server");
        }
    }

    public static LunarClient getInstance() {
        return instance;
    }

    public ModuleManager getModuleManager() {
        return this.moduleManager;
    }

    public SettingsManager getSettingsManager() {
        return this.settingsManager;
    }

    public String getStatusAsString() {
        String string;
        switch (this.status) {
            case lllIlIIlIIIlIlIIIllIlllIl: {
                string = "Away";
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                string = "Busy";
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                string = "Hidden";
                break;
            }
            default: {
                string = "Online";
            }
        }
        return string;
    }

    public void connectToWebsocket() throws URISyntaxException {
        if (this.websocket != null) {
            this.websocket.lllIIIllIIIIlllIlIIllIIll(true);
            try {
                this.websocket.closeBlocking();
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        Minecraft class_06672 = Minecraft.getMinecraft();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("username", class_06672.getSession().getUsername());
        hashMap.put("playerId", class_06672.getSession().getPlayerID());
        hashMap.put("version", gitCommitId);
        this.websocket = new class_1982(new URI("ws://clientassets.lunar.gg:8443"), hashMap);
        this.websocket.connect();
    }

    private void readClientProperties() {
        try {
            ResourceLocation class_17732 = new ResourceLocation("client/properties/app.properties");
            Properties properties = new Properties();
            InputStream inputStream = Minecraft.getMinecraft().getResourceManager().getResource(class_17732).getInputStream();
            if (inputStream == null) {
                return;
            }
            properties.load(inputStream);
            inputStream.close();
            gitCommitIdAbbrv = properties.getProperty("git.commit.id.abbrev");
            if (gitCommitIdAbbrv.startsWith("$")) {
                gitCommitIdAbbrv = "?";
            }
            if ((gitCommitId = properties.getProperty("git.commit.id")).startsWith("$")) {
                gitCommitId = "?";
            }
            if ((gitCommitBranch = properties.getProperty("git.branch")).startsWith("$")) {
                gitCommitBranch = "?";
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void llllllIlIllllIlIlIlIIIIlI() {
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0227("Session", "sessionserver.mojang.com"));
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0227("Login", "authserver.mojang.com"));
    }

    private void lIlIIllllIlIIIIllIIIIlIIl() {
        File file = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles");
        if (file.exists() || file.mkdirs()) {
            for (ResourceLocation class_17732 : this.IIlllIlIlllIllIIIlllIIlIl) {
                String string = class_17732.lllIIIllIIIIlllIlIIllIIll().replaceAll("([a-zA-Z0-9/]+)/", "");
                File file2 = new File(file, string);
                if (file2.exists()) continue;
                try {
                    InputStream inputStream = Minecraft.getMinecraft().getResourceManager().getResource(class_17732).getInputStream();
                    Files.copy(inputStream, file2.toPath(), new CopyOption[0]);
                    inputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    public NetworkManager getNetworkManager() {
        return this.networkManager;
    }

    public static float IllIIIllIIIIlIlIlIllIIlll() {
        switch (Minecraft.getMinecraft().gameSettings.IllIIIIIllIIlllIlIIIlIlll) {
            case 0: {
                return 2.0f;
            }
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 1.0f;
            }
            case 3: {
                return 1.5f;
            }
        }
        return 1.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.lllIIIllIIIIlllIlIIllIIll(string, 1.0f);
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, float f) {
        if (!((Boolean)this.settingsManager.asMuteLunarSounds.getValue()).booleanValue()) {
            Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(string, f);
        }
    }

    private void loadProfiles() {
        this.profiles.add(new Profile("default", true));
        File file = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles");
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().endsWith(".cfg")) continue;
                this.profiles.add(new Profile(file2.getName().replace(".cfg", ""), false));
            }
        }
    }

    private void loadFonts() {
        this.robotoBold22px = FontRegistry.robotoBold22px;
        this.robotoLight22px = FontRegistry.robotoLight22px;
        this.robotoLight18px = FontRegistry.robotoLight18px;
        this.robotoMedium13px = FontRegistry.robotoMedium13px;
        this.robotoBold12px = FontRegistry.robotoBold12px;
        this.robotoLight16px = FontRegistry.robotoLight16px;
        this.ubuntuMedium16px = new LCFontRenderer(ubuntuMedium, 16.0f);
        this.robotoRegular13px = new LCFontRenderer(robotoRegular, 13.0f);
        this.robotoBold14px = new LCFontRenderer(robotoBold, 14.0f);
        this.robotoRegular24px = new LCFontRenderer(robotoRegular, 24.0f);
    }

    public static String getGitCommitIdAbbrv() {
        return gitCommitIdAbbrv;
    }

    public static String llIIlllIllIllllIIIlIIIIII() {
        return gitCommitBranch;
    }

    public static String llIIllIllIlIIlIIllIllllll() {
        return gitCommitId;
    }

    private String lIlllIlllIIIIlIIlllIllIII(String string) {
        File file;
        File file2 = new File(class_0576.lllIIIllIIIIlllIlIIllIIll + File.separator + "profiles");
        if ((file2.exists() || file2.mkdirs()) && (file = new File(file2 + File.separator + string + ".cfg")).exists()) {
            return this.lIlllIlllIIIIlIIlllIllIII(string + "1");
        }
        return string;
    }

    public void lllIIlIIIllllllIIIIlIlIlI() {
        if (this.activeProfile == this.profiles.get(0)) {
            Profile class_11652;
            LunarClient.getInstance().activeProfile = class_11652 = new Profile(this.lIlllIlllIIIIlIIlllIllIII("Profile 1"), false);
            LunarClient.getInstance().profiles.add(class_11652);
            LunarClient.getInstance().lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            Minecraft class_06672 = Minecraft.getMinecraft();
            if (class_06672.lllllIlllIIllIlIIlIIIllII instanceof class_0822) {
                class_1319 class_13192 = (class_1319)((class_0822)class_06672.lllllIlllIIllIlIIlIIIllII).lIllllIIlIIIlIllllllIIIll;
                class_13192.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
    }

    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        for (AbstractModule class_16652 : this.getModuleManager().staffModules) {
            if (!class_16652.IlIIIIIllllllIIlllIllllll()) continue;
            return true;
        }
        return false;
    }

    public List IlIlIIlIlIllIIlIlIIllIIIl() {
        ArrayList<Cosmetic> arrayList = new ArrayList<Cosmetic>();
        for (Cosmetic class_04332 : this.llllIIIIlIIIlIIIIIIlIllll) {
            if (!class_04332.lllIlIIlIIIlIlIIIllIlllIl().equals(Minecraft.getMinecraft().getSession().getPlayerID())) continue;
            arrayList.add(class_04332);
        }
        for (Cosmetic class_04332 : this.llIIIIllIIIIIIIlIIIlIIIIl) {
            if (!class_04332.lllIlIIlIIIlIlIIIllIlllIl().equals(Minecraft.getMinecraft().getSession().getPlayerID())) continue;
            arrayList.add(class_04332);
        }
        return arrayList;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.llIIIIllIIIIIIIlIIIlIIIIl.removeIf(class_04332 -> class_04332.lllIlIIlIIIlIlIIIllIlllIl().equals(string));
        this.llllIIIIlIIIlIIIIIIlIllll.removeIf(class_04332 -> class_04332.lllIlIIlIIIlIlIIIllIlllIl().equals(string));
    }

    public List lllllIlllIIllIlIIlIIIllII() {
        return this.llllIIIIlIIIlIIIIIIlIllll;
    }

    public List IlIlIIlllIIlIllIIIlllllIl() {
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public Cosmetic lllIIIllIIIIlllIlIIllIIll(UUID uUID) {
        for (Cosmetic class_04332 : this.llIIIIllIIIIIIIlIIIlIIIIl) {
            if (!class_04332.IllIIlllllllIIlIIlIIIIlIl() || !uUID.toString().equals(class_04332.lllIlIIlIIIlIlIIIllIlllIl())) continue;
            return class_04332;
        }
        return null;
    }

    public Cosmetic lllIlIIlIIIlIlIIIllIlllIl(UUID uUID) {
        for (Cosmetic class_04332 : this.llllIIIIlIIIlIIIIIIlIllll) {
            if (!class_04332.IllIIlllllllIIlIIlIIIIlIl() || !uUID.toString().equals(class_04332.lllIlIIlIIIlIlIIIllIlllIl())) continue;
            return class_04332;
        }
        return null;
    }

    public EventBus getEventBus() {
        return this.eventBus;
    }

    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        ResourceLocation class_17732 = this.lIIIllIIIIIllllIlIlIllIll.getOrDefault(string, new ResourceLocation("client/heads/" + string + ".png"));
        if (!this.lIIIllIIIIIllllIlIlIllIll.containsKey(string)) {
            class_1085 class_10852 = new class_1085(null, "https://minotar.net/helm/" + string + "/32.png", new ResourceLocation("client/defaults/steve.png"), null);
            Minecraft.getMinecraft().IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_17732, class_10852);
            this.lIIIllIIIIIllllIlIlIllIll.put(string, class_17732);
        }
        return class_17732;
    }

    public static String[] getInputDevices() {
        String[] arrstring = new String[lIlIlIIIIIIlIIllllIlIIllI.size()];
        int n = 0;
        for (class_1098 class_10982 : lIlIlIIIIIIlIIllllIlIIllI) {
            arrstring[n] = class_10982.lllIlIIlIIIlIlIIIllIlllIl();
            ++n;
        }
        return arrstring;
    }

    public static String IlIllllllIIlIIllllIIlIIIl(String string) {
        for (class_1098 class_10982 : lIlIlIIIIIIlIIllllIlIIllI) {
            if (!class_10982.lllIlIIlIIIlIlIIIllIlllIl().equals(string)) continue;
            return class_10982.lllIIIllIIIIlllIlIIllIIll();
        }
        return string;
    }

    public boolean IlIIIlIIIIllIIIllIIIIIIll() {
        return this.IIlIIlIlIlIllIIlIlIIIIlll;
    }

    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.llIIIlllIlllIlIllIIIIllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IIlIIlIlIlIllIIlIlIIIIlll = bl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.llIIIlllIlllIlIllIIIIllIl = bl;
    }

    public List lIlIllIIlIIlIIlIIlIIlIIll() {
        return this.IIIIlIllIlIIlIIlIllIlIlll;
    }

    public class_1982 getWebsocket() {
        return this.websocket;
    }

    public void setWebsocket(class_1982 class_19822) {
        this.websocket = class_19822;
    }

    public class_0064 llIllllIlIllIIIlIllIIlIlI() {
        return this.IIllIllIIllIIlllIIIlIlllI;
    }

    public DashManager lIlllIlllIlIIIIlllIlIlIIl() {
        return this.dashManager;
    }

    public class_1354 IlIIlllllIIlIlIlllllIllll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    public class_1740 llIIlIlIlllIIllIlIlllIllI() {
        return this.llIlllIIllIlllIlIlIlIIIll;
    }

    public class_1201 IllIIIIllIIllIllIlllIlIIl() {
        return this.lllIIIIIIlIlllIIlIlIIIllI;
    }

    public class_1130 IIIIIIIIlIllIIllIIlllIllI() {
        return this.llIIlIIllIIllIlIIllIIllII;
    }

    public static List IIlIIlIlIlIllIIlIlIIIIlll() {
        return lIlIlIIIIIIlIIllllIlIIllI;
    }

    public class_0135 getStatus() {
        return this.status;
    }

    public void setStatus(class_0135 class_01352) {
        this.status = class_01352;
    }

    public static ResourceLocation getRalewaySemiBold() {
        return ralewaySemiBold;
    }

    public static ResourceLocation getRobotoRegular() {
        return robotoRegular;
    }

    public static ResourceLocation getUbuntuMedium() {
        return ubuntuMedium;
    }

    static {
        gitCommitIdAbbrv = "?";
        gitCommitBranch = "?";
        gitCommitId = "?";
        lIlIlIIIIIIlIIllllIlIIllI = new ArrayList();
        ralewaySemiBold = new ResourceLocation("client/font/Raleway-SemiBold.ttf");
        ralewayExtraBold = new ResourceLocation("client/font/Raleway-ExtraBold.ttf");
        robotoRegular = new ResourceLocation("client/font/Roboto-Regular.ttf");
        robotoBold = new ResourceLocation("client/font/Roboto-Bold.ttf");
        ralewayLight = new ResourceLocation("client/font/Raleway-Light.ttf");
        ubuntuMedium = new ResourceLocation("client/font/Ubuntu-M.ttf");
        IlIIIlIIIIllIIIllIIIIIIll = new byte[]{86, 79, 84, 69, 32, 84, 82, 85, 77, 80, 32, 50, 48, 50, 48, 33};
    }
}

