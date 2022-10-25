package net.minecraft.profiler;

import obf.class_1983;
import optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Profiler {
    private static final Logger logger = LogManager.getLogger();
    private final List<String> sectionList = new ArrayList<>();
    private final List<Long> timestampList = new ArrayList<>();
    public boolean profilingEnabled;
    private String profilingSection = "";
    private final Map<String, Long> profilingMap = new HashMap<>();
    public boolean profilerGlobalEnabled;
    private boolean profilerLocalEnabled = this.profilerGlobalEnabled = true;
    private long startTickNano = 0L;
    public long timeTickNano = 0L;
    private long startUpdateChunksNano = 0L;
    public long timeUpdateChunksNano = 0L;

    public void clearProfiling() {
        this.profilingMap.clear();
        this.profilingSection = "";
        this.sectionList.clear();
        this.profilerLocalEnabled = this.profilerGlobalEnabled;
    }

    public void startSection(String par1Str) {
        if (Config.getGameSettings().showDebugInfo)
        {
            if (this.startTickNano == 0L && par1Str.equals("tick"))
            {
                this.startTickNano = System.nanoTime();
            }

            if (this.startTickNano != 0L && par1Str.equals("preRenderErrors"))
            {
                this.timeTickNano = System.nanoTime() - this.startTickNano;
                this.startTickNano = 0L;
            }

            if (this.startUpdateChunksNano == 0L && par1Str.equals("updatechunks"))
            {
                this.startUpdateChunksNano = System.nanoTime();
            }

            if (this.startUpdateChunksNano != 0L && par1Str.equals("terrain"))
            {
                this.timeUpdateChunksNano = System.nanoTime() - this.startUpdateChunksNano;
                this.startUpdateChunksNano = 0L;
            }
        }

        if (this.profilerLocalEnabled)
        {
            if (this.profilingEnabled)
            {
                if (this.profilingSection.length() > 0)
                {
                    this.profilingSection = this.profilingSection + ".";
                }

                this.profilingSection = this.profilingSection + par1Str;
                this.sectionList.add(this.profilingSection);
                this.timestampList.add(System.nanoTime());
            }
        }
    }

    public void endSection() {
        if (this.profilerLocalEnabled)
        {
            if (this.profilingEnabled)
            {
                long var1 = System.nanoTime();
                long var3 = this.timestampList.remove(this.timestampList.size() - 1);
                this.sectionList.remove(this.sectionList.size() - 1);
                long var5 = var1 - var3;

                if (this.profilingMap.containsKey(this.profilingSection))
                {
                    this.profilingMap.put(this.profilingSection, this.profilingMap.get(this.profilingSection) + var5);
                }
                else
                {
                    this.profilingMap.put(this.profilingSection, var5);
                }

                if (var5 > 100000000L)
                {
                    logger.warn("Something's taking too long! '" + this.profilingSection + "' took aprox " + (double)var5 / 1000000.0D + " ms");
                }

                this.profilingSection = !this.sectionList.isEmpty() ? this.sectionList.get(this.sectionList.size() - 1) : "";
            }
        }
    }

    public List getProfilingData(String string) {
        this.profilerLocalEnabled = this.profilerGlobalEnabled;
        if (!this.profilerLocalEnabled) {
            return new ArrayList<>(Collections.singletonList(new class_1983("root", 0.0, 0.0)));
        }
        if (!this.profilingEnabled) {
            return null;
        }
        long l = this.profilingMap.getOrDefault("root", 0L);
        long l2 = this.profilingMap.getOrDefault(string, -1L);
        ArrayList<class_1983> arrayList = new ArrayList<>();
        if (string.length() > 0) {
            string = string + ".";
        }
        long l3 = 0L;
        for (String string2 : this.profilingMap.keySet()) {
            if (string2.length() <= string.length() || !string2.startsWith(string) || string2.indexOf(".", string.length() + 1) >= 0) continue;
            l3 += this.profilingMap.get(string2);
        }
        float f = l3;
        if (l3 < l2) {
            l3 = l2;
        }
        if (l < l3) {
            l = l3;
        }
        for (String string3 : this.profilingMap.keySet()) {
            if (string3.length() <= string.length() || !string3.startsWith(string) || string3.indexOf(".", string.length() + 1) >= 0) continue;
            long l4 = this.profilingMap.get(string3);
            double d = (double)l4 * 100.0 / (double)l3;
            double d2 = (double)l4 * 100.0 / (double)l;
            String string4 = string3.substring(string.length());
            arrayList.add(new class_1983(string4, d, d2));
        }
        for (String string3 : this.profilingMap.keySet()) {
            this.profilingMap.put(string3, this.profilingMap.get(string3) * 999L / 1000L);
        }
        if ((float)l3 > f) {
            arrayList.add(new class_1983("unspecified", (double)((float)l3 - f) * 100.0 / (double)l3, (double)((float)l3 - f) * 100.0 / (double)l));
        }
        Collections.sort(arrayList);
        arrayList.add(0, new class_1983(string, 100.0, (double)l3 * 100.0 / (double)l));
        return arrayList;
    }

    public void endStartSection(String string) {
        if (this.profilerLocalEnabled) {
            this.endSection();
            this.startSection(string);
        }
    }

    public String getNameOfLastSection() {
        return this.sectionList.size() == 0 ? "[UNKNOWN]" : this.sectionList.get(this.sectionList.size() - 1);
    }
}

