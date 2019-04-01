package lesson17generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ProductApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV",2000));
        products.add(new Product("laptop",4000));
        products.add(new Product("car",50_000));

        System.out.println(products);


        Consumer<Product> processor = new Increase10PercentProcessor();


        processElement(products,processor);

        System.out.println(products);

        processElement(products, new DecreaseBy100Processor());

        System.out.println(products);

//        List<Service> services = new ArrayList<>();
//        services.add(new Service("repair PC", 100));
//        services.add(new Service("build software", 1000));



//        processElement(services, new DecreaseBy100Processor());

//        System.out.println(services);

    }
    private static void processElement(List<Product> list, Consumer<Product> processor){

//        for (int i = 0; i < list.size(); i++){
//            processor.accept(list.get(0));
//        }
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            processor.accept(product);

            if (product.getPrice() > 4000){
                iterator.remove();
        }

        iterator.next();

        iterator.remove();

//        for (Product product: list){
//            processor.accept(product);
//            }
        }

    }

}
