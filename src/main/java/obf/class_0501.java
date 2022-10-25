package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;

public class class_0501 {
    public static File lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        File file;
        String string2 = System.getProperty("user.home", ".");
        switch (class_0501.lllIIIllIIIIlllIlIIllIIll().ordinal()) {
            case 0: 
            case 1: {
                file = new File(string2, '.' + string + '/');
                break;
            }
            case 2: {
                String string3 = System.getenv("APPDATA");
                if (string3 != null) {
                    file = new File(string3, "." + string + '/');
                    break;
                }
                file = new File(string2, '.' + string + '/');
                break;
            }
            case 3: {
                file = new File(string2, "Library/Application Support/" + string);
                break;
            }
            default: {
                file = new File(string2, string + '/');
            }
        }
        if (bl && !file.exists() && !file.mkdirs()) {
            throw new RuntimeException("The working directory could not be created: " + file);
        }
        return file;
    }

    public static class_0344 lllIIIllIIIIlllIlIIllIIll() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("unix") ? class_0344.lllIIIllIIIIlllIlIIllIIll : (string.contains("linux") ? class_0344.lllIIIllIIIIlllIlIIllIIll : (string.contains("sunos") ? class_0344.lllIlIIlIIIlIlIIIllIlllIl : (string.contains("solaris") ? class_0344.lllIlIIlIIIlIlIIIllIlllIl : (string.contains("mac") ? class_0344.lIlllIlllIIIIlIIlllIllIII : (string.contains("win") ? class_0344.IlIllllllIIlIIllllIIlIIIl : class_0344.IlIIIIIllllllIIlllIllllll)))));
    }
}

