import java.util.ArrayList;
import java.util.List;
public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputerByBrand(Brand brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        return null;
    }
}
