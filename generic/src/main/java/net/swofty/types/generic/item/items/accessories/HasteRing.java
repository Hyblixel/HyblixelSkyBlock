package net.swofty.types.generic.item.items.accessories;

import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.NotFinishedYet;
import net.swofty.types.generic.item.impl.Talisman;
import net.swofty.types.generic.user.SkyBlockPlayer;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HasteRing implements Talisman, NotFinishedYet {
    @Override
    public String getSkullTexture(@Nullable SkyBlockPlayer player, SkyBlockItem item) {
        return "3c26a1ec929d4b144266c56af11d9abaf93f6b274872c96d3e34cb7c7965";
    }

    @Override
    public List<String> getTalismanDisplay() {
        return null;
    }
}
