package patika_6_beyond_classes.enums;

public class EnumExample {

    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day);
        }
        System.out.println("============   =========");

        System.out.println("Direction");

        System.out.println(Direction.NORTH.name() + " - " + Direction.NORTH.ordinal() + " - " + Direction.NORTH.getAngle() + " = " + Direction.NORTH.getDirection());
        System.out.println(Direction.EAST.name() + " - " + Direction.EAST.ordinal() + " - " + Direction.EAST.getAngle() + " = " + Direction.EAST.getDirection());
        System.out.println(Direction.SOUTH.name() + " - " + Direction.SOUTH.ordinal() + " - " + Direction.SOUTH.getAngle() + " = " + Direction.SOUTH.getDirection());
        System.out.println(Direction.WEST.name() + " - " + Direction.WEST.ordinal() + " - " + Direction.WEST.getAngle() + " = " + Direction.WEST.getDirection());

        System.out.println("============   =========");

        System.out.println("Operation");

        System.out.println(Operation.ADD.apply(5, 7));

        System.out.println(Operation.SUBTRACT.apply(8, 2));

        System.out.println(Operation.MUL.apply(10, 2));

        System.out.println(Operation.DIV.apply(100, 2));


    }
}
