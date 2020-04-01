public class Main {
    public static void main(String[] args) {
        //test1
        BmiService service = new BmiService();
        double weight = 86.5;
        double height = 185;

        double bmi = service.calculate(weight, height);
        System.out.println("BMI in test1 is :" + bmi);


        weight = 50;
        height = 160;

        bmi = service.calculate(weight, height);
        System.out.println("BMI in test2 is :"+bmi);

        //test3
        weight = 50;
        height = 0;

        bmi = service.calculate(weight, height);
        System.out.println("BMI in test3 is :"+bmi);


    }
}
