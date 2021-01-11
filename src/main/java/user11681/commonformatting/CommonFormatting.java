package user11681.commonformatting;

import net.fabricmc.api.ModInitializer;
import user11681.phormat.api.ExtendedFormatting;
import user11681.phormat.api.FormattingRegistry;

public class CommonFormatting implements ModInitializer {
    public static final char[] overlineCodes = {
        4096,
        4096 + 1,
        4096 + 2,
        4096 + 3,
        4096 + 4,
        4096 + 5,
    };

    public static final ExtendedFormatting overline0 = FormattingRegistry.register("OVERLINE_" + '0', overlineCodes[0], true).formatter(new OverlineFormatter(0));
    public static final ExtendedFormatting overline1 = FormattingRegistry.register("OVERLINE_" + '1', overlineCodes[1], true).formatter(new OverlineFormatter(1));
    public static final ExtendedFormatting overline2 = FormattingRegistry.register("OVERLINE_" + '2', overlineCodes[2], true).formatter(new OverlineFormatter(2));
    public static final ExtendedFormatting overline3 = FormattingRegistry.register("OVERLINE_" + '3', overlineCodes[3], true).formatter(new OverlineFormatter(3));
    public static final ExtendedFormatting overline4 = FormattingRegistry.register("OVERLINE_" + '4', overlineCodes[4], true).formatter(new OverlineFormatter(4));
    public static final ExtendedFormatting overline5 = FormattingRegistry.register("OVERLINE_" + '5', overlineCodes[5], true).formatter(new OverlineFormatter(5));

    @Override
    public void onInitialize() {}
}
