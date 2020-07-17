package com.dystopia.api.effects;

/**
 * Defines a base WorldEffect
 * See {@link WorldEffects}.
 *
 * @author bmb0901
 */
public class EffectBase {

	public static String name;
	
	public static boolean active = false;
	
	public EffectBase(String name) {
	}

	/**
	 *  Gets an instance of the effect by
	 * 	returning a new EffectBase() with name parameter
	 **/
	public static EffectBase getEffect() {
		return WorldEffects.currentEffect;
	}
	/**
	 * Triggers the effect
	 */
	public void onEffectActive() {
		active = true;
	}
	/**
	 * Stops the effect
	 */
	public void onEffectInactive() {
		active = false;
	}
}