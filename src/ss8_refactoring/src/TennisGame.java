public class TennisGame {
    /**
     * QUAN CLEAN CODE
     * bỏ các biến thừa
     * tách phương thức
     * refactoring lại các biến và phương thức
     * @param point
     * @return
     */
    public static String readPoint(int point) {
        String score = " ";
        switch (point) {
            case 0 -> score += "Love";
            case 1 -> score += "Fifteen";
            case 2 -> score += "Thirty";
            case 3 -> score += "Forty";
        }
        return score;
    }

    public static String getScore(int mScore1, int mScore2) {
        StringBuilder score = new StringBuilder(readPoint(mScore1));
        int tempScore;
        if (mScore1 == mScore2) {
            score.append("All");
        } else if (mScore1 >= 4 || mScore2 >= 4) {
            int minusResult = mScore1 - mScore2;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage player1");
            } else if (minusResult == -1) {
                score = new StringBuilder("Advantage player2");
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for player1");
            } else {
                score = new StringBuilder("Win for player2");
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = mScore1;
                } else {
                    score.append("-");
                    tempScore = mScore2;
                }
                switch (tempScore) {
                    case 0 -> score.append("Love");
                    case 1 -> score.append("Fifteen");
                    case 2 -> score.append("Thirty");
                    case 3 -> score.append("Forty");
                }
            }
        }
        return score.toString();
    }
}
