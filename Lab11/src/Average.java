import java.text.DecimalFormat;

public class Average {

    public static void main(String[] args) {

        DecimalFormat fmt = new DecimalFormat("00.00");
        int sum = 0;

        if (args.length == 0) {

            System.out.println("No arguments");

        } else {

            int parse = 0;            
            System.out.println("\nNumbers You Entered:");
            for (int i = 0; i < args.length; i++) {

                System.out.println(args[i]);
                
                parse = Integer.parseInt(args[i]);
                sum += parse;
            }

        }

        double average = (double) sum / args.length;
        System.out.println("\nAverage: " + fmt.format(average));
    }

}
