package service.Impl;

import dao.StudentDao;
import entity.Student;
import org.springframework.stereotype.Service;
import service.StudentService;
import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }
}
