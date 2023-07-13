package net.veroxuniverse.epicsamurai.client.custom_armors.samurai_armor.straw_hat;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;
import net.veroxuniverse.epicsamurai.item.armor.StrawHatArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StrawHatArmorModel extends AnimatedGeoModel<StrawHatArmorItem> {
    @Override
    public ResourceLocation  getModelLocation(StrawHatArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "geo/straw_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(StrawHatArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "textures/models/armor/straw_hat_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(StrawHatArmorItem animatable) {
        return null;
        //return new ResourceLocation(EpicSamuraiMod.MOD_ID, "animations/samurai_armor_animation.json");
    }

}
