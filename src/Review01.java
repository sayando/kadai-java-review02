public class Review01 {
    public static void main(String [] args) {
        int price = 1500;
        int taxPrice;
        taxPrice = tax(price);
        int totalPrice = price + taxPrice;
System.out.println(price+"円の商品の税込価格は"+totalPrice+"円（消費税は"+taxPrice+"円）です。");
}
    public static int tax(int price) {
        int taxRate = 10;
        int taxPrice = price/(100/taxRate);
        return taxPrice;
}
}