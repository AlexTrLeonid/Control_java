public class PlayOut {
    public static void main(String[] args) {
        ChildsWord word = new ChildsWord();

        Game game1 = new Game(1, "Конструктор Lego", 10, 20);
        Game game2 = new Game(2, "Трансфомер", 200, 40);
        Game game3 = new Game(3, "Мяч", 200, 90);
        Game game4 = new Game(3, "Кукла Barbie", 50, 30);
        Game game5 = new Game(3, "Пазл", 200, 90);
        Game game6 = new Game(3, "PlayStation 5", 10, 10);

        word.addGame(game1);
        word.addGame(game2);
        word.addGame(game3);
        word.addGame(game4);
        word.addGame(game5);
        word.addGame(game6);


        word.changeGameFrequency(1, 30);

        word.organizeOut();

        Game presentGame = word.getPresentGame();
        if (presentGame != null) {
            System.out.println("Выигрышная игрушка: " + presentGame.getName());
        }
    }
}
