// Source - https://stackoverflow.com/a/52682
// Posted by Stefan Karlsson, modified by community. See post 'Timeline' for change history
// Retrieved 2026-02-20, License - CC BY-SA 4.0

import java.lang.instrument.Instrumentation;

public class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}
