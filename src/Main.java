public class Main {
    public  static void main(String[] args) {
       // Student student = new Student("1", "666-777-888", "");
       // System.out.println(student.getOplata());

        Telegram start = new Telegram();
        Viber startV = new Viber();
        WhatApp startW = new WhatApp();

        start.getMessenger();
        startW.getMessenger();
        startV.getMessenger();

        /*System.out.println(start.getMessenger());
        System.out.println(startV);
        System.out.println(startW);
        
         */


    }
}
