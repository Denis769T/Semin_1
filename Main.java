public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Масло", 100, 28);
        Product product2 = new Product("Чипсы", 120, 24);
        Product product3 = new Product("Конфеты", 300, 18);
        Product product4 = new Product("Сок", 231, 45);
        Product product5 = new Product("Хлеб", 36, 76);
        Product product6 = new Product("Вода", 11, 30);
        Product product7 = new Product("Дыня", 146, 55);

        System.out.println("Список товаров.");
        System.out.println("product1 =" + product1.name +", "+
                "price1=" + product1.price +", "+
                "rating1=" + product1.rating+" ");
        System.out.println("product2 =" + product2.name +", "+
                "price2=" + product2.price +", "+
                "rating2=" + product2.rating+" ");
        System.out.println("product3 =" + product3.name +", "+
                "price3=" + product3.price +", "+
                "rating3=" + product3.rating+" ");
        System.out.println("product4 =" + product4.name +", "+
                "price4=" + product4.price +", "+
                "rating4=" + product4.rating+" ");
        System.out.println("product5 =" + product5.name +", "+
                "price5=" + product5.price +", "+
                "rating5=" + product5.rating+" ");
        System.out.println("product1 =" + product6.name +", "+
                "price6=" + product6.price +", "+
                "rating6=" + product6.rating+" ");
        System.out.println("product1 =" + product7.name +", "+
                "price7=" + product7.price +", "+
                "rating7=" + product7.rating+" ");
        System.out.println("---------------------------------");


        System.out.println("Корзина покупателя");
        Basket basket1 = new Basket("Конфеты", 300, 18);
        Basket basket2 = new Basket("Вода", 11, 30);

        System.out.println("basket1 =" + basket1.name +", "+
                "price1=" + basket1.price +", "+
                "rating1=" + basket1.rating+" ");
        System.out.println("basket2 =" + basket2.name +", "+
                "price2=" + basket2.price +", "+
                "rating2=" + basket2.rating+" ");








    }
}
