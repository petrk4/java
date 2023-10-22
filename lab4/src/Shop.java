import java.util.*;

enum ProductCategory {
    ELECTRONICS,
    CLOTHING
}

class Product {
    private String name;
    private double price;
    private ProductCategory category;

    public Product(String name, double price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : items) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void clearCart() {
        items.clear();
    }
}

class OnlineStore {
    private User currentUser;
    private List<Product> productList;
    private ShoppingCart cart;

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public List<Product> getProductList() {
        return productList;
    }


    public OnlineStore() {
        productList = new ArrayList<>();
        cart = new ShoppingCart();
        initializeProducts();
    }

    private void initializeProducts() {
        productList.add(new Product("Ноутбук", 800.0, ProductCategory.ELECTRONICS));
        productList.add(new Product("Футболка", 20.0, ProductCategory.CLOTHING));
        productList.add(new Product("Штаны", 100.0, ProductCategory.CLOTHING));
        productList.add(new Product("Телефон", 500.0, ProductCategory.ELECTRONICS));
    }

    public void login(String username, String password) {
        if ("petrk".equals(username) && "123".equals(password)) {
            currentUser = new User(username, password);
            System.out.println("Вы успешно вошли как " + username);
        } else {
            System.out.println("Неправильный логин или пароль");
        }
    }

    public void viewCatalog() {
        System.out.println("Список каталогов товаров:");
        for (ProductCategory category : ProductCategory.values()) {
            System.out.println(category.name());
        }
    }

    public void viewCategory(ProductCategory category) {
        System.out.println("Товары в категории " + category.name() + ":");
        for (Product product : productList) {
            if (product.getCategory() == category) {
                System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
            }
        }
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
        System.out.println(product.getName() + " добавлен в корзину");
    }

    public void checkout() {
        List<Product> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Корзина пуста. Добавьте товары в корзину.");
            return;
        }

        double total = cart.calculateTotalPrice();
        System.out.println("Товары в корзине:");
        for (Product item : items) {
            System.out.println(item.getName() + " - " + item.getPrice() + " руб.");
        }
        System.out.println("Общая стоимость: " + total + " руб.");
        System.out.println("Покупка успешно завершена.");
        cart.clearCart();
    }
}

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnlineStore store = new OnlineStore();

        System.out.print("Введите логин: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        store.login(username, password);

        while (store.getCurrentUser() != null) {
            System.out.println("Выберите действие:");
            System.out.println("1. Просмотреть каталог");
            System.out.println("2. Просмотреть товары категории");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Покупка товаров в корзине");
            System.out.println("0. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    store.viewCatalog();
                    break;
                case 2:
                    System.out.println("Выберите категорию:");
                    for (ProductCategory category : ProductCategory.values()) {
                        System.out.println(category.ordinal() + 1 + ". " + category.name());
                    }
                    int categoryChoice = scanner.nextInt();
                    if (categoryChoice >= 1 && categoryChoice <= ProductCategory.values().length) {
                        ProductCategory selectedCategory = ProductCategory.values()[categoryChoice - 1];
                        store.viewCategory(selectedCategory);
                    } else {
                        System.out.println("Некорректный выбор.");
                    }
                    break;
                case 3:
                    System.out.println("Выберите товар для добавления в корзину:");
                    for (int i = 0; i < store.getProductList().size(); i++) {
                        Product product = store.getProductList().get(i);
                        System.out.println((i + 1) + ". " + product.getName() + " - " + product.getPrice() + " руб.");
                    }
                    int productChoice = scanner.nextInt();
                    if (productChoice >= 1 && productChoice <= store.getProductList().size()) {
                        Product selectedProduct = store.getProductList().get(productChoice - 1);
                        store.addToCart(selectedProduct);
                    } else {
                        System.out.println("Некорректный выбор.");
                    }
                    break;
                case 4:
                    store.checkout();
                    break;
                case 0:
                    store.setCurrentUser(null);
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        }
        System.out.println("Выход из приложения.");
    }
}