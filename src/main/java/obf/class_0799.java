package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.crash.CrashReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public class class_0799 {
    private final CrashReport lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private StackTraceElement[] lIlllIlllIIIIlIIlllIllIII = new StackTraceElement[0];

    public class_0799(CrashReport class_02232, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02232;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public void addCrashSectionCallable(String string, Callable callable) {
        try {
            this.lllIIIllIIIIlllIlIIllIIll(string, callable.call());
        }
        catch (Throwable throwable) {
            this.lllIIIllIIIIlllIlIIllIIll(string, throwable);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, Object object) {
        this.IlIllllllIIlIIllllIIlIIIl.add(new class_0749(string, object));
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string, Throwable throwable) {
        this.lllIIIllIIIIlllIlIIllIIll(string, (Object)throwable);
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        if (arrstackTraceElement.length <= 0) {
            return 0;
        }
        this.lIlllIlllIIIIlIIlllIllIII = new StackTraceElement[arrstackTraceElement.length - 3 - n];
        System.arraycopy(arrstackTraceElement, 3 + n, this.lIlllIlllIIIIlIIlllIllIII, 0, this.lIlllIlllIIIIlIIlllIllIII.length);
        return this.lIlllIlllIIIIlIIlllIllIII.length;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.lIlllIlllIIIIlIIlllIllIII.length != 0 && stackTraceElement != null) {
            StackTraceElement stackTraceElement3 = this.lIlllIlllIIIIlIIlllIllIII[0];
            if (stackTraceElement3.isNativeMethod() == stackTraceElement.isNativeMethod() && stackTraceElement3.getClassName().equals(stackTraceElement.getClassName()) && Objects.equals(stackTraceElement3.getFileName(), stackTraceElement.getFileName()) && stackTraceElement3.getMethodName().equals(stackTraceElement.getMethodName())) {
                if (stackTraceElement2 != null != this.lIlllIlllIIIIlIIlllIllIII.length > 1) {
                    return false;
                }
                if (stackTraceElement2 != null && !this.lIlllIlllIIIIlIIlllIllIII[1].equals(stackTraceElement2)) {
                    return false;
                }
                this.lIlllIlllIIIIlIIlllIllIII[0] = stackTraceElement;
                return true;
            }
            return false;
        }
        return false;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        StackTraceElement[] arrstackTraceElement = new StackTraceElement[this.lIlllIlllIIIIlIIlllIllIII.length - n];
        System.arraycopy(this.lIlllIlllIIIIlIIlllIllIII, 0, arrstackTraceElement, 0, arrstackTraceElement.length);
        this.lIlllIlllIIIIlIIlllIllIII = arrstackTraceElement;
    }

    public void lllIIIllIIIIlllIlIIllIIll(StringBuilder stringBuilder) {
        stringBuilder.append("-- ").append(this.lllIlIIlIIIlIlIIIllIlllIl).append(" --\n");
        stringBuilder.append("Details:");
        if (this.lIlllIlllIIIIlIIlllIllIII != null && this.lIlllIlllIIIIlIIlllIllIII.length > 0) {
            stringBuilder.append("\nStacktrace:");
            for (StackTraceElement stackTraceElement : this.lIlllIlllIIIIlIIlllIllIII) {
                stringBuilder.append("\n\tat ");
                stringBuilder.append(stackTraceElement.toString());
            }
        }
    }

    public StackTraceElement[] lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0799 class_07992, int n, int n2, int n3, Block class_05492, int n4) {
    }
}

