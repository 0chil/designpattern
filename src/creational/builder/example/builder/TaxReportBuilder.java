package creational.builder.example.builder;

import creational.builder.example.taxdetail.TaxDetails;

public interface TaxReportBuilder {

	TaxReportBuilder reset();

	TaxReportBuilder enterIncomeDetails(TaxDetails details);

	TaxReportBuilder enterTaxExemptDetails(TaxDetails details);

	TaxReportBuilder calculate();

	TaxReportBuilder adjustPayment();

	TaxReport getResult();
}
