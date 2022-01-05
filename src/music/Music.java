package music;

import utility.Messages;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;


public class Music {

    public static void playMusic(String musicLocation) {

        try {
            File musicPath = new File(musicLocation);

            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }

            else {
                System.out.println(Messages.MUSIC_FILE_ERROR);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
