package net.minecraft.crash;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.JOptionPane;

import com.moonsworth.lunar.client.LunarClient;
import obf.*;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CrashReport {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final Throwable IlIllllllIIlIIllllIIlIIIl;
    private final class_0799 lIlllIlllIIIIlIIlllIllIII = new class_0799(this, "System Details");
    private final List IlIIIIIllllllIIlllIllllll = new ArrayList();
    private File lIllllIIlIIIlIllllllIIIll;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = true;
    private StackTraceElement[] IllIIlllllllIIlIIlIIIIlIl = new StackTraceElement[0];
    private boolean IIIllIllIIlIlIlIlIllllIIl = false;

    public CrashReport(String string, Throwable throwable) {
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = throwable;
        this.IIIllIIlIIIIIIlIlIIllIIlI();
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("Minecraft Version", new class_0993(this));
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("Operating System", new class_0635(this));
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("Java Version", new class_0987(this));
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("Java VM Version", new class_0908(this));
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("Memory", new class_1068(this));
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("JVM Flags", new class_0986(this));
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("AABB Pool Size", new class_1005(this));
        this.lIlllIlllIIIIlIIlllIllIII.addCrashSectionCallable("IntCache", new class_1167(this));
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == null ? "Unknown" : this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Throwable lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(StringBuilder stringBuilder) {
        if ((this.IllIIlllllllIIlIIlIIIIlIl == null || this.IllIIlllllllIIlIIlIIIIlIl.length <= 0) && this.IlIIIIIllllllIIlllIllllll.size() > 0) {
            this.IllIIlllllllIIlIIlIIIIlIl = (StackTraceElement[])ArrayUtils.subarray((Object[])((class_0799)this.IlIIIIIllllllIIlllIllllll.get(0)).lllIIIllIIIIlllIlIIllIIll(), (int)0, (int)1);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl != null && this.IllIIlllllllIIlIIlIIIIlIl.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Stacktrace:\n");
            for (StackTraceElement stackTraceElement : this.IllIIlllllllIIlIIlIIIIlIl) {
                stringBuilder.append("\t").append("at ").append(stackTraceElement.toString());
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(stringBuilder);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String IlIllllllIIlIIllllIIlIIIl() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable throwable = this.IlIllllllIIlIIllllIIlIIIl;
        if (throwable.getMessage() == null) {
            if (throwable instanceof NullPointerException) {
                throwable = new NullPointerException(this.lllIlIIlIIIlIlIIIllIlllIl);
            } else if (throwable instanceof StackOverflowError) {
                throwable = new StackOverflowError(this.lllIlIIlIIIlIlIIIllIlllIl);
            } else if (throwable instanceof OutOfMemoryError) {
                throwable = new OutOfMemoryError(this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            throwable.setStackTrace(this.IlIllllllIIlIIllllIIlIIIl.getStackTrace());
        }
        String string = throwable.toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable throwable2) {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly(printWriter);
            throw throwable2;
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)printWriter);
        return string;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        if (!this.IIIllIllIIlIlIlIlIllllIIl) {
            this.IIIllIllIIlIlIlIlIllllIIl = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Crash Report ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(CrashReport.IllIIlllllllIIlIIlIIIIlIl());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time: ");
        stringBuilder.append(new SimpleDateFormat().format(new Date()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.lllIlIIlIIIlIlIIIllIlllIl);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.IlIllllllIIlIIllllIIlIIIl());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 0; i < 87; ++i) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.lllIIIllIIIIlllIlIIllIIll(stringBuilder);
        return stringBuilder.toString();
    }

    public File IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(File file) {
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            return false;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.lIlllIlllIIIIlIIlllIllIII());
            fileWriter.close();
            this.lIllllIIlIIIlIllllllIIIll = file;
            return true;
        }
        catch (Throwable throwable) {
            lllIIIllIIIIlllIlIIllIIll.error("Could not save crash report to " + file, throwable);
            return false;
        }
    }

    public class_0799 getCategory() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_0799 lllIIIllIIIIlllIlIIllIIll(String string) {
        return this.lllIIIllIIIIlllIlIIllIIll(string, 1);
    }

    public class_0799 lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        class_0799 class_07992 = new class_0799(this, string);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI) {
            int n2 = class_07992.lllIIIllIIIIlllIlIIllIIll(n);
            StackTraceElement[] arrstackTraceElement = this.IlIllllllIIlIIllllIIlIIIl.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            int n3 = arrstackTraceElement.length - n2;
            if (n3 < 0) {
                System.out.println("Negative index in crash report handler (" + arrstackTraceElement.length + "/" + n2 + ")");
            }
            if (arrstackTraceElement != null && 0 <= n3 && n3 < arrstackTraceElement.length) {
                stackTraceElement = arrstackTraceElement[n3];
                if (arrstackTraceElement.length + 1 - n2 < arrstackTraceElement.length) {
                    stackTraceElement2 = arrstackTraceElement[arrstackTraceElement.length + 1 - n2];
                }
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_07992.lllIIIllIIIIlllIlIIllIIll(stackTraceElement, stackTraceElement2);
            if (n2 > 0 && !this.IlIIIIIllllllIIlllIllllll.isEmpty()) {
                class_0799 class_07993 = (class_0799)this.IlIIIIIllllllIIlllIllllll.get(this.IlIIIIIllllllIIlllIllllll.size() - 1);
                class_07993.lllIlIIlIIIlIlIIIllIlllIl(n2);
            } else if (arrstackTraceElement != null && arrstackTraceElement.length >= n2 && 0 <= n3 && n3 < arrstackTraceElement.length) {
                this.IllIIlllllllIIlIIlIIIIlIl = new StackTraceElement[n3];
                System.arraycopy(arrstackTraceElement, 0, this.IllIIlllllllIIlIIlIIIIlIl, 0, this.IllIIlllllllIIlIIlIIIIlIl.length);
            } else {
                this.IIIllIIlIIIIIIlIlIIllIIlI = false;
            }
        }
        this.IlIIIIIllllllIIlllIllllll.add(class_07992);
        return class_07992;
    }

    private static String IllIIlllllllIIlIIlIIIIlIl() {
        String[] arrstring = new String[]{"Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine."};
        try {
            return arrstring[(int)(System.nanoTime() % (long)arrstring.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    public static CrashReport lllIIIllIIIIlllIlIIllIIll(Throwable throwable, String string) {
        Object object;
        try {
            object = new StringBuilder();
            ((StringBuilder)object).append(throwable.getClass().getSimpleName()).append(": ").append(throwable.getLocalizedMessage());
            for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
                ((StringBuilder)object).append("\n").append("\t").append("at ").append(stackTraceElement);
            }
            UUID uUID = UUID.randomUUID();
            Runtime runtime = Runtime.getRuntime();
            long l = runtime.maxMemory() / 1024L / 1024L;
            long l2 = runtime.totalMemory() / 1024L / 1024L;
            long l3 = runtime.freeMemory() / 1024L / 1024L;
            String string2 = l3 + "MB/" + l2 + "MB of " + l + "MB";
            if (LunarClient.getInstance() != null && LunarClient.getInstance().getWebsocket() != null && LunarClient.getInstance().getWebsocket().isOpen()) {
                LunarClient.getInstance().getWebsocket().lllIIIllIIIIlllIlIIllIIll(new class_2215(uUID.toString(), LunarClient.llIIllIllIlIIlIIllIllllll(), System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"), string2, ((StringBuilder)object).toString()));
            }
            StringSelection stringSelection = new StringSelection("LC-" + uUID.toString());
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            if (throwable.getClass().getSimpleName().equals("OutOfMemoryError")) {
                new Thread(() -> JOptionPane.showMessageDialog(null, "Your client has ran out of memory.\nYou can increase memory allocation in the launcher. \n\nPlease use the following code (also copied to your clipboard) when submitting a bug report: \n\nLC-" + uUID, "Out of Memory", 2)).start();
            } else {
                new Thread(() -> JOptionPane.showMessageDialog(null, "Your client has crashed. \n\nPlease use the following code (also copied to your clipboard) when submitting a bug report: \n\nLC-" + uUID, "Something went wrong", 2)).start();
            }
            Thread.sleep(4000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        object = throwable instanceof class_0892 ? ((class_0892)throwable).lllIIIllIIIIlllIlIIllIIll() : new CrashReport(string, throwable);
        return object;
    }
}

