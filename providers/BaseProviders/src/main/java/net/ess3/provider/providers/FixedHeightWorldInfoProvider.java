package net.ess3.provider.providers;

import net.ess3.provider.WorldInfoProvider;
import net.essentialsx.providers.ProviderData;
import org.bukkit.World;

@ProviderData(description = "Fixed Height World Info Provider")
public class FixedHeightWorldInfoProvider implements WorldInfoProvider {
    @Override
    public int getMaxHeight(World world) {
        // Method has existed since Beta 1.7 (yes, *beta*)
        return world.getMaxHeight();
    }

    @Override
    public int getLogicalHeight(World world) {
        // This mirrors the vanilla behaviour up until Minecraft 1.16
        return world.getEnvironment() == World.Environment.NETHER ? 128 : 256;
    }

    @Override
    public int getMinHeight(World world) {
        // Worlds could not go below 0 until Minecraft 1.16
        return 0;
    }
}
