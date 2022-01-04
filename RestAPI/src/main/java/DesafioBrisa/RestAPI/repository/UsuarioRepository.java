package DesafioBrisa.RestAPI.repository;

import DesafioBrisa.RestAPI.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
