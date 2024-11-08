package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class BoseSpeaker implements Speaker {
    private Woofer woofer;

    public BoseSpeaker(Woofer woofer) { //외부에서 주는 값을 사용
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Bose Speaker: 소리가 짱짱하다.");
        woofer.baseSound();
    }

}