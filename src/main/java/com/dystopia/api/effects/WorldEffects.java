package com.dystopia.api.effects;

import java.util.ArrayList;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
/**
 * Class responsible for the management of WorldEffects.
 * @author bmb0901
 */
public class WorldEffects {
	
	//Effects
	public static EffectBase base;
	
	/**
	 * The currentEffect variable is used to determine the effect's
	 * current actions.
	 */
	public static EffectBase currentEffect = null;

	/**
	 * A collection of EffectBase() objects
	 * See {@code setupWorldEffects}
	 */
	public static ArrayList<EffectBase> worldEffects = new ArrayList<EffectBase>();

	
	public WorldEffects() {
	}
	
	/**
	 * First assigns each list object with an EffectBase(),
	 * then adds it to the worldEffects list.
	 * @return worldEffects
	 */
	public static ArrayList<EffectBase> setupWorldEffects() {
		base = new EffectBase("default");
		
		worldEffects.add(base);
		
		return worldEffects;
	}
	/**
	 * First gets an instance of an EffectBase() for each object
	 * in the worldEffects ArrayList. After doing so, it assigns
	 * the most recent list object to currentEffect.
	 * @return currentEffect
	 */
	public static EffectBase parseWorldEffects() {
		for(EffectBase effects : worldEffects) {
			currentEffect = EffectBase.getEffect();
		}
		return currentEffect;
	}
	
	/**
	 * Sets the currentEffect to the EffectBase() specified
	 * @param effect
	 */
	public static void setWorldEffect(EffectBase effect) {
		currentEffect = effect;
	}
}
