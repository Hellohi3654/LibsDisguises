package me.libraryaddict.disguise.disguisetypes;

public class PlayerDisguise extends Disguise {
    private String playerName;

    public PlayerDisguise(String name) {
        this(name, true);
    }

    public PlayerDisguise(String name, boolean replaceSounds) {
        if (name.length() > 16)
            name = name.substring(0, 16);
        playerName = name;
        createDisguise(DisguiseType.PLAYER, replaceSounds);
    }

    public PlayerDisguise clone() {
        PlayerDisguise disguise = new PlayerDisguise(getName(), replaceSounds());
        return disguise;
    }

    public String getName() {
        return playerName;
    }

}