package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface SkillRepository extends CrudRepository {
}
