public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = 0;
        if (height != 0)
            bmi = weight * 10000/ (height * height);
        return bmi;
    }
}
