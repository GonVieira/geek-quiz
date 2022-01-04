package music;

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
                System.out.println("Can't find file");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
