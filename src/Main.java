public class Main {
    public static void main(String[] args) throws Exception {
        Facade facade = new Facade();

        boolean validateLogin = facade.login();
        if (validateLogin == true) {
            System.out.println("Login is Successful");
        } else {
            System.out.println("Username/Password is incorrect");
            facade.login();
        }

        facade.createProductList();
        facade.chooseProductType();

    }
}