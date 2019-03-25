package DataType;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition ='A';
    String nameOfCar = "Toyota";



    public void printVariable(){
        System.out.println("This is the MaxSpeed " +maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }

//    public void wreckCar(){
//        condition = 'C';
//    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed+1;
    }



    public static void main(String[] args){

        Car familyCar = new Car();
        System.out.println("Family's Car");
        familyCar.printVariable();
        familyCar.upgradeMinSpeed();
        familyCar.printVariable();


    }
}
