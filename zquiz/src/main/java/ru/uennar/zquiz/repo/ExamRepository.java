package ru.uennar.zquiz.repo;

import org.springframework.data.repository.CrudRepository;
import ru.uennar.zquiz.model.Exam;

public interface ExamRepository extends CrudRepository<Exam, Long> {
}
