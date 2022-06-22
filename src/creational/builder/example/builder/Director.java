package creational.builder.example.builder;

import creational.builder.example.taxdetail.TaxDetails;

public class Director {
	private final TaxReportBuilder taxReportBuilder;

	public Director(TaxReportBuilder taxReportBuilder) {
		this.taxReportBuilder = taxReportBuilder;
	}

	public TaxReport makeTaxReport(TaxDetails incomeDetails, TaxDetails exemptDetails) {
		return taxReportBuilder
			.reset()
			.enterIncomeDetails(incomeDetails)
			.enterTaxExemptDetails(exemptDetails)
			.calculate()
			.adjustPayment()
			.getResult();
	}
}
