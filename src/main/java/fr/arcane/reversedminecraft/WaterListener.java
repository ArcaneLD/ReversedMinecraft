package fr.arcane.reversedminecraft;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class WaterListener implements Listener {

    @EventHandler
    public void OnInWaterEvent(PlayerMoveEvent e) {
        if (e.getPlayer().isInWater()) {
            e.getPlayer().damage(2);
        }
    }
}
