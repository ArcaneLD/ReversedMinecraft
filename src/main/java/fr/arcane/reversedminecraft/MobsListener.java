package fr.arcane.reversedminecraft;



import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class MobsListener implements Listener {


    @EventHandler
    public void RevertMobs(EntitySpawnEvent e) {

        if (e.getEntityType() != EntityType.ENDER_DRAGON) {
            e.getEntity().setCustomName("Dinnerbone");
            e.getEntity().setCustomNameVisible(false);
        }
    }


    @EventHandler
    public void MobsIncrease(EntityTargetLivingEntityEvent e) {

        Entity mob = e.getEntity();


        if (mob instanceof Monster) {
            ((Monster) mob).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 900,1, false, false));
        }

        if (mob instanceof Wolf || mob instanceof Creeper) {
            e.getEntity().getWorld().createExplosion(e.getEntity().getLocation(), 5, true);
        }
    }

}
