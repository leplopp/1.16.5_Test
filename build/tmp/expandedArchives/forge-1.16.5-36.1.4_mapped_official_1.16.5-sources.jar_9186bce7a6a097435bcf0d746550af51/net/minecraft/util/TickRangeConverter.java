package net.minecraft.util;

public class TickRangeConverter {
   public static RangedInteger rangeOfSeconds(int p_233037_0_, int p_233037_1_) {
      return new RangedInteger(p_233037_0_ * 20, p_233037_1_ * 20);
   }
}