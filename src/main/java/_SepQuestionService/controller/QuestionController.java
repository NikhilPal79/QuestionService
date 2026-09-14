package _SepQuestionService.controller;

import _SepQuestionService.entity.Question;
import _SepQuestionService.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {


    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionService.add(question);
    }

    @GetMapping
    public List<Question> findEvery(){
        return questionService.findAll();
    }

    @GetMapping("/{id}")
    public Question findOne(@PathVariable Long id){
        return questionService.findById(id);
    }


    @GetMapping("/quiz/{quizId}")
    public List<Question> findByQuizId(@PathVariable Long quizId){
        return questionService.findByQuizId(quizId);
    }
}
