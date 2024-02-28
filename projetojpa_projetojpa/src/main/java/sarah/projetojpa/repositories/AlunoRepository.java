package sarah.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sarah.projetojpa.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}