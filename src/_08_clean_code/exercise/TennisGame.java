package _08_clean_code.exercise;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int temporaryScore=0;
        boolean isByPoint = player1Score == player2Score;
        boolean isMoreThan4 = player1Score >= 4 || player2Score >= 4;
        if (isByPoint) {
            score = getScoreWhenIsByPoint(player1Score);
        } else {
            if (isMoreThan4) {
                score = getScoreWhenMoreThan4(player1Score, player2Score);
            } else {
                score = isLessThan4(player1Score, player2Score, score);
            }
        }
        return score;
    }

    public static String isLessThan4(int player1Score, int player2Score, String score) {
        int temporaryScore;
        for (int i = 1; i<3; i++) {
            if (i==1) {
                temporaryScore = player1Score;
            }
            else {
                score+="-"; temporaryScore = player2Score;
            }
            switch(temporaryScore) {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    public static String getScoreWhenMoreThan4(int player1Score, int player2Score) {
        String score;
        int minusResult = getMinusResult(player1Score, player2Score);
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    public static String getScoreWhenIsByPoint(int player1Score) {
        String score;
        switch (player1Score)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static int getMinusResult(int player1Score, int player2Score) {
        return player1Score -player2Score;
    }
}