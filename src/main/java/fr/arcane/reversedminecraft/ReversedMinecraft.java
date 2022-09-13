package fr.arcane.reversedminecraft;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class ReversedMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[ReversedMC] Loaded . . .");

        Bukkit.getServer().getPluginManager().registerEvents(new BedListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new HealthListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BlockListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new EndCrystalListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new EndermanListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BlazeListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new WaterListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new MobsListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new TreeListener(), this);

        recipeFurnace();
    }
        public void recipeFurnace(){
            ItemStack result = new ItemStack(Material.COBBLESTONE);
            FurnaceRecipe recipe = new FurnaceRecipe(result, Material.STONE);
            recipe.setExperience(8);
            getServer().addRecipe(recipe);

        }

        




    @Override
    public void onDisable() {
        System.out.println("[ReversedMC] Disabled . . .");
    }
}
