package _SepQuestionService.service;

import _SepQuestionService.entity.Question;
import _SepQuestionService.repo.QuestionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private QuestionRepo  questionRepo;

    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public Question add(Question question){
        return questionRepo.save(question);
    }

    public List<Question> findAll(){
        return questionRepo.findAll();
    }

    public Question findById(Long id){
        return questionRepo.findById(id).orElseThrow(()-> new RuntimeException("NO QUESTION FOUND"));
    }

    public List<Question> findByQuizId(Long quizId){
        return questionRepo.findByQuizId(quizId);
    }
}
