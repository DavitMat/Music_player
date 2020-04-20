package am.dav.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    List<String> list = new ArrayList<>();

    {
        list.add("Rock music 1");
        list.add("Rock music 2");
        list.add("Rock music 3");
    }


    @Override
    public List<String> getSong() {
        return list;
    }


}
