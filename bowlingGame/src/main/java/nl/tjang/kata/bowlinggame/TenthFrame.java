package nl.tjang.kata.bowlinggame;

public class TenthFrame extends BowlingFrame {
    int third;

    public TenthFrame() {
    }

    public TenthFrame(int first) {
        super(first);
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }
}
