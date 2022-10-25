package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.FileNotFoundException;

public class class_1017
extends FileNotFoundException {
    public class_1017(File file, String string) {
        super(String.format("'%s' in ResourcePack '%s'", string, file));
    }
}

