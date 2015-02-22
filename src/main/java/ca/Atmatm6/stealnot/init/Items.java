package ca.Atmatm6.stealnot.init;

import ca.Atmatm6.stealnot.item.RawSecurity;
import ca.Atmatm6.stealnot.item.SecureIngot;
import net.minecraft.item.Item;

/**
 * Created by Austin on 2015-02-20.
 */
public class Items {
    public static Item securityRaw;
    public static Item secureIngot;

    static {
        securityRaw = new RawSecurity();
        secureIngot = new SecureIngot();
    }
}
