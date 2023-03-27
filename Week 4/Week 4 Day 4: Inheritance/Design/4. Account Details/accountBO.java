class AccountBO {
    public FixedAccount getAccountDetail(String detail) {
        String[] details = detail.split(",");
        String accountNumber = details[0];
        Double balance = Double.parseDouble(details[1]);
        String accountHolderName = details[2];
        Double minimumBalance = Double.parseDouble(details[3]);
        Integer lockingPeriod = Integer.parseInt(details[4]);
        FixedAccount account = new FixedAccount(accountNumber, balance, accountHolderName, minimumBalance, lockingPeriod);
        return account;
    }
}
