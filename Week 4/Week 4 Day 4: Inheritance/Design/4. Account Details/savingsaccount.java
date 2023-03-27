class SavingAccount extends Account {
    protected Double minimumBalance;
    
    public SavingAccount(String accountNumber, Double balance, String accountHolderName, Double minimumBalance) {
        super(accountNumber, balance, accountHolderName);
        this.minimumBalance = minimumBalance;
    }
}
