package net.caedenjackson.tutorialmod.effect;


import net.caedenjackson.tutorialmod.TutorialMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTs =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TutorialMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        MOB_EFFECTs.register(eventBus);
    }
}
