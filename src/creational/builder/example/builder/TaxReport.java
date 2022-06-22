package creational.builder.example.builder;

public class TaxReport {

	enum ReportType {
		REFUND, PAYMENT
	}

	private ReportType reportType;
	private Double amount;

	public TaxReport() {}

	public ReportType getReportType() {
		return reportType;
	}

	public Double getAmount() {
		return amount;
	}

	void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

	void setAmount(Double amount) {
		this.amount = amount;
	}
}
