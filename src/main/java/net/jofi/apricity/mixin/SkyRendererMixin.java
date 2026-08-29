package net.jofi.apricity.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.jofi.apricity.config.ApricityConfig;
import net.minecraft.client.renderer.SkyRenderer;
import net.minecraft.world.level.MoonPhase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SkyRenderer.class)
public class SkyRendererMixin {

    @Inject(method = "renderSun",
            at = @At(value = "INVOKE", target = "Lorg/joml/Matrix4fStack;pushMatrix()Lorg/joml/Matrix4fStack;", shift = At.Shift.AFTER))
    private static void renderSun(float alpha, PoseStack poseStack, CallbackInfo ci)
    {
        if(ApricityConfig.sunRotationEnabled) {
            RenderSystem.getModelViewStack().rotateX((float) Math.toRadians(ApricityConfig.sunRotationAmount));
        }

    }

    @Inject(method = "renderMoon",
            at = @At(value = "INVOKE", target = "Lorg/joml/Matrix4fStack;pushMatrix()Lorg/joml/Matrix4fStack;", shift = At.Shift.AFTER))
    private static void renderMoon(MoonPhase moonPhase, float alpha, PoseStack poseStack, CallbackInfo ci)
    {
        if(ApricityConfig.moonRotationEnabled) {
            RenderSystem.getModelViewStack().rotateX((float) Math.toRadians(ApricityConfig.moonRotationAmount));
        }

    }
}
