package homework.hw6.Part2;

public class ContractEmployee extends Employee implements Calculation{
	private int fixedPaid;
	private String federalTaxIdMember;
	
	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	public int getFixedPaid() {
		return fixedPaid;
	}

	public void setFixedPaid(int fixedPaid) {
		this.fixedPaid = fixedPaid;
	}
	public ContractEmployee(){
	}
	public int CalculatePay(){
		return getFixedPaid();
	}
	public ContractEmployee(int id, String name, int fixepaid){
		super(id, name);
		this.fixedPaid= fixepaid;
	}
	@Override
	public String toString() {
		return ("Id" + getEmployeeid() + " Name: " + getName() + " Salary: " + CalculatePay());
	};
	
}
