package ca.Atmatm6.stealnot.init;

import ca.Atmatm6.stealnot.block.BlockOfSecurity;
import ca.Atmatm6.stealnot.block.OreSecure;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block secureOre;
    public static Block blockOfSecurity;
    static
    {
        secureOre = new OreSecure(Material.rock);
        blockOfSecurity = new BlockOfSecurity(Material.sponge);
    }
}
