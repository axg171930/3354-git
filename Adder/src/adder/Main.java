package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
	for(int i = 2; i < args.length; i++)
		sum+=Integer.parseInt(args[i]);
return sum;
    }
}
