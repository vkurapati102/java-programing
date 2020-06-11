package OOPConceptPart1;

public class HSBCBank implements USBank,BrazilBank{

	@Override
	public void overDraft() {
		// TODO Auto-generated method stub
		
		System.out.println("Brazil....OverDraft");
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
		System.out.println("USB....Credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("USB....Debit");
	}

	@Override
	public void transferFunds() {
		// TODO Auto-generated method stub
		
		System.out.println("USB....TransferFunds");
		
	}

	public void educationalLoan() {
		
		System.out.println("HSBC....Educational Loan");
	}
	
}
