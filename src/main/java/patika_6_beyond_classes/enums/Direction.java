package patika_6_beyond_classes.enums;

public enum Direction {

    NORTH(0, "Kuzey"), EAST(90, "Doğu"), SOUTH(180, "Güney"), WEST(270, "Batı");


    private final int angle;

    private final String direction;

    Direction(int angle, String direction) {
        this.angle = angle;
        this.direction = direction;
    }

    public int getAngle() {
        return angle;
    }

    public String getDirection() {
        return direction;
    }
}
