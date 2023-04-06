package CourseWork;

/**
 * BankCard is a class which is a used to print the details of client.
 *
 * @author (Suraj Gurung)
 * @version (5.10a)
 */
public class BankCard
{
    //declearing BankCard variables
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;

    //constructing a parameterized constructor of BankCard class
    protected BankCard(int balanceAmount, int cardId,String bankAccount, String issuerBank){
        this.clientName = "";
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }

    //defining accessor method (getter)
    protected String getClientName(){
        return clientName;
    }

    //defining accessor method (getter)
    protected int getBalanceAmount(){
        return balanceAmount;
    }

    //defining accessor method (getter)
    protected int getCardId(){
        return cardId;
    }

    //defining accessor method (getter)
    protected String getBankAccount(){
        return bankAccount;
    }

    //defining accessor method (getter)
    protected String getIssuerBank(){
        return issuerBank;
    }

    //defining mutator method (setter)
    protected void setClientName(String clientName){
        this.clientName = clientName;
    }

    //defining mutator method (setter)
    protected void setBalanceAmount(int balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    
    //a void display method to print the details of client
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
