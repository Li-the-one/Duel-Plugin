package DuelPlugin;

public class PlayerElo {
    private int elo; // Le classement ELO du joueur

    public PlayerElo(int elo) {
        this.elo = elo;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    // Méthode pour mettre à jour le classement ELO après un duel
    public void updateElo(boolean win, int opponentElo) {
        double expectedScore = 1 / (1 + Math.pow(10, (opponentElo - elo) / 400.0));
        int actualScore = win ? 1 : 0;
        int k = 32; // Facteur de pondération (peut être ajusté)
        int delta = (int) Math.round(k * (actualScore - expectedScore));
        elo += delta;
    }
}
