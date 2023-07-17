import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ChildsWord {
    private ArrayList<Game> games;
    private ArrayList<Game> presentGames;
    private String presentFilePath;

    public ChildsWord() {
        games = new ArrayList<Game>();
        presentGames = new ArrayList<Game>();
        presentFilePath = "present.txt";
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void changeGameFrequency(int gameId, double newFrequency) {
        for (Game game : games) {
            if (game.getId() == gameId) {
                game.setFrequency(newFrequency);
            }
        }
    }

    public void organizeOut() {
        presentGames.clear();

        for (Game game : games) {
            double random = Math.random() * 100;
            if (random < game.getFrequency()) {
                presentGames.add(game);
            }
        }
    }
    public Game getPresentGame() {
        if (!presentGames.isEmpty()) {
            Game presentGame = presentGames.remove(0);
            presentGame.setQuantity(presentGame.getQuantity() - 1);

            try {
                FileWriter writer = new FileWriter(presentFilePath, true);
                writer.write(presentGame.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }

            return presentGame;
        } else {
            System.out.println("Все игрушки кончились");
            return null;
        }
    }
}


  

