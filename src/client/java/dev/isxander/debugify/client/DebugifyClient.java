package dev.isxander.debugify.client;

import dev.isxander.debugify.Debugify;

public class DebugifyClient {
    public static void onInitializeClient() {}
    public static boolean isGameplayFixesEnabled() {
        return Debugify.CONFIG.gameplayFixesInMultiplayer;
    }
}
