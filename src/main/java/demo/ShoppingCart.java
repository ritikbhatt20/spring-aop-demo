package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
//        Logging
//        Authentication and Authorization  ..these are the cross cutting concerns(Aspect)
//        Sanitize the data
        System.out.println("Checkout Method from ShoppingCart called");
    }

    public int quantity(){
        return 2;
    }
}
