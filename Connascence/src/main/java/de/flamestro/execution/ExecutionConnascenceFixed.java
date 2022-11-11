package de.flamestro.execution;


public class ExecutionConnascenceFixed {
    record Order(String orderReference){}

    private String generateOrderReference(){
        return "This is a random String";
    }

    private Order createOrder(String orderReference){
        return new Order(orderReference);
    }

    private void placeOrder(){
        var orderReference = generateOrderReference();
        createOrder(orderReference);
    }
}



