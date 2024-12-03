public class Main {
    public static void main(String[] args) {
        // Crear una tienda
        Store store = new Store();

        // Agregar productos electrónicos
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));

        // Agregar accesorios
        store.addProduct(new Accessory("Mouse", 25.0));
        store.addProduct(new Accessory("Keyboard", 45.0));
        store.addProduct(new Accessory("Headphones", 60.0));

        // Aplicar un descuento del 10%
        System.out.println("Aplicando descuento del 10%:");
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);

        // Aplicar un descuento fijo de $50
        System.out.println("\nAplicando descuento fijo de $50:");
        Discountable fiftyDollarsDiscount = product -> {
            double discountedPrice = product.getPrice() - 50.0;
            return discountedPrice > 0 ? discountedPrice : 0.0; // Prevenir precios negativos
        };
        store.applyDiscount(fiftyDollarsDiscount);

        // Aplicar un descuento combinado (15% + $20)
        System.out.println("\nAplicando descuento combinado (15% + $20):");
        Discountable combinedDiscount = product -> {
            double percentageDiscount = product.getPrice() * 0.85; // 15% descuento
            return percentageDiscount - 20.0 > 0 ? percentageDiscount - 20.0 : 0.0; // $20 adicional
        };
        store.applyDiscount(combinedDiscount);

        // Aplicar un descuento variable según el precio
        System.out.println("\nAplicando descuento variable según el precio:");
        Discountable variableDiscount = product -> {
            if (product.getPrice() > 500.0) {
                return product.getPrice() * 0.8; // 20% descuento para productos caros
            } else if (product.getPrice() > 100.0) {
                return product.getPrice() * 0.9; // 10% descuento para productos medianos
            } else {
                return product.getPrice(); // Sin descuento para productos baratos
            }
        };
        store.applyDiscount(variableDiscount);
    }
}
