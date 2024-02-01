package entities;

import java.util.Objects;

public class Teacher {
	
	public Integer codAluno;

	public Teacher(Integer codAluno) {
		this.codAluno = codAluno;
	}

	public Integer getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(Integer codAluno) {
		this.codAluno = codAluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codAluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(codAluno, other.codAluno);
	}
	
	
	
}
