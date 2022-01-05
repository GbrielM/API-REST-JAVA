package DesafioBrisa.RestAPI.repository;

import DesafioBrisa.RestAPI.model.PixModel;
import org.springframework.data.repository.CrudRepository;

public interface PixRepository extends CrudRepository<PixModel, Integer> {
}
