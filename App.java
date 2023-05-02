import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        RisorsaParcheggio p = new RisorsaParcheggio();
        ArrayList<Auto> automobili = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            automobili.add(new Auto("Auto " + (i + 1) + "", p));
        }
        automobili.forEach(e -> e.start());
    }
}