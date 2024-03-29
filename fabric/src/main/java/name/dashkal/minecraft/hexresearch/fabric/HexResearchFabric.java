package name.dashkal.minecraft.hexresearch.fabric;

import name.dashkal.minecraft.hexresearch.fabric.config.HexResearchConfigFabricImpl;
import name.dashkal.minecraft.hexresearch.fabric.event.EventsFabric;
import name.dashkal.minecraft.hexresearch.fabric.network.NetworkingFabric;
import name.dashkal.minecraft.hexresearch.fabric.xplat.FabricXPlatAPIImpl;
import net.fabricmc.api.ModInitializer;
import name.dashkal.minecraft.hexresearch.HexResearch;

/**
 * This is your loading entrypoint on fabric(-likes), in case you need to initialize
 * something platform-specific.
 * <br/>
 * Since quilt can load fabric mods, you develop for two platforms in one fell swoop.
 * Feel free to check out the <a href="https://github.com/architectury/architectury-templates">Architectury templates</a>
 * if you want to see how to add quilt-specific code.
 */
public class HexResearchFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FabricXPlatAPIImpl.init();
        HexResearchConfigFabricImpl.init();
        EventsFabric.init();
        NetworkingFabric.init();
        HexResearch.init();
    }
}
