package creational.builder.example.repository;

public class FakeWithholdingRepository implements WithholdingRepository {

	@Override
	public Double findWithholdingById(Long id) {
		return 3000.0;
	}
}
