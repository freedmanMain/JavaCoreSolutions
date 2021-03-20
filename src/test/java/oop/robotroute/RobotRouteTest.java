package oop.robotroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotRouteTest {
    int coordinate_x = 12;
    int coordinate_y= 5;

    Direction direction = Direction.DOWN;

    Robot robot = new Robot(direction, coordinate_x, coordinate_y);
    RobotRoute robotRoute = new RobotRoute();

    @Test
    public void robot_route_test() {
        robotRoute.moveRobot(robot, -3, 5);
        assertArrayEquals(new int[]{-3, 5}, new int[]{robot.getX(), robot.getY()});
    }
}