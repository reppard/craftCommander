package com.reppardwalker.craftCommander;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created with IntelliJ IDEA.
 * User: rwalker8
 * Date: 3/16/14
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class craftCommander extends JavaPlugin{
    private final PlayerListener playerListener = new PlayerListener(this);

    @Override
    public void onEnable(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(playerListener, this);
        getLogger().info("craftCommander: plugin enabled!");
    }

    @Override
    public void onDisable(){
        getLogger().info("craftCommander: plugin disabled!");
    }
}
