public class BankCard
{
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;

    protected BankCard(int balanceAmount, int cardId,String bankAccount, String issuerBank){
        this.clientName = "";
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }

    protected String getClientName(){
        return clientName;
    }

    protected int getBalanceAmount(){
        return balanceAmount;
    }
    protected int getCardId(){
        return cardId;
    }
    protected String getBankAccount(){
        return bankAccount;
    }
    protected String getIssuerBank(){
        return issuerBank;
    }
    protected void setClientName(String clientName){
        this.clientName = clientName;
    }
    protected void setBalanceAmount(int balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    protected void display(){
        if (this.clientName == ""){ 
            System.out.println("Please Enter Clientname ");
        }
        else{
            System.out.println("Card Id:"+cardId);
            System.out.println("Client Name:" +clientName);
            System.out.println("Issuer Bank:"+issuerBank);
            System.out.println("Bank Account:"+ bankAccount);
            System.out.println("Balance Ammount: "+balanceAmount);
        }
    }
}
