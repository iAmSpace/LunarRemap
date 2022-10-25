package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import net.minecraft.client.resources.DefaultResourcePack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class class_1207 {
    public static String[] lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        return class_1207.lllIIIllIIIIlllIlIIllIIll(new String[]{string}, new String[]{string2});
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(String[] arrstring, String[] arrstring2) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        class_0449[] arrclass_0449 = Config.lIIlIlllIllIlIlllIIIIIIII();
        for (int i = 0; i < arrclass_0449.length; ++i) {
            class_0449 class_04492 = arrclass_0449[i];
            String[] arrstring3 = class_1207.lllIIIllIIIIlllIlIIllIIll(class_04492, arrstring, arrstring2, (String[])null);
            linkedHashSet.addAll(Arrays.asList(arrstring3));
        }
        String[] arrstring4 = linkedHashSet.toArray(new String[linkedHashSet.size()]);
        return arrstring4;
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492, String string, String string2, String[] arrstring) {
        return class_1207.lllIIIllIIIIlllIlIIllIIll(class_04492, new String[]{string}, new String[]{string2}, arrstring);
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492, String[] arrstring, String[] arrstring2) {
        return class_1207.lllIIIllIIIIlllIlIIllIIll(class_04492, arrstring, arrstring2, (String[])null);
    }

    public static String[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492, String[] arrstring, String[] arrstring2, String[] arrstring3) {
        if (class_04492 instanceof DefaultResourcePack) {
            return class_1207.lllIIIllIIIIlllIlIIllIIll(class_04492, arrstring3);
        }
        if (!(class_04492 instanceof class_0821)) {
            return new String[0];
        }
        class_0821 class_08212 = (class_0821)class_04492;
        File file = class_0179.lllIIIllIIIIlllIlIIllIIll(class_08212);
        return file == null ? new String[0] : (file.isDirectory() ? class_1207.lllIIIllIIIIlllIlIIllIIll(file, "", arrstring, arrstring2) : (file.isFile() ? class_1207.lllIIIllIIIIlllIlIIllIIll(file, arrstring, arrstring2) : new String[0]));
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492, String[] arrstring) {
        if (arrstring == null) {
            return new String[0];
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < arrstring.length; ++i) {
            String string = arrstring[i];
            ResourceLocation class_17732 = new ResourceLocation(string);
            if (!class_04492.lllIlIIlIIIlIlIIIllIlllIl(class_17732)) continue;
            arrayList.add(string);
        }
        String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring2;
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(File file, String string, String[] arrstring, String[] arrstring2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = "assets/minecraft/";
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return new String[0];
        }
        for (int i = 0; i < arrfile.length; ++i) {
            String string3;
            File file2 = arrfile[i];
            if (file2.isFile()) {
                string3 = string + file2.getName();
                if (!string3.startsWith(string2) || !class_2254.lllIIIllIIIIlllIlIIllIIll(string3 = string3.substring(string2.length()), arrstring) || !class_2254.lllIlIIlIIIlIlIIIllIlllIl(string3, arrstring2)) continue;
                arrayList.add(string3);
                continue;
            }
            if (!file2.isDirectory()) continue;
            string3 = string + file2.getName() + "/";
            String[] arrstring3 = class_1207.lllIIIllIIIIlllIlIIllIIll(file2, string3, arrstring, arrstring2);
            for (int j = 0; j < arrstring3.length; ++j) {
                String string4 = arrstring3[j];
                arrayList.add(string4);
            }
        }
        String[] arrstring4 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring4;
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(File file, String[] arrstring, String[] arrstring2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "assets/minecraft/";
        try {
            String[] arrstring3;
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                arrstring3 = enumeration.nextElement();
                String string2 = arrstring3.getName();
                if (!string2.startsWith(string) || !class_2254.lllIIIllIIIIlllIlIIllIIll(string2 = string2.substring(string.length()), arrstring) || !class_2254.lllIlIIlIIIlIlIIIllIlllIl(string2, arrstring2)) continue;
                arrayList.add(string2);
            }
            zipFile.close();
            arrstring3 = arrayList.toArray(new String[arrayList.size()]);
            return arrstring3;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return new String[0];
        }
    }
}

