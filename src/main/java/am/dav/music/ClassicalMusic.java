package am.dav.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ClassicalMusic implements Music {


    List<String> list = new ArrayList<>();
    {
        list.add("Classical music 1");
        list.add("Classical music 2");
        list.add("Classical music 3");
    }



    @Override
    public List<String> getSong() {
        return list;
    }


}
