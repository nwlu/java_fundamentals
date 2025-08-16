package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class ExceedNumOrderException extends Exception{
    @Override
    public String toString(){
        return "TooManyOrdersException {You have exceeded the number of allowable orders}";
    }

    public static void main(String[] args) {
        try{
            DishOrder someDish = new DishOrder();
            Order order = new Order();

            for (int i = 0; i < 5; i++) {
                order.addSomeDish(someDish);
            }

        }catch(ExceedNumOrderException e){
            System.out.println("You have already ordered the allowable amount of this dish.");
            System.out.println(e.toString());
        }
    }
    static class DishOrder{

    }
    static class Order{
        int max = 4;
        int numOfOrder = 0;

        public void addSomeDish(DishOrder someDish) throws ExceedNumOrderException{
            if (numOfOrder >= max){
                throw new ExceedNumOrderException();
            }
            numOfOrder++;
            System.out.println("Added dish to order. " + numOfOrder + " added to order");
        }
    }

}