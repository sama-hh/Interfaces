package org.example;

public class Main {
    public static void main(String[] args) {
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();

        MediaController.playMedia(musicPlayer);
        MediaController.playMedia(videoPlayer);
    }
}