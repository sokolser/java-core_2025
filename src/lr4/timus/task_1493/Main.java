package lr4.timus.task_1493;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.next();
        scanner.close();

        System.out.println(isOneStepFromHappy(ticket) ? "Yes" : "No");
    }

    public static boolean isOneStepFromHappy(String ticket) {

        String prevTicket = decrementTicket(ticket);
        if (isHappyTicket(prevTicket)) {
            return true;
        }


        String nextTicket = incrementTicket(ticket);
        return isHappyTicket(nextTicket);
    }

    public static boolean isHappyTicket(String ticket) {
        int sumFirst = Character.getNumericValue(ticket.charAt(0)) +
                Character.getNumericValue(ticket.charAt(1)) +
                Character.getNumericValue(ticket.charAt(2));
        int sumLast = Character.getNumericValue(ticket.charAt(3)) +
                Character.getNumericValue(ticket.charAt(4)) +
                Character.getNumericValue(ticket.charAt(5));
        return sumFirst == sumLast;
    }

    public static String decrementTicket(String ticket) {
        int num = Integer.parseInt(ticket);
        num--;
        return String.format("%06d", num);
    }

    public static String incrementTicket(String ticket) {
        int num = Integer.parseInt(ticket);
        num++;
        return String.format("%06d", num);
    }
}