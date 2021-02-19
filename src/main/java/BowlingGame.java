public class BowlingGame {
    // TODO: Why must this array have a size of 21? - 21 rolls total, 0 counts as first roll, not 1, and it needs to allow for an extra roll at end if strike or spare.
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here - Increases the rolls by one each time around
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero? - In Java arrays start with zero, not 1
        int startOfNextFrameIndex = 0;
        for(int frame = 1; frame < 11 ; frame++) {
            //for strike
            if(rolls[startOfNextFrameIndex] == 10) {
                score += 10 + rolls[startOfNextFrameIndex + 1] + rolls[startOfNextFrameIndex + 2];
                startOfNextFrameIndex += 1;
            }
            //for spare
            else if(rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1] == 10){
                score += 10 + rolls[startOfNextFrameIndex + 2];
                startOfNextFrameIndex += 2;
            }
            //for all others
            else{
                score += rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1];
                startOfNextFrameIndex += 2;
            }
        }
        return score;

    }
    }
