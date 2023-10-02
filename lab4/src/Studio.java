enum ClothingSize {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private int euroSize;
    private String description;

    ClothingSize(int euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return description;
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    private ClothingSize size;
    private double cost;
    private String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: размер " + getSize().name() + ", цвет " + getColor() + ", стоимость " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: размер " + getSize().name() + ", цвет " + getColor() + ", стоимость " + getCost());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны - размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getCost() );

    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны - размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getCost() );
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужской галстук - размер: " + getSize() + ", цвет: " + getColor() + ", цена: " + getCost() );
    }
}

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда в ателье:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof WomenClothing) {
                ((WomenClothing) clothing).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда в ателье:");
        for (Clothes clothing : clothes) {
            if (clothing instanceof MenClothing) {
                ((MenClothing) clothing).dressMan();
            }
        }
    }
}

public class Studio {
    public static void main(String[] args) {
        Clothes[] allClothes = {
                new TShirt(ClothingSize.L, 20.0, "Красный"),
                new Tie(ClothingSize.S, 174.0, "Черный"),
                new Pants(ClothingSize.L, 350.0, "Красный"),
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(allClothes);
        atelier.dressMan(allClothes);
    }
}