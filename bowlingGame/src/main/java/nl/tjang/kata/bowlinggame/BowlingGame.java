package nl.tjang.kata.bowlinggame;

import java.util.LinkedList;
import java.util.List;

public class BowlingGame {
    List<Integer> rolls = new LinkedList<>();
    int rollCount = 0;
    int frameCount = 0;


    public BowlingGame() {
        for (int i = 0; i < 21; i++) {
            rolls.add(0);
        }
    }

    public int score() {
        int score = 0;

        for (int rollCount = 0; rollCount < rolls.size(); rollCount++) {
            int frameScore = rolls.get(rollCount) + rolls.get(rollCount+1);

            int nextRoll;
            if(rollCount < 9) {
                nextRoll = rolls.get(rollCount + 1);
            }else{
                nextRoll = 0;
            }
            if(rolls.get(rollCount) == 10) {
                final int strikeBonus = 2 * nextRoll;
                score += 10 + strikeBonus;
            }else if(frameScore == 10){
                score += frameScore + nextRoll;
            }else{
                score += frameScore;
            }
        }
        return score;
    }

    public void roll(int roll){
        if(rollCount % 2 == 0){
            rolls.set(rollCount/2, roll);

            if(roll == 10){
                if(rollCount <= 18) {
                    int currentFrame = rolls.get(rollCount / 2);
                    currentFrame.setSecond(0);
                }else if(rollCount == 19){
                    TenthFrame currentFrame = (TenthFrame) rolls.get(rollCount / 2);
                    currentFrame.second = roll;
                }else if(rollCount == 20){
                    TenthFrame currentFrame = (TenthFrame) rolls.get(rollCount / 2);
                    currentFrame.third = roll;
                }
                rollCount++;
            }
        }else{
            BowlingFrame currentFrame = rolls.get(rollCount/2);
            currentFrame.setSecond(roll);
        }
        rollCount++;
    }
}
