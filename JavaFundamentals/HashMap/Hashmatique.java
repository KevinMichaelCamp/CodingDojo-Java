import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Another Post Human Dream", "Algorithms of demise float over our heads");
        tracklist.put("Solaris", "I'm on a mission to wipe imagination clean");
        tracklist.put("Apocalypse Blooms", "You get your daylight from a screen");
        tracklist.put("Another Space Song", "I've got no Houston to whine down to");

        String song = tracklist.get("Solaris");
        // System.out.println(song);

        Set<String> keys = tracklist.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + tracklist.get(key));
        }
    }
}