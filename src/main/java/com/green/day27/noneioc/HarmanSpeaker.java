package com.green.day27.noneioc;

import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker() {
        woofer = new HanilWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("Harmen Speaker: 소리가 웅장하다.");
        woofer.baseSound();
    }



}
