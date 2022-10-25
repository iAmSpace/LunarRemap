package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class class_0261 {
    public static void lllIIIllIIIIlllIlIIllIIll(String[] arrstring) {
        Path path = Paths.get("dictionary.txt", new String[0]);
        Path path2 = Paths.get("shuffled-dictionary.txt", new String[0]);
        List<String> list = Files.readAllLines(path);
        Collections.shuffle(list);
        Files.write(path2, list, new OpenOption[0]);
        System.out.println("Shuffled " + list.size() + " lines from " + path + " to " + path2);
    }
}

