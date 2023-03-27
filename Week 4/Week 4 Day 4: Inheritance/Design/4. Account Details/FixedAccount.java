class FixedAccount extends SavingAccount {
    private Integer lockingPeriod;
    
    public FixedAccount(String accountNumber, Double balance, String accountHolderName, Double minimumBalance, Integer lockingPeriod) {
        super(accountNumber, balance, accountHolderName, minimumBalance);
        this.lockingPeriod = lockingPeriod;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public Double getBalance() {
        return balance;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public Double getMinimumBalance() {
        return minimumBalance;
    }
    
    public Integer getLockingPeriod() {
        return lockingPeriod;
    }
}
