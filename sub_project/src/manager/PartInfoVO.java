package manager;

public class PartInfoVO {
	private String partNo;
	private String partName;
	private int partCost;
	private int laborCost;
	
	private String partStock;
	private String partUnit;
	public PartInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPartNo() {
		return partNo;
	}
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public int getPartCost() {
		return partCost;
	}
	public void setPartCost(int partCost) {
		this.partCost = partCost;
	}
	public int getLaborCost() {
		return laborCost;
	}
	public void setLaborCost(int laborCost) {
		this.laborCost = laborCost;
	}
	public String getPartStock() {
		return partStock;
	}
	public void setPartStock(String partStock) {
		this.partStock = partStock;
	}
	public String getPartUnit() {
		return partUnit;
	}
	public void setPartUnit(String partUnit) {
		this.partUnit = partUnit;
	}

}
