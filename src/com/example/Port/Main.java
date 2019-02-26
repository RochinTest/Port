//2)Написать клиент для работы порта. Корабли могут заходить
// в порт для разгрузки / загрузки контейнеров. Количество контейнеров,
// находятся в текущий момент в порту и на корабле, должно быть
// неотъемлемой и не превышать заданную грузоподъемность судна и
// емкость порта. В порту работает несколько причалов. В одном причале
// может стоять только один корабль. Корабль может загружаться у причала,
// разгружаться или выполнять оба действия.
package com.example.Port;



public class Main extends Thread {
    Port arrival = new Port(100, 45);
    Ship ship1 = new Ship(20);

    public static void main(String[] args) {
        Ship containerShip = new Ship(15);
        Ship1 containerShip2 = new Ship1();
        Main containerShip1 = new Main();

        new Thread(containerShip1).start();
        new Thread(containerShip2).start();
        new Thread(containerShip).start();

    }

    public void loading() {

        if (arrival.getPortContainercount() < arrival.getMaxPortContainer()) {
            System.out.println("Пришёл " + Thread.currentThread().getName() + " под погрузку");
            System.out.println("Загружаем " + ship1.getShipContainerCount() + " контейнеров");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            int n = 0;
            n = arrival.getPortContainercount() + ship1.getShipContainerCount();
            arrival.setPortContainercount(n);
            System.out.println("Осталось " + arrival.getPortContainercount() + " контенеров");
        }

    }


    public void run() {

        for (int i = 1; i < 10; i++) {
            Thread.currentThread().setName(" контейнеровоз № " + i);
            int n = (int) (Math.random() * 20 + 10);
            ship1.setShipContainerCount(n);
            loading();
        }
    }

    static class Ship1 extends Thread {
        Port arrival = new Port(200, 20);
        Ship ship2 = new Ship(20);

        public void run() {
            for (int i = 1; i < 10; i++) {
                Thread.currentThread().setName(" контейнеровоз № " + i);
                int n = (int) (Math.random() * 20 + 10);
                ship2.setShipContainerCount(n);
                unloading();
            }
        }

       private void unloading() {

            if (arrival.getPortContainercount() > ship2.getShipContainerCount()) {
                System.out.println("Пришёл " + Thread.currentThread().getName() + " под выгрузку");
                System.out.println("Выгружаем " + ship2.getShipContainerCount() + " контейнеров");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }
                int n ;
                n = arrival.getPortContainercount() - ship2.getShipContainerCount();
                arrival.setPortContainercount(n);
                System.out.println("Осталось " + arrival.getPortContainercount() + " контейнеров");
            }

        }
    }
}