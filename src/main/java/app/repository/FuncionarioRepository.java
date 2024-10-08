package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
