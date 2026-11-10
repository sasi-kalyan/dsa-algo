package problemset01;


import java.util.*;
import java.util.stream.Collectors;

record Product(String name, String category, double price, int quantity) {}

record Employee(String name, List<String> skills) {}

public class ProblemSet02 {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 75000, 5),
                new Product("Mouse", "Electronics", 500, 50),
                new Product("Desk", "Furniture", 12000, 10),
                new Product("Chair", "Furniture", 4500, 20),
                new Product("Monitor", "Electronics", 15000, 8),
                new Product("Bookshelf", "Furniture", 7000, 0)
        );

        //12. Get names of all products priced above 10,000.

        List<String> productsGt10000 = products.
                stream()
                .filter(p -> p.price() > 10000)
                .map(Product::name)
                .collect(Collectors.toList());

        System.out.println(productsGt10000);

        //13. Get a list of product names in UPPERCASE whose quantity is 0 (out of stock).
        List<String> productUpperQty0 =
                products.stream()
                        .filter(p -> p.quantity() == 0)
                        .map(p -> p.name().toUpperCase())
                        .collect(Collectors.toList());

        System.out.println(productUpperQty0);

        //14. Calculate total inventory value (price * quantity summed across all products).
        double totalInventoryValue =
                products.stream()
                        .map(
                                p -> p.price() * p.quantity()
                        ).mapToDouble(
                                Double::doubleValue
                        ).sum();
        System.out.println(totalInventoryValue);

        // 15. Find the product with the highest price (max with Comparator).

        Optional<Product> highPriceProduct =
                products.stream()
                        .max(Comparator.comparingDouble(Product::price));
        System.out.println(highPriceProduct.get());

        //16. Create a List<String> of "name - category" formatted strings for all Electronics products.

        List<String> nameCategory =
                products.stream()
                        .map(p -> p.name()+" - "+p.category())
                        .collect(Collectors.toList());
        System.out.println(nameCategory);

        //17. Apply a 10% discount to all Furniture product prices and collect into a Map<String, Double> of name → discounted price.

        Map<String, Double> discount10Map
                = products
                .stream()
                .collect(
                        Collectors.toMap(
                                Product::name,
                                product -> (product.price() - (product.price() * 10)/100)
                        )
                );

        System.out.println(discount10Map);

        //19. Unique words from sentences

        List<String> sentences = List.of(
                "the quick brown fox",
                "the lazy dog sleeps",
                "quick fox jumps high"
        );

        List<String> uniqueWords = sentences
                .stream()
                .flatMap(w -> Arrays.stream(w.split("\\s")))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(uniqueWords);


        //20. Flatten an array of arrays

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> flatList1 = Arrays.stream(matrix)
                .flatMap(arr -> Arrays.stream(arr).boxed())
                .collect(Collectors.toList());

        System.out.println(flatList1);

        //21. Flatten employee-skills mapping
        List<Employee> employees = List.of(
                new Employee("Alice", List.of("Java", "SQL")),
                new Employee("Bob", List.of("Python", "Java", "AWS")),
                new Employee("Carol", List.of("SQL", "AWS"))
        );

        List<String> skills =
                employees.stream()
                        .map(e -> e.skills())
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(skills);

        //22. Count total characters across all words
        List<String> words = List.of("stream", "lambda", "collector");

        long countOfChars = words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .count();
        System.out.println(countOfChars);
    }
}
