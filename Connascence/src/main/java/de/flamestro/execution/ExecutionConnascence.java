package de.flamestro.execution;


public class ExecutionConnascence {
    record Order(String orderReference){}

    private String orderReference = null;

    private void generateOrderReference(){
        orderReference = "This is a random String";
    }

    private Order createOrder(){
        return new Order(orderReference);
    }

    private void placeOrder(){
        generateOrderReference();
        createOrder();
    }
}



