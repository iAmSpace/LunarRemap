package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  org.lwjgl.opengl.GL11
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterOutputStream;
import java.io.Reader;
import java.net.Proxy;
import java.util.Map;

import net.minecraft.util.ResourceLocation;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_1226
extends class_1197 {
    private boolean lllIIIllIIIIlllIlIIllIIll = true;
    private String lllIlIIlIIIlIlIIIllIlllIl;
    private ResourceLocation lllllIlllIIllIlIIlIIIllII;
    private Map IlIlIIlllIIlIllIIIlllllIl;
    private String lIIlIIIIIlIlllIlIIlIlIlll;

    public class_1226(int n, Map map, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, n4, n5, (String)map.get("displayName"));
        this.lllIlIIlIIIlIlIIIllIlllIl = (String)map.get("displayName");
        this.lIIlIIIIIlIlllIlIIlIlIlll = (String)map.get("clientToken");
        this.IlIlIIlllIIlIllIIIlllllIl = map;
        this.lllllIlllIIllIlIIlIIIllII = LunarClient.getInstance().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, (String)map.get("uuid"));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Minecraft class_06672, int n, int n2) {
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            class_1854 class_18542 = class_06672.IlIlllIIIIIIlIIllIIllIlll;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.IlIlIIlIlIllIIlIlIIllIIIl = n >= this.lIllllIIlIIIlIllllllIIIll && n2 >= this.IIIllIIlIIIIIIlIlIIllIIlI && n < this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII && n2 < this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll;
            int n3 = this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl);
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                class_0210.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI, this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII, this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll, this.IlIlIIlIlIllIIlIlIIllIIIl ? -15395563 : -14540254);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(class_06672, n, n2);
            int n4 = -1;
            if (!this.IllIIIllIIIIlIlIlIllIIlll) {
                n4 = -986896;
            } else if (this.IlIlIIlIlIllIIlIlIIllIIIl) {
                n4 = -3092272;
            }
            if (this.lllIlIIlIIIlIlIIIllIlllIl.length() > 9) {
                LunarClient.getInstance().robotoMedium13px.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII / 2 + 12, this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll / 2 - (this.lllIIIllIIIIlllIlIIllIIll ? 4 : 3), n4);
            } else {
                LunarClient.getInstance().robotoLight16px.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIllllIIlIIIlIllllllIIIll + this.lIlllIlllIIIIlIIlllIllIII / 2 + 12, this.IIIllIIlIIIIIIlIlIIllIIlI + this.IlIIIIIllllllIIlllIllllll / 2 - (this.lllIIIllIIIIlllIlIIllIIll ? 5 : 4), n4);
            }
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_0857.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, 7.0f, (float)(this.lIllllIIlIIIlIllllllIIIll + 10), (float)(this.IIIllIIlIIIIIIlIlIIllIIlI + 5));
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        class_1220 class_12202;
        if (((String)this.IlIlIIlllIIlIllIIIlllllIl.get("uuid")).equalsIgnoreCase(Minecraft.getMinecraft().getSession().getPlayerID())) {
            return false;
        }
        Minecraft.getMinecraft().IllIIIlllllIlIlllIlllllII().lllIIIllIIIIlllIlIIllIIll(class_0132.lllIIIllIIIIlllIlIIllIIll(new ResourceLocation("gui.button.press"), 1.0f));
        System.out.println("token: " + this.lIIlIIIIIlIlllIlIIlIlIlll + "; accessToken: " + this.IlIlIIlllIIlIllIIIlllllIl.get("accessToken"));
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, this.lIIlIIIIIlIlllIlIIlIlIlll);
        YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)yggdrasilAuthenticationService.createUserAuthentication(Agent.MINECRAFT);
        yggdrasilUserAuthentication.loadFromStorage(this.IlIlIIlllIIlIllIIIlllllIl);
        try {
            yggdrasilUserAuthentication.logIn();
            class_12202 = new class_1220(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
        }
        catch (AuthenticationException authenticationException) {
            authenticationException.printStackTrace();
            return false;
        }
        File file = new File(Minecraft.getMinecraft().mcDataDir + File.separator + "launcher_profiles.json");
        if (file.exists() && !yggdrasilUserAuthentication.getAuthenticatedToken().equals(this.IlIlIIlllIIlIllIIIlllllIl.get("accessToken"))) {
            try {
                FileReader fileReader = new FileReader(file);
                JsonParser jsonParser = new JsonParser();
                JsonElement jsonElement = jsonParser.parse((Reader)fileReader);
                Map.Entry entry = null;
                for (Object object : jsonElement.getAsJsonObject().entrySet()) {
                    if (!((String)object.getKey()).equalsIgnoreCase("authenticationDatabase")) continue;
                    for (Map.Entry entry2 : ((JsonElement)object.getValue()).getAsJsonObject().entrySet()) {
                        for (Map.Entry entry3 : ((JsonElement)entry2.getValue()).getAsJsonObject().entrySet()) {
                            if (!((String)entry3.getKey()).equalsIgnoreCase("profiles")) continue;
                            for (Map.Entry entry4 : ((JsonElement)entry3.getValue()).getAsJsonObject().entrySet()) {
                                if (!((String)entry4.getKey()).replaceAll("-", "").equalsIgnoreCase(class_12202.getPlayerID().replaceAll("-", ""))) continue;
                                entry = entry2;
                            }
                        }
                    }
                }
                if (entry != null) {
                    this.IlIlIIlllIIlIllIIIlllllIl.put("accessToken", yggdrasilUserAuthentication.getAuthenticatedToken());
                    ((JsonElement)entry.getValue()).getAsJsonObject().remove("accessToken");
                    ((JsonElement)entry.getValue()).getAsJsonObject().addProperty("accessToken", yggdrasilUserAuthentication.getAuthenticatedToken());
                    System.out.println("Updated accessToken and logged user in.");
                }
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    Object object;
                    object = new DataOutputStream(new FileOutputStream(file));
                    ((DataOutputStream)object).writeBytes(gson.toJson(jsonElement).replace("\n", "\r\n"));
                    ((DataOutputStream)object).flush();
                    ((FilterOutputStream)object).close();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return false;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return false;
            }
        }
        Minecraft.getMinecraft().lllIIIllIIIIlllIlIIllIIll(class_12202);
        return true;
    }
}

