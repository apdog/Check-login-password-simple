import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputLoginPassword ();
    }


    private static void inputLoginPassword () {
        Scanner in = new Scanner(System.in);
        String userLogin = "admin";
        String userPassword = "12345678";
        System.out.println("Введите логин для входа: ");
        String login = in.nextLine();
        if (!login.equals(userLogin)) {
            do {
                System.out.println("Пользователя с таким логином не существует. Введите другой логин: ");
                login = in.nextLine();
            }
            while (!login.equals(userLogin));
        }
        System.out.println("Введите пароль: ");
        String password = in.nextLine();
        if (password.length() < 8 || password.length() > 15) {
            do {
                if (password.length() < 8 || password.length() > 15){
                    System.out.println("Пароль должен состоять от 8 до 15 символов. Введите другой пароль: ");
                }
                else {
                    System.out.println("Пароль не верен! Введите другой пароль: ");
                }
                password = in.nextLine();
            }
            while (!userPassword.equals(password));
            System.out.println("Добро пожаловать, " + userLogin + "!");
        }
    }
}
