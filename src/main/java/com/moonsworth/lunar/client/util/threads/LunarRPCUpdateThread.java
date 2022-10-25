package com.moonsworth.lunar.client.util.threads;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.LunarClient;
import net.minecraft.client.Minecraft;
import obf.class_0227;
import obf.EnumChatFormatting;
import obf.class_2010;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class LunarRPCUpdateThread
extends Thread {
    @Override
    public void run() {
        try {
            URL uRL = new URL(LunarClient.getInstance().getSettingsManager().IIIllIllIIlIlIlIlIllllIIl);
            URLConnection uRLConnection = uRL.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
            JsonParser jsonParser = new JsonParser();
            JsonElement jsonElement = jsonParser.parse((Reader)bufferedReader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            for (int i = 0; i < jsonArray.size(); ++i) {
                JsonElement jsonElement2 = jsonArray.get(i);
                for (Map.Entry entry : jsonElement2.getAsJsonObject().entrySet()) {
                    for (class_0227 class_02272 : LunarClient.getInstance().lllIlIIlIIIlIlIIIllIlllIl) {
                        class_2010 class_20102;
                        if (!class_02272.IlIllllllIIlIIllllIIlIIIl().equalsIgnoreCase((String)entry.getKey()) || (class_20102 = class_2010.lllIIIllIIIIlllIlIIllIIll(((JsonElement)entry.getValue()).getAsString())) == null) continue;
                        if (class_20102 != class_02272.lllIIIllIIIIlllIlIIllIIll() && class_02272.lllIIIllIIIIlllIlIIllIIll() != class_2010.lIlllIlllIIIIlIIlllIllIII && class_02272.lllIIIllIIIIlllIlIIllIIll() != class_2010.IlIllllllIIlIIllllIIlIIIl && (class_20102 == class_2010.lllIlIIlIIIlIlIIIllIlllIl || class_20102 == class_2010.lllIIIllIIIIlllIlIIllIIll)) {
                            String string;
                            EnumChatFormatting class_12272 = class_20102 == class_2010.lllIIIllIIIIlllIlIIllIIll ? EnumChatFormatting.GREEN : EnumChatFormatting.RED;
                            String string2 = string = class_20102 == class_2010.lllIIIllIIIIlllIlIIllIIll ? "online" : "offline";
                            if (Minecraft.getMinecraft().theWorld != null) {
                                LunarClient.getInstance().getModuleManager().lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll("info", "Minecraft " + (Object)((Object) EnumChatFormatting.AQUA) + class_02272.lllIlIIlIIIlIlIIIllIlllIl().toLowerCase() + (Object)((Object) EnumChatFormatting.RESET) + " server is now " + (Object)((Object)class_12272) + string + (Object)((Object) EnumChatFormatting.RESET) + ".", 7500L);
                            }
                        }
                        class_02272.lllIIIllIIIIlllIlIIllIIll(class_20102);
                    }
                }
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

