package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1769
extends class_1246 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private long lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    @Override
    public String lllIIIllIIIIlllIlIIllIIll() {
        return "debug";
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 3;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692) {
        return "commands.debug.usage";
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring) {
        if (arrstring.length == 1) {
            if (arrstring[0].equals("start")) {
                class_1769.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.debug.start", new Object[0]);
                class_0220.IlIIlllllIIlIlIlllllIllll().IllIlIlIIIlllIIllIIIIlIll();
                this.lllIlIIlIIIlIlIIIllIlllIl = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
                this.IlIllllllIIlIIllllIIlIIIl = class_0220.IlIIlllllIIlIlIlllllIllll().IllllIIlIIIllIlllIlllIllI();
                return;
            }
            if (arrstring[0].equals("stop")) {
                if (!class_0220.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl.profilingEnabled) {
                    throw new class_1953("commands.debug.notStarted", new Object[0]);
                }
                long l = class_0220.lllIIIlIIlIlIllIIIIIlIIll();
                int n = class_0220.IlIIlllllIIlIlIlllllIllll().IllllIIlIIIllIlllIlllIllI();
                long l2 = l - this.lllIlIIlIIIlIlIIIllIlllIl;
                int n2 = n - this.IlIllllllIIlIIllllIIlIIIl;
                this.lllIIIllIIIIlllIlIIllIIll(l2, n2);
                class_0220.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl.profilingEnabled = false;
                class_1769.lllIIIllIIIIlllIlIIllIIll(class_19692, (class_0291)this, "commands.debug.stop", Float.valueOf((float)l2 / 1000.0f), n2);
                return;
            }
        }
        throw new class_0932("commands.debug.usage", new Object[0]);
    }

    private void lllIIIllIIIIlllIlIIllIIll(long l, int n) {
        File file = new File(class_0220.IlIIlllllIIlIlIlllllIllll().IlIllllllIIlIIllllIIlIIIl("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.lllIlIIlIIIlIlIIIllIlllIl(l, n));
            fileWriter.close();
        }
        catch (Throwable throwable) {
            lllIIIllIIIIlllIlIIllIIll.error("Could not save profiler results to " + file, throwable);
        }
    }

    private String lllIlIIlIIIlIlIIIllIlllIl(long l, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Profiler Results ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(class_1769.lIlllIlllIIIIlIIlllIllIII());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time span: ").append(l).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n).append(" ticks\n");
        stringBuilder.append("// This is approximately ").append(String.format("%.2f", Float.valueOf((float)n / ((float)l / 1000.0f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.lllIIIllIIIIlllIlIIllIIll(0, "root", stringBuilder);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        return stringBuilder.toString();
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, String string, StringBuilder stringBuilder) {
        List list = class_0220.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl.getProfilingData(string);
        if (list != null && list.size() >= 3) {
            for (int i = 1; i < list.size(); ++i) {
                class_1983 class_19832 = (class_1983)list.get(i);
                stringBuilder.append(String.format("[%02d] ", n));
                for (int j = 0; j < n; ++j) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append(class_19832.IlIllllllIIlIIllllIIlIIIl);
                stringBuilder.append(" - ");
                stringBuilder.append(String.format("%.2f", class_19832.lllIIIllIIIIlllIlIIllIIll));
                stringBuilder.append("%/");
                stringBuilder.append(String.format("%.2f", class_19832.lllIlIIlIIIlIlIIIllIlllIl));
                stringBuilder.append("%\n");
                if (class_19832.IlIllllllIIlIIllllIIlIIIl.equals("unspecified")) continue;
                try {
                    this.lllIIIllIIIIlllIlIIllIIll(n + 1, string + "." + class_19832.IlIllllllIIlIIllllIIlIIIl, stringBuilder);
                    continue;
                }
                catch (Exception exception) {
                    stringBuilder.append("[[ EXCEPTION " + exception + " ]]");
                }
            }
        }
    }

    private static String lIlllIlllIIIIlIIlllIllIII() {
        String[] arrstring = new String[]{"Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server."};
        try {
            return arrstring[(int)(System.nanoTime() % (long)arrstring.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return arrstring.length == 1 ? class_1769.lllIIIllIIIIlllIlIIllIIll(arrstring, "start", "stop") : null;
    }
}

