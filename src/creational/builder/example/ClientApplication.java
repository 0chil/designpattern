package creational.builder.example;

import java.util.HashMap;
import java.util.Map;

import creational.builder.example.builder.Director;
import creational.builder.example.builder.KoreaTaxReportBuilder;
import creational.builder.example.builder.TaxReport;
import creational.builder.example.taxdetail.TaxDetails;

public class ClientApplication {


	private static final String DETAILS_DELIMITER = ",";
	private static final String ITEM_DELIMITER = " ";
	private static final String incomeInput = "연봉 300000,부수입 10000";
	private static final String exemptInput = "기부 10000";

	public static void main(String[] args) {
		TaxDetails incomeDetails = input(incomeInput);
		TaxDetails exemptDetails = input(exemptInput);

		Director director = new Director(new KoreaTaxReportBuilder());
		TaxReport taxReport = director.makeTaxReport(incomeDetails, exemptDetails);

		// Do whatever you want with tax report
		System.out.println("taxReport.getReportType() = " + taxReport.getReportType());
		System.out.println("taxReport.getAmount() = " + taxReport.getAmount());
	}


	// TODO@0chil : Maybe an Adapter pattern would be nice with below
	private static TaxDetails input(String input) {
		return new TaxDetails(parseTaxDetails(input));
	}

	private static Map<String, Double> parseTaxDetails(String input) {
		Map<String, Double> detailsMap = new HashMap<>();
		String[] items = input.split(DETAILS_DELIMITER);
		for (String item : items) {
			String[] itemDetails = item.split(ITEM_DELIMITER);
			String name = itemDetails[0];
			Double amount = Double.parseDouble(itemDetails[1]);
			detailsMap.put(name, amount);
		}
		return detailsMap;
	}
}
