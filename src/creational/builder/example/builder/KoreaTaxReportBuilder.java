package creational.builder.example.builder;

import static creational.builder.example.builder.TaxReport.ReportType.*;

import creational.builder.example.repository.FakeWithholdingRepository;
import creational.builder.example.repository.WithholdingRepository;
import creational.builder.example.taxbrackets.KoreaTaxBracketsTable;
import creational.builder.example.taxdetail.TaxDetails;

public class KoreaTaxReportBuilder implements TaxReportBuilder {

	private TaxReport taxReport;
	private TaxDetails taxDetails;
	// TODO@0chil : Singleton pattern would be nice with below
	private final WithholdingRepository withholdingRepository = new FakeWithholdingRepository();

	@Override
	public TaxReportBuilder reset() {
		taxReport = new TaxReport();
		return this;
	}

	@Override
	public TaxReportBuilder enterIncomeDetails(TaxDetails incomeDetails) {
		this.taxDetails = incomeDetails;
		return this;
	}

	@Override
	public TaxReportBuilder enterTaxExemptDetails(TaxDetails exemptDetails) {
		this.taxDetails.exemptItems(exemptDetails);
		return this;
	}

	@Override
	public TaxReportBuilder calculate() {
		Double calculated = KoreaTaxBracketsTable.calculate(taxDetails);
		this.taxReport.setAmount(calculated);
		return this;
	}

	@Override
	public TaxReportBuilder adjustPayment() {
		Double withholding = withholdingRepository.findWithholdingById(0L);
		if(taxReport.getAmount() - withholding > 0)
			this.taxReport.setReportType(PAYMENT);
		else
			this.taxReport.setReportType(REFUND);
		return this;
	}

	@Override
	public TaxReport getResult() {
		return taxReport;
	}
}
