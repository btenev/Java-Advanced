package P3_Bank_Account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_Bank_Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, Bank_Account> bankAccounts = new HashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String output = null;

            switch (command) {
                case "Create":
                    Bank_Account bank_account = new Bank_Account();
                    bankAccounts.put(bank_account.getId(), bank_account);
                    output = "Account ID" + bank_account.getId() + " created";
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (!bankAccounts.containsKey(id)) {
                        output = "Account does not exist";
                    } else {
                        bankAccounts.get(id).deposit(amount);
                        output = "Deposited " + amount + " to " + "ID" + id;
                    }
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[1]);
                    Bank_Account.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    int ids = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (!bankAccounts.containsKey(ids)) {
                        output = "Account does not exist";
                    } else {
                        double interest = bankAccounts.get(ids).getInterest(years);
                        output = String.format("%.2f", interest);
                    }
                    break;
            }
            if (output != null) {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }

    }
}
