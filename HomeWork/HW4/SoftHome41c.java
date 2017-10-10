import java.util.Scanner;
public class SoftHome41c {
   public enum HTTPError{BadRequest,Unauthorized,PaymentRequired,Forbidden}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть номер помилки");
        int er = sc.nextInt();

        HTTPError error;
        switch (er) {
            case 400:
                error = HTTPError.BadRequest;
                System.out.println(error);
                break;
            case 401:
                error = HTTPError.Unauthorized;
                System.out.println(error);
                break;
            case 402:
                error = HTTPError.PaymentRequired;
                System.out.println(error);
                break;
            case 403:
                error = HTTPError.Forbidden;
                System.out.println(error);
                break;
            default:
                System.out.println("Не існує такої помилки");
                System.exit(0);
        }
    }
}
