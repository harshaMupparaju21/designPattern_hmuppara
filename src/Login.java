import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Login {

    private UserInfoItem userInfoItem;

    public int login() throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your Username:  ");
        String input_userName = userInput.nextLine();

        System.out.println("Please enter your Password:  ");
        String input_password = userInput.nextLine();

        int user = validateUser(input_userName, input_password);
        return user;
    }

    public int validateUser(String input_userName, String input_password) throws Exception{

            String current_dir = System.getProperty("user.dir");

            File buyersList = new File(current_dir+"/src/BuyerInfo.txt");
            BufferedReader buyer_br = new BufferedReader(new FileReader(buyersList));

            String buyerInfo;
            while ((buyerInfo = buyer_br.readLine()) != null) {

                String[] userDetails = buyerInfo.split(":");
                String username = userDetails[0];
                String password = userDetails[1];
                if (input_userName.equals(username) && input_password.equals(password)) {
                    userInfoItem = new UserInfoItem(username, 0);
                    return 0;
                }
            }

            File sellersList = new File(current_dir+"/src/SellerInfo.txt");
            BufferedReader seller_br = new BufferedReader(new FileReader(sellersList));

            String sellerInfo;
            while ((sellerInfo = seller_br.readLine()) != null) {

                String[] userDetails = sellerInfo.split(":");
                String username = userDetails[0];
                String password = userDetails[1];
                if (input_userName.equals(username) && input_password.equals(password)) {
                    userInfoItem = new UserInfoItem(username, 1);
                    return 1;
                }
            }
            return -1;
        }

    public UserInfoItem getUserInfoItem() {
        return userInfoItem;
    }
}
