class Bank {
    // Static method in parent class
    static void showInterestRate() {
        System.out.println("Bank: General interest rate is 5%");
    }
}

class SavingsAccount extends Bank {
    // Static method hiding (not overriding)
    static void showInterestRate() {
        System.out.println("Savings Account: Interest rate is 6%");
    }
}

class CurrentAccount extends Bank {
    // Static method hiding (not overriding)
    static void showInterestRate() {
        System.out.println("Current Account: No interest on current accounts.");
    }
}



