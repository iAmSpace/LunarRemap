package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class class_0051
extends IOException {
    private final List lllIIIllIIIIlllIlIIllIIll = Lists.newArrayList();
    private final String lllIlIIlIIIlIlIIIllIlllIl;

    public class_0051(String string) {
        this.lllIIIllIIIIlllIlIIllIIll.add(new class_0823(null));
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public class_0051(String string, Throwable throwable) {
        super(throwable);
        this.lllIIIllIIIIlllIlIIllIIll.add(new class_0823(null));
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        class_0823.lllIIIllIIIIlllIlIIllIIll((class_0823)this.lllIIIllIIIIlllIlIIllIIll.get(0), string);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        class_0823.lllIlIIlIIIlIlIIIllIlllIl((class_0823)this.lllIIIllIIIIlllIlIIllIIll.get(0), string);
        this.lllIIIllIIIIlllIlIIllIIll.add(0, new class_0823(null));
    }

    @Override
    public String getMessage() {
        return "Invalid " + ((class_0823)this.lllIIIllIIIIlllIlIIllIIll.get(this.lllIIIllIIIIlllIlIIllIIll.size() - 1)).toString() + ": " + this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public static class_0051 lllIIIllIIIIlllIlIIllIIll(Exception exception) {
        if (exception instanceof class_0051) {
            return (class_0051)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new class_0051(string, exception);
    }
}

