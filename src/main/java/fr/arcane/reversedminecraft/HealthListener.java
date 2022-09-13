package fr.arcane.reversedminecraft;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class HealthListener implements Listener {




    @EventHandler
    public void OnDamage(EntityDamageEvent e) {

        if (e.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK || e.getCause() == EntityDamageEvent.DamageCause.ENTITY_SWEEP_ATTACK || e.getCause() == EntityDamageEvent.DamageCause.CUSTOM || e.getCause() == EntityDamageEvent.DamageCause.SUICIDE) {
                return;
        }


            if (e.getEntity() instanceof Player) {
                e.setCancelled(true);
                Player p = (Player) e.getEntity();
                double sh = p.getHealth() + e.getDamage();
                p.setHealth(sh);

            }



        }

    }


