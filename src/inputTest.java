public class inputTest {
        public static void main(String[] args) {
            //顯示訊息
            java.util.Scanner sc =new java.util.Scanner(System.in);


            String Name = sc.nextLine();  System.out.println("What`s your name?");

            System.out.println("How old are you?");
            Double Age = sc.nextDouble();

            System.out.println(Name +" ,You`re " + Age +" years old.");

        }
    }
