package com.reppardwalker.craftCommander;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static org.bukkit.ChatColor.*;


/**
 * Created with IntelliJ IDEA.
 * User: rwalker8
 * Date: 3/16/14
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */

public class PlayerListener implements Listener {
    public final craftCommander plugin;

    public PlayerListener(craftCommander instance){
        plugin = instance;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage(AQUA + "[Server using craftCommander v0.0.1]");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        player.sendMessage(YELLOW  + player.getDisplayName() + RED + "left the game.");
    }
}
