package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0470 {
    private static final Logger IlIIIIIllllllIIlllIllllll = LogManager.getLogger();
    public static final File lllIIIllIIIIlllIlIIllIIll = new File("banned-ips.txt");
    public static final File lllIlIIlIIIlIlIIIllIlllIl = new File("banned-players.txt");
    public static final File IlIllllllIIlIIllllIIlIIIl = new File("ops.txt");
    public static final File lIlllIlllIIIIlIIlllIllIII = new File("white-list.txt");

    private static void lllIIIllIIIIlllIlIIllIIll(class_0220 class_02202, Collection collection, ProfileLookupCallback profileLookupCallback) {
        String[] arrstring = (String[])Iterators.toArray((Iterator)Iterators.filter(collection.iterator(), (Predicate)new class_1772()), String.class);
        if (class_02202.lIlIlIIIIIIlIIllllIlIIllI()) {
            class_02202.IlIlIllIIlIIIIlllIlIllIlI().findProfilesByNames(arrstring, Agent.MINECRAFT, profileLookupCallback);
        } else {
            String[] arrstring2 = arrstring;
            int n = arrstring.length;
            for (int i = 0; i < n; ++i) {
                String string = arrstring2[i];
                UUID uUID = class_0814.lllIIIllIIIIlllIlIIllIIll(new GameProfile((UUID)null, string));
                GameProfile gameProfile = new GameProfile(uUID, string);
                profileLookupCallback.onProfileLookupSucceeded(gameProfile);
            }
        }
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        if (!class_1911.lllIlIIlIIIlIlIIIllIlllIl(string) && string.length() <= 16) {
            class_0220 class_02202 = class_0220.IlIIlllllIIlIlIlllllIllll();
            GameProfile gameProfile = class_02202.IlIIllIlIlIllIIIlIIlIlIIl().lllIIIllIIIIlllIlIIllIIll(string);
            if (gameProfile != null && gameProfile.getId() != null) {
                return gameProfile.getId().toString();
            }
            if (!class_02202.llIIIlllIlllIlIllIIIIllIl() && class_02202.lIlIlIIIIIIlIIllllIlIIllI()) {
                ArrayList arrayList = Lists.newArrayList();
                class_0027 class_00272 = new class_0027(class_02202, arrayList);
                class_0470.lllIIIllIIIIlllIlIIllIIll(class_02202, Lists.newArrayList((Object[])new String[]{string}), class_00272);
                return arrayList.size() > 0 && ((GameProfile)arrayList.get(0)).getId() != null ? ((GameProfile)arrayList.get(0)).getId().toString() : "";
            }
            return class_0814.lllIIIllIIIIlllIlIIllIIll(new GameProfile((UUID)null, string)).toString();
        }
        return string;
    }

    static /* synthetic */ Logger lllIIIllIIIIlllIlIIllIIll() {
        return IlIIIIIllllllIIlllIllllll;
    }
}

