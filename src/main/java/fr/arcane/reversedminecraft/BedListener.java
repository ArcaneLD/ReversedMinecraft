package fr.arcane.reversedminecraft;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BedListener implements Listener {

    @EventHandler
    public void OnBedInteract(PlayerBedEnterEvent e) {

        Player p = e.getPlayer();

        if (p.getWorld().getEnvironment() == World.Environment.NETHER || p.getWorld().getEnvironment() == World.Environment.THE_END) {
            e.setCancelled(true);
            e.setUseBed(Event.Result.ALLOW);
            e.useBed();

         }

        if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {
            e.setUseBed(Event.Result.DENY);
            e.getPlayer().getWorld().createExplosion(e.getPlayer().getLocation(), 14, true);
            e.setCancelled(true);
        }


    }
}
