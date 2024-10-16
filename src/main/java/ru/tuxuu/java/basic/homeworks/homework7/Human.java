package ru.tuxuu.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private String currentTransport;
    private Transport transport;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
    }

    public void sitDown(Transport transport) {
        currentTransport = transport.getName();
        System.out.println(name + " сел за " + currentTransport);
    }

    public void standUp() {
        if (currentTransport != null) {
            System.out.println(name + " вышел из " + currentTransport);
            currentTransport = null;
        } else {
            System.out.println(name + " стоит на ногах");
        }
    }

    public void walk(Area area, int distance) {
        System.out.println(name + " прошёл пешком расстояние " + distance + " по местности " + area);
    }

    public boolean driveLocation(Transport transport, Area area, int distance) {
        if (transport.choosingLocation(area)) {
            sitDown(transport);
            if (transport.driveDistance(distance)) {
                return true;
            } else {
                standUp();
                return false;
            }
        }
        walk(area, distance);
        return false;
    }

    public void info() {
        if (currentTransport != null) {
            System.out.println(name + " вышел из " + currentTransport);
        } else {
            System.out.println(name + " стоит на ногах");
        }
    }
}
