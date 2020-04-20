package am.dav.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }

    }

    private List<Music> musicList = new ArrayList<>();


    public List<Music> getMusicList() {
        return musicList;
    }

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;

    }

    public MusicPlayer() {

    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }
}
