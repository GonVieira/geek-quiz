package music;

import utility.Messages;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class Music {

    public static Clip playMusic(String musicLocation) {

            File musicPath = new File(musicLocation);

            if (musicPath.exists()) {
                AudioInputStream audioInput = null;
                try {
                    audioInput = AudioSystem.getAudioInputStream(musicPath);
                } catch (UnsupportedAudioFileException | IOException e) {
                    e.printStackTrace();
                }
                Clip clip = null;
                try {
                    clip = AudioSystem.getClip();
                } catch (LineUnavailableException e) {
                    e.printStackTrace();
                }
                try {
                    clip.open(audioInput);
                } catch (LineUnavailableException | IOException e) {
                    e.printStackTrace();
                }
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                return clip;
            } else {
                System.out.println(Messages.MUSIC_FILE_ERROR);
                return null;
            }
    }

    public static void stopMusic(Clip clip) {
        clip.stop();
    }
}
