package ladysnake.gaspunk;

import net.minecraftforge.common.config.Config;

@Config(modid = GasPunk.MOD_ID)
public class Configuration {

    public static boolean fastGas = false;
    public static Client client = new Client();

    public static class Client {
        public boolean useShaders = true;
    }
}