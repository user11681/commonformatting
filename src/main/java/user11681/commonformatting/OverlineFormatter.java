package user11681.commonformatting;

import net.minecraft.client.font.FontStorage;
import net.minecraft.client.font.Glyph;
import net.minecraft.client.font.GlyphRenderer;
import net.minecraft.text.Style;
import user11681.phormat.api.TextFormatter;
import user11681.phormat.asm.access.TextRendererDrawerAccess;

public class OverlineFormatter implements TextFormatter {
    public final int yMultiplier;

    public OverlineFormatter(int level) {
        this.yMultiplier = level;
    }

    @Override
    public void format(
        TextRendererDrawerAccess drawer,
        Style style,
        int charIndex,
        int character,
        FontStorage storage,
        Glyph glyph,
        GlyphRenderer glyphRenderer,
        float red,
        float green,
        float blue,
        float alpha,
        float advance) {
        float shadow = drawer.shadow() ? 1 : 0;
        float x = drawer.x() + shadow;
        float y = drawer.y() + shadow - 1 - 2 * yMultiplier;

        drawer.invokeAddRectangle(new GlyphRenderer.Rectangle(x - 1, y, x + advance, y - 1, 0.01F, red, green, blue, alpha));
    }
}
