public class PriceableService implements Priceable {
    private String serviceName;
    private double hourlyRate;
    private int hoursWorked;

    public PriceableService(String serviceName, double hourlyRate, int hoursWorked) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hoursWorked;
    }

}
