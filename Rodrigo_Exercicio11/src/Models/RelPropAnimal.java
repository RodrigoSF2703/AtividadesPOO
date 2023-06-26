package Models;

public class RelPropAnimal {
    
	private String cpf;
    private int animalId;
    
    public RelPropAnimal(String cpf, int animalId) {
		super();
		this.cpf = cpf;
		this.animalId = animalId;
	}
    
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
    
}
