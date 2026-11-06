package com.santosrp.launcher;

/** Configurações do servidor. Troque aqui quando tiver o IP e os links. */
public final class Config {
    private Config() {}

    public static final String SERVER_NAME = "Santos Roleplay";
    public static final String SERVER_IP = "";      // ex: "123.45.67.89"
    public static final int SERVER_PORT = 7777;

    /** Todos os servidores somados no contador ONLINE: {"ip", "porta"}. Adicione quantos quiser. */
    public static final String[][] SERVERS = {
        {SERVER_IP, String.valueOf(SERVER_PORT)},
    };
    /** Cliente SA-MP que o botão JOGAR AGORA abre (com.gta.game / activity SAMP). */
    public static final String GAME_PACKAGE = "com.gta.game";
    public static final String GAME_ACTIVITY = "com.gta.game.SAMP";
    /** Pasta que o cliente usa para cache e configurações. */
    public static final String GAME_DIR = "/storage/emulated/0/GTA/";
    /** true = o launcher baixa o cache .zip e extrai em GAME_DIR antes de jogar. */
    public static final boolean CACHE_ENABLED = false;

    /** Link DIRETO (https) do .zip do cache. O conteúdo do zip deve ficar na raiz,
     *  exatamente como dentro de Android/data/<pacote>/files. */
    public static final String CACHE_URL = "";      // ex: "https://seusite.com/santos-cache.zip"
    /** Mude (ex: "2") quando publicar um cache novo: os jogadores baixam de novo. */
    public static final String CACHE_VERSION = "1";

    public static final String DISCORD_URL = "";    // ex: "https://discord.gg/xxxx"
    public static final String INSTAGRAM_URL = "";
    public static final String YOUTUBE_URL = "";
    public static final String TERMS_URL = "";
    public static final String RULES_URL = "";
}
