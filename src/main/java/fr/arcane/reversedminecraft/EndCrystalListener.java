package fr.arcane.reversedminecraft;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EndCrystalListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EndCrystalExplode(EntityExplodeEvent e) {
        if (e.getEntityType() == EntityType.ENDER_CRYSTAL) {
            e.setCancelled(true);
        }

    }


}
