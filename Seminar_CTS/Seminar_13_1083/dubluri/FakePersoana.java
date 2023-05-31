package dubluri;

import clase.IPersoana;

public class FakePersoana implements IPersoana {

	private String getSexValue;
	private int getVarstaValue;
	private boolean getCNPValue;
	
	public void setGetSexValue(String getSexValue) {
		this.getSexValue = getSexValue;
	}

	public void setGetVarstaValue(int getVarstaValue) {
		this.getVarstaValue = getVarstaValue;
	}

	public void setGetCNPValue(boolean getCNPValue) {
		this.getCNPValue = getCNPValue;
	}

	@Override
	public String getSex() {
		return this.getSexValue;
	}

	@Override
	public int getVarsta() {
		return this.getVarstaValue;
	}

	@Override
	public boolean checkCNP() {
		return this.getCNPValue;
	}

}
