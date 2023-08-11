public class Fee {
	private String sID;
	private String feeType;
	private double fee;

	public Fee(String sID, String feeType, double fee) {
		this.sID = sID;
		this.feeType = feeType;
		this.fee = fee;
	}

	public String getStudentID() {
		return sID;
	}

	public void setStudentID(String sID) {
		this.sID = sID;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void display() {
		System.out.println("\nStudent ID: " + sID);
		System.out.println("Fee Type: " + feeType);
		System.out.println("Fee Amount: " + fee);
	}
}