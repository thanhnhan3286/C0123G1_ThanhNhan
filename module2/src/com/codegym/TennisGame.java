package com.codegym;


public class TennisGame {
    public static String getScore(String player1, String player2, int score1, int score2) {
        String score = "";
        int tempScore = 0;
        if (score1 == score2) {
            switch (score1) {
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
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = checkAdvantageAndWinner(score1, score2);
            switch (minusResult) {
                case 1:
                    score = "Advantage player1";
                    break;
                case -1:
                    score = "Advantage player2";
                    break;
                case 2:
                case 3:
                case 4:
                    score = "Win for player1";
                    break;
                default:
                    score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = score1;
                else {
                    score += "-";
                    tempScore = score2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static int checkAdvantageAndWinner(int score1, int score2) {
        return score1 - score2;
    }
}