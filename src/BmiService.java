public class BmiService {
    public double calculate(int weight, double height) {


        double massBody = weight / (height * height);
        return massBody;
    }
}

