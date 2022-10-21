public class Main {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();

        facade.login();
        facade.createProductList();
        facade.createUser(facade.getUserInfoItem());
        facade.AttachProductToUser();
    }
}