package OOPConceptPart1;

public class testInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBCBank hb = new HSBCBank();
		
		hb.credit();
		hb.debit();
		hb.educationalLoan();
		hb.overDraft();
		hb.transferFunds();

		System.out.println("Minimum Balance: "+ USBank.min_bal);
		

	}

}
