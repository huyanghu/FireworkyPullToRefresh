package com.cleveroad.pulltorefresh.firework.particlesystem.initializers;

import com.cleveroad.pulltorefresh.firework.particlesystem.Particle;

import java.util.Random;


public class ScaleInitializer implements ParticleInitializer {

    private float mMaxScale;
    private float mMinScale;

    public ScaleInitializer(float minScale, float maxScale) {
        mMinScale = minScale;
        mMaxScale = maxScale;
    }

    @Override
    public void initParticle(Particle p, Random r) {
        p.mScale = r.nextFloat() * (mMaxScale - mMinScale) + mMinScale;
    }

}
