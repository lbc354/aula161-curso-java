package entities;

//outsourced = terceirizado
public class OutsourcedEmployee extends Employee {
//	ATRIBUTOS
	private Double additionalCharge; // despesa adicional

//	CONSTRUTORES
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
//	GETTERS AND SETTERS
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
//	MÉTODOS
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}