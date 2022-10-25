package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public class class_1670
extends class_0831 {
    public static void IlIllllllIIlIIllllIIlIIIl() {
        class_2114 class_21142 = class_2114.lllIIIllIIIIlllIlIIllIIll;
        Map map = class_1670.lllIlIIlIIIlIlIIIllIlllIl(class_21142);
        if (map == null) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("RenderPlayerOF init() failed: RenderManager.MapRenderTypes not found");
        } else {
            class_1670 class_16702 = new class_1670();
            class_16702.lllIIIllIIIIlllIlIIllIIll(class_21142);
            map.put(class_0814.class, class_16702);
        }
    }

    public static Field[] lllIIIllIIIIlllIlIIllIIll(Class class_, Class class_2) {
        ArrayList<Field> arrayList = new ArrayList<Field>();
        try {
            Field[] arrfield = class_.getDeclaredFields();
            for (int i = 0; i < arrfield.length; ++i) {
                Field field = arrfield[i];
                if (field.getType() != class_2) continue;
                field.setAccessible(true);
                arrayList.add(field);
            }
            Field[] arrfield2 = arrayList.toArray(new Field[arrayList.size()]);
            return arrfield2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Map lllIlIIlIIIlIlIIIllIlllIl(class_2114 class_21142) {
        try {
            Field[] arrfield = class_1670.lllIIIllIIIIlllIlIIllIIll(class_2114.class, Map.class);
            for (int i = 0; i < arrfield.length; ++i) {
                Object v;
                Field field = arrfield[i];
                Map map = (Map)field.get(class_21142);
                if (map == null || !((v = map.get(class_0814.class)) instanceof class_0831)) continue;
                return map;
            }
            return null;
        }
        catch (Exception exception) {
            Config.lllIlIIlIIIlIlIIIllIlllIl("Error getting RenderManager.mapRenderTypes");
            Config.lllIlIIlIIIlIlIIIllIlllIl(exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }
}

