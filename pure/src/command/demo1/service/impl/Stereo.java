package command.demo1.service.impl;

import command.demo1.service.Command;

public class Stereo {
    public void on() {
        System.out.println("Stereo - [on] >>>");
    }

    public void off() {
        System.out.println("Stereo - [off] >>>");
    }

    public void setCd() {
        System.out.println("Stereo - [setCd] >>>");
    }

    public void setDvd() {
        System.out.println("Stereo - [setCd] >>>");
    }

    public void setRadio() {
        System.out.println("Stereo - [setRadio] >>>");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo - [setVolume]" + volume + " >>>");
    }
}
