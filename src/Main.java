public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massBody = service.calculate(  55, 150);

        System.out.println("Индекс массы тела:" + massBody);
    }
}