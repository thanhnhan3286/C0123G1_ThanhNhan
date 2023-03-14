package ss7_abstract_inface;

public class Seller extends Employee implements IGame{
    @Override
    public void doTask() {
        System.out.println(" đi kiếm đối tác, khách hàng cho công ty");
    }

    @Override
    public void organizeGame() {
        System.out.println("Seller có thể tổ chức trò chơi");
    }
}
